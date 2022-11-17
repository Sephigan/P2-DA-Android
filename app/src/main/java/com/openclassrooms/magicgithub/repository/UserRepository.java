package com.openclassrooms.magicgithub.repository;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return FAKE_USERS;
    }

    public void generateRandomUser() {
        // Je comprends pas pourquoi ça marche pas !
        getUsers().clear();
        User UserRandom = FAKE_USERS_RANDOM.get(0);
        getUsers().add(UserRandom);
    }

    public void deleteUser(User user) {
        // TODO: A tester
        getUsers().remove(user.getId());
        boolean test_presence = getUsers().contains(user);
        assert test_presence = false;
    }
}
