package Ch38.Domain.Service;

import Ch38.Domain.Dao.BookDaoImpl;

public class BookServiceImpl {

	//
	private BookDaoImpl bookDao;
	
	//싱글톤 패턴
	private static BookServiceImpl instance;
	private BookServiceImpl() throws Exception{	
		bookDao = BookDaoImpl.getInstance();
	}
	public static BookServiceImpl getInstance() throws Exception{
		if(instance==null)
			instance = new BookServiceImpl();
		return instance;
	}
	
	
}
