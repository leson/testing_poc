package spring_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import leson.springmvc.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application.xml")
public class SpringTestBase {
}
