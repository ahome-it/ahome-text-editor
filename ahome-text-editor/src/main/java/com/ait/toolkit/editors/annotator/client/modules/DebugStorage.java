package com.ait.toolkit.editors.annotator.client.modules;

import com.google.gwt.core.client.JavaScriptObject;

/*
 * A storage component that can be used to print details of the annotation persistence processes to the console when
 * developing other parts of Annotator.
 */
public class DebugStorage extends AnnotatorModule {

    protected DebugStorage( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public static DebugStorage get() {
        return new DebugStorage( createPeer() );
    }

    private static native JavaScriptObject createPeer()/*-{
		return $wnd.annotator.storage.debug;
    }-*/;
}
