package addressbook;

public class PhoneBookMessage {

	public void openning() {
		System.out.println("*****************************");
		System.out.println("*     전화번호 관리 프로그램       *");
		System.out.println("*****************************");
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println();
		System.out.print("> ");
	}
	
	public void endding() {
		System.out.println("[5] 종료");
		System.out.println("*********감사합니다********");
	}
	
	public void c1() {
		System.out.println("[1] 리스트");
	}
	
	public void c2() {
		System.out.println("[2] 등록");
		System.out.println("등록할 정보를 입력해주세요");
	}
	
	public void c3() {
		System.out.println("[3] 삭제");
		System.out.println("삭제할 번호를 입력해주세요");
		System.out.print(">");
	}
	
	public void c30() {
		System.out.println("작업이 종료되었습니다");
	}
	
	public void c4() {
		System.out.println("[4] 검색");
		System.out.println("검색할 내용을 입력해주세요");
		System.out.print(">");
	}
	
	public void err() {
		System.out.println("잘못누르셨습니다");
		System.out.println("다시 입력해주세요");
	}
}
