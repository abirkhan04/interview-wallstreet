package com.java.ecommerce;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.java.ecommerce.controller.WishController;
import com.java.ecommerce.entity.Customer;
import com.java.ecommerce.entity.Wish;
import com.java.ecommerce.service.CustomerService;
import com.java.ecommerce.service.WishService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {

	   @Autowired
	    private MockMvc mockMvc;

	    @Mock
	    private WishService wishService;

	    @Mock
	    private CustomerService customerService;

	    @InjectMocks
	    private WishController wishController;
	    
	    
	    @Test
	    public void testGetWishesByCustomer_ValidCustomerId_ReturnsWishes() throws Exception {
	        // Mocking customer and wishes data
	        Customer mockCustomer = new Customer(); // Assuming Customer class exists
	        mockCustomer.setId(1L);
	        Wish wish1 = new Wish(); // Assuming Wish class exists
	        Wish wish2 = new Wish();
	        List<Wish> wishes = Arrays.asList(wish1, wish2);

	        // Stubbing service methods
	        when(customerService.getCustomerById(anyLong())).thenReturn(mockCustomer);
	        when(wishService.getWishesByCustomer(any(Customer.class))).thenReturn(wishes);

              // Assuming JSON response format

	        // Verifying service method invocations
	        verify(customerService, times(1)).getCustomerById(anyLong());
	        verify(wishService, times(1)).getWishesByCustomer(any(Customer.class));
	    }


}
