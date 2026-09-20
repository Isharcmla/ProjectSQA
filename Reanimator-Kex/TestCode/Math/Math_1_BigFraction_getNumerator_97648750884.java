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

public class BigFraction_getNumerator_97648750884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;
     Object term9397;
     Object term9374;

    public BigFraction_getNumerator_97648750884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term810 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term812 = (int[]) newIntArray(4);
        Object term821 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term823 = (int[]) newIntArray(4);
        setIntField(term810, term810.getClass(), "signum", 1);
        setIntElement(term812, 0, -416270825);
        setIntElement(term812, 1, 1927349900);
        setIntElement(term812, 2, 1771220804);
        setIntElement(term812, 3, -1585671012);
        setField(term810, term810.getClass(), "mag", term812);
        setIntField(term810, term810.getClass(), "bitCountPlusOne", 0);
        setIntField(term810, term810.getClass(), "bitLengthPlusOne", 0);
        setIntField(term810, term810.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term810, term810.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term809, term809.getClass(), "numerator", term810);
        setIntField(term821, term821.getClass(), "signum", 1);
        setIntElement(term823, 0, -96625993);
        setIntElement(term823, 1, 858831425);
        setIntElement(term823, 2, 2048299238);
        setIntElement(term823, 3, 1415585975);
        setField(term821, term821.getClass(), "mag", term823);
        setIntField(term821, term821.getClass(), "bitCountPlusOne", 0);
        setIntField(term821, term821.getClass(), "bitLengthPlusOne", 0);
        setIntField(term821, term821.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term821, term821.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term809, term809.getClass(), "denominator", term821);
        term9397 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9398 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9399 = (int[]) newIntArray(4);
        Object term9400 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9401 = (int[]) newIntArray(4);
        setIntField(term9398, term9398.getClass(), "signum", 1);
        setIntElement(term9399, 0, -416270825);
        setIntElement(term9399, 1, 1927349900);
        setIntElement(term9399, 2, 1771220804);
        setIntElement(term9399, 3, -1585671012);
        setField(term9398, term9398.getClass(), "mag", term9399);
        setIntField(term9398, term9398.getClass(), "bitCountPlusOne", 0);
        setIntField(term9398, term9398.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9398, term9398.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9398, term9398.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9397, term9397.getClass(), "numerator", term9398);
        setIntField(term9400, term9400.getClass(), "signum", 1);
        setIntElement(term9401, 0, -96625993);
        setIntElement(term9401, 1, 858831425);
        setIntElement(term9401, 2, 2048299238);
        setIntElement(term9401, 3, 1415585975);
        setField(term9400, term9400.getClass(), "mag", term9401);
        setIntField(term9400, term9400.getClass(), "bitCountPlusOne", 0);
        setIntField(term9400, term9400.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9400, term9400.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9400, term9400.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9397, term9397.getClass(), "denominator", term9400);
        term9374 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9376 = (int[]) newIntArray(4);
        setIntField(term9374, term9374.getClass(), "signum", 1);
        setIntElement(term9376, 0, -416270825);
        setIntElement(term9376, 1, 1927349900);
        setIntElement(term9376, 2, 1771220804);
        setIntElement(term9376, 3, -1585671012);
        setField(term9374, term9374.getClass(), "mag", term9376);
        setIntField(term9374, term9374.getClass(), "bitCountPlusOne", 0);
        setIntField(term9374, term9374.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9374, term9374.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9374, term9374.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumerator", argTypes, term809, args);
        assertTrue(recursiveEquals(term809, term9397));
        assertTrue(recursiveEquals(retValue, term9374));
    }

};
