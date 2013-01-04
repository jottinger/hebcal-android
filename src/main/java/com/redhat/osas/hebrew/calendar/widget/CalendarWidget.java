package com.redhat.osas.hebrew.calendar.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;
import net.sourceforge.zmanim.hebrewcalendar.JewishCalendar;

public class CalendarWidget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        RemoteViews remoteViews;
        ComponentName calendarWidget;
        JewishCalendar jc = new JewishCalendar();

        remoteViews = new RemoteViews(context.getPackageName(), R.layout.main);
        calendarWidget = new ComponentName(context, CalendarWidget.class);
        remoteViews.setTextViewText(R.id.widget_text, jc.toString());
        appWidgetManager.updateAppWidget(calendarWidget, remoteViews);
    }
}
