// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lucas/sistemas-web/conf/routes
// @DATE:Sat Sep 15 01:07:55 BRT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseContaController ContaController = new controllers.ReverseContaController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseContaController ContaController = new controllers.javascript.ReverseContaController(RoutesPrefix.byNamePrefix());
  }

}
