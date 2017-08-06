package com.javafx.tree;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;  
import javafx.scene.control.TreeView;  
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * stage--舞台
 * scene--场景
 * Pane-- 窗口布局
 */
public class TreeViewSample extends Application {  
   
    public static void main(String[] args) {
        launch(args);  
    }  
      
    @Override  
    public void start(Stage primaryStage) {  
        primaryStage.setTitle("Tree View Sample");          

        // 创建树根
        TreeItem<String> rootItem = new TreeItem<> ("Inbox", null);
        // 是否可折叠
        rootItem.setExpanded(true);  
        for (int i = 1; i < 6; i++) {  
            TreeItem<String> item = new TreeItem<> ("Message" + i);              
            rootItem.getChildren().add(item);  
        }
        // 树的view组建
        TreeView<String> tree = new TreeView<> (rootItem);

        //
        StackPane root = new StackPane();  
        root.getChildren().add(tree);  
        primaryStage.setScene(new Scene(root, 300, 250));  
        primaryStage.show();  
    }  
}  