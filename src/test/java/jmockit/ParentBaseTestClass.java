package jmockit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ParentBaseTestClass {

  public ParentBaseTestClass() {
    System.out.println("CONSTRUCTOR- " + ParentBaseTestClass.class.getCanonicalName());
  }

  @BeforeSuite
  protected void beforeSuite() {
    System.out.println("before SUITE- " + ParentBaseTestClass.class.getCanonicalName());
  }

  @BeforeClass
  protected void beforeClass() {
    System.out.println("before CLASS- " + ParentBaseTestClass.class.getCanonicalName());
  }

  @BeforeTest
  protected void beforeTest() {
    System.out.println("before TEST- " + ParentBaseTestClass.class.getCanonicalName());
  }
}
