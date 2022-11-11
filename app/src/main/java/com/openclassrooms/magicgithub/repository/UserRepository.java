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
        // TODO: A tester
        return FAKE_USERS;
    }

    public void generateRandomUser() {
        // TODO: A tester
        String a = new String();
        String b = new String();
        String c = new String();
        User add_User = new User(a, b, c);
        for(int x=FAKE_USERS.size(); x<25; x++)
        {
            for(int y=0; y<=4; y++) {
                FAKE_USERS.add(x, add_User = FAKE_USERS_RANDOM.get(y));
            }
        }
    }

    public void deleteUser(User user) {
        // TODO: A tester
        FAKE_USERS.remove(user.getId());
    }
}
