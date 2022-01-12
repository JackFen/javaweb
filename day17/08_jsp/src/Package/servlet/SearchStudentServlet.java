package Package.servlet;

import Package.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        //发sql语句查询学生信息
        //使用for循环查询到的数据做模拟
        List<Student> studentList=new ArrayList<Student>();
        for(int i=0;i<10;i++){
            int t=i+1;
            studentList.add(new Student(t,"name"+t,18+t,"phone"+t));
        }
        //保存查询到的结果（学生信息）到request域中
        req.setAttribute("stuList",studentList);
        //请求转发到showStudent.jsp页面
        req.getRequestDispatcher("/text/showStudent.jsp").forward(req,resp);
    }
}
