package org.ron.c130.lombok;

import java.math.BigDecimal;

@lombok.Data
public class OrderA {
    private final int orderNumber;
    private String customerName;
    private String state;
    private BigDecimal taxRate;
    private String productType;
    private BigDecimal area;
    private BigDecimal costPerSquareFoot;
    private BigDecimal laborCostPerSquareFoot;
    private BigDecimal materialCost;
    private BigDecimal laborCost;
    private BigDecimal tax;
    private BigDecimal total;
    private final double c130;

    public static void main(String[] args) {
        OrderA order1 = new OrderA(123, 3.14);
        OrderA order2 = new OrderA(321, 3.14);
        OrderA order3 = new OrderA(123, 3.14);

        System.out.println(order1.equals(order2));
        System.out.println(order1.equals(order3));
    }
}
