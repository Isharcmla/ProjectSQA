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

public class BigFraction_equals_51329991879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653;
     Object term676;
     Object term7286;
     Object term7291;

    public BigFraction_equals_51329991879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term654 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term656 = (int[]) newIntArray(4);
        Object term665 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term667 = (int[]) newIntArray(4);
        setIntField(term654, term654.getClass(), "signum", 1);
        setIntElement(term656, 0, -92660371);
        setIntElement(term656, 1, 1806660338);
        setIntElement(term656, 2, -1813466624);
        setIntElement(term656, 3, 2057596020);
        setField(term654, term654.getClass(), "mag", term656);
        setIntField(term654, term654.getClass(), "bitCountPlusOne", 0);
        setIntField(term654, term654.getClass(), "bitLengthPlusOne", 0);
        setIntField(term654, term654.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term654, term654.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term653, term653.getClass(), "numerator", term654);
        setIntField(term665, term665.getClass(), "signum", 1);
        setIntElement(term667, 0, 1396472396);
        setIntElement(term667, 1, -2060859936);
        setIntElement(term667, 2, -1259907501);
        setIntElement(term667, 3, -1922979571);
        setField(term665, term665.getClass(), "mag", term667);
        setIntField(term665, term665.getClass(), "bitCountPlusOne", 0);
        setIntField(term665, term665.getClass(), "bitLengthPlusOne", 0);
        setIntField(term665, term665.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term665, term665.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term653, term653.getClass(), "denominator", term665);
        term676 = newInstance(Class.forName("java.lang.Object"));
        term7286 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7287 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7288 = (int[]) newIntArray(4);
        Object term7289 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7290 = (int[]) newIntArray(4);
        setIntField(term7287, term7287.getClass(), "signum", 1);
        setIntElement(term7288, 0, -92660371);
        setIntElement(term7288, 1, 1806660338);
        setIntElement(term7288, 2, -1813466624);
        setIntElement(term7288, 3, 2057596020);
        setField(term7287, term7287.getClass(), "mag", term7288);
        setIntField(term7287, term7287.getClass(), "bitCountPlusOne", 0);
        setIntField(term7287, term7287.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7287, term7287.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7287, term7287.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7286, term7286.getClass(), "numerator", term7287);
        setIntField(term7289, term7289.getClass(), "signum", 1);
        setIntElement(term7290, 0, 1396472396);
        setIntElement(term7290, 1, -2060859936);
        setIntElement(term7290, 2, -1259907501);
        setIntElement(term7290, 3, -1922979571);
        setField(term7289, term7289.getClass(), "mag", term7290);
        setIntField(term7289, term7289.getClass(), "bitCountPlusOne", 0);
        setIntField(term7289, term7289.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7289, term7289.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7289, term7289.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7286, term7286.getClass(), "denominator", term7289);
        term7291 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term676;
        Object retValue = callMethod(klass, "equals", argTypes, term653, args);
        assertTrue(recursiveEquals(term653, term7286));
        assertTrue(recursiveEquals(term676, term7291));
        assertTrue(recursiveEquals(retValue, false));
    }

};


