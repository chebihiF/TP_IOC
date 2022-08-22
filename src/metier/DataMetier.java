package metier;

import dao.*;

public class DataMetier {

    private IDao dao ;

    public double getInfo(){
        return dao.getData() * 10 ;
    }
}
