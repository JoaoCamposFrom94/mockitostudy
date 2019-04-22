package jmockit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestClass extends ParentBaseTestClass {
  @BeforeSuite
  protected void beforeSuite1() {
    System.out.println("before SUITE- " + BaseTestClass.class.getCanonicalName());
  }

  @BeforeClass
  protected void beforeClass1() {
    System.out.println("before CLASS- " + BaseTestClass.class.getCanonicalName());
  }

  @BeforeTest
  protected void beforeTest1() {
    System.out.println("before TEST- " + BaseTestClass.class.getCanonicalName());
  }

}
