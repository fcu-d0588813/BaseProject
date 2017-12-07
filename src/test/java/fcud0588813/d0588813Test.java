package fcud0588813;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class d0588813Test {
    @Test
    public void getType() throws Exception {
        // Arrange
        d0588813 triangle = new d0588813(5,10,5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
