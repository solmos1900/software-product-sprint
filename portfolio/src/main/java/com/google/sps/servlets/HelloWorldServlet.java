package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    ArrayList<String> greetings = new ArrayList<>();
    greetings.add("hello");
    greetings.add("hi");
    greetings.add("whats up");

    response.setContentType("application/json;");
    response.getWriter().println(convertToJsonUsingGson(greetings));
  }
  private String convertToJsonUsingGson(ArrayList a) {
    Gson gson = new Gson();
    String json = gson.toJson(a);
    return json;
  }
}
