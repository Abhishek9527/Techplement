package Register_user;
import java.util.Scanner;

public class UserRegistrationSystem {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to User Registration System!");

	        System.out.print("Enter username: ");
	        String username = scanner.nextLine();

	        System.out.print("Enter password: ");
	        String password = scanner.nextLine();

	       your_user newUser = new your_user(username, password);

	        UserDao userDao = new UserDao();
	        userDao.registerUser(newUser);

	        System.out.println("User registered successfully!");

	        System.out.println("\nLogin to verify registration:");
	        System.out.print("Enter username: ");
	        String enteredUsername = scanner.nextLine();
	        System.out.print("Enter password: ");
	        String enteredPassword = scanner.nextLine();

	        your_user loggedInUser = userDao.loginUser(enteredUsername, enteredPassword);

	        if (loggedInUser != null) {
	            System.out.println("Login successful! Welcome, " + loggedInUser.getUsername() + "!");
	        } else {
	            System.out.println("Login failed. Invalid username or password.");
	        }

	        scanner.close();

	}

}
