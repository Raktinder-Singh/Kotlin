data class DiscountCoupon(
    val percentage: Int,
    val minimumAmount: Int
)

fun main(){

val orderAmount = 134

val discountCouponList = listOf(
    DiscountCoupon(10, 150),
    DiscountCoupon(5, 75), 
    DiscountCoupon(8, 100),
    DiscountCoupon(6, 90)
)

val discountValueList = discountCouponList.map{ discountCoupon ->
    if(orderAmount >= discountCoupon.minimumAmount){
        orderAmount * discountCoupon.percentage/100
    }else{
        0
    }
}
println(discountValueList)
}