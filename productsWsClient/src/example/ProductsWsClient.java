package example;

import soap.IProducts;
import soap.ProductsService;

/**
 * Created by Ceyhun Esedli on 2017-04-22.
 */
public class ProductsWsClient {
  public static void main(String[] argv) {
    IProducts service = new ProductsService().getProductsPort();
    //invoke business method
    System.out.println(service.getProduct(10));
  }
}
