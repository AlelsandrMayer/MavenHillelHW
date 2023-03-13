package net.hliznutsa.hw21;


public class User {
    private final String LOGIN;
    private final String PASSWORD;

    public String getLOGIN() {
        return LOGIN;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        this.LOGIN = checkLogin(login);
        this.PASSWORD = checkPassword(password);
        if (!(PASSWORD.equals(confirmPassword))) {
            throw new WrongPasswordException("Пароль не совпадает с ранее введённым");
        }
    }

    public static String checkLogin(String login) throws WrongLoginException {
        if (login.length() < 20) {
            for (int i = 0; i < login.length(); i++) {
                char letter = login.charAt(i);
                if (!(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z')) {
                    throw new WrongLoginException("Логин не соотвествует параметрам");
                }
            }
            return login;
        }
        throw new WrongLoginException("Логин больше 20 символов");
    }

    public static String checkPassword(String password) throws WrongPasswordException {
        if (6 <= password.length() && password.length() <= 26) {
            int countLetter = 0;
            int countInt = 0;
            for (int i = 0; i < password.length(); i++) {
                char indexSymbol = password.charAt(i);
                if (indexSymbol >= 'a' & indexSymbol <= 'z' || indexSymbol >= 'A' & indexSymbol <= 'Z') {
                    countLetter++;
                }
                if (indexSymbol >= '0' && indexSymbol <= '9') {
                    countInt++;
                }
            }
            if (countLetter > 0 && countInt > 0) {
                return password;
            }
        }
        throw new WrongPasswordException("Пароль не соотвествует параметрам");
    }
}