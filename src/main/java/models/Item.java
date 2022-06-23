package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Timer;

@Getter
@Setter

    /* API
MarketResponse{
itemTypeId	string
nullable: true
city	string
nullable: true
qualityLevel	integer($int32)
sellPriceMin	integer($int64)
sellPriceMinDate	string($date-time)
sellPriceMax	integer($int64)
sellPriceMaxDate	string($date-time)
buyPriceMin	integer($int64)
buyPriceMinDate	string($date-time)
buyPriceMax	integer($int64)
buyPriceMaxDate	string($date-time)
}
    */

public class Item {
    private String name;
    private int pricesMin;
    private int pricesMax;
    private int pricesAvg;
    private int itemCount;


}
