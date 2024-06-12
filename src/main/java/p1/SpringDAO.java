package p1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class SpringDAO 
{

  HibernateTemplate ht;// heap memeory is not created


  public HibernateTemplate getHt() {
    return ht;
  }
  public void setHt(HibernateTemplate ht) {
    this.ht = ht;
  }
  public void insert(Student s)
  {
    ht.save(s);
  }
  public void update(Student s)
  {
    ht.update("id", s);
  }
  public Student find(int id)
  {
    return (Student) ht.get(Student.class, id);
    
  }
  public void delete(int id)
  {
    Student s = find(id);
    ht.delete(s);
  }
  public List<Student> findall(){
    return ht.loadAll(Student.class);
    
    
  }    
}