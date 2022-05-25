package lesson_11;

import java.util.Random;

public class TestData {
    public static final Random random = new Random();
    public static final String URL = "https://diary.ru/user/registration";
    public static final String HAPPY_PATH_LOCATOR = "//li[@class=\"username\"]/a[\"LoginTest\"]";
    public static final String LOGIN_INPUT_XPATH = "//*[@id=\"signupform-username\"]";
    public static final String PASSWORD_INPUT_XPATH = "//*[@id=\"signupform-password\"]";
    public static final String EMAIL_INPUT_XPATH = "//*[@id=\"signupform-email\"]";
    public static final String USER_LOGIN = "LoginTest" + random.nextInt();
    public static final String USER_PASSWORD = "Password@Test";
    public static final String USER_EMAIL = "Test" + random.nextInt() + "@mail.ru";
    public static final String CONFIRM_BUTTON = "//*[@id=\"chk_box_user_confirm\"]";
    public static final String SIGNUP_BUTTON = "//*[@id=\"signup_btn\"]";
    public static final String USER_WRONG_LOGIN = "!@#$%^&*()";
    public static final String USER_WRONG_EMAIL = "FailTestPassword";
    public static final String FAIL_PATH_WRONG_LOGIN_LOCATOR = "//*[@id=\"registration_form\"]/div[1]";
    public static final String FAIL_PATH_WRONG_EMAIL_LOCATOR = "//*[@id=\"registration_form\"]/div[3]";
}
