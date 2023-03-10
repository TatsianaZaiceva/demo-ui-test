public class OnLinerPage {
    public static final String URL = "https://www.onliner.by/";
    public static final String COPYRIGHT = "//div[@class='footer-style__copy']";
    public static final String TEXT = "© 2001—2023 Onlíner";
    public static final String BTN_ENTER = "//div[@class='auth-bar__item auth-bar__item--text']";
    public static final String TITLE_ENTER_TEXT = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    public static final String TITLE_ENTER_TEXT_EXPECTED = "Вход";
    public static final String BTN_AUTH = "//button[contains(@class, 'auth-button')]";
    public static final String ERROR_MSG_LOGIN = "//div[contains(text(), 'Укажите ник или e-mail')]";
    public static final String ERROR_MSG_LOGIN_EXPECTED = "Укажите ник или e-mail";
    public static final String ERROR_MSG_PASSWORD = "//div[contains(text(), 'Укажите пароль')]";
    public static final String ERROR_MSG_PASSWORD_EXPECTED = "Укажите пароль";
    public static final String LOGIN_PLACEHOLDER = "//input[@placeholder='Ник или e-mail']";
    public static final String ENTERING_EMAIL = "testRandom@gmail.com";
}
