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
import java.lang.Integer;
import java.lang.Object;

public class BigFraction_getReducedFraction_198016468164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term80;
     Object term6113;

    public BigFraction_getReducedFraction_198016468164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = new Integer(-2038273078);
        term80 = new Integer(1227103734);
        term6113 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6114 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6116 = (int[]) newIntArray(1);
        Object term6122 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6124 = (int[]) newIntArray(1);
        setIntField(term6114, term6114.getClass(), "signum", -1);
        setIntElement(term6116, 0, 1019136539);
        setField(term6114, term6114.getClass(), "mag", term6116);
        setIntField(term6114, term6114.getClass(), "bitCountPlusOne", 0);
        setIntField(term6114, term6114.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6114, term6114.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6114, term6114.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6113, term6113.getClass(), "numerator", term6114);
        setIntField(term6122, term6122.getClass(), "signum", 1);
        setIntElement(term6124, 0, 613551867);
        setField(term6122, term6122.getClass(), "mag", term6124);
        setIntField(term6122, term6122.getClass(), "bitCountPlusOne", 0);
        setIntField(term6122, term6122.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6122, term6122.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6122, term6122.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6113, term6113.getClass(), "denominator", term6122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term78;
        args[1] = term80;
        Object retValue = callMethod(klass, "getReducedFraction", argTypes, null, args);
        assertTrue(recursiveEquals(term78, -2038273078));
        assertTrue(recursiveEquals(term80, 1227103734));
        assertTrue(recursiveEquals(retValue, term6113));
    }

};
