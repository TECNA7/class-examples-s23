interface AnimalActions {

  public abstract double eat(Animal prey);

  public abstract void sleep();

  // reutrn type int: which icnidcates how many children were created
  // return type array of Animals
  public abstract Animal[] procreate(Animal partner);

  public abstract Animal[] procreate();
  
}
