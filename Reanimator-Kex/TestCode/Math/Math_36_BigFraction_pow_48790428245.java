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
import java.lang.Object;
import java.lang.Double;

public class BigFraction_pow_48790428245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1343;
     Object term1366;

    public BigFraction_pow_48790428245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1343 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1344 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1346 = (int[]) newIntArray(4);
        Object term1355 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1357 = (int[]) newIntArray(4);
        setIntField(term1344, term1344.getClass(), "signum", 1);
        setIntElement(term1346, 0, -1862176886);
        setIntElement(term1346, 1, -2119361788);
        setIntElement(term1346, 2, 335402738);
        setIntElement(term1346, 3, 1395641703);
        setField(term1344, term1344.getClass(), "mag", term1346);
        setIntField(term1344, term1344.getClass(), "bitCountPlusOne", 0);
        setIntField(term1344, term1344.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1344, term1344.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1344, term1344.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1343, term1343.getClass(), "numerator", term1344);
        setIntField(term1355, term1355.getClass(), "signum", 1);
        setIntElement(term1357, 0, -953182332);
        setIntElement(term1357, 1, 1733609660);
        setIntElement(term1357, 2, 686035008);
        setIntElement(term1357, 3, -1772008457);
        setField(term1355, term1355.getClass(), "mag", term1357);
        setIntField(term1355, term1355.getClass(), "bitCountPlusOne", 0);
        setIntField(term1355, term1355.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1355, term1355.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1355, term1355.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1343, term1343.getClass(), "denominator", term1355);
        term1366 = new Double(0.2641345529914265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1366;
        callMethod(klass, "pow", argTypes, term1343, args);
    }

};


