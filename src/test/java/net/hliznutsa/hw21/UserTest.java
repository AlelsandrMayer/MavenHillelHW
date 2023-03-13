package net.hliznutsa.hw21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static net.hliznutsa.hw21.User.checkLogin;
import static net.hliznutsa.hw21.User.checkPassword;

class UserTest {

    @Test
    void checkLoginIsWorkTest() throws WrongLoginException {
        Assertions.assertEquals(checkLogin("qwertrewq"), "qwertrewq");
    }

    @Test
    void checkLoginIntsTest() {
        Assertions.assertThrows(WrongLoginException.class, () ->
                checkLogin("qwertrewq1234"));
    }

    @Test
    void checkLoginLengthTest() {
        Assertions.assertThrows(WrongLoginException.class, () ->
                checkLogin("qwertrewqqwertrewqqwertrewqqwertrewq"));
    }

    @Test
    void checkLoginAnotherSymbolTest() {
        Assertions.assertThrows(WrongLoginException.class, () ->
                checkLogin("Йцукекуцй"));

        Assertions.assertThrows(WrongLoginException.class, () ->
                checkLogin("%32?:%;(<>|}{+="));
    }

    @Test
    void checkLoginNullTest() {
        Assertions.assertThrows(NullPointerException.class, () ->
                checkLogin(null));
    }


    @Test
    void checkPasswordIsWorkTest() throws WrongPasswordException {
        Assertions.assertEquals(checkPassword("qwertrewq1"), "qwertrewq1");
    }

    @Test
    void checkPasswordWithoutIntsTest() {
        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("qwertrewq"));
    }

    @Test
    void checkPasswordLengthTest() {
        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("12qw"));

        Assertions.assertThrows(WrongPasswordException.class, () ->
                checkPassword("qwertrewqqwertrewqqwertrewqqwertrewq"));

    }

    @Test
    void checkPasswordOnlyIntsTest() {
        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("21452353267344"));
    }

    @Test
    void checkPasswordAnotherSymbolTest() {
        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("ЫВОАЫФАПФАРШгф"));

        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("%32?:%;(<>|}{+="));
    }

    @Test
    void checkPasswordNullTest() {
        Assertions.assertThrows(NullPointerException.class, () -> checkPassword(null));
    }

    @Test
    void createUserIsWorkTest() throws WrongLoginException, WrongPasswordException {
        User user = new User("qwerty", "qwert123", "qwert123");

        Assertions.assertEquals(user.getLogin(), "qwerty");
        Assertions.assertEquals(user.getPassword(), "qwert123");
    }

    @Test
    void createUserWrongLoginTest() {
        Assertions.assertThrows(WrongLoginException.class, () ->
                new User("qwerty123", "qwert123", "qwert123"));

    }

    @Test
    void createUserWrongPasswordTest() {
        Assertions.assertThrows(WrongPasswordException.class, () ->
                new User("qwerty", "qwer2", "qwert123"));
    }

    @Test
    void createUserWrongConfirmPasswordTest() {
        Assertions.assertThrows(WrongPasswordException.class, () ->
                new User("qwerty", "qwert123", "qwert165"));
    }

    @Test
    void createUserWrongLoginLengthTest() {
        Assertions.assertThrows(WrongLoginException.class, () ->
                new User("qwertyqwertyqwertyqwerty", "qwert123", "qwert123"));
    }

    @Test
    void createUserWrongPasswordLengthTest() {
        Assertions.assertThrows(WrongPasswordException.class, () ->
                new User("qwerty", "qwer2", "qwer2"));
    }

    @Test
    void createUserNullTest() {
        Assertions.assertThrows(NullPointerException.class, () ->
                new User(null, null, null));
    }
}