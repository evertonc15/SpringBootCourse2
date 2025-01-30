package com.github.evertonc15.arquiteturaspring;

import com.github.evertonc15.arquiteturaspring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository repository = null;//new SimpleJpaRepository<TodoEntity, Integer>();
        TodoValidator validator = new TodoValidator(repository);
        MailSender sender = new MailSender();

        TodoService todoService = new TodoService(repository, validator, sender);

    }
}
