package org.apache.commons.math3.fraction;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;
import java.lang.Object;

public class BigFraction_init_188989908755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term27;
     Object term1887;
     Object term1892;
     Object term1894;

    public BigFraction_init_188989908755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term18 = (int[]) newIntArray(4);
        setIntField(term16, term16.getClass(), "signum", 1);
        setIntElement(term18, 0, 313747341);
        setIntElement(term18, 1, -964936229);
        setIntElement(term18, 2, -478647413);
        setIntElement(term18, 3, -898923898);
        setField(term16, term16.getClass(), "mag", term18);
        setIntField(term16, term16.getClass(), "bitCountPlusOne", 0);
        setIntField(term16, term16.getClass(), "bitLengthPlusOne", 0);
        setIntField(term16, term16.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term16, term16.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term27 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term29 = (int[]) newIntArray(4);
        setIntField(term27, term27.getClass(), "signum", 1);
        setIntElement(term29, 0, -165862327);
        setIntElement(term29, 1, 1335502000);
        setIntElement(term29, 2, -1994335642);
        setIntElement(term29, 3, -1099245088);
        setField(term27, term27.getClass(), "mag", term29);
        setIntField(term27, term27.getClass(), "bitCountPlusOne", 0);
        setIntField(term27, term27.getClass(), "bitLengthPlusOne", 0);
        setIntField(term27, term27.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term27, term27.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term1887 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1888 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1889 = (int[]) newIntArray(4);
        Object term1890 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1891 = (int[]) newIntArray(4);
        setIntField(term1888, term1888.getClass(), "signum", 1);
        setIntElement(term1889, 0, 156873670);
        setIntElement(term1889, 1, -482468115);
        setIntElement(term1889, 2, -239323707);
        setIntElement(term1889, 3, -449461949);
        setField(term1888, term1888.getClass(), "mag", term1889);
        setIntField(term1888, term1888.getClass(), "bitCountPlusOne", 0);
        setIntField(term1888, term1888.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1888, term1888.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1888, term1888.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1887, term1887.getClass(), "numerator", term1888);
        setIntField(term1890, term1890.getClass(), "signum", 1);
        setIntElement(term1891, 0, 2064552484);
        setIntElement(term1891, 1, -1479732648);
        setIntElement(term1891, 2, 1150315827);
        setIntElement(term1891, 3, 1597861104);
        setField(term1890, term1890.getClass(), "mag", term1891);
        setIntField(term1890, term1890.getClass(), "bitCountPlusOne", 0);
        setIntField(term1890, term1890.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1890, term1890.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1890, term1890.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1887, term1887.getClass(), "denominator", term1890);
        term1892 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1893 = (int[]) newIntArray(4);
        setIntField(term1892, term1892.getClass(), "signum", 1);
        setIntElement(term1893, 0, 313747341);
        setIntElement(term1893, 1, -964936229);
        setIntElement(term1893, 2, -478647413);
        setIntElement(term1893, 3, -898923898);
        setField(term1892, term1892.getClass(), "mag", term1893);
        setIntField(term1892, term1892.getClass(), "bitCountPlusOne", 0);
        setIntField(term1892, term1892.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1892, term1892.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1892, term1892.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term1894 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1895 = (int[]) newIntArray(4);
        setIntField(term1894, term1894.getClass(), "signum", 1);
        setIntElement(term1895, 0, -165862327);
        setIntElement(term1895, 1, 1335502000);
        setIntElement(term1895, 2, -1994335642);
        setIntElement(term1895, 3, -1099245088);
        setField(term1894, term1894.getClass(), "mag", term1895);
        setIntField(term1894, term1894.getClass(), "bitCountPlusOne", 0);
        setIntField(term1894, term1894.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1894, term1894.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1894, term1894.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigInteger");
        argTypes[1] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[2];
        args[0] = term16;
        args[1] = term27;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1887));
        assertTrue(recursiveEquals(term16, term1892));
        assertTrue(recursiveEquals(term27, term1894));
    }

};
