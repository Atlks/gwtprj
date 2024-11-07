package pkg2.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Md2 implements EntryPoint {

    public static void main(String[] args) {
        System.out.println(888);
    }
    @Override
    public void onModuleLoad() {
        // 创建并显示一个简单的 UI 组件
        Label label = new Label("md2222 lab");
               // 将组件添加到根面板
        RootPanel.get().add(label);

    }
}
