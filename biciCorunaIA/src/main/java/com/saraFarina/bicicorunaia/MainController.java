package com.saraFarina.bicicorunaia;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;


public class MainController {
    @FXML
    private TextArea chatArea;

    @FXML
    private TextField mensajeField;

    @FXML
    protected void enviarMensaje(){

        String mensaje = mensajeField.getText();

        if(!mensaje.isEmpty()){

            chatArea.appendText("Usuario: " + mensaje + "\n");
            mensajeField.clear();

            chatArea.appendText(("IA: He recibido tu respuesta" + "\n"));
        }
    }
}

