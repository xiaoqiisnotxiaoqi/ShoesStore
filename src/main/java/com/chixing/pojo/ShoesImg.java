package com.chixing.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * shoes_img
 * @author 
 */
public class ShoesImg implements Serializable {
    private Integer imgId;

    private Integer shoesId;

    private Integer shoesColorId;

    private String imgPath;

    private Integer sortNo;

    private static final long serialVersionUID = 1L;

    public ShoesImg() {
    }

    public ShoesImg(Integer imgId, Integer shoesId, Integer shoesColorId, String imgPath, Integer sortNo) {
        this.imgId = imgId;
        this.shoesId = shoesId;
        this.shoesColorId = shoesColorId;
        this.imgPath = imgPath;
        this.sortNo = sortNo;
    }

    public Integer getShoesColorId() {
        return shoesColorId;
    }

    public void setShoesColorId(Integer shoesColorId) {
        this.shoesColorId = shoesColorId;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getShoesId() {
        return shoesId;
    }

    public void setShoesId(Integer shoesId) {
        this.shoesId = shoesId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoesImg shoesImg = (ShoesImg) o;
        return Objects.equals(imgId, shoesImg.imgId) &&
                Objects.equals(shoesId, shoesImg.shoesId) &&
                Objects.equals(shoesColorId, shoesImg.shoesColorId) &&
                Objects.equals(imgPath, shoesImg.imgPath) &&
                Objects.equals(sortNo, shoesImg.sortNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imgId, shoesId, shoesColorId, imgPath, sortNo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"imgId\":")
                .append(imgId);
        sb.append(",\"shoesId\":")
                .append(shoesId);
        sb.append(",\"shoesColorId\":")
                .append(shoesColorId);
        sb.append(",\"imgPath\":\"")
                .append(imgPath).append('\"');
        sb.append(",\"sortNo\":")
                .append(sortNo);
        sb.append('}');
        return sb.toString();
    }
}