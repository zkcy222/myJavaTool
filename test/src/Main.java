import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WXArticleInfo wxArticleInfo = new WXArticleInfo("https://mp.weixin.qq.com/s/Y8uBfPC9Pp7Ss2UCfs8BgQ");
        System.out.println(wxArticleInfo);
    }
}
