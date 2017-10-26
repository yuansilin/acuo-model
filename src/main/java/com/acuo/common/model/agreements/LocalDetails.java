package com.acuo.common.model.agreements;

import lombok.Data;

@Data
public class LocalDetails {
    private String ampId;
    private boolean callIssuanceManual;
    private boolean callIssuanceMultipleCallsPerDayCheck;
    private boolean callIssuanceNoMaterialChangeCheck;
    private double callIssuanceOwnVsCptyTolerance;
    private double callIssuancePrimaryToValidatorTolerance;
    private String callIssuanceSchedule;
    private String marginTermCalculationType;
    private String marginTermPrimary;
}
