public class street {
    public void getStreet() {
        String street = getStreetFromUser();
        Query query = session.createQuery("from Address a where a.street='" + street + "'");
    }
}