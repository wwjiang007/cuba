/*
 * Copyright 2000-2018 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.haulmont.cuba.web.widgets.client.addons.contextmenu;

import com.vaadin.client.ApplicationConnection;
import com.vaadin.client.ui.VOverlay;

/**
 * FIXME: This is needed to somehow resolve the application connection issue. A
 * real solution is needed.
 */
public class MyVOverlay extends VOverlay {
    private static ApplicationConnection ac_static;

    @SuppressWarnings("deprecation")
    public MyVOverlay(boolean autoHide, boolean modal) {
        super(autoHide, modal);
    }

    public MyVOverlay() {
        super();
    }

    // FIXME: gg, just a quick compilation fix. Will be replaced during add-on update
    public void setApplicationConnection(ApplicationConnection ac) {
        // this.ac = ac;
        ac_static = ac;
    }

    @Override
    protected ApplicationConnection getApplicationConnection() {
        return ac_static;
    }
}
