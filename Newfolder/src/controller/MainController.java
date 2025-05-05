package controller;

import java.util.Scanner;

import entity.Admin;
import entity.RegularUser;
import entity.ResourceManager;
import entity.User;
import service.BookingService;
import service.ResourceService;
import service.UserService;

public class MainController {
    private UserService userService = new UserService();
    private ResourceService resourceService = new ResourceService();
    private BookingService bookingService = new BookingService();
    private Scanner scanner = new Scanner(System.in);
    
    public void start() {
    	seedUsers();
        System.out.println("=== Welcome to SRBMS Console App ===");
        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Login\n2. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> handleLogin();
                case 2 -> exit = true;
                default -> System.out.println("Invalid choice!");
            }
        }
    }
    private void seedUsers() {
        userService.registerUser(new Admin("admin1", "Alice Admin", "alice@admin.com"));
        userService.registerUser(new ResourceManager("rm1", "Bob Manager", "bob@manager.com"));
        userService.registerUser(new RegularUser("user1", "Charlie User", "charlie@user.com"));
        userService.registerUser(new RegularUser("user2", "Dana User", "dana@user.com"));
    }

    private void handleLogin() {
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        User user = userService.login(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (user instanceof Admin) {
            showAdminMenu();
        } else if (user instanceof ResourceManager) {
            showResourceManagerMenu();
        } else if (user instanceof RegularUser) {
            showRegularUserMenu();
        }
    }

    private void showAdminMenu() {
        System.out.println("\n--- Admin Menu ---");
        // Add options like viewing reports, managing users
    }

    private void showResourceManagerMenu() {
        System.out.println("\n--- Resource Manager Menu ---");
        // Add options like add/edit/delete resources
    }

    private void showRegularUserMenu() {
        System.out.println("\n--- Regular User Menu ---");
        // Add options like booking resources, view cart, cancel bookings
    }
}