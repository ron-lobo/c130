package org.ron.c130.lombok;

import lombok.*;

import java.math.BigDecimal;

@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class OrderB {
    private final int orderNumber;
    private final double c130;

    @Setter
    private String customerName;

    @Setter
    private String state;

    @Setter
    private BigDecimal taxRate;

    @Setter
    private String productType;

    private BigDecimal area;
    private BigDecimal costPerSquareFoot;
    private BigDecimal laborCostPerSquareFoot;
    private BigDecimal materialCost;
    private BigDecimal laborCost;
    private BigDecimal tax;
    private BigDecimal total;

    public static void main(String[] args) {
        OrderB order1 = new OrderB(123, 3.14);
        OrderB order2 = new OrderB(321, 3.14);
        OrderB order3 = new OrderB(123, 3.14);

        System.out.println(order1.equals(order2));
        System.out.println(order1.equals(order3));
    }
}
