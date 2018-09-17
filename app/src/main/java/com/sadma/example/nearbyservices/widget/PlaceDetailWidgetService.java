package com.sadma.example.nearbyservices.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by Sadman on 2018-05-04.
 */

public class PlaceDetailWidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new PlaceDetailWidgetAdapter(this);
    }
}
