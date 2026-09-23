package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.fraction.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class BigFraction_multiply_70703222991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041;
     Object term1064;
     Object term8120;
     Object term8095;

    public BigFraction_multiply_70703222991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1041 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1042 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1044 = (int[]) newIntArray(4);
        Object term1053 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1055 = (int[]) newIntArray(4);
        setIntField(term1042, term1042.getClass(), "signum", 1);
        setIntElement(term1044, 0, 1239021286);
        setIntElement(term1044, 1, 1589572879);
        setIntElement(term1044, 2, 1925233318);
        setIntElement(term1044, 3, 1848703490);
        setField(term1042, term1042.getClass(), "mag", term1044);
        setIntField(term1042, term1042.getClass(), "bitCountPlusOne", 0);
        setIntField(term1042, term1042.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1042, term1042.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1042, term1042.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1041, term1041.getClass(), "numerator", term1042);
        setIntField(term1053, term1053.getClass(), "signum", 1);
        setIntElement(term1055, 0, 1177792992);
        setIntElement(term1055, 1, -767703544);
        setIntElement(term1055, 2, -1292366590);
        setIntElement(term1055, 3, 1836168570);
        setField(term1053, term1053.getClass(), "mag", term1055);
        setIntField(term1053, term1053.getClass(), "bitCountPlusOne", 0);
        setIntField(term1053, term1053.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1053, term1053.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1053, term1053.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1041, term1041.getClass(), "denominator", term1053);
        term1064 = new Integer(1585847225);
        term8120 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8121 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8122 = (int[]) newIntArray(4);
        Object term8123 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8124 = (int[]) newIntArray(4);
        setIntField(term8121, term8121.getClass(), "signum", 1);
        setIntElement(term8122, 0, 1239021286);
        setIntElement(term8122, 1, 1589572879);
        setIntElement(term8122, 2, 1925233318);
        setIntElement(term8122, 3, 1848703490);
        setField(term8121, term8121.getClass(), "mag", term8122);
        setIntField(term8121, term8121.getClass(), "bitCountPlusOne", 0);
        setIntField(term8121, term8121.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8121, term8121.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8121, term8121.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8120, term8120.getClass(), "numerator", term8121);
        setIntField(term8123, term8123.getClass(), "signum", 1);
        setIntElement(term8124, 0, 1177792992);
        setIntElement(term8124, 1, -767703544);
        setIntElement(term8124, 2, -1292366590);
        setIntElement(term8124, 3, 1836168570);
        setField(term8123, term8123.getClass(), "mag", term8124);
        setIntField(term8123, term8123.getClass(), "bitCountPlusOne", 0);
        setIntField(term8123, term8123.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8123, term8123.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8123, term8123.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8120, term8120.getClass(), "denominator", term8123);
        term8095 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8096 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8098 = (int[]) newIntArray(5);
        Object term8108 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8110 = (int[]) newIntArray(4);
        setIntField(term8096, term8096.getClass(), "signum", 1);
        setIntElement(term8098, 0, 45748857);
        setIntElement(term8098, 1, -2068752425);
        setIntElement(term8098, 2, 1097338436);
        setIntElement(term8098, 3, -1260741598);
        setIntElement(term8098, 4, 169127973);
        setField(term8096, term8096.getClass(), "mag", term8098);
        setIntField(term8096, term8096.getClass(), "bitCountPlusOne", 0);
        setIntField(term8096, term8096.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8096, term8096.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8096, term8096.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8095, term8095.getClass(), "numerator", term8096);
        setIntField(term8108, term8108.getClass(), "signum", 1);
        setIntElement(term8110, 0, 117779299);
        setIntElement(term8110, 1, 1211719834);
        setIntElement(term8110, 2, 2018246989);
        setIntElement(term8110, 3, 183616857);
        setField(term8108, term8108.getClass(), "mag", term8110);
        setIntField(term8108, term8108.getClass(), "bitCountPlusOne", 0);
        setIntField(term8108, term8108.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8108, term8108.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8108, term8108.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8095, term8095.getClass(), "denominator", term8108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1064;
        Object retValue = callMethod(klass, "multiply", argTypes, term1041, args);
        assertTrue(recursiveEquals(term1041, term8120));
        assertTrue(recursiveEquals(term1064, 1585847225));
        assertTrue(recursiveEquals(retValue, term8095));
    }

};


