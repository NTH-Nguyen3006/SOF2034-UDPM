package poly.cafe.dao.impl;

import poly.cafe.dao.impl.interfaces.UserDAO;
import poly.cafe.entity.Users;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XQuery;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    String createSql = """
            INSERT INTO Users (Username, [Password], [Enabled], Fullname, Photo, Manager)
            VALUES (?, ?, ?, ?, ?, ?)""";

    String updateSql = """
            UPDATE Users SET [Password] = ?, [Enabled] = ?,
            Fullname = ?, Photo = ?, Manager = ? 
            WHERE Username = ?
            """;
    String deleteSql = """
            DELETE FROM Users WHERE Username = ?
            """;
    String findAllSql = "SELECT * FROM Users;";
    String findByIdSql = "SELECT * FROM Users WHERE Username = ?";

    @Override
    public Users create(Users entity) {
        XJdbc.executeUpdate(createSql, entity.getUsername(),
                entity.getPassword(), entity.isEnabled(), entity.getFullname(),
                entity.getPhoto(), entity.isManager());

        return XQuery.getSingleBean(Users.class, findByIdSql, entity.getUsername());
    }

    @Override
    public void update(Users entity) {
        XJdbc.executeUpdate(updateSql,
                entity.getPassword(), entity.isEnabled(), entity.getFullname(),
                entity.getPhoto(), entity.isManager(), entity.getUsername());
        System.out.println("Update Users");
    }

    @Override
    public void deleteById(String s) {
        XJdbc.executeUpdate(deleteSql, s);
    }

    @Override
    public List<Users> findAll() {
        return XQuery.getEntityList(Users.class, findAllSql);
    }

    @Override
    public Users findById(String s) {
        return XQuery.getSingleBean(Users.class, findByIdSql, s.trim());
    }
}
