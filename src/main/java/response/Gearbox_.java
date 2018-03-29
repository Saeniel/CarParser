package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gearbox_ {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("slug")
    @Expose
    private Object slug;
    @SerializedName("title")
    @Expose
    private Object title;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getSlug() {
        return slug;
    }

    public void setSlug(Object slug) {
        this.slug = slug;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

}
