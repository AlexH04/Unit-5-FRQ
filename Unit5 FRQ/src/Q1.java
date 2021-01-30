public class Q1 {
    public class Invitation

    {

        private String hostName;

        private String address;



        public Invitation(String n, String a)

        {

            hostName = n;

            address = a;

        }

        /*a*/public String getHostName() {
            return hostName;
        }

        /*b*/public void updateAddress(String update) {
            address = update;
        }

        //c
        public String sendInvite(String guest) {
            return "Dear " + guest + ", please attend my event at " + address + ". See you then, " + hostName + ".";
        }
        //d
        public Invitation(String add) {
            address = add;
            hostName = "Host";
        }

    }
}
