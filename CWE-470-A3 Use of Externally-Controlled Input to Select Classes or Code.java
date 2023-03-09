public class parameter {
    public void getParameter() {
        String ctl = request.getParameter("ctl");
        Class cmdClass = Class.forName(ctl + "Command");
        Worker ao = (Worker) cmdClass.newInstance();
        ao.doAction(request);
    }

    public void getParameterTwo() {
        String ctl = request.getParameter("ctl");
        Class cmdClass = Class.forName(ctl + "Command");
        Worker ao = (Worker) cmdClass.newInstance();
        ao.checkAccessControl(request);
        ao.doAction(request);
    }

}