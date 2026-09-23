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
import java.lang.Integer;
import java.lang.Object;

public class BigFraction_init_99160037660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;
     Object term3819;

    public BigFraction_init_99160037660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = new Integer(-1922583790);
        term3819 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term3820 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3821 = (int[]) newIntArray(1);
        Object term3822 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3823 = (int[]) newIntArray(1);
        setIntField(term3820, term3820.getClass(), "signum", -1);
        setIntElement(term3821, 0, 1922583790);
        setField(term3820, term3820.getClass(), "mag", term3821);
        setIntField(term3820, term3820.getClass(), "bitCountPlusOne", 0);
        setIntField(term3820, term3820.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3820, term3820.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3820, term3820.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3819, term3819.getClass(), "numerator", term3820);
        setIntField(term3822, term3822.getClass(), "signum", 1);
        setIntElement(term3823, 0, 1);
        setField(term3822, term3822.getClass(), "mag", term3823);
        setIntField(term3822, term3822.getClass(), "bitCountPlusOne", 0);
        setIntField(term3822, term3822.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3822, term3822.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3822, term3822.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3819, term3819.getClass(), "denominator", term3822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3819));
        assertTrue(recursiveEquals(term66, -1922583790));
    }

};


