package com.houzhi.retrofitdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * Created by houzhi on 15-10-20.
 */
public class Files {


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
