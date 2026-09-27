/** Class for a Rectangle. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructor for Rectangle.
   *
   * @param w the width of the retangle
   * @param h the height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Return the area.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the factor to scale by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Return if this rectangle is larger.
   *
   * @param other the other rectangle
   * @return true if it is bigger. false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
