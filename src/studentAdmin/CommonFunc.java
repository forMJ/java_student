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
		StudentDto sd = null;
		switch(key) {
		case 1 :
			addStudent();
			continueAdd();
			break;
		case 2 :
			updateStudent();
			break;
		case 3 :
			System.out.println();
			System.out.println("\t ==== Delete ====");
			deleteStudent();
			break;
		case 4 :
			System.out.println();
			System.out.println("\t ==== Search ====");
			sd = searchStudent();
			printStudent(sd);
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
		System.out.println("\t ==== Add ====");
		sd.setNumber( (myList == null ? 0 : myList.size()) + 1);
		
		System.out.print("\t name :: ");
		sd.setName(sc.next());

		System.out.print("\t phone :: ");
		sd.setPhone(sc.next());
		
		System.out.print("\t grade :: ");
		sd.setGrade(sc.next());
		
		System.out.println();
		
		myList.add(sd);
	}
	
	private void continueAdd() {
		System.out.println();
		System.out.print("continue??? (y/n) ::: ");
		String key = sc.next();
		
		if (key.equalsIgnoreCase("Y")) {
			addStudent();
		}
	}
	
	public void updateStudent() {
		System.out.println("update");
	}
	
	public void deleteStudent() {
		
		StudentDto sd = searchStudent();
		myList.remove(sd);
	}
	
	public StudentDto searchStudent() {
		
		System.out.print("\t name :: ");
		String name = sc.next();
		
		int len = myList.size();
		StudentDto sd = null;
		for (int i = 0 ; i < len ; i++) {
			sd = myList.get(i);
			if (name.equalsIgnoreCase(sd.getName())) {
				break;
			}
		}
		return sd;
		//printStudent(name);
	}
	
	public void allSearch() {
		printAll();
	}
	
	private void printStudent(StudentDto sd) {
		
		System.out.println();
		System.out.println("\t ==== Student ====");
		System.out.println("\t number :: " + sd.getNumber());
		System.out.println("\t name :: " + sd.getName());
		System.out.println("\t phone :: " + sd.getPhone());
		System.out.println("\t grade :: " + sd.getGrade());
		System.out.println();
		System.out.println();
	}
	
	private void printAll () {
		
		int len = myList.size();
		StudentDto sd;
		for (int i = 0 ; i < len ; i++) {
			sd = myList.get(i);
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
