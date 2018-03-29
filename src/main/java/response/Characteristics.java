package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Characteristics {

    @SerializedName("gearbox")
    @Expose
    private Gearbox gearbox;
    @SerializedName("category")
    @Expose
    private Category_ category;
    @SerializedName("engine")
    @Expose
    private Engine engine;

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public Category_ getCategory() {
        return category;
    }

    public void setCategory(Category_ category) {
        this.category = category;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
