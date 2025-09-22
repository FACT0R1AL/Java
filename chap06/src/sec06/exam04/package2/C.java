package sec06.exam04.package2;

import sec06.exam04.package1.*;

public class C {
	A a1 = new A(true);
	// A a2 = new A(1);			// 다른 패키지이기 때문에 default 사용못함
	// A a3 = new A("문자열");	// private은 여전히 사용못함
}
