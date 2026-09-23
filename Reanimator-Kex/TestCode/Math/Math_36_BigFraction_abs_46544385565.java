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

public class BigFraction_abs_46544385565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term4279;
     Object term4256;

    public BigFraction_abs_46544385565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term4279 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4280 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4281 = (int[]) newIntArray(4);
        Object term4282 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4283 = (int[]) newIntArray(4);
        setIntField(term4280, term4280.getClass(), "signum", 1);
        setIntElement(term4281, 0, 1397923395);
        setIntElement(term4281, 1, 1257594315);
        setIntElement(term4281, 2, -1189378466);
        setIntElement(term4281, 3, 834705699);
        setField(term4280, term4280.getClass(), "mag", term4281);
        setIntField(term4280, term4280.getClass(), "bitCountPlusOne", 0);
        setIntField(term4280, term4280.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4280, term4280.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4280, term4280.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4279, term4279.getClass(), "numerator", term4280);
        setIntField(term4282, term4282.getClass(), "signum", 1);
        setIntElement(term4283, 0, -890532197);
        setIntElement(term4283, 1, 1140403369);
        setIntElement(term4283, 2, 1309324128);
        setIntElement(term4283, 3, 1465941822);
        setField(term4282, term4282.getClass(), "mag", term4283);
        setIntField(term4282, term4282.getClass(), "bitCountPlusOne", 0);
        setIntField(term4282, term4282.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4282, term4282.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4282, term4282.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4279, term4279.getClass(), "denominator", term4282);
        term4256 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4257 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4259 = (int[]) newIntArray(4);
        Object term4268 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4270 = (int[]) newIntArray(4);
        setIntField(term4257, term4257.getClass(), "signum", 1);
        setIntElement(term4259, 0, 1397923395);
        setIntElement(term4259, 1, 1257594315);
        setIntElement(term4259, 2, -1189378466);
        setIntElement(term4259, 3, 834705699);
        setField(term4257, term4257.getClass(), "mag", term4259);
        setIntField(term4257, term4257.getClass(), "bitCountPlusOne", 0);
        setIntField(term4257, term4257.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4257, term4257.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4257, term4257.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4256, term4256.getClass(), "numerator", term4257);
        setIntField(term4268, term4268.getClass(), "signum", 1);
        setIntElement(term4270, 0, -890532197);
        setIntElement(term4270, 1, 1140403369);
        setIntElement(term4270, 2, 1309324128);
        setIntElement(term4270, 3, 1465941822);
        setField(term4268, term4268.getClass(), "mag", term4270);
        setIntField(term4268, term4268.getClass(), "bitCountPlusOne", 0);
        setIntField(term4268, term4268.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4268, term4268.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4268, term4268.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4256, term4256.getClass(), "denominator", term4268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term82, args);
        assertTrue(recursiveEquals(term82, term4279));
        assertTrue(recursiveEquals(retValue, term4256));
    }

};


