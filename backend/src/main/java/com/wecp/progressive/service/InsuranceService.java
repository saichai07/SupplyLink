package com.wecp.progressive.service;

import com.wecp.progressive.entity.Insurance;

import java.util.List;

public interface InsuranceService {

    List<Insurance> getAllInsurances();

    int addInsurance(Insurance insurance);

    Insurance getInsuranceById(int insuranceId);

    void updateInsurance(Insurance insurance);

    void deleteInsurance(int insuranceId);
<<<<<<< HEAD
}
=======
}
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
