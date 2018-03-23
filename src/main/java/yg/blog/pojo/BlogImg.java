package yg.blog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class BlogImg {
    private Integer imgId;

    private Integer likeId;

    private String imgName;

    private String imgPath;

    private String imgContent;

    private String imgDate;

    private String indexImg;

    public String getIndexImg() {
        return indexImg;
    }

    public void setIndexImg(String indexImg) {
        this.indexImg = indexImg;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getImgContent() {
        return imgContent;
    }

    public void setImgContent(String imgContent) {
        this.imgContent = imgContent == null ? null : imgContent.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public String getImgDate() {
        return imgDate;
    }

    public void setImgDate(String imgDate) {
        this.imgDate = imgDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogImg blogImg = (BlogImg) o;

        if (imgId != null ? !imgId.equals(blogImg.imgId) : blogImg.imgId != null) return false;
        if (likeId != null ? !likeId.equals(blogImg.likeId) : blogImg.likeId != null) return false;
        if (imgName != null ? !imgName.equals(blogImg.imgName) : blogImg.imgName != null) return false;
        if (imgPath != null ? !imgPath.equals(blogImg.imgPath) : blogImg.imgPath != null) return false;
        if (imgContent != null ? !imgContent.equals(blogImg.imgContent) : blogImg.imgContent != null) return false;
        if (imgDate != null ? !imgDate.equals(blogImg.imgDate) : blogImg.imgDate != null) return false;
        return indexImg != null ? indexImg.equals(blogImg.indexImg) : blogImg.indexImg == null;
    }

    @Override
    public int hashCode() {
        int result = imgId != null ? imgId.hashCode() : 0;
        result = 31 * result + (likeId != null ? likeId.hashCode() : 0);
        result = 31 * result + (imgName != null ? imgName.hashCode() : 0);
        result = 31 * result + (imgPath != null ? imgPath.hashCode() : 0);
        result = 31 * result + (imgContent != null ? imgContent.hashCode() : 0);
        result = 31 * result + (imgDate != null ? imgDate.hashCode() : 0);
        result = 31 * result + (indexImg != null ? indexImg.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BlogImg{" +
                "imgId=" + imgId +
                ", likeId=" + likeId +
                ", imgName='" + imgName + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", imgContent='" + imgContent + '\'' +
                ", imgDate='" + imgDate + '\'' +
                ", indexImg='" + indexImg + '\'' +
                '}';
    }

    public BlogImg() {
        this.imgId = imgId;
    }
}