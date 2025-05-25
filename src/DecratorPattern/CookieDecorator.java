package DecratorPattern;

public abstract class CookieDecorator implements Cookie {

        protected Cookie cookie;

        

        public CookieDecorator(Cookie cookie) {
            this.cookie = cookie;
        }

        @Override
        public double getCost() {
            
            return cookie.getCost();
        }

        @Override
        public String getDesc() {
            
            return cookie.getDesc();
        }
        

}
