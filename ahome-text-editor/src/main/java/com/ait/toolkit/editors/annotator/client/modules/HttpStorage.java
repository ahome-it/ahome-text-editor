package com.ait.toolkit.editors.annotator.client.modules;

import com.google.gwt.core.client.JavaScriptObject;

/*
 * A storage component that can be used to print details of the annotation persistence processes to the console when
 * developing other parts of Annotator.
 */
public class HttpStorage extends AnnotatorModule {

    protected HttpStorage( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public static HttpStorage get() {
        return new HttpStorage( createPeer() );
    }

    private static native JavaScriptObject createPeer()/*-{
		return $wnd.annotator.storage.http;
    }-*/;
}
