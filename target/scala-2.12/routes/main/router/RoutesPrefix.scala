
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/lab2/conf/routes
// @DATE:Tue Feb 27 11:20:46 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
