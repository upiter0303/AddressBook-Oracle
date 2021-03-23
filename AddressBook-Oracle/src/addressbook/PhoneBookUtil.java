package addressbook;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneBookUtil {
	
	public void listAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("휴대폰번호 : ");
		String hp = sc.next();
		System.out.print("집전화번호 : ");
		String tel = sc.next();
		
		PhoneBookVo vo = new PhoneBookVo(name, hp, tel);
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		boolean success = dao.insert(vo);
		
		System.out.println("입력 "+ (success ? "완료": "실패"));
	}

	public void listShow() {
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		List<PhoneBookVo> list = dao.getList();
		Iterator<PhoneBookVo> it = list.iterator();
		
		while (it.hasNext()) {
			PhoneBookVo vo = it.next();	// 내용 불러오기
			System.out.printf("%d. %s, %s, %s%n",
					vo.getId(),vo.getName(),vo.getHp(),vo.getTel());
		}
	}

	public void listDelete(Long delNum) {
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		boolean success = dao.delete(delNum);
		System.out.println("삭제 " + (success ? "완료":"실패"));
		while (!success) {
			System.out.println("다시 입력해 주세요 (0 입력시 취소)");
			Scanner s = new Scanner(System.in);
			delNum = s.nextLong();
			if(delNum == 0) break;
			success = dao.delete(delNum);
			System.out.println("삭제 " + (success ? "완료":"실패"));
		}
	}
	
	public void listSearch(String toSearch) {
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		List<PhoneBookVo> list = dao.search(toSearch);
		
		Iterator<PhoneBookVo> it = list.iterator();
		
		while(it.hasNext()) {
			PhoneBookVo vo = it.next();
			System.out.printf("%d. %s, %s, %s%n",
					vo.getId(),vo.getName(),vo.getHp(),vo.getTel());	
		}
		
	}

}
