package studentAdmin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonFunc {
	
	private Scanner sc = new Scanner(System.in);
	private List<StudentDto> myList = new ArrayList();;
	
	public CommonFunc() {
		mainView();
	}
	
	/*
	 * common function 
	 */
	
	public void mainView() {
		
		int key = -1;
		while(true) {
			initPage();
			key = sc.nextInt();
			//System.out.println(key);
			
			if (0 <= key && key < 6) {
				callFunc(key);
				break;
			} else {
				System.out.println("re!!!");
			}
		}
		
	}
	
	private void initPage() {
		System.out.println();
		System.out.println("===== Student Administrator =====");
		System.out.println("\t 1. create");
		System.out.println("\t 2. update");
		System.out.println("\t 3. delete");
		System.out.println("\t 4. search");
		System.out.println("\t 5. all print");
		System.out.println("\t 0. exit");
		System.out.print(" please enter number ::: ");
	}
	
	private void callFunc(int key) {
		switch(key) {
		case 1 :
			addStudent();
			break;
		case 2 :
			updateStudent();
			break;
		case 3 :
			deleteStudent();
			break;
		case 4 :
			searchStudent();
			break;
		case 5 :
			allSearch();
			break;
		case 0 :
			System.out.println();
			System.out.println("bye~!!");
			System.exit(0);
			break;
		}
		mainView();
	}
	
	public void addStudent() {
		StudentDto sd = new StudentDto();
		
		System.out.println();
		System.out.println("\t ==== Student Add ====");
		sd.setNumber(myList == null ? 0 : myList.size());
		
		System.out.print("\t name :: ");
		sd.setName(sc.next());

		System.out.print("\t phone :: ");
		sd.setPhone(sc.next());
		
		System.out.print("\t grade :: ");
		sd.setGrade(sc.next());
		
		System.out.println();
		
		myList.add(sd);
	}
	
	public void updateStudent() {
		System.out.println("update");
	}
	
	public void deleteStudent() {
		System.out.println("delete");		
	}
	
	public void searchStudent() {
		printStudent();
	}
	
	public void allSearch() {
		printStudent();
	}
	
	private void printStudent() {
		
		int len = myList.size();
		for (int i = 0 ; i < len ; i++) {
			StudentDto sd = myList.get(i);
			System.out.println();
			System.out.println("\t ==== Student ====");
			System.out.println("\t number :: " + sd.getNumber());
			System.out.println("\t name :: " + sd.getName());
			System.out.println("\t phone :: " + sd.getPhone());
			System.out.println("\t grade :: " + sd.getGrade());
			System.out.println();
			System.out.println();
		}
	}
	
}
