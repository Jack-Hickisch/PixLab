/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroRed();
    beach.zeroGreen();
    beach.explore();
  }

  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
		Pixel[][] pixels = beach.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setGreen(255 - pixelObj.getGreen());
			}
		}
    beach.explore();
  }

  public static void testGreyscale()
  {
    Picture beach = new Picture("beach.jpg");
    Pixel[][] pixels = beach.getPixels2D();
    int avg = 0;
    for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
        avg = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen()) / 3;
				pixelObj.setRed(avg);
				pixelObj.setBlue(avg);
				pixelObj.setGreen(avg);
        avg = 0;
		  }
    }
    beach.explore();
  }

  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    Pixel[][] pixels = water.getPixels2D();
    water.explore();
    for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
        if (pixelObj.getBlue() > 159 && pixelObj.getGreen() < 170)
        {
				  pixelObj.setBlue((int)(Double.valueOf(pixelObj.getBlue()) + Double.valueOf(pixelObj.getBlue()) * .3));
        }
				pixelObj.setGreen(pixelObj.getGreen() - 35);
		  }
    }
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture motorcycle = new Picture("redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture motorcycle = new Picture("redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture motorcycle = new Picture("redMotorcycle.jpg");
    motorcycle.mirrorVerticalRightToLeft();
    motorcycle.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testMirrorGull()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }

  public static void testCopy()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.copy(swan, 214, 182, 235, 261);
    swan.explore();
  }

  public static void myCollage()
  {
    Picture swan = new Picture("swan.jpg");
    Picture gull = new Picture("seagull.jpg");
    Picture water = new Picture("water.jpg");
    swan.zeroBlue();
    swan.mirrorVertical();
    gull.mirrorGull();
    water.mirrorArms();
    swan.copy(gull, 0, 0, 50, 50);
    swan.copy(water, 100, 100, 150, 150);
    swan.copy(gull, 150, 150, 200, 200);
    swan.copy(water, 200, 200, 250, 250);
    swan.copy(gull, 300, 300, 350, 350);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testGreyscale();
    // testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    // on write a grayscale
    // testFixUnderwater();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontalBotToTop();
    //testMirrorVertical();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    //testMirrorDiagonal();
    // testCollage();
    // myCollage();
    // testCopy();
    testEdgeDetection();
    // testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
