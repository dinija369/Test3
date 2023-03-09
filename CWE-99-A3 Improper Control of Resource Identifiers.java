public class injection {
    public void injectionResource() {
        String rName = request.getParameter("reportName");
        File rFile = new File("/usr/local/apfr/reports/" + rName);
        rFile.delete();
    }
}