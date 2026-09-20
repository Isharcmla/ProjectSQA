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
import java.lang.Object;

public class BigFraction_reciprocal_103191794546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1376;

    public BigFraction_reciprocal_103191794546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1376 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1377 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1379 = (int[]) newIntArray(4);
        Object term1388 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1390 = (int[]) newIntArray(4);
        setIntField(term1377, term1377.getClass(), "signum", 1);
        setIntElement(term1379, 0, -1590849233);
        setIntElement(term1379, 1, 1173538591);
        setIntElement(term1379, 2, 1062959934);
        setIntElement(term1379, 3, -685518428);
        setField(term1377, term1377.getClass(), "mag", term1379);
        setIntField(term1377, term1377.getClass(), "bitCountPlusOne", 0);
        setIntField(term1377, term1377.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1377, term1377.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1377, term1377.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1376, term1376.getClass(), "numerator", term1377);
        setIntField(term1388, term1388.getClass(), "signum", 1);
        setIntElement(term1390, 0, -737396276);
        setIntElement(term1390, 1, -1999136398);
        setIntElement(term1390, 2, -920096120);
        setIntElement(term1390, 3, 1530907886);
        setField(term1388, term1388.getClass(), "mag", term1390);
        setIntField(term1388, term1388.getClass(), "bitCountPlusOne", 0);
        setIntField(term1388, term1388.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1388, term1388.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1388, term1388.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1376, term1376.getClass(), "denominator", term1388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reciprocal", argTypes, term1376, args);
    }

};
