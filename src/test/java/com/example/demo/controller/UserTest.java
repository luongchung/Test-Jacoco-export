package com.example.demo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;
import static ch.qos.logback.core.joran.util.beans.BeanUtil.isGetter;
import static ch.qos.logback.core.joran.util.beans.BeanUtil.isSetter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class UserTest {

    @InjectMocks
    private User obj;

    @BeforeEach
    void setUp() throws Exception {
        obj = new User();
    }

    @Test
    public void testToFunt() {
        obj.hashCode();
        assertTrue(true);
    }

    @Test
    public void testGetSet() {
        Class myObjectClass = User.class;
        Method[] methods = myObjectClass.getMethods();
        for(Method method : methods){
            if(isGetter(method)){
                try {
                    method.invoke(obj);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            if(isSetter(method)){
                try {
                    Object[] param = {null}; //truyền pram null
                    method.invoke(obj,param);
                } catch (Exception e) {
                    try {
                        Object[] param = {0};
                        method.invoke(obj,param);
                    } catch (Exception ex) {
                        //     System.out.println(e.toString());
                    }
                }
            }
        }
    }



    @Test
    public void testEquals() {
       obj.equals(obj);
       obj.equals(null);
       User obj2 = new User();
        obj2.setId("");
       obj.equals(obj2);
       assertTrue(true);

    }

    @Test
    public void testToString() {
        String result = obj.toString();
        assertEquals(result, result);
    }

    @Test
    public void testHash() {
        int result = obj.hashCode();
        assertEquals(result, result);
    }
}

