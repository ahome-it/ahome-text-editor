package com.ait.toolkit.editors.annotator.client.modules;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class AnnotationStorageUrls extends JsObject {

    protected AnnotationStorageUrls() {
        jsObj = JsoHelper.createObject();
    }

    public AnnotationStorageUrls setCreate( String value ) {
        JsoHelper.setAttribute( jsObj, "create", value );
        return this;
    }

    public AnnotationStorageUrls setUpdate( boolean value ) {
        JsoHelper.setAttribute( jsObj, "update", value );
        return this;
    }

    public AnnotationStorageUrls setDestroy( boolean value ) {
        JsoHelper.setAttribute( jsObj, "destroy", value );
        return this;
    }

    public AnnotationStorageUrls setSearch( JavaScriptObject value ) {
        JsoHelper.setAttribute( jsObj, "search", value );
        return this;
    }

}
