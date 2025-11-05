package exam1105;

public class MemoExample {

	public static void main(String[] args) {
		MemoRepository mr = new LocalRepository();
		mr.addMemo("1", "안녕");
		mr.getMemo();
		mr.updateMemo("1", "안녕하세요");
		mr.deleteMemo("1");
		
		mr = new NetworkRepository();
		mr.addMemo("1", "안녕");
		mr.getMemo();
		mr.updateMemo("1", "안녕하세요");
		mr.deleteMemo("1");
	}

}
