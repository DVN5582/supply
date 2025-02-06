package com.wecp.progressive.service;

import com.wecp.progressive.entity.Shipment;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public interface ShipmentService {
    List<Shipment> getAllShipments() throws SQLException;

    Shipment getShipmentById(int shipmentId) throws SQLException;

    int addShipment(Shipment shipment) throws SQLException;

    void updateShipment(Shipment shipment) throws SQLException;

    void deleteShipment(int shipmentId) throws SQLException;
=======
import java.util.List;

public interface ShipmentService {
    List<Shipment> getAllShipments();

    Shipment getShipmentById(int shipmentId);

    int addShipment(Shipment shipment);

    void updateShipment(Shipment shipment);

    void deleteShipment(int shipmentId);
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

}
