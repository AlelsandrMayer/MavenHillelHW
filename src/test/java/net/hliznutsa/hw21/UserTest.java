package net.hliznutsa.hw21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static net.hliznutsa.hw21.User.checkLogin;
import static net.hliznutsa.hw21.User.checkPassword;

class UserTest {

    @Test
    void checkLoginTest() throws WrongLoginException {
        Assertions.assertEquals(checkLogin("qwertrewq"), "qwertrewq");

        Assertions.assertThrows(WrongLoginException.class, () -> checkLogin("qwertrewq1234"));

        Assertions.assertThrows(WrongLoginException.class, () -> checkLogin("qwertrewqqwertrewqqwertrewqqwertrewq"));

        Assertions.assertThrows(WrongLoginException.class, () -> checkLogin("Йцукекуцй"));

        Assertions.assertThrows(WrongLoginException.class, () -> checkLogin("%32?:%;(<>|}{+="));

        Assertions.assertThrows(NullPointerException.class, () -> checkLogin(null));

    }

    @Test
    void checkPasswordTest() throws WrongPasswordException {
        Assertions.assertEquals(checkPassword("qwertrewq1"), "qwertrewq1");

        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("qwertrewq"));

        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("12qw"));

        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("21452353267344"));

        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("qwertrewqqwertrewqqwertrewqqwertrewq"));

        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("ЫВОАЫФАПФАРШгф"));

        Assertions.assertThrows(WrongPasswordException.class, () -> checkPassword("%32?:%;(<>|}{+="));

        Assertions.assertThrows(NullPointerException.class, () -> checkPassword(null));
    }
}