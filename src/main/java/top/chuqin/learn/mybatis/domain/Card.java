package top.chuqin.learn.mybatis.domain;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class Card {
    private Integer id;
    private  String code;

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Card() {
    }

    public Card(Integer id, String code) {
        this.id = id;
        this.code = code;
    }
}
