package com.acuo.common.model.margin;

import com.acuo.common.model.margin.Types.SecurityIdType;
import com.opengamma.strata.basics.currency.Currency;
import lombok.Data;

import java.time.LocalDate;
import java.util.Comparator;

@Data
public class Pledge implements Comparable<Pledge>{

    private static Comparator<String> nullSafeStringComparator = Comparator.nullsFirst(String::compareTo);

    private String callAmpId;
    private String pledgeAmpId;
    private String securityId;
    private SecurityIdType securityIdType;
    private String deliveryType;
    private double quantity;
    private Currency FXCurrency;
    private double currentMarketValue;
    private double adjustedCollateralValue;
    private LocalDate settlementDate;
    private double FXRate;
    private double price;
    private double haircut;
    private String externalUsername;
    private int rejectReasonCode;
    private int version;

    @Override
    public int compareTo(Pledge other) {
        return nullSafeStringComparator.compare(this.callAmpId, other.callAmpId);
    }
}
