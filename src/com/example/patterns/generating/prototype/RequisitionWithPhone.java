package com.example.patterns.generating.prototype;

public abstract class RequisitionWithPhone extends RequisitionBase {
    public String phone;

    public RequisitionWithPhone() {
    }

    public RequisitionWithPhone(RequisitionWithPhone requisitionWithPhone) {
        super(requisitionWithPhone);
        this.phone = requisitionWithPhone.phone;
    }

}
