package kshiroma0622.sierpinskigasket

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File

import javax.imageio.ImageIO

object Main {
  def main(args: Array[String]): Unit = {
    val W = 4096
    val H = 4096

    val img = new BufferedImage(W, H, BufferedImage.TYPE_3BYTE_BGR)
    val g = img.getGraphics
    g.setColor(Color.WHITE)
    g.fillRect(0, 0, W, H)

    g.setColor(Color.BLACK)
    for (x <- 0 until W; y <- 0 until H) {
      if (judge(x, y)) {
        g.fillRect(x, y, 1, 1)
      }
    }
    g.dispose()
    ImageIO.write(img, "png", new File("work/sample.png"))
  }


  /**
    * (x,y)で与えた描画領域の座標に点を打つか否か判定します。
    *
    * @param x 描画領域のx座標
    * @param y 描画領域のy座標
    */
  def judge(x: Int, y: Int): Boolean = {
    //この部分を実装してください。
    return false;
  }

}
