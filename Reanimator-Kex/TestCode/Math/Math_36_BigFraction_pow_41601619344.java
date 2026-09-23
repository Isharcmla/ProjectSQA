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

public class BigFraction_pow_41601619344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1297;
     Object term1320;

    public BigFraction_pow_41601619344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1297 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1298 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1300 = (int[]) newIntArray(4);
        Object term1309 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1311 = (int[]) newIntArray(4);
        setIntField(term1298, term1298.getClass(), "signum", 1);
        setIntElement(term1300, 0, 1365219088);
        setIntElement(term1300, 1, -455050259);
        setIntElement(term1300, 2, -297902631);
        setIntElement(term1300, 3, -1016094089);
        setField(term1298, term1298.getClass(), "mag", term1300);
        setIntField(term1298, term1298.getClass(), "bitCountPlusOne", 0);
        setIntField(term1298, term1298.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1298, term1298.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1298, term1298.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1297, term1297.getClass(), "numerator", term1298);
        setIntField(term1309, term1309.getClass(), "signum", 1);
        setIntElement(term1311, 0, 1189557563);
        setIntElement(term1311, 1, 1494967506);
        setIntElement(term1311, 2, -1652109670);
        setIntElement(term1311, 3, 1005730893);
        setField(term1309, term1309.getClass(), "mag", term1311);
        setIntField(term1309, term1309.getClass(), "bitCountPlusOne", 0);
        setIntField(term1309, term1309.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1309, term1309.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1309, term1309.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1297, term1297.getClass(), "denominator", term1309);
        term1320 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1322 = (int[]) newIntArray(4);
        setIntField(term1320, term1320.getClass(), "signum", 1);
        setIntElement(term1322, 0, -1654371953);
        setIntElement(term1322, 1, 1034353314);
        setIntElement(term1322, 2, 1689808200);
        setIntElement(term1322, 3, 937504939);
        setField(term1320, term1320.getClass(), "mag", term1322);
        setIntField(term1320, term1320.getClass(), "bitCountPlusOne", 0);
        setIntField(term1320, term1320.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1320, term1320.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1320, term1320.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term1320;
        callMethod(klass, "pow", argTypes, term1297, args);
    }

};


