/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.apache.maven.Goods;

/**
 *
 * @author japan
 */
public class cart {
    private static cart instance;
    private ObservableList<Goods> GoodsList = FXCollections.observableArrayList();
    private cart() {
    
    }    
    public static cart getinstance(){
         if (instance == null) {
             instance = new cart();
        }
        return instance;
    }

    public static cart getInstance() {
        return instance;
    }

    public static void setInstance(cart instance) {
        cart.instance = instance;
    }

    public ObservableList<Goods> getGoodsList() {
        return GoodsList;
    }

    public void setGoodsList(ObservableList<Goods> GoodsList) {
        this.GoodsList = GoodsList;
    }
    
    public void addGoods(Goods good){
    this.GoodsList.add(good);
    }

    public void clear(){
    this.GoodsList.clear();
    }
}
