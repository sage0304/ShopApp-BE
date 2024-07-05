package com.project.shopapp.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.shopapp.models.Order;
import com.project.shopapp.models.OrderDetail;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse extends BaseResponse{
    private Long id;

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("fullname")
    private String fullName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("address")
    private String address;

    @JsonProperty("note")
    private String note;

    @JsonProperty("order_date")
    private LocalDate orderDate;

    @JsonProperty("status")
    private String status;

    @JsonProperty("total_money")
    private Float totalMoney;

    @JsonProperty("shipping_method")
    private String shippingMethod;

    @JsonProperty("shipping_address")
    private String shippingAddress;

    @JsonProperty("shipping_date")
    private LocalDate shippingDate;

    @JsonProperty("tracking_number")
    private String trackingNumber;

    @JsonProperty("payment_method")
    private String paymentMethod;

    @JsonProperty("order_detail")
    private List<OrderDetail> orderDetails;

    @JsonProperty("active")
    private Boolean active;

    public static OrderResponse fromOrder(Order order){
        OrderResponse orderResponse = OrderResponse.builder()
                .id(order.getId())
                .userId(order.getUser().getId())
                .fullName(order.getFullName())
                .email(order.getEmail())
                .phoneNumber(order.getPhoneNumber())
                .address(order.getAddress())
                .note(order.getNote())
                .status(order.getStatus())
                .shippingMethod(order.getShippingMethod())
                .shippingAddress(order.getShippingAddress())
                .trackingNumber(order.getTrackingNumber())
                .paymentMethod(order.getPaymentMethod())
                .orderDate(order.getOrderDate())
                .orderDetails(order.getOrderDetails())
                .active(order.getActive())
                .build();
        return orderResponse;
    }
}
