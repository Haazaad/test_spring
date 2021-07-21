package ru.haazad.webapp;

import ru.haazad.webapp.servlet.CreateListProduct;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = ("/products"))
public class ProductServlet extends HttpServlet {
    private CreateListProduct listProduct;

    @Override
    public void init() {
        listProduct = new CreateListProduct();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().printf(listProduct.getProductList());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported");
    }
}
