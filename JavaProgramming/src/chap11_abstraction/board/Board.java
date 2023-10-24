package chap11_abstraction.board;

public class Board {
	int boardNo;
	String boardTitle;
	String boardContent;
	String boardWriter;
	String boardDate;
	
	//단축키  : Alt + Shift + s --> 제네레이트 컨스트럭더 유징 필드 --> 모드 체크박스 선택 후 확인 

	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, String boardDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
	}

	
	
	//단축키  : Alt + Shift + s --> 게터 세터 --> 모드 체크박스 선택 후 확인 
	
	//boardNo를 가져올 수 있는 메소드
	public int getBoardNo() {
		return boardNo;
	}
	
	//boardNo값을 변경할 수 있는 메소드
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	
	public void insertBoard() {
		System.out.println("게시글을 작성합니다.");
	}
	
	
	
	
}
