// @GENERATOR:play-routes-compiler
// @SOURCE:/home/aluno/Sistemas-Web/conf/routes
// @DATE:Mon Sep 17 16:56:25 BRT 2018


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
