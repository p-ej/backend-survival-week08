package kr.megaptera.assignment.application.cart;

import com.example.demo.infrastructure.CartDtoFetcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class GetCartServiceTest {
    private CartDtoFetcher cartDtoFetcher;

    private GetCartService getCartService;

    @BeforeEach
    void setUp() {
        cartDtoFetcher = mock(CartDtoFetcher.class);

        getCartService = new GetCartService(cartDtoFetcher);
    }

    @Test
    void getCartDto() {
        getCartService.getCartDto();

        verify(cartDtoFetcher).fetchCartDto(any());
    }
}
