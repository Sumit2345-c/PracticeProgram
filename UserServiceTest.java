package com.mock.service.test;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.mock.dao.UserDao;
import com.mock.service.UserService;
import junit.framework.TestCase;

public class UserServiceTest extends TestCase {
    @Test
    public void testGetNameByUserId() {
       UserDao mockDao = PowerMockito.mock(UserDao.class);
       PowerMockito.when(mockDao.findNameById(111).thenReturn("Raj");
       UserService service = new UserService(mockDao);
       String name = service.getNameByUserId(111);
       assertEquals("Raj",name);
    }
    @Test
    public void testGetEmailByUserId(){
        UserDao mockDao = PowerMockito.mock(UserDao.class);
        PowerMockito.when(mockDao.findEmailById(111)).thenReturn("raj@gmail.com");
        UserService service = new UserService(mockDao);
        String email = service.getEmailByUserId(111);
        assertEquals("raj@gmail.com",email); 
    }
}
