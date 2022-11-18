package com.openclassrooms.magicgithub.repository;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A tester
        apiService.deleteUser(user);
        //assert getUsers().contains(user);
    }
}
