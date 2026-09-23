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

public class BigFraction_getNumerator_7609773984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;
     Object term7515;
     Object term7492;

    public BigFraction_getNumerator_7609773984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term7515 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7516 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7517 = (int[]) newIntArray(4);
        Object term7518 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7519 = (int[]) newIntArray(4);
        setIntField(term7516, term7516.getClass(), "signum", 1);
        setIntElement(term7517, 0, -416270825);
        setIntElement(term7517, 1, 1927349900);
        setIntElement(term7517, 2, 1771220804);
        setIntElement(term7517, 3, -1585671012);
        setField(term7516, term7516.getClass(), "mag", term7517);
        setIntField(term7516, term7516.getClass(), "bitCountPlusOne", 0);
        setIntField(term7516, term7516.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7516, term7516.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7516, term7516.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7515, term7515.getClass(), "numerator", term7516);
        setIntField(term7518, term7518.getClass(), "signum", 1);
        setIntElement(term7519, 0, -96625993);
        setIntElement(term7519, 1, 858831425);
        setIntElement(term7519, 2, 2048299238);
        setIntElement(term7519, 3, 1415585975);
        setField(term7518, term7518.getClass(), "mag", term7519);
        setIntField(term7518, term7518.getClass(), "bitCountPlusOne", 0);
        setIntField(term7518, term7518.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7518, term7518.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7518, term7518.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7515, term7515.getClass(), "denominator", term7518);
        term7492 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7494 = (int[]) newIntArray(4);
        setIntField(term7492, term7492.getClass(), "signum", 1);
        setIntElement(term7494, 0, -416270825);
        setIntElement(term7494, 1, 1927349900);
        setIntElement(term7494, 2, 1771220804);
        setIntElement(term7494, 3, -1585671012);
        setField(term7492, term7492.getClass(), "mag", term7494);
        setIntField(term7492, term7492.getClass(), "bitCountPlusOne", 0);
        setIntField(term7492, term7492.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7492, term7492.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7492, term7492.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumerator", argTypes, term809, args);
        assertTrue(recursiveEquals(term809, term7515));
        assertTrue(recursiveEquals(retValue, term7492));
    }

};


