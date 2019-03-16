package com.smart.dao;

//用于数据的访问和操作

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;
import com.smart.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository    //过Spring注解定义一个DAO Bean
public class UserDao {
   private JdbcTemplate jdbcTemplate;

   @Autowired    //自动注入JdbcTemplate的Bean
   public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
      this.jdbcTemplate = jdbcTemplate;
   }
   //根据用户名和密码获取匹配的用户数
   public int getMatchCount(String userName,String password){
      String sqlStr="SELECT count(*) FROM t_user"+"WHERE user"+"WHERE user_name=? and password=?";
      return jdbcTemplate.queryForObject(sqlStr,new Object[]{userName,password},Integer.class);
   }
   //根据用户名获取User对象
   public User findUserByUserName(final String userName){
      final User user=new User();
      jdbcTemplate.query(MATCH_COUNT_SQL, new Object[]{userName}, new RowCallbackHandler() {
         public void processRow(ResultSet resultSet) throws SQLException {
            user.setUserId(resultSet.getInt("user_id"));
            user.setUserName(userName);
            user.setCredits(resultSet.getInt("credits"));
         }
      });
      return user;
   }
   //更新用户积分。最后登录IP及最后登录时间
   public void updateLoginInfo(User user){
      jdbcTemplate.update(UPDATE_LOGIN_INFO_SQL,new Object[]{user.getLastVisit(),
              user.getLastIp(),user.getCredits(),user.getUserId()});
   }
   //根据用户名查询用户的SQL语句
   private final static String MATCH_COUNT_SQL="SELECT count(*) FROM"+
           "t_user WHERE user_name=? and password=?";

   private final static String UPDATE_LOGIN_INFO_SQL="UPDATE t_user SET"+
           "last_visit=?,last_ip=?,credits=? WHERE user_id=?";
}
