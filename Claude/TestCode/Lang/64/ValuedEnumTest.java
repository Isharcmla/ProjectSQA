import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ValuedEnumTest {

    /**
     * Concrete subclass of ValuedEnum used for testing purposes,
     * since ValuedEnum is abstract.
     */
    public static final class ColorEnum extends ValuedEnum {
        public static final int RED_VALUE = 0;
        public static final int GREEN_VALUE = 1;
        public static final int BLUE_VALUE = 2;

        public static final ColorEnum RED = new ColorEnum("Red", RED_VALUE);
        public static final ColorEnum GREEN = new ColorEnum("Green", GREEN_VALUE);
        public static final ColorEnum BLUE = new ColorEnum("Blue", BLUE_VALUE);

        private ColorEnum(String name, int value) {
            super(name, value);
        }

        public static ColorEnum getEnum(int value) {
            return (ColorEnum) ValuedEnum.getEnum(ColorEnum.class, value);
        }
    }

    /**
     * A second, distinct ValuedEnum subclass used to test cross-class
     * comparisons (which are allowed since compareTo only casts to ValuedEnum).
     */
    public static final class ShapeEnum extends ValuedEnum {
        public static final int CIRCLE_VALUE = 0;
        public static final ShapeEnum CIRCLE = new ShapeEnum("Circle", CIRCLE_VALUE);

        private ShapeEnum(String name, int value) {
            super(name, value);
        }
    }

    @Before
    public void setUp() {
        // No special setup required; enums are initialized via static fields.
    }

    // -------------------- getValue() tests --------------------

    @Test
    public void testGetValue_normalEnum_returnsCorrectValue() {
        assertEquals(ColorEnum.RED_VALUE, ColorEnum.RED.getValue());
        assertEquals(ColorEnum.GREEN_VALUE, ColorEnum.GREEN.getValue());
        assertEquals(ColorEnum.BLUE_VALUE, ColorEnum.BLUE.getValue());
    }

    // -------------------- getEnum(Class, int) tests --------------------

    @Test
    public void testGetEnum_validValue_returnsMatchingEnum() {
        ColorEnum result = ColorEnum.getEnum(ColorEnum.GREEN_VALUE);
        assertNotNull(result);
        assertEquals(ColorEnum.GREEN, result);
        assertEquals("Green", result.getName());
    }

    @Test
    public void testGetEnum_invalidValue_returnsNull() {
        ColorEnum result = ColorEnum.getEnum(999);
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEnum_nullClass_throwsIllegalArgumentException() {
        ValuedEnum.getEnum(null, 0);
    }

    // -------------------- compareTo(Object) tests --------------------

    @Test
    public void testCompareTo_lesserValue_returnsNegative() {
        int result = ColorEnum.RED.compareTo(ColorEnum.GREEN);
        assertTrue(result < 0);
    }

    @Test
    public void testCompareTo_greaterValue_returnsPositive() {
        int result = ColorEnum.BLUE.compareTo(ColorEnum.RED);
        assertTrue(result > 0);
    }

    @Test
    public void testCompareTo_equalValue_returnsZero() {
        int result = ColorEnum.RED.compareTo(ColorEnum.RED);
        assertEquals(0, result);
    }

    @Test
    public void testCompareTo_crossClassSameValue_returnsZero() {
        // ShapeEnum.CIRCLE has value 0, same as ColorEnum.RED
        int result = ColorEnum.RED.compareTo(ShapeEnum.CIRCLE);
        assertEquals(0, result);
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_nullArgument_throwsNullPointerException() {
        ColorEnum.RED.compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_invalidType_throwsClassCastException() {
        ColorEnum.RED.compareTo("Not a ValuedEnum");
    }

    // -------------------- toString() tests --------------------

    @Test
    public void testToString_returnsFormattedString() {
        String result = ColorEnum.RED.toString();
        assertNotNull(result);
        assertTrue(result.contains("Red"));
        assertTrue(result.contains(String.valueOf(ColorEnum.RED_VALUE)));
        assertTrue(result.startsWith("ColorEnum["));
        assertTrue(result.endsWith("]"));
    }

    @Test
    public void testToString_calledTwice_returnsSameValue() {
        String firstCall = ColorEnum.GREEN.toString();
        String secondCall = ColorEnum.GREEN.toString();
        assertEquals(firstCall, secondCall);
    }

    @Test
    public void testToString_differentEnums_returnsDifferentStrings() {
        String redString = ColorEnum.RED.toString();
        String blueString = ColorEnum.BLUE.toString();
        assertFalse(redString.equals(blueString));
    }
}
