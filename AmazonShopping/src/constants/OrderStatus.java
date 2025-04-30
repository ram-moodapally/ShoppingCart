package constants;

public enum OrderStatus {
    UNSHIPPED,
//            {
//        @Override
//        public boolean canTransistionTo(OrderStatus nexStatus){
//            return nexStatus == PENDING || nexStatus == RETURNED;
//        }
//    },
    SHIPPED,
    CONFIRMED,
    TRANSIT,
    DELIVERED,
    RETURNED;

    public boolean canTransistionTo(OrderStatus nexStatus){
        switch(this){
            case UNSHIPPED:
                return nexStatus == SHIPPED;
            case SHIPPED:
                return nexStatus == DELIVERED || nexStatus == RETURNED;
            case DELIVERED:
                return true;
            default:
                return false;
        }
    }
    // this is not great, we can add the next controlled emum status.
    /*
    one way to add this is the abstract boolean canTansistionTo method and then overide all the
    enums,

    else the above mentioned method.
     */

//    public abstract boolean canTransistionTo(OrderStatus nexStatus);
}
