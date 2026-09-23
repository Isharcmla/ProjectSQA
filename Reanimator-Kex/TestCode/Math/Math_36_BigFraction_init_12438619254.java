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

public class BigFraction_init_12438619254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1762;
     Object term1767;

    public BigFraction_init_12438619254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3 = (int[]) newIntArray(4);
        setIntField(term1, term1.getClass(), "signum", 1);
        setIntElement(term3, 0, 791012385);
        setIntElement(term3, 1, 819285061);
        setIntElement(term3, 2, 1509521496);
        setIntElement(term3, 3, 1264343831);
        setField(term1, term1.getClass(), "mag", term3);
        setIntField(term1, term1.getClass(), "bitCountPlusOne", 0);
        setIntField(term1, term1.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1, term1.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1, term1.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term1762 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1763 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1764 = (int[]) newIntArray(4);
        Object term1765 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1766 = (int[]) newIntArray(1);
        setIntField(term1763, term1763.getClass(), "signum", 1);
        setIntElement(term1764, 0, 791012385);
        setIntElement(term1764, 1, 819285061);
        setIntElement(term1764, 2, 1509521496);
        setIntElement(term1764, 3, 1264343831);
        setField(term1763, term1763.getClass(), "mag", term1764);
        setIntField(term1763, term1763.getClass(), "bitCountPlusOne", 0);
        setIntField(term1763, term1763.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1763, term1763.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1763, term1763.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1762, term1762.getClass(), "numerator", term1763);
        setIntField(term1765, term1765.getClass(), "signum", 1);
        setIntElement(term1766, 0, 1);
        setField(term1765, term1765.getClass(), "mag", term1766);
        setIntField(term1765, term1765.getClass(), "bitCountPlusOne", 0);
        setIntField(term1765, term1765.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1765, term1765.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1765, term1765.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1762, term1762.getClass(), "denominator", term1765);
        term1767 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1768 = (int[]) newIntArray(4);
        setIntField(term1767, term1767.getClass(), "signum", 1);
        setIntElement(term1768, 0, 791012385);
        setIntElement(term1768, 1, 819285061);
        setIntElement(term1768, 2, 1509521496);
        setIntElement(term1768, 3, 1264343831);
        setField(term1767, term1767.getClass(), "mag", term1768);
        setIntField(term1767, term1767.getClass(), "bitCountPlusOne", 0);
        setIntField(term1767, term1767.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1767, term1767.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1767, term1767.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1762));
        assertTrue(recursiveEquals(term1, term1767));
    }

};


