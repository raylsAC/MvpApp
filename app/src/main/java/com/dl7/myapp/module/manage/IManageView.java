package com.dl7.myapp.module.manage;

import com.dl7.myapp.local.table.NewsTypeBean;

import java.util.List;

/**
 * Created by long on 2016/9/1.
 * 栏目管理接口
 */
public interface IManageView {

    /**
     * 显示数据
     * @param checkList     选中栏目
     * @param uncheckList   未选中栏目
     */
    void loadData(List<NewsTypeBean> checkList, List<NewsTypeBean> uncheckList);
}