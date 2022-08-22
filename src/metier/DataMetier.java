package metier;

import dao.*;

import java.io.*;

public class DataMetier {

    private IDao dao ;

    private void dao_ioc(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("ioc.config")));
            String stringClassName = br.readLine();
            Class daoClass = Class.forName(stringClassName);
            dao = (IDao) daoClass.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public double getInfo(){
        dao_ioc();
        return dao.getData() * 10 ;
    }
}
