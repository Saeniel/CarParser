package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Modification {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("series")
    @Expose
    private Series series;
    @SerializedName("generation")
    @Expose
    private Generation generation;
    @SerializedName("model")
    @Expose
    private Object model;
    @SerializedName("year_begin")
    @Expose
    private Object yearBegin;
    @SerializedName("year_end")
    @Expose
    private Object yearEnd;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public Object getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = model;
    }

    public Object getYearBegin() {
        return yearBegin;
    }

    public void setYearBegin(Object yearBegin) {
        this.yearBegin = yearBegin;
    }

    public Object getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(Object yearEnd) {
        this.yearEnd = yearEnd;
    }

}
