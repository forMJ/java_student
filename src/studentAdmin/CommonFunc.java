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
			} else {
				System.out.println("re!!!");
			}
		}
		
	}
	
	public void initPage() {
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
	
	public void callFunc(int key) {
		switch(key) {
		case 1 :
			System.out.println(key);
			break;
		case 2 :
			System.out.println(key);
			break;
		case 3 :
			System.out.println(key);
			break;
		case 4 :
			System.out.println(key);
			break;
		case 5 :
			System.out.println(key);
			break;
		case 0 :
			System.out.println();
			System.out.println("bye~!!");
			System.exit(0);
			break;
		}
	}
	
	public void addStudent() {
		
	}
	
	public void deleteStudent() {
		
	}
	
	public void updateStudent() {
		
	}
	
	public void searchStudent() {
		
	}
	
	public void allSearch() {
		
	}
	
}
