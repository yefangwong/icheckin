package app.icheckin.app.icheckin.model;

import com.orm.dsl.Table;

/**
 * Created by mark wong on 2016/3/31.
 */
@Table
public class User {
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
