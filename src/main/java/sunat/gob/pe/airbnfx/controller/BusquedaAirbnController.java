/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sunat.gob.pe.airbnfx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import sunat.gob.pe.airbnfx.model.dao.iDepartamento;
import sunat.gob.pe.airbnfx.model.dao.impl.DepartamentoDaoImpl;
import sunat.gob.pe.airbnfx.model.entities.Departamento;

/**
 * FXML Controller class
 *
 * @author user
 */
public class BusquedaAirbnController implements Initializable {

    /**
     * Initializes the controller class.
     * 
     * 
     */
    
     private ObservableList<Departamento> departamentoData = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO    
      //  enlazarTabla();
        llenarDatosEnTabla();
    }    
      /*  private void enlazarTabla() {
        alumnoTable.setItems(alumnoData);
        txtNombres.textProperty().bindBidirectional(alumnoActual.getNombres1());
        txtApellidos.textProperty().bindBidirectional(alumnoActual.getApellidos1());
        txtEmail.textProperty().bindBidirectional(alumnoActual.getCorreo1());

        idColumn.setCellValueFactory(rowData -> rowData.getValue().getIdAlumno1());
        nombresColumn.setCellValueFactory(rowData -> rowData.getValue().getNombres1());
        apellidosColumn.setCellValueFactory(rowData -> rowData.getValue().getApellidos1());
        emailColumn.setCellValueFactory(rowData -> rowData.getValue().getCorreo1());

        estadoColumn.setCellValueFactory(rowData -> new SimpleStringProperty(
                EstadoEnum.getStringValueFromInt(rowData.getValue().getEstado())));
    }*/

    private void llenarDatosEnTabla() {        
        iDepartamento departamentoDao = new DepartamentoDaoImpl();
        departamentoData.addAll(departamentoDao.busquedaDepartameto()) ;
    }
}
