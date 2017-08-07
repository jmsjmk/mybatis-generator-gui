package com.javafx.tree;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewSample1 extends Application {
   
//    private final Node rootIcon = new ImageView(
//        new Image(getClass().getResourceAsStream("folder_16.png"))
//    );
   
    public static void main(String[] args) {  
        launch(args);  
    }  
      
    @Override  
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tree View Sample");          

        // 创建树根
        TreeItem<String> rootItem = new TreeItem<> ("1", null);
        // 是否可折叠
        rootItem.setExpanded(true);

        for (int i = 1; i < 6; i++) {  
            TreeItem<String> item = new TreeItem<> ("Message" + i);              
            rootItem.getChildren().add(item);  
        }

        // 创建树根
        TreeItem<String> rootItem1 = new TreeItem<> ("Inbox2221", null);
        // 是否可折叠
        rootItem1.setExpanded(true);
        for (int i = 1; i < 6; i++) {
            TreeItem<String> item = new TreeItem<> ("Message" + i);
            rootItem1.getChildren().add(item);
        }

        // 树的view组建
        TreeView<String> tree = new TreeView<> (rootItem);
        TreeView<String> tree1 = new TreeView<> (rootItem1);
        tree1.setRoot(rootItem1);
        tree1.setShowRoot(false);
        GridPane root = new GridPane();

        root.getChildren().add(tree);
        root.getChildren().add(tree1);
        primaryStage.setScene(new Scene(root, 600, 250));

        primaryStage.show();  
    }  
}  