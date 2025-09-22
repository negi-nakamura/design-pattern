package com.hitorime.Controller;

import com.hitorime.Factory.ShapeFactory;
import com.hitorime.Interface.Shape;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ComboBoxController implements Initializable {

    @FXML
    private AnchorPane combo_box;

    @FXML
    private AnchorPane combo_box_container;

    @FXML
    private Label combo_box_title_label;

    @FXML
    private ComboBox<String> combo_box_shape;

    @FXML
    private HBox shape_container;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initComboBox();
        comboBoxListener();
    }

    public void comboBoxListener() {
        combo_box_shape.setOnAction(event -> {
            String shapeName = combo_box_shape.getValue();
            Node shape = createShape(shapeName);

            removeShape();
            insertShape(shape);
        });
    }

    public void initComboBox() {
        ObservableList<String> shapes = FXCollections.observableArrayList("Circle", "Triangle", "Rectangle");
        combo_box_shape.setItems(shapes);
        combo_box_shape.setValue(shapes.getFirst());

        String shapeName = combo_box_shape.getValue();
        Node shape = createShape(shapeName);
        insertShape(shape);
    }

    public Node createShape(String shapeName) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(shapeName);
        return shape.create();
    }

    public void removeShape() {
        shape_container.getChildren().clear();
    }

    public void insertShape(Node shape) {
        shape_container.getChildren().add(shape);
    }

}
