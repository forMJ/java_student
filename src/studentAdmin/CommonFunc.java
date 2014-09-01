package studentAdmin;

import java.util.Scanner;

public class CommonFunc {
	
	private Scanner sc = new Scanner(System.in);
	
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
	}
	
	public void addStudent() {
		System.out.println("add");
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
		System.out.println();
		System.out.println("\t ==== Student ====");
		System.out.println("\t number :: ");
		System.out.println("\t name :: ");
		System.out.println("\t phone :: ");
		System.out.println("\t grade :: ");
		System.out.println();
		System.out.println();
	}
	
}
