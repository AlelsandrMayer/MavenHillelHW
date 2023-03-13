package net.hliznutsa.hw21;


public class User {
    private final String login;
    private final String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        this.login = checkLogin(login);
        this.password = checkPassword(password);
        if (!(this.password.equals(confirmPassword))) {
            throw new WrongPasswordException("Пароль не совпадает с ранее введённым");
        }
    }

    public static String checkLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин больше 20 символов");
        }
        for (int i = 0; i < login.length(); i++) {
            char letter = login.charAt(i);
            if (!(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z')) {
                throw new WrongLoginException("Логин не соотвествует параметрам");
            }
        }
        return login;
    }

    public static String checkPassword(String password) throws WrongPasswordException {
        int countLetter = 0;
        int countInt = 0;

        if (6 > password.length() || password.length() > 25) {
            throw new WrongPasswordException("Пароль короче 6 или длиннее 25 символов");
        }
        for (int i = 0; i < password.length(); i++) {
            char indexSymbol = password.charAt(i);
            if (indexSymbol >= 'a' && indexSymbol <= 'z' || indexSymbol >= 'A' && indexSymbol <= 'Z') {
                countLetter++;
            }
            if (indexSymbol >= '0' && indexSymbol <= '9') {
                countInt++;
            }
        }
        if (countLetter > 0 && countInt > 0) {
            return password;
        }
        throw new WrongPasswordException("Пароль не соотвествует параметрам");
    }
}