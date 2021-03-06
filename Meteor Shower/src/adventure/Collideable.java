
package adventure;


public interface Collideable<D> {
    public int getWidth();
    public int getHeight();
    public int getRadius();
    public D collidesWith(Collideable thing);
    public int distance(Collideable thing);
    
    // Notes:
    // x and y are centers
    // distance(my x, my y, thing x, thing y) <= (my radius + thing radius)
  //  public int distance(Collideable thing);
    
}

