
package com.yuyh.cavaliers.Interactor;

import com.yuyh.cavaliers.http.bean.news.NewsDetail;
import com.yuyh.cavaliers.http.callback.GetBeanCallback;

public interface NBANewsDetailInteractor {

    void getNewsDetail(String arcId, GetBeanCallback<NewsDetail> callback);
}