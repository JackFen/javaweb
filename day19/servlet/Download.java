package servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取要下载的文件名
        String downloadFileName="2.jpg";
        //2.读取要下载的文件内容（通过ServletContext对象可以读取）
        ServletContext servletContext = getServletContext();
        //获取要下载的文件类型
        String mimeType = servletContext.getMimeType("/file/" + downloadFileName);
        System.out.println("下载的文件类型:"+mimeType);
        //4.在回传前，通过响应头告诉客户端返回的数据类型
        resp.setContentType(mimeType);
        //5.还要告诉客户端收到的数据是用于下载使用（还是使用响应头）
        //Content-Disposition响应头表示收到的数据怎么处理
        //attachment表示附件，表示下载使用
        //filename= 表示指定下载的文件名
        //url编码是把汉字转换成%xx%xx的格式
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode("狗.jpg","UTF-8"));
        // 获取响应的输出流
        // 读取输入流中全部数据，复制给输出流，输出给客户端
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);
        OutputStream outputStream=resp.getOutputStream();
        //3.把下载的文件内容回传给客户端
        IOUtils.copy(resourceAsStream,outputStream);

    }
}
