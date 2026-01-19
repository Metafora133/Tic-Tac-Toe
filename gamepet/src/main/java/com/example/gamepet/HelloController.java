package com.example.gamepet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    private String gameover[][] = new String[3][3];

    private boolean isGame = true;

    private String nowClk = "x";
    @FXML
    void UseBtn(ActionEvent event) {
        Button btn = (Button)event.getSource();
        if(!isGame || btn.getText() != "") return;


        btn.setText(nowClk); // Сеттаем кнопку

        int rnIndex = GridPane.getRowIndex(btn) == null ? 0: GridPane.getRowIndex(btn) ;
        int stolIndex = GridPane.getColumnIndex(btn) == null ? 0:  GridPane.getColumnIndex(btn) ;

        gameover[rnIndex][stolIndex] = nowClk;
        nowClk = nowClk == "x" ? "o" : "x";

        if(gameover[0][0] == gameover[0][1] && gameover[0][0] == gameover[0][2] && (gameover[0][0] == "x" || gameover[0][0] == "o")) {
           isGame = false;
        }else if(gameover[0][0] == gameover[1][0] && gameover[0][0] == gameover[2][0] && (gameover[0][0] == "x" || gameover[0][0] == "o")){
            isGame = false;
        }else if (gameover[0][0] == gameover[1][1] && gameover[0][0] == gameover[2][2] && (gameover[0][0] == "x" || gameover[0][0] == "o")){
            isGame = false;
        }else if(gameover[2][0] == gameover[1][1] && gameover[2][0] == gameover[0][2] && (gameover[2][0] == "x" || gameover[2][0] == "o")){
            isGame = false;
        }else if (gameover[0][1] == gameover[1][1] && gameover[0][1] == gameover[2][1] && (gameover[0][1] == "x" || gameover[0][1] == "o")){
            isGame = false;
        }else if (gameover[0][2] == gameover[1][2] && gameover[0][2] == gameover[2][2] && (gameover[0][2] == "x" || gameover[0][2] == "o")){
            isGame = false;
        }else if (gameover[1][0] == gameover[1][1] && gameover[1][0] == gameover[1][2] && (gameover[1][0] == "x" || gameover[1][0] == "o")){
            isGame = false;
        }else if (gameover[2][0] == gameover[2][1] && gameover[2][0] == gameover[2][2] && (gameover[2][0] == "x" || gameover[2][0] == "o")){
            isGame = false;
        }


    }

    @FXML
    void initialize() {

    }

}
