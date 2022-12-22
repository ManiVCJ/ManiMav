package mannnD3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {


    @Test
    void withValidMissingNumberTest(){
        MissingNumber obj = new MissingNumber();
        int numb = obj.missingNumber(new int[]{2,3,1,4,5},new int[]{2,3,4,1});
        Assertions.assertEquals(5,numb);


    }

}
