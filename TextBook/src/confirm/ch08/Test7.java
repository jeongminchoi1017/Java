package confirm.ch08;

interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
	
}

class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}

class MysqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");
		
	}
	@Override
	public void insert() {
		System.out.println("Mysql DB에 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("Mysql DB를 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");
	}
}

public class Test7 {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		
	}

}
