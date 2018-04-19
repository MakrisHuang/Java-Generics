import java.util.*;
import java.lang.*;

interface Info<T>{
  public T getVar();
  public void setVar(T x);
}

class InfoImpl<U> implements Info<String>{
  private U name;
  private String var;

  public InfoImpl(U name, String var){
    this.setName(name);
    this.setVar(var);
  }

  public U getName(){
    return this.name;
  }

  public void setName(U name){
    this.name = name;
  }

  @Override
  public String getVar(){
    return this.var;
  }

  @Override
  public void setVar(String var){
    this.var = var;
  }
}

public class Demo{
  public static void main(String args[]){
    InfoImpl<Integer> infoImpl = new InfoImpl(10, "generics1");
    System.out.println(infoImpl.getVar());
    System.out.println("generic name<Integer>: " + infoImpl.getName());

    InfoImpl<Float> infoImpl2 = new InfoImpl(10.32, "generics2");
    System.out.println(infoImpl2.getVar());
    System.out.println("generic name<Float>: " + infoImpl2.getName());
  }
}
