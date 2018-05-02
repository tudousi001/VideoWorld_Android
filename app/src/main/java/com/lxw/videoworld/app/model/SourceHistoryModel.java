package com.lxw.videoworld.app.model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 *
 * Created by Zion on 2018/4/16.
 */

public class SourceHistoryModel extends RealmObject implements Serializable {
    @PrimaryKey
    private String link;
    private SourceDetailModel sourceDetailModel;
    private int seek;
    private int total;
    private String status;// 0 已删除  1 正常状态
    private long time;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public SourceDetailModel getSourceDetailModel() {
        return sourceDetailModel;
    }

    public void setSourceDetailModel(SourceDetailModel sourceDetailModel) {
        this.sourceDetailModel = sourceDetailModel;
    }

    public int getSeek() {
        return seek;
    }

    public void setSeek(int seek) {
        this.seek = seek;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
