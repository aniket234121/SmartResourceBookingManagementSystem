package service;

import entity.User;
import repository.UserRepository;

public class UserService {
    private UserRepository userRepo = new UserRepository();

    public void registerUser(User user) {
        userRepo.addUser(user);
    }

    public User login(String userId) {
        return userRepo.getUser(userId);
    }
}
