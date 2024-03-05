import java.util.Scanner;



import static org.junit.Assert.*;





public class TinhToanTest {
    private TinhToan ShapeCalculator = new TinhToan();

    Scanner scanner = new Scanner(System.in);

    @org.junit.Test
    public void testRectangleWithValidInput() {

        assertEquals(20, ShapeCalculator.calculateRectangleArea(5, 4));
    }




    @org.junit.Test
    public void testRectangleWithNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(-5, 4);
        });
    }

    @org.junit.Test
    public void testRectangleWithInvalidLength() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble(" "), 4);
        });
    }



    @org.junit.Test
    public void testRectangleWithZeroWidth() {
        assertEquals(0, ShapeCalculator.calculateRectangleArea(5, 0));
    }
    @org.junit.Test
    public void testRectangleWithInvalidWidth() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(5, Double.parseDouble("a"));
        });

    }



    @org.junit.Test
    public void testRectangleWithLength() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble("a"), 4);
        });
    }


    @org.junit.Test
    public void testRectangleWithtwo() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble("/*"), Double.parseDouble("a"));
        });
    }


    @org.junit.Test
    public void testRectangleWithNullLength() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble(null), Double.parseDouble(null));
        });
    }


    @org.junit.Test
    public void testCircleWithValidRadius() {
        assertEquals(Math.PI * 100, ShapeCalculator.calculateCircleArea(10),.2);
    }


    @org.junit.Test
    public void testCircleWithNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeCalculator.calculateCircleArea(-11);
        });
    }

    @org.junit.Test
    public void testCircleWithInvalidRadius() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateCircleArea(Double.parseDouble(""));
        });
    }

    @org.junit.Test
    public void testCircleWithNullRadius() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateCircleArea(Double.parseDouble(null));
        });
    }

    @org.junit.Test
    public void testCircleWithInvalidRadius2() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateCircleArea(Double.parseDouble("abc"));
        });
    }

    @org.junit.Test
    public void testCircleWithInvalidRadius3() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateCircleArea(Double.parseDouble("!@#$123"));
        });}

        @org.junit.Test
        public void testSquareWithValidSide() {
            assertEquals(25, ShapeCalculator.calculateSquareArea(5));
        }

        @org.junit.Test
        public void testSquareWithNegativeSide() {
            assertThrows(IllegalArgumentException.class, () -> {
                ShapeCalculator.calculateSquareArea(-5);
            });
        }

        @org.junit.Test
        public void testSquareWithInvalidSide() {
            assertThrows(NumberFormatException.class, () -> {
                ShapeCalculator.calculateSquareArea(Double.parseDouble(""));
            });
        }

        @org.junit.Test
        public void testSquareWithInvalidSide2() {
            assertThrows(NumberFormatException.class, () -> {
                ShapeCalculator.calculateSquareArea(Double.parseDouble("abc"));
            });
        }

        @org.junit.Test
        public void testSquareWithInvalidSide3() {
            assertThrows(NumberFormatException.class, () -> {
                ShapeCalculator.calculateSquareArea(Double.parseDouble("!@#$123"));
            });
        }
    @org.junit.Test
    public void testRectanglePerimeterWithValidInput() {
        assertEquals(18, ShapeCalculator.calculateRectanglePerimeter(5, 4));
    }

    @org.junit.Test
    public void testRectanglePerimeterWithNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(-5, 4);
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithInvalidLength() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble(""), 4);
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithNullLength() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble(null), 4);
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithInvalidWidth() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(5, Double.parseDouble("abc"));
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithNullWidth() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(5, Double.parseDouble(null));
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithZeroWidth() {
        assertEquals(10, ShapeCalculator.calculateRectanglePerimeter(5, 0));
    }

    @org.junit.Test
    public void testCirclePerimeterWithValidRadius() {
        assertEquals(62.83185307179586, ShapeCalculator.calculateCirclePerimeter(10));
    }

    @org.junit.Test
    public void testCirclePerimeterWithNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeCalculator.calculateCirclePerimeter(-11);
        });
    }

    
    
    
    @org.junit.Test
    public void testCirclePerimeterWithInvalidRadius() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateCirclePerimeter(Double.parseDouble(""));
        });
    }

    
    
    

    
    
    
    
    @org.junit.Test
    public void testCirclePerimeterWithInvalidRadius2() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateCirclePerimeter(Double.parseDouble("abc"));
        });
    }

    
    
    
    
    
    @org.junit.Test
    public void testCirclePerimeterWithInvalidRadius3() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateCirclePerimeter(Double.parseDouble("!@#$123"));
        });
    }

    
    
    
    
    

    @org.junit.Test
    public void testSquarePerimeterWithValidSide() {
        assertEquals(20, ShapeCalculator.calculateSquarePerimeter(5));
    }

    @org.junit.Test
    public void testSquarePerimeterWithNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeCalculator.calculateSquarePerimeter(-5);
        });
    }

    
    
    
    
    @org.junit.Test
    public void testSquarePerimeterWithZeroSide() {
        assertEquals(0, ShapeCalculator.calculateSquarePerimeter(0));
    }

    
    
    
    @org.junit.Test
    public void testSquarePerimeterWithInvalidSide() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateSquarePerimeter(Double.parseDouble(""));
        });
    }

    
    


    
    
    
    
    @org.junit.Test
    public void testSquarePerimeterWithInvalidSide2() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateSquarePerimeter(Double.parseDouble("abc"));
        });
    }

    
    
    @org.junit.Test
    public void testSquarePerimeterWithInvalidSide3() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateSquarePerimeter(Double.parseDouble("!@#$123"));
        });
    }
    
    
    
    
    }








