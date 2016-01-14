package com.ait.toolkit.editors.annotator.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class AnnotatorUser extends JsObject {

    protected AnnotatorUser( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public String getId() {
        return JsoHelper.getAttribute( jsObj, "id" );
    }
}
