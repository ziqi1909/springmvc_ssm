package com.miles.dao;

import com.miles.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : springmvc_07_rest_case
 * @Package : com.miles.dao
 * @ClassName : BookDao.java
 * @createTime : 2022/8/16 16:26
 * @Email : zqwang21@163.com
 * @Description :
 */
public interface BookDao {
    @Insert("insert into tbl_book VALUES (null,#{type},#{name},#{description})")
    public int save(Book book);
    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);
    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
    @Select("select * from tbl_book")
    public List<Book> getAll();
}
