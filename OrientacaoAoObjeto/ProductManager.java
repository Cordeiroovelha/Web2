package OrientacaoAoObjeto;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductsList(){
        return productList;
    }

    
}
