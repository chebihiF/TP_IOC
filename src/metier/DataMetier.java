package metier;

import dao.DataDao;

public class DataMetier {

    private DataDao dao;

    public double getInfo(){
        return dao.getData() * 10 ;
    }
}
