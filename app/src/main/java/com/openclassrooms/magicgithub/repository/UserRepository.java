package com.openclassrooms.magicgithub.repository;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A tester
        return FAKE_USERS;
    }

    public void generateRandomUser() {
        // TODO: A modifier
    }

    public void deleteUser(User user) {
        // TODO: A modifier
    }
}
