public class injection {
    public void cookie() {
        String author = request.getParameter(AUTHOR_PARAM);
        Cookie cookie = new Cookie("author", author);
        cookie.setMaxAge(cookieExpiration);
        response.addCookie(cookie);
    }
}