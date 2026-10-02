import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.internal.util.Primitives;

public class PrimitivesTest {

    // ---------- primitiveTypeOf ----------

    @Test
    public void testPrimitiveTypeOf_primitiveClassPassed_returnsSameClass() {
        assertEquals(int.class, Primitives.primitiveTypeOf(int.class));
        assertEquals(boolean.class, Primitives.primitiveTypeOf(boolean.class));
        assertEquals(char.class, Primitives.primitiveTypeOf(char.class));
        assertEquals(byte.class, Primitives.primitiveTypeOf(byte.class));
        assertEquals(short.class, Primitives.primitiveTypeOf(short.class));
        assertEquals(long.class, Primitives.primitiveTypeOf(long.class));
        assertEquals(float.class, Primitives.primitiveTypeOf(float.class));
        assertEquals(double.class, Primitives.primitiveTypeOf(double.class));
    }

    @Test
    public void testPrimitiveTypeOf_wrapperClassPassed_returnsCorrespondingPrimitive() {
        assertEquals(Boolean.TYPE, Primitives.primitiveTypeOf(Boolean.class));
        assertEquals(Character.TYPE, Primitives.primitiveTypeOf(Character.class));
        assertEquals(Byte.TYPE, Primitives.primitiveTypeOf(Byte.class));
        assertEquals(Short.TYPE, Primitives.primitiveTypeOf(Short.class));
        assertEquals(Integer.TYPE, Primitives.primitiveTypeOf(Integer.class));
        assertEquals(Long.TYPE, Primitives.primitiveTypeOf(Long.class));
        assertEquals(Float.TYPE, Primitives.primitiveTypeOf(Float.class));
        assertEquals(Double.TYPE, Primitives.primitiveTypeOf(Double.class));
    }

    @Test
    public void testPrimitiveTypeOf_nonPrimitiveNonWrapperClassPassed_returnsNull() {
        assertNull(Primitives.primitiveTypeOf(String.class));
        assertNull(Primitives.primitiveTypeOf(Object.class));
    }

    @Test(expected = NullPointerException.class)
    public void testPrimitiveTypeOf_nullPassed_throwsNullPointerException() {
        Primitives.primitiveTypeOf(null);
    }

    // ---------- isPrimitiveWrapper ----------

    @Test
    public void testIsPrimitiveWrapper_wrapperTypesPassed_returnsTrue() {
        assertTrue(Primitives.isPrimitiveWrapper(Boolean.class));
        assertTrue(Primitives.isPrimitiveWrapper(Character.class));
        assertTrue(Primitives.isPrimitiveWrapper(Byte.class));
        assertTrue(Primitives.isPrimitiveWrapper(Short.class));
        assertTrue(Primitives.isPrimitiveWrapper(Integer.class));
        assertTrue(Primitives.isPrimitiveWrapper(Long.class));
        assertTrue(Primitives.isPrimitiveWrapper(Float.class));
        assertTrue(Primitives.isPrimitiveWrapper(Double.class));
    }

    @Test
    public void testIsPrimitiveWrapper_nonWrapperTypePassed_returnsFalse() {
        assertFalse(Primitives.isPrimitiveWrapper(String.class));
        assertFalse(Primitives.isPrimitiveWrapper(Object.class));
        assertFalse(Primitives.isPrimitiveWrapper(int.class));
    }

    @Test
    public void testIsPrimitiveWrapper_nullPassed_returnsFalse() {
        assertFalse(Primitives.isPrimitiveWrapper(null));
    }

    // ---------- primitiveWrapperOf ----------

    @Test
    public void testPrimitiveWrapperOf_wrapperTypesPassed_returnsDefaultValues() {
        assertEquals(Boolean.FALSE, Primitives.primitiveWrapperOf(Boolean.class));
        assertEquals(Character.valueOf('\u0000'), Primitives.primitiveWrapperOf(Character.class));
        assertEquals(Byte.valueOf((byte) 0), Primitives.primitiveWrapperOf(Byte.class));
        assertEquals(Short.valueOf((short) 0), Primitives.primitiveWrapperOf(Short.class));
        assertEquals(Integer.valueOf(0), Primitives.primitiveWrapperOf(Integer.class));
        assertEquals(Long.valueOf(0L), Primitives.primitiveWrapperOf(Long.class));
        assertEquals(Float.valueOf(0F), Primitives.primitiveWrapperOf(Float.class));
        assertEquals(Double.valueOf(0D), Primitives.primitiveWrapperOf(Double.class));
    }

    @Test
    public void testPrimitiveWrapperOf_nonWrapperTypePassed_returnsNull() {
        assertNull(Primitives.primitiveWrapperOf(String.class));
    }

    @Test
    public void testPrimitiveWrapperOf_nullPassed_returnsNull() {
        assertNull(Primitives.primitiveWrapperOf(null));
    }

    // ---------- primitiveValueOrNullFor ----------

    @Test
    public void testPrimitiveValueOrNullFor_primitiveTypesPassed_returnsDefaultValues() {
        assertEquals(Boolean.FALSE, Primitives.primitiveValueOrNullFor(boolean.class));
        assertEquals(Character.valueOf('\u0000'), Primitives.primitiveValueOrNullFor(char.class));
        assertEquals(Byte.valueOf((byte) 0), Primitives.primitiveValueOrNullFor(byte.class));
        assertEquals(Short.valueOf((short) 0), Primitives.primitiveValueOrNullFor(short.class));
        assertEquals(Integer.valueOf(0), Primitives.primitiveValueOrNullFor(int.class));
        assertEquals(Long.valueOf(0L), Primitives.primitiveValueOrNullFor(long.class));
        assertEquals(Float.valueOf(0F), Primitives.primitiveValueOrNullFor(float.class));
        assertEquals(Double.valueOf(0D), Primitives.primitiveValueOrNullFor(double.class));
    }

    @Test
    public void testPrimitiveValueOrNullFor_nonPrimitiveTypePassed_returnsNull() {
        assertNull(Primitives.primitiveValueOrNullFor(String.class));
        assertNull(Primitives.primitiveValueOrNullFor(Integer.class));
    }

    @Test
    public void testPrimitiveValueOrNullFor_nullPassed_returnsNull() {
        assertNull(Primitives.primitiveValueOrNullFor(null));
    }
}
