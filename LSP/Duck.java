package lsp;

public class Duck implements DuckInterface {

  @Override
  public void quack() throws DuckInterfaceException {
    System.out.println("Quack...");
  }

  @Override
  public void swim() throws DuckInterfaceException {
    System.out.println("Swim...");
  }
}
