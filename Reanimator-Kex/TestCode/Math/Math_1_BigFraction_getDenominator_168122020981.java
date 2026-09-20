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

public class BigFraction_getDenominator_168122020981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716;
     Object term9259;
     Object term9236;

    public BigFraction_getDenominator_168122020981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
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
        term9259 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9260 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9261 = (int[]) newIntArray(4);
        Object term9262 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9263 = (int[]) newIntArray(4);
        setIntField(term9260, term9260.getClass(), "signum", 1);
        setIntElement(term9261, 0, 23271998);
        setIntElement(term9261, 1, 1665933532);
        setIntElement(term9261, 2, -2029352665);
        setIntElement(term9261, 3, -825384049);
        setField(term9260, term9260.getClass(), "mag", term9261);
        setIntField(term9260, term9260.getClass(), "bitCountPlusOne", 0);
        setIntField(term9260, term9260.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9260, term9260.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9260, term9260.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9259, term9259.getClass(), "numerator", term9260);
        setIntField(term9262, term9262.getClass(), "signum", 1);
        setIntElement(term9263, 0, -1324232828);
        setIntElement(term9263, 1, 1852426136);
        setIntElement(term9263, 2, -1851277557);
        setIntElement(term9263, 3, -903339850);
        setField(term9262, term9262.getClass(), "mag", term9263);
        setIntField(term9262, term9262.getClass(), "bitCountPlusOne", 0);
        setIntField(term9262, term9262.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9262, term9262.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9262, term9262.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9259, term9259.getClass(), "denominator", term9262);
        term9236 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9238 = (int[]) newIntArray(4);
        setIntField(term9236, term9236.getClass(), "signum", 1);
        setIntElement(term9238, 0, -1324232828);
        setIntElement(term9238, 1, 1852426136);
        setIntElement(term9238, 2, -1851277557);
        setIntElement(term9238, 3, -903339850);
        setField(term9236, term9236.getClass(), "mag", term9238);
        setIntField(term9236, term9236.getClass(), "bitCountPlusOne", 0);
        setIntField(term9236, term9236.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9236, term9236.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9236, term9236.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominator", argTypes, term716, args);
        assertTrue(recursiveEquals(term716, term9259));
        assertTrue(recursiveEquals(retValue, term9236));
    }

};
