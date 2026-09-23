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
import java.lang.Integer;

public class BigFraction_subtract_47674634749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1484;
     Object term1507;

    public BigFraction_subtract_47674634749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1484 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1485 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1487 = (int[]) newIntArray(4);
        Object term1496 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1498 = (int[]) newIntArray(4);
        setIntField(term1485, term1485.getClass(), "signum", 1);
        setIntElement(term1487, 0, -1275013488);
        setIntElement(term1487, 1, -482919067);
        setIntElement(term1487, 2, 2037932451);
        setIntElement(term1487, 3, -269111219);
        setField(term1485, term1485.getClass(), "mag", term1487);
        setIntField(term1485, term1485.getClass(), "bitCountPlusOne", 0);
        setIntField(term1485, term1485.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1485, term1485.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1485, term1485.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1484, term1484.getClass(), "numerator", term1485);
        setIntField(term1496, term1496.getClass(), "signum", 1);
        setIntElement(term1498, 0, -2061083601);
        setIntElement(term1498, 1, -1266083098);
        setIntElement(term1498, 2, -760089252);
        setIntElement(term1498, 3, -1363060924);
        setField(term1496, term1496.getClass(), "mag", term1498);
        setIntField(term1496, term1496.getClass(), "bitCountPlusOne", 0);
        setIntField(term1496, term1496.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1496, term1496.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1496, term1496.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1484, term1484.getClass(), "denominator", term1496);
        term1507 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1507;
        callMethod(klass, "subtract", argTypes, term1484, args);
    }

};


