class UtilsClass {


  static String someStaticMethod(){
    return new ServiceUsedByUtils("Real constructor argument").invokeInstanceMethod();
  }

}
