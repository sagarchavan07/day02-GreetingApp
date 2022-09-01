package com.bl.greetingapp.Repository;

import com.bl.greetingapp.Entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository<Greeting,Long> {
}
