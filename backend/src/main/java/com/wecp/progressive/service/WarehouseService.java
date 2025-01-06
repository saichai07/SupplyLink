package com.wecp.progressive.service;

import com.wecp.progressive.entity.Warehouse;

import java.sql.SQLException;
import java.util.List;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses() throws SQLException;

    int addWarehouse(Warehouse warehouse) throws SQLException;

    List<Warehouse> getWarehousesSortedByCapacity() throws SQLException;

<<<<<<< HEAD
    default public void emptyArrayList() throws SQLException {
=======
    default public void emptyArrayList() {
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java class
    default void updateWarehouse(Warehouse warehouse) throws SQLException {
    }

    default void deleteWarehouse(int warehouseId) throws SQLException {
    }

    default Warehouse getWarehouseById(int warehouseId) throws SQLException {
        return null;
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException {
        return null;
    }
}
=======
    default List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }
}
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
