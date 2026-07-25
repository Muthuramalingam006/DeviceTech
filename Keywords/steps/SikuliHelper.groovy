package steps

import com.kms.katalon.core.annotation.Keyword
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import java.io.File
import org.testng.Assert

class SikuliHelper {

	@Keyword
	def compareScreenshot(String baselinePath, String currentPath) {
		try {
			BufferedImage img1 = ImageIO.read(new File(baselinePath))
			BufferedImage img2 = ImageIO.read(new File(currentPath))

			if (img1.width != img2.width || img1.height != img2.height) {
				Assert.fail("❌ Image sizes differ! ${img1.width}x${img1.height} vs ${img2.width}x${img2.height}")
			}

			long diff = 0
			for (int y = 0; y < img1.height; y++) {
				for (int x = 0; x < img1.width; x++) {
					int rgb1 = img1.getRGB(x, y)
					int rgb2 = img2.getRGB(x, y)
					if (rgb1 != rgb2) {
						diff++
					}
				}
			}

			double total = img1.width * img1.height
			double diffPercent = (diff * 100.0) / total
			println "🧮 Difference: ${String.format('%.4f', diffPercent)}%"

			if (diffPercent < 0.5) {
				// allow 0.5% pixel difference
				println "✅ Images are visually identical!"
				return true
			} else {
				Assert.fail("❌ Images differ by ${String.format('%.4f', diffPercent)}% of pixels!")
			}
		} catch (Exception e) {
			println "⚠️ Error comparing screenshots: ${e.message}"
			return false
		}
	}
}
