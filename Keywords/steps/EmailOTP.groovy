package steps

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

import javax.mail.*
import java.util.Properties

import internal.GlobalVariable


import javax.mail.internet.MimeMultipart



public class EmailOTP {

	public String getMails(String user, String password) {
		String otp = ""
		try {
			Properties props = new Properties()
			props.put("mail.store.protocol", "imap")
			props.put("mail.imap.host", "imap.gmail.com")
			props.put("mail.imap.port", "993")
			props.put("mail.imap.ssl.enable", "true")

			Session session = Session.getInstance(props, new Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(user, password)
						}
					})

			Store store = session.getStore("imap")
			store.connect()

			Folder inbox = store.getFolder("INBOX")
			inbox.open(Folder.READ_ONLY)

			Message[] messages = inbox.getMessages()
			println "Total messages: ${messages.length}"

			for (int i = messages.length - 1; i >= 0; i--) {
				Message message = messages[i]
				String subject = message.getSubject()
				println "Checking message: ${subject}"

				Object content = message.getContent()
				String body = ""

				if (content instanceof String) {
					body = content
				} else if (content instanceof MimeMultipart) {
					MimeMultipart multipart = (MimeMultipart) content
					for (int j = 0; j < multipart.getCount(); j++) {
						BodyPart part = multipart.getBodyPart(j)
						if (part.isMimeType("text/plain")) {
							body += part.getContent()
						} else if (part.isMimeType("text/html")) {
							body += part.getContent().toString().replaceAll("<[^>]*>", "")
						}
					}
				}

				println "Email body: ${body}"

				def matcher = body =~ /\b\d{6}\b/
				if (matcher.find()) {
					otp = matcher.group()
					println "Extracted OTP: ${otp}"
					break
				}
			}

			inbox.close(false)
			store.close()
		} catch (Exception e) {
			e.printStackTrace()
		}
		return otp
	}
}