package org.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;

public class MyGwtApp implements EntryPoint {

    public static void main(String[] args) {
        System.out.println(888);
    }
    @Override
    public void onModuleLoad() {
        // 创建并显示一个简单的 UI 组件
        Label label = new Label("Hello, GWT!");
        Button button = new Button("btn11");
        button.addClickHandler(event -> button.setText("btn222"));
        // 将组件添加到根面板
        RootPanel.get().add(label);
        RootPanel.get().add(button);
    }
}
