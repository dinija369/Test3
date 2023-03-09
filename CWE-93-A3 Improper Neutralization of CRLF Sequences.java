public class injection {
    public void crlfInjection() {
        logger.info("User's street address: " + request.getParameter("streetAddress"));
    }
}