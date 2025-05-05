package Util;

import entity.Admin;
import entity.Resource;
import service.ResourceService;
import service.UserService;

public class DataSeeder {
    public static void seed(UserService userService, ResourceService resourceService) {
        userService.registerUser(new Admin("A1", "Admin One", "admin@example.com"));
        resourceService.addResource(new Resource("R1", "Projector", "equipment", 50.0));
    }
}
