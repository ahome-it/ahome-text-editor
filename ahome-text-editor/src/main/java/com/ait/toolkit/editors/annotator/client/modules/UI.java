package com.ait.toolkit.editors.annotator.client.modules;

import com.google.gwt.core.client.JavaScriptObject;

public class UI extends AnnotatorModule {

    protected UI( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public static UI get() {
        return new UI( createMain() );
    }

    private static native JavaScriptObject createMain()/*-{
		return $wnd.annotator.ui.main;
    }-*/;
}
