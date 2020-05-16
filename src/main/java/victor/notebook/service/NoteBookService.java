package victor.notebook.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.notebook.domain.Notebook;
import victor.notebook.persistence.DAO.NotebookDAO;
import victor.notebook.repository.INotebookDAO;

@Service
public class NoteBookService {

	@Autowired
	private INotebookDAO notebookDAO ;
	
	public List<Notebook> listNotebookByMemberId(Integer memberId){
		return notebookDAO.showBooksByMemberId(memberId);
	}
	
	public Notebook getNotebookById(Integer bookid) {
		if(Objects.nonNull(bookid)) {
			return null;
			
		}else {
			return notebookDAO.findBookById(bookid);
		}
		
	}
	
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public void saveOrupdate() {
		
	}
}
