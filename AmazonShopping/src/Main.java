public class Main {
    public static void main(String[] args) {
        System.out.println("lets design Amazon Shopping Cart.");
    }
}
/*
Nouns: user (customer, admin, buyer, seller), products, shopping cart,
verbs: buys, sell, search, reviews, ratings, payment, order, shipment

Question: how will the buyer know the product? how will  he search?
r1-> customer ( auth or guest)
r2 -> auth customer ,- buy , sell -> search, guest only search
r3 ->
-> how is the payment done? cash, card? EMI?
-> do we also need to handle the return ? ( refund)
-> is there any limit to the prduct that he can buy? - eggs (2 per cart)
-> If any product have insurances?
-> how do we want the rate system? (1-5) int? or char?
r3 -> review? - image or only text? - if text size ( char)?  a product can have multiple reviews
-> do we need to track the shipment?
r4 - authenticated user should be able to specify a sh
r5 -> able to specify the shipping address at the time of order
r6 -> payment can be made throuh credit cards, electornic bank or cash
r7 _> an order can be cancelled during the time of shipment
r8 -> notifiation
r9 shipment tracking
r10 - admin - >



 */