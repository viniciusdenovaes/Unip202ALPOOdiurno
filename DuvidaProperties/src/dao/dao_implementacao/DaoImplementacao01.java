package dao.dao_implementacao;

import java.util.Properties;

public class DaoImplementacao01 {
	
	public void teste() {
		Properties prop = DaoUtil.readPropertiesFile("src/dao/dao_implementacao/teste.properties");
		System.out.println("user: " + prop.getProperty("user"));
		System.out.println("senha: " + prop.getProperty("senha"));
	}
	
	public static void main(String[] args) {
		DaoImplementacao01 dao = new DaoImplementacao01();
		dao.teste();
	}

}
