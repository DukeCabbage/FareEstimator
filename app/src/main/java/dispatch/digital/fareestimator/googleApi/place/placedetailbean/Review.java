package dispatch.digital.fareestimator.googleApi.place.placedetailbean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Review {

    @SerializedName("aspects")
    @Expose
    private List<Aspect> aspects = new ArrayList<Aspect>();
    @SerializedName("author_name")
    @Expose
    private String authorName;
    @SerializedName("author_url")
    @Expose
    private String authorUrl;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("time")
    @Expose
    private Integer time;

    /**
     * @return The aspects
     */
    public List<Aspect> getAspects() {
        return aspects;
    }

    /**
     * @param aspects The aspects
     */
    public void setAspects(List<Aspect> aspects) {
        this.aspects = aspects;
    }

    /**
     * @return The authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @param authorName The author_name
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * @return The authorUrl
     */
    public String getAuthorUrl() {
        return authorUrl;
    }

    /**
     * @param authorUrl The author_url
     */
    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    /**
     * @return The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return The rating
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * @param rating The rating
     */
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    /**
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * @param time The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

}
