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

public class BigFraction_getDenominator_78083044081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716;
     Object term7356;
     Object term7333;

    public BigFraction_getDenominator_78083044081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term717 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term719 = (int[]) newIntArray(4);
        Object term728 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term730 = (int[]) newIntArray(4);
        setIntField(term717, term717.getClass(), "signum", 1);
        setIntElement(term719, 0, 23271998);
        setIntElement(term719, 1, 1665933532);
        setIntElement(term719, 2, -2029352665);
        setIntElement(term719, 3, -825384049);
        setField(term717, term717.getClass(), "mag", term719);
        setIntField(term717, term717.getClass(), "bitCountPlusOne", 0);
        setIntField(term717, term717.getClass(), "bitLengthPlusOne", 0);
        setIntField(term717, term717.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term717, term717.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term716, term716.getClass(), "numerator", term717);
        setIntField(term728, term728.getClass(), "signum", 1);
        setIntElement(term730, 0, -1324232828);
        setIntElement(term730, 1, 1852426136);
        setIntElement(term730, 2, -1851277557);
        setIntElement(term730, 3, -903339850);
        setField(term728, term728.getClass(), "mag", term730);
        setIntField(term728, term728.getClass(), "bitCountPlusOne", 0);
        setIntField(term728, term728.getClass(), "bitLengthPlusOne", 0);
        setIntField(term728, term728.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term728, term728.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term716, term716.getClass(), "denominator", term728);
        term7356 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7357 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7358 = (int[]) newIntArray(4);
        Object term7359 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7360 = (int[]) newIntArray(4);
        setIntField(term7357, term7357.getClass(), "signum", 1);
        setIntElement(term7358, 0, 23271998);
        setIntElement(term7358, 1, 1665933532);
        setIntElement(term7358, 2, -2029352665);
        setIntElement(term7358, 3, -825384049);
        setField(term7357, term7357.getClass(), "mag", term7358);
        setIntField(term7357, term7357.getClass(), "bitCountPlusOne", 0);
        setIntField(term7357, term7357.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7357, term7357.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7357, term7357.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7356, term7356.getClass(), "numerator", term7357);
        setIntField(term7359, term7359.getClass(), "signum", 1);
        setIntElement(term7360, 0, -1324232828);
        setIntElement(term7360, 1, 1852426136);
        setIntElement(term7360, 2, -1851277557);
        setIntElement(term7360, 3, -903339850);
        setField(term7359, term7359.getClass(), "mag", term7360);
        setIntField(term7359, term7359.getClass(), "bitCountPlusOne", 0);
        setIntField(term7359, term7359.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7359, term7359.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7359, term7359.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7356, term7356.getClass(), "denominator", term7359);
        term7333 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7335 = (int[]) newIntArray(4);
        setIntField(term7333, term7333.getClass(), "signum", 1);
        setIntElement(term7335, 0, -1324232828);
        setIntElement(term7335, 1, 1852426136);
        setIntElement(term7335, 2, -1851277557);
        setIntElement(term7335, 3, -903339850);
        setField(term7333, term7333.getClass(), "mag", term7335);
        setIntField(term7333, term7333.getClass(), "bitCountPlusOne", 0);
        setIntField(term7333, term7333.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7333, term7333.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7333, term7333.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominator", argTypes, term716, args);
        assertTrue(recursiveEquals(term716, term7356));
        assertTrue(recursiveEquals(retValue, term7333));
    }

};


