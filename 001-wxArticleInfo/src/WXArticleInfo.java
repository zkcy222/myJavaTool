import java.io.IOException;

public class WXArticleInfo {
    private String url;
    private String photo;
    private String title;

    public WXArticleInfo(String url) throws IOException {
        this.url = url;
        String htmlStr = SocketConnection.getURLSource(url).substring(0, 5000);
        System.out.println(htmlStr);
//        String str = "<meta property=\"og:image\" content=\"";
        String str = "<meta property=\"og:title\" content=\"";

        int index = htmlStr.indexOf(str);
        if (index > 0) {
            index += str.length();
            htmlStr = htmlStr.substring(index);
            System.out.println("============================");
            System.out.println(htmlStr);
            index = htmlStr.indexOf("\" />");
            if (index > 0) {
                this.title = htmlStr.substring(0, index);
            }
        }

        str = "<meta property=\"og:image\" content=\"";
        index = htmlStr.indexOf(str);
        if (index > 0) {
            index += str.length();
            htmlStr = htmlStr.substring(index);
            System.out.println("============================");
            System.out.println(htmlStr);
            index = htmlStr.indexOf("\" />");
            if (index > 0) {
                this.photo = htmlStr.substring(0, index);
            }
        }
    }


    @Override
    public String toString() {
        return "WXArticleInfo{" +
                "url='" + url + '\'' +
                ", photo='" + photo + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
