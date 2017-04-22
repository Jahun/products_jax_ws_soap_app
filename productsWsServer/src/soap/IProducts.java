package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Ceyhun Esedli on 2017-04-22.
 */
@WebService
public interface IProducts {
    @WebMethod
    String getProduct(Integer id);
}
