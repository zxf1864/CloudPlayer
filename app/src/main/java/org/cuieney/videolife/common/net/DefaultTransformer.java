package org.cuieney.videolife.common.net;


import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *  版本号：1.0
 *  类描述：  预处理异常信息
 *  备注消息：
 *  修改时间：2016/11/25 下午7:22
 **/
public class DefaultTransformer<T>  implements Observable.Transformer<HttpResponse<T>,T>{
    @Override
    public Observable<T> call(Observable<HttpResponse<T>> httpResponseObservable) {

        return httpResponseObservable. subscribeOn(Schedulers.io())
                                                .observeOn(Schedulers.newThread())
                                                .compose(ErrorTransformer.<T>getInstance())
                                                .observeOn(AndroidSchedulers.mainThread());
    }
}
