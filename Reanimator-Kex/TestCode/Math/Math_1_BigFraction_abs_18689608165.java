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

public class BigFraction_abs_18689608165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term6156;
     Object term6133;

    public BigFraction_abs_18689608165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term83 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term85 = (int[]) newIntArray(4);
        Object term94 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term96 = (int[]) newIntArray(4);
        setIntField(term83, term83.getClass(), "signum", 1);
        setIntElement(term85, 0, 1397923395);
        setIntElement(term85, 1, 1257594315);
        setIntElement(term85, 2, -1189378466);
        setIntElement(term85, 3, 834705699);
        setField(term83, term83.getClass(), "mag", term85);
        setIntField(term83, term83.getClass(), "bitCountPlusOne", 0);
        setIntField(term83, term83.getClass(), "bitLengthPlusOne", 0);
        setIntField(term83, term83.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term83, term83.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term82, term82.getClass(), "numerator", term83);
        setIntField(term94, term94.getClass(), "signum", 1);
        setIntElement(term96, 0, -890532197);
        setIntElement(term96, 1, 1140403369);
        setIntElement(term96, 2, 1309324128);
        setIntElement(term96, 3, 1465941822);
        setField(term94, term94.getClass(), "mag", term96);
        setIntField(term94, term94.getClass(), "bitCountPlusOne", 0);
        setIntField(term94, term94.getClass(), "bitLengthPlusOne", 0);
        setIntField(term94, term94.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term94, term94.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term82, term82.getClass(), "denominator", term94);
        term6156 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6157 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6158 = (int[]) newIntArray(4);
        Object term6159 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6160 = (int[]) newIntArray(4);
        setIntField(term6157, term6157.getClass(), "signum", 1);
        setIntElement(term6158, 0, 1397923395);
        setIntElement(term6158, 1, 1257594315);
        setIntElement(term6158, 2, -1189378466);
        setIntElement(term6158, 3, 834705699);
        setField(term6157, term6157.getClass(), "mag", term6158);
        setIntField(term6157, term6157.getClass(), "bitCountPlusOne", 0);
        setIntField(term6157, term6157.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6157, term6157.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6157, term6157.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6156, term6156.getClass(), "numerator", term6157);
        setIntField(term6159, term6159.getClass(), "signum", 1);
        setIntElement(term6160, 0, -890532197);
        setIntElement(term6160, 1, 1140403369);
        setIntElement(term6160, 2, 1309324128);
        setIntElement(term6160, 3, 1465941822);
        setField(term6159, term6159.getClass(), "mag", term6160);
        setIntField(term6159, term6159.getClass(), "bitCountPlusOne", 0);
        setIntField(term6159, term6159.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6159, term6159.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6159, term6159.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6156, term6156.getClass(), "denominator", term6159);
        term6133 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6134 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6136 = (int[]) newIntArray(4);
        Object term6145 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6147 = (int[]) newIntArray(4);
        setIntField(term6134, term6134.getClass(), "signum", 1);
        setIntElement(term6136, 0, 1397923395);
        setIntElement(term6136, 1, 1257594315);
        setIntElement(term6136, 2, -1189378466);
        setIntElement(term6136, 3, 834705699);
        setField(term6134, term6134.getClass(), "mag", term6136);
        setIntField(term6134, term6134.getClass(), "bitCountPlusOne", 0);
        setIntField(term6134, term6134.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6134, term6134.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6134, term6134.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6133, term6133.getClass(), "numerator", term6134);
        setIntField(term6145, term6145.getClass(), "signum", 1);
        setIntElement(term6147, 0, -890532197);
        setIntElement(term6147, 1, 1140403369);
        setIntElement(term6147, 2, 1309324128);
        setIntElement(term6147, 3, 1465941822);
        setField(term6145, term6145.getClass(), "mag", term6147);
        setIntField(term6145, term6145.getClass(), "bitCountPlusOne", 0);
        setIntField(term6145, term6145.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6145, term6145.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6145, term6145.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6133, term6133.getClass(), "denominator", term6145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term82, args);
        assertTrue(recursiveEquals(term82, term6156));
        assertTrue(recursiveEquals(retValue, term6133));
    }

};
