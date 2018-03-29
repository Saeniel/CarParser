package response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("slug")
    @Expose
    private Object slug;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("parents")
    @Expose
    private List<Object> parents = null;

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

    public List<Object> getParents() {
        return parents;
    }

    public void setParents(List<Object> parents) {
        this.parents = parents;
    }

}
