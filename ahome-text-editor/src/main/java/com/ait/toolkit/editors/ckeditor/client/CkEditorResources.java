package com.ait.toolkit.editors.ckeditor.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface CkEditorResources extends ClientBundle {

    public static final CkEditorResources INSTANCE = GWT.create( CkEditorResources.class );

    @Source( "ckeditor.js" )
    TextResource js();
}
