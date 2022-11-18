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
        List<User> New_List = new ArrayList<User>(getUsers());
        New_List.clear();
        User UserRandom = FAKE_USERS_RANDOM.get(0);
        New_List.add(UserRandom);
    }

    public void deleteUser(User user) {
        // TODO: A tester
        apiService.deleteUser(user);
        //assert getUsers().contains(user);
    }
}
