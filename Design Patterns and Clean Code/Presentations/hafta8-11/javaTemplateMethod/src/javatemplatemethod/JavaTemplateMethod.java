package javatemplatemethod;
/**
 *
 * @author Onder Eyecioglu
 */
/**
 * abstract class House containing template method buildHouse and implementation
 * of steps which is same for all types of houses. Those implementations have
 * been marked as final.
 */
 
abstract class House {
  /**
   * This is the template method we are discussing. This method should be
   * final so that other class can't re-implement and change the order of the
   * steps.
   */
    public final void buildhouse() {
        constructBase();
        constructRoof();
        constructWalls();
        constructWindows();
        constructDoors();
        paintHouse();
        decorateHouse();
    }
    public abstract void decorateHouse();
    public abstract void paintHouse();
    public abstract void constructDoors();
    public abstract void constructWindows();
    public abstract void constructWalls();
  /**
   * final implementation of constructing roof - final as all type of house
   * Should build roof in same manner.
   */
    private final void constructRoof() {
        System.out.println("Roof has been constructed.");
    }
  /**
   * final implementation of constructing base - final as all type of house
   * Should build base/foundation in same manner.
   */
    private final void constructBase() {
        System.out.println("Base has been constructed.");
    }
}

class ConcreteWallHouse extends House {
      @Override
      public void decorateHouse() {
            System.out.println("Decorating Concrete Wall House");
      }
      @Override
      public void paintHouse() {
            System.out.println("Painting Concrete Wall House");
      }
      @Override
      public void constructDoors() {
            System.out.println("Constructing Doors for Concrete Wall House");
      }
      @Override
      public void constructWindows() {
            System.out.println("Constructing Windows for Concrete Wall House");
      }
      @Override
      public void constructWalls() {
            System.out.println("Constructing Concrete Wall for my House");
      }

}
class GlassWallHouse extends House {
  @Override
  public void decorateHouse() {
    System.out.println("Decorating Glass Wall House");
  }
  @Override
  public void paintHouse() {
    System.out.println("Painting Glass Wall House");
  }
  @Override
  public void constructDoors() {
    System.out.println("Constructing Doors for Glass Wall House");
  } 
  @Override
  public void constructWindows() {
    System.out.println("Constructing Windows for Glass Wall House");
  }
 
  @Override
  public void constructWalls() {
    System.out.println("Constructing Glass Wall for my House");
  }
}
public class JavaTemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Going to build Concrete Wall House");
            House house = new ConcreteWallHouse();
            house.buildhouse();
            System.out.println("Concrete Wall House constructed successfully");
            house.constructWindows();
            
            
            System.out.println("********************");
            System.out.println("Going to build Glass Wall House");
            house = new GlassWallHouse();
            house.constructWindows();
            house.buildhouse();
            System.out.println("Glass Wall House constructed successfully");
    }
    
}
