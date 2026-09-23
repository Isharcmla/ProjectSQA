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
import java.lang.Long;

public class BigFraction_subtract_47674535550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1517;
     Object term1540;

    public BigFraction_subtract_47674535550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1517 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1518 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1520 = (int[]) newIntArray(4);
        Object term1529 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1531 = (int[]) newIntArray(4);
        setIntField(term1518, term1518.getClass(), "signum", 1);
        setIntElement(term1520, 0, -1761316980);
        setIntElement(term1520, 1, 587915678);
        setIntElement(term1520, 2, -1333264903);
        setIntElement(term1520, 3, 1626917933);
        setField(term1518, term1518.getClass(), "mag", term1520);
        setIntField(term1518, term1518.getClass(), "bitCountPlusOne", 0);
        setIntField(term1518, term1518.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1518, term1518.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1518, term1518.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1517, term1517.getClass(), "numerator", term1518);
        setIntField(term1529, term1529.getClass(), "signum", 1);
        setIntElement(term1531, 0, -1099162389);
        setIntElement(term1531, 1, 1840943291);
        setIntElement(term1531, 2, -732619534);
        setIntElement(term1531, 3, 1693877868);
        setField(term1529, term1529.getClass(), "mag", term1531);
        setIntField(term1529, term1529.getClass(), "bitCountPlusOne", 0);
        setIntField(term1529, term1529.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1529, term1529.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1529, term1529.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1517, term1517.getClass(), "denominator", term1529);
        term1540 = new Long(6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1540;
        callMethod(klass, "subtract", argTypes, term1517, args);
    }

};


