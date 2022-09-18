package test.com.bhavna.testing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneParameterized {

	@ParameterizedTest
    @ValueSource(ints = {10,15,20,40})
    @DisplayName(value = "ValueSource")
    public void testWithValueSource(int num) {
        Operation obj = new Operation();
        assertEquals(false,obj.isEven(num));
    }

    @ParameterizedTest
    @CsvSource({"10,true","15,false","20,true","25,true"})
    @DisplayName(value = "CSVSource")
    public void testWithCSVSource(int num,boolean check) {
        Operation obj = new Operation();
        assertEquals(check,obj.isEven(num));
    }

    @ParameterizedTest
    @CsvFileSource( resources = "C:\\first day git\\Document.csv")
    @DisplayName(value = "CSVFileSource")
    public void testWithCSVFileSource(int num,boolean check) {
        Operation obj = new Operation();
        assertEquals(check,obj.isEven(num));
    }

}
