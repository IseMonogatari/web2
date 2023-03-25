package accounts;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *     Класс для хранения пользователей сервиса
 * </p>
 *
 * @autor Dmitry
 * */
public class AccountService {
    /**
     * <p>
     *     Карта типа "логин : профиль пользователя"
     * </p>
    * */
    private final Map<String, UserProfile> loginToProfile;

    public AccountService() {
        loginToProfile = new HashMap<>();
    }

    /**
     * <p>
     *     Метод принимает профиль пользователя (UserProfile)
     *     и добавляет его в список аккаунтов
     * </p>
     * @param userProfile с логином и паролем
     * */
    public void addNewUser(UserProfile userProfile) {
        loginToProfile.put(userProfile.getLogin(), userProfile);
    }

    /**
     * @param login пользователя
     * @return профиль пользователя (UserProfile) по заданному логину
     * */
    public UserProfile getUserByLogin(String login) {
        return loginToProfile.get(login);
    }
}
