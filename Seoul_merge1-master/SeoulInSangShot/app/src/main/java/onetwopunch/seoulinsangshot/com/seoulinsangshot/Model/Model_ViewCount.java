package onetwopunch.seoulinsangshot.com.seoulinsangshot.Model;

/**
 * Created by Beom2 on 2017-10-07.
 */

public class Model_ViewCount {

    //조회수 모델
    String area;
    String url;
    String id;

    public Model_ViewCount() {
    }

    public Model_ViewCount(String area, String url, String id) {
        this.area = area;
        this.url = url;
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public String getUrl() {
        return url;
    }

    public String getId() {
        return id;
    }
}
