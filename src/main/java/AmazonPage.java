public class AmazonPage {
    public static final String URL = "https://www.amazon.com/";
    public static final String COPYRIGHT = "//span[contains(text(), '© 1996-2023, Amazon')]";
    public static final String TEXT = "© 1996-2023, Amazon.com, Inc. or its affiliates";
    public static final String BTN_CART = "//span[contains(text(),'Cart')]";
    public static final String TITLE_CART_TEXT =
            "//div[@class='a-row sc-your-amazon-cart-is-empty']";
    public static final String TITLE_CART_TEXT_EXPECTED = "Your Amazon Cart is empty";
}
