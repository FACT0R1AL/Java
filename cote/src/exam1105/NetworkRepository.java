package exam1105;

public class NetworkRepository implements MemoRepository{
	public void addMemo(String id, String body) {
		System.out.println(id + "번 메모를 네트워크에 추가합니다.");
		System.out.println("id : " + id + ", body : " + body);
	}
	
	public void getMemo() {
		System.out.println("메모를 네트워크에서 가져옵니다.");
	}
	
	public void deleteMemo(String id) {
		System.out.println("네트워크에 있는 " + id + "번 메모를 삭제합니다.");
	}
	
	public void updateMemo(String id, String body) {
		System.out.println("네트워크에 있는 " + id + "번 메모를 업데이트합니다.");
		System.out.println("id : " + id + ", body : " + body);
	}
}
