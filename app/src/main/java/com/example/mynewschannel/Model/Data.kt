package com.example.mynewschannel.Model

import javax.xml.transform.Source

annotation class Expose

annotation class SerializedName(val value: String)
class Data {
    @SerializedName("author")
    @Expose
    private var author: String? = null

    @SerializedName("title")
    @Expose
    private var title: String? = null

    @SerializedName("description")
    @Expose
    private var description: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("source")
    @Expose
    private var source: Source? = null

    @SerializedName("Image")
    @Expose
    private var Image: String? = null

    @SerializedName("Category")
    @Expose
    private var category:String?=null

    @SerializedName("language")
    @Expose
    private var language:String?=null

    @SerializedName("country")
    @Expose
    private var country:String?=null

    @SerializedName("publishedAt")
    @Expose
    private var publishedAt: String? = null


    fun getAuthor(): String? {
        return author
    }

    fun setAuthor(author: String?) {
        this.author = author
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String?) {
        this.description = description
    }

    fun getUrl():String?{
        return url
    }
    fun setUrl(url:String?){
        this.url=url
    }
    fun getSource(): Source? {
        return source
    }

    fun setSource(source: Source?) {
        this.source = source
    }

    fun getImage():String?{
        return Image
    }
    fun setImage(Image:String?){
        this.Image=Image
    }

    fun getCategory():String?{
        return category
    }
    fun setCategory(category:String?){
        this.category=category
    }
    fun getLanguage():String?{
        return language
    }
    fun setLanguage(language:String?){
        this.language=language
    }
    fun getCountry():String?{
        return country
    }
    fun setCountry(country:String?){
        this.country=country
    }
    fun getPublishedAt(): String? {
        return publishedAt
    }

    fun setPublishedAt(publishedAt: String?) {
        this.publishedAt = publishedAt
    }

}

