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
import java.lang.Long;

public class BigFraction_multiply_70703322192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;
     Object term1097;
     Object term8318;
     Object term8292;

    public BigFraction_multiply_70703322192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1074 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1075 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1077 = (int[]) newIntArray(4);
        Object term1086 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1088 = (int[]) newIntArray(4);
        setIntField(term1075, term1075.getClass(), "signum", 1);
        setIntElement(term1077, 0, 293662311);
        setIntElement(term1077, 1, -2102809913);
        setIntElement(term1077, 2, 592247390);
        setIntElement(term1077, 3, -770722530);
        setField(term1075, term1075.getClass(), "mag", term1077);
        setIntField(term1075, term1075.getClass(), "bitCountPlusOne", 0);
        setIntField(term1075, term1075.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1075, term1075.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1075, term1075.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1074, term1074.getClass(), "numerator", term1075);
        setIntField(term1086, term1086.getClass(), "signum", 1);
        setIntElement(term1088, 0, -233101112);
        setIntElement(term1088, 1, 2084849656);
        setIntElement(term1088, 2, -2065506293);
        setIntElement(term1088, 3, -1198473032);
        setField(term1086, term1086.getClass(), "mag", term1088);
        setIntField(term1086, term1086.getClass(), "bitCountPlusOne", 0);
        setIntField(term1086, term1086.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1086, term1086.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1086, term1086.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1074, term1074.getClass(), "denominator", term1086);
        term1097 = new Long(7411271909051562686L);
        term8318 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8319 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8320 = (int[]) newIntArray(4);
        Object term8321 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8322 = (int[]) newIntArray(4);
        setIntField(term8319, term8319.getClass(), "signum", 1);
        setIntElement(term8320, 0, 293662311);
        setIntElement(term8320, 1, -2102809913);
        setIntElement(term8320, 2, 592247390);
        setIntElement(term8320, 3, -770722530);
        setField(term8319, term8319.getClass(), "mag", term8320);
        setIntField(term8319, term8319.getClass(), "bitCountPlusOne", 0);
        setIntField(term8319, term8319.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8319, term8319.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8319, term8319.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8318, term8318.getClass(), "numerator", term8319);
        setIntField(term8321, term8321.getClass(), "signum", 1);
        setIntElement(term8322, 0, -233101112);
        setIntElement(term8322, 1, 2084849656);
        setIntElement(term8322, 2, -2065506293);
        setIntElement(term8322, 3, -1198473032);
        setField(term8321, term8321.getClass(), "mag", term8322);
        setIntField(term8321, term8321.getClass(), "bitCountPlusOne", 0);
        setIntField(term8321, term8321.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8321, term8321.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8321, term8321.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8318, term8318.getClass(), "denominator", term8321);
        term8292 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8293 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8295 = (int[]) newIntArray(6);
        Object term8306 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8308 = (int[]) newIntArray(4);
        setIntField(term8293, term8293.getClass(), "signum", 1);
        setIntElement(term8295, 0, 29495872);
        setIntElement(term8295, 1, 1861749064);
        setIntElement(term8295, 2, -1625279114);
        setIntElement(term8295, 3, -857179257);
        setIntElement(term8295, 4, 1959408141);
        setIntElement(term8295, 5, -1969639919);
        setField(term8293, term8293.getClass(), "mag", term8295);
        setIntField(term8293, term8293.getClass(), "bitCountPlusOne", 0);
        setIntField(term8293, term8293.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8293, term8293.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8293, term8293.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8292, term8292.getClass(), "numerator", term8293);
        setIntField(term8306, term8306.getClass(), "signum", 1);
        setIntElement(term8308, 0, 1015466546);
        setIntElement(term8308, 1, 521212414);
        setIntElement(term8308, 2, 557365250);
        setIntElement(term8308, 3, -299618258);
        setField(term8306, term8306.getClass(), "mag", term8308);
        setIntField(term8306, term8306.getClass(), "bitCountPlusOne", 0);
        setIntField(term8306, term8306.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8306, term8306.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8306, term8306.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8292, term8292.getClass(), "denominator", term8306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1097;
        Object retValue = callMethod(klass, "multiply", argTypes, term1074, args);
        assertTrue(recursiveEquals(term1074, term8318));
        assertTrue(recursiveEquals(term1097, 7411271909051562686L));
        assertTrue(recursiveEquals(retValue, term8292));
    }

};


