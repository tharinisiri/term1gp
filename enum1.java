package enum1;

enum CompassDirections
  {
    NORTH, SOUTH, EAST,WEST,NORTEAST,SOUTHEAST,SOUTHWEST,NORTHWEST;
  }
class enum1
{
   
  public static void main(String[] args)
  {
    CompassDirections cd = CompassDirections.EAST; 
    
    System.out.println(cd);
    
    
  }
}
