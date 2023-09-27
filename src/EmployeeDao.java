import java.sql.*;
import java.util.ArrayList;

public class EmployeeDao {
      
      
      public static void createEmployee(Employee emp) throws SQLException{
            Connection conn = DB.connect();
            String query = Query.insert;
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1,emp.getId());
            st.setString(2,emp.getName());
            st.setInt(3,emp.getAge());
            st.setString(4,emp.getPassword());

            st.execute();
            System.out.println("Data Inserted Successfully!");
            conn.close();
      }//end of createEmployee


      public static ArrayList<Employee> readAllEmployee() throws SQLException{
            Connection conn = DB.connect();
            String query = Query.read;
            PreparedStatement st = conn.prepareStatement(query);
            ArrayList<Employee> arr = new ArrayList<>();

            ResultSet res = st.executeQuery();

            while(res.next()){
                  Employee emp = new Employee(res.getInt(1), res.getString(2), res.getInt(3),res.getString(4));
                  arr.add(emp);
            }
            conn.close();
            return arr;

      }

      public static void updateEmployee(String name,int id) throws SQLException{
            Connection conn = DB.connect();
            String query = Query.update;
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1,name);
            st.setInt(2,id);

            int n = st.executeUpdate();
            
            System.out.println(n + " row updated");

            conn.close();
      }


      public static void deleteEmployee(int id) throws SQLException{
            Connection conn = DB.connect();
            String query = Query.delete;
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1,id);
            int n = st.executeUpdate();
            System.out.println(n + " row deleted");
            conn.close();
      }
}//end of EmployeeDao Class