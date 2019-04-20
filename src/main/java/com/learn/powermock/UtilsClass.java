package com.learn.powermock;

public class UtilsClass {


  public static String someStaticMethod() {
    return new ServiceUsedByUtils("Real constructor argument").invokeInstanceMethod();
  }

}
