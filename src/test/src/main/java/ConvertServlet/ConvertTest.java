package src.main.java.ConvertServlet;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.*;

public class ConvertTest extends Mockito{

    @Test
    public void testConvertTest() throws IOException, Servlet Exception {
        parameter.put("param1", "some value");
        servlet.doPost(request, response);
        assertThat(responst_writer.toString());
    }
}
