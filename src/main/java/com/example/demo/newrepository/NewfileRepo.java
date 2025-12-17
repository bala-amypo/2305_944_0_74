package com.example.demo.newrepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.repository.*;

public class NewfileRepo extends JpaRepository<NewfileEntity,Long> {
   List< NewfileEntity>getall();
   NewfileEntity update(Long id,NewfileEntity newfile);
      void delete(Long id);
}
