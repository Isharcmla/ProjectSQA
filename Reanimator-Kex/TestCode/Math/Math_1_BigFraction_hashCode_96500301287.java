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

public class BigFraction_hashCode_96500301287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902;
     Object term9536;

    public BigFraction_hashCode_96500301287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term902 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term903 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term905 = (int[]) newIntArray(4);
        Object term914 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term916 = (int[]) newIntArray(4);
        setIntField(term903, term903.getClass(), "signum", 1);
        setIntElement(term905, 0, -1972950250);
        setIntElement(term905, 1, 1158581818);
        setIntElement(term905, 2, 1884192502);
        setIntElement(term905, 3, 1299154171);
        setField(term903, term903.getClass(), "mag", term905);
        setIntField(term903, term903.getClass(), "bitCountPlusOne", 0);
        setIntField(term903, term903.getClass(), "bitLengthPlusOne", 0);
        setIntField(term903, term903.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term903, term903.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term902, term902.getClass(), "numerator", term903);
        setIntField(term914, term914.getClass(), "signum", 1);
        setIntElement(term916, 0, -14775137);
        setIntElement(term916, 1, -1380788073);
        setIntElement(term916, 2, -1043455465);
        setIntElement(term916, 3, 1812557668);
        setField(term914, term914.getClass(), "mag", term916);
        setIntField(term914, term914.getClass(), "bitCountPlusOne", 0);
        setIntField(term914, term914.getClass(), "bitLengthPlusOne", 0);
        setIntField(term914, term914.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term914, term914.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term902, term902.getClass(), "denominator", term914);
        term9536 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9537 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9538 = (int[]) newIntArray(4);
        Object term9539 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9540 = (int[]) newIntArray(4);
        setIntField(term9537, term9537.getClass(), "signum", 1);
        setIntElement(term9538, 0, -1972950250);
        setIntElement(term9538, 1, 1158581818);
        setIntElement(term9538, 2, 1884192502);
        setIntElement(term9538, 3, 1299154171);
        setField(term9537, term9537.getClass(), "mag", term9538);
        setIntField(term9537, term9537.getClass(), "bitCountPlusOne", 0);
        setIntField(term9537, term9537.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9537, term9537.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9537, term9537.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9536, term9536.getClass(), "numerator", term9537);
        setIntField(term9539, term9539.getClass(), "signum", 1);
        setIntElement(term9540, 0, -14775137);
        setIntElement(term9540, 1, -1380788073);
        setIntElement(term9540, 2, -1043455465);
        setIntElement(term9540, 3, 1812557668);
        setField(term9539, term9539.getClass(), "mag", term9540);
        setIntField(term9539, term9539.getClass(), "bitCountPlusOne", 0);
        setIntField(term9539, term9539.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9539, term9539.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9539, term9539.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9536, term9536.getClass(), "denominator", term9539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term902, args);
        assertTrue(recursiveEquals(term902, term9536));
        assertTrue(recursiveEquals(retValue, 2027434587));
    }

};
