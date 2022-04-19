import processing.core.PApplet;
import processing.core.PImage;
/**
 * This program generates a DVD logo and a rectangle which bounce around the screen irregularly
 * @author: JohnDuarte23
 */

public class Sketch extends PApplet {
	
  // These are the variables required for the background
	PImage img;
  float fltimgX = 0;
  float fltimgY = 0;

  // These are the variables required for the rectangle
  PImage Shape;
  float fltShapeX = 50;
  float fltShapeY = 50;
  float fltShapeXSpeed = 2;
  float fltShapeYSpeed = 1;

  // These are the variable required for the DVD logo
  PImage DVD;
  float fltDVDX = 300;
  float fltDVDY = 300;
  float fltDVDXSpeed = 5;
  float fltDVDYSpeed = 3;

  // These variables will make the shapes move in a non-linear pattern
  float fltwave;
  float fltwMovement;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
    img = loadImage("space.jpg");
    DVD = loadImage("DVDimage.png");
    DVD.resize(200, 100);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // This portion of code generates a moving DVD logo
	  image(img, fltimgX, fltimgY);
    image(DVD, fltDVDX, fltDVDY);

    fltwave += (Math.PI/20);
    fltwMovement = (float)(Math.sin(fltwave)*5);

    fltDVDX += fltwMovement + fltDVDXSpeed;
    fltDVDY += fltwMovement + fltDVDYSpeed;

    if(fltDVDX < 0){
      fltDVDXSpeed *= -1;
    }

    if(fltDVDX > 600){
      fltDVDXSpeed *= -1;
    }

    if(fltDVDY < 0){
      fltDVDYSpeed *= -1;
    }

    if(fltDVDY > 660){
      fltDVDYSpeed *= -1;
    }

    // This portion of code generates a moving rectangle
    fill(255, 255, 255);
    rect(fltShapeX, fltShapeY, 50, 50);

    fltwave += (Math.PI/20);
    fltwMovement = (float)(Math.sin(fltwave)*5);

    fltShapeX += fltwMovement + fltShapeXSpeed;
    fltShapeY += fltwMovement + fltShapeYSpeed;

    if(fltShapeX < 0){
      fltShapeXSpeed *= -1;
    }

    if(fltShapeX > 750){
      fltShapeXSpeed *= -1;
    }

    if(fltShapeY < 0){
      fltShapeYSpeed *= -1;
    }

    if(fltShapeY > 710){
      fltShapeYSpeed *= -1;
    }
  }
  // define other methods down here.
}