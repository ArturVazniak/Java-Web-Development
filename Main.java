import java.util.Scanner;

class Calculat {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		int n1 = getInt();
		int n2 = getInter();
		char operation = getOperation();
		int result = calc(n1,n2,operation);
		System.out.println("Лови сучка потный ответ: " + result);
	}
     public static int getInt(){
		System.out.println("Нажмакай своими кривулями целое число: ");
		int n1;
		if(scanner.hasNextInt()){
			n1 = scanner.nextInt();
		} else {
			System.out.println("Рукожоп, что ты ввел? Даю тебе еще одну попытку! ");
			scanner.next();
			n1 = getInt();
		}
		return n1;
	 }
	 public static int getInter(){
		System.out.println("Давай мудила еще одно: ");
		int n2;
		if(scanner.hasNextInt()){
			n2 = scanner.nextInt();
		} else {
			System.out.println("Ты че тупой? первый раз получилось, поднапрягись второй!");
			scanner.next();
			n2 = getInter();
		}
		return n2;
	 }

     public static char getOperation(){
		System.out.println("Что с этим говном сделать?");
		char operation;
		if(scanner.hasNext()) {
			operation = scanner.next().charAt(0);
		} else {
			scanner.next();
			operation = getOperation();
		}
		return operation;
	 }

	 public static int calc(int n1, int n2, char operation){
		int result;
		switch (operation){
			case '+':
				result = n1+n2;
				break;
			case '-':
				result = n1-n2;
				break;
			case '*':
				result = n1*n2;
				break;
			case '/':
				result = n1/n2;
				break;
			default:
				System.out.println("Тупорогий, читай между строк '+' '-' '*' '/'");
				result = calc(n1, n2, getOperation());
		}
	return result;
	 }

}










