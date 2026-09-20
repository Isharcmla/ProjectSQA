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
import java.lang.Long;

public class BigFraction_multiply_135937315792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;
     Object term1097;
     Object term10200;
     Object term10174;

    public BigFraction_multiply_135937315792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1074 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
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
        term10200 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term10201 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10202 = (int[]) newIntArray(4);
        Object term10203 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10204 = (int[]) newIntArray(4);
        setIntField(term10201, term10201.getClass(), "signum", 1);
        setIntElement(term10202, 0, 293662311);
        setIntElement(term10202, 1, -2102809913);
        setIntElement(term10202, 2, 592247390);
        setIntElement(term10202, 3, -770722530);
        setField(term10201, term10201.getClass(), "mag", term10202);
        setIntField(term10201, term10201.getClass(), "bitCountPlusOne", 0);
        setIntField(term10201, term10201.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10201, term10201.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10201, term10201.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10200, term10200.getClass(), "numerator", term10201);
        setIntField(term10203, term10203.getClass(), "signum", 1);
        setIntElement(term10204, 0, -233101112);
        setIntElement(term10204, 1, 2084849656);
        setIntElement(term10204, 2, -2065506293);
        setIntElement(term10204, 3, -1198473032);
        setField(term10203, term10203.getClass(), "mag", term10204);
        setIntField(term10203, term10203.getClass(), "bitCountPlusOne", 0);
        setIntField(term10203, term10203.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10203, term10203.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10203, term10203.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10200, term10200.getClass(), "denominator", term10203);
        term10174 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term10175 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10177 = (int[]) newIntArray(6);
        Object term10188 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10190 = (int[]) newIntArray(4);
        setIntField(term10175, term10175.getClass(), "signum", 1);
        setIntElement(term10177, 0, 29495872);
        setIntElement(term10177, 1, 1861749064);
        setIntElement(term10177, 2, -1625279114);
        setIntElement(term10177, 3, -857179257);
        setIntElement(term10177, 4, 1959408141);
        setIntElement(term10177, 5, -1969639919);
        setField(term10175, term10175.getClass(), "mag", term10177);
        setIntField(term10175, term10175.getClass(), "bitCountPlusOne", 0);
        setIntField(term10175, term10175.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10175, term10175.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10175, term10175.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10174, term10174.getClass(), "numerator", term10175);
        setIntField(term10188, term10188.getClass(), "signum", 1);
        setIntElement(term10190, 0, 1015466546);
        setIntElement(term10190, 1, 521212414);
        setIntElement(term10190, 2, 557365250);
        setIntElement(term10190, 3, -299618258);
        setField(term10188, term10188.getClass(), "mag", term10190);
        setIntField(term10188, term10188.getClass(), "bitCountPlusOne", 0);
        setIntField(term10188, term10188.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10188, term10188.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10188, term10188.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10174, term10174.getClass(), "denominator", term10188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1097;
        Object retValue = callMethod(klass, "multiply", argTypes, term1074, args);
        assertTrue(recursiveEquals(term1074, term10200));
        assertTrue(recursiveEquals(term1097, 7411271909051562686L));
        assertTrue(recursiveEquals(retValue, term10174));
    }

};
