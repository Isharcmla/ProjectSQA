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

public class BigFraction_longValue_60735568289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term964;
     Object term9626;

    public BigFraction_longValue_60735568289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term964 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term965 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term967 = (int[]) newIntArray(4);
        Object term976 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term978 = (int[]) newIntArray(4);
        setIntField(term965, term965.getClass(), "signum", 1);
        setIntElement(term967, 0, 173949109);
        setIntElement(term967, 1, 1470940093);
        setIntElement(term967, 2, -586014309);
        setIntElement(term967, 3, -233794276);
        setField(term965, term965.getClass(), "mag", term967);
        setIntField(term965, term965.getClass(), "bitCountPlusOne", 0);
        setIntField(term965, term965.getClass(), "bitLengthPlusOne", 0);
        setIntField(term965, term965.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term965, term965.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term964, term964.getClass(), "numerator", term965);
        setIntField(term976, term976.getClass(), "signum", 1);
        setIntElement(term978, 0, 173061710);
        setIntElement(term978, 1, 1097938680);
        setIntElement(term978, 2, -722608097);
        setIntElement(term978, 3, 1936967028);
        setField(term976, term976.getClass(), "mag", term978);
        setIntField(term976, term976.getClass(), "bitCountPlusOne", 0);
        setIntField(term976, term976.getClass(), "bitLengthPlusOne", 0);
        setIntField(term976, term976.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term976, term976.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term964, term964.getClass(), "denominator", term976);
        term9626 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9627 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9628 = (int[]) newIntArray(4);
        Object term9629 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9630 = (int[]) newIntArray(4);
        setIntField(term9627, term9627.getClass(), "signum", 1);
        setIntElement(term9628, 0, 173949109);
        setIntElement(term9628, 1, 1470940093);
        setIntElement(term9628, 2, -586014309);
        setIntElement(term9628, 3, -233794276);
        setField(term9627, term9627.getClass(), "mag", term9628);
        setIntField(term9627, term9627.getClass(), "bitCountPlusOne", 0);
        setIntField(term9627, term9627.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9627, term9627.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9627, term9627.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9626, term9626.getClass(), "numerator", term9627);
        setIntField(term9629, term9629.getClass(), "signum", 1);
        setIntElement(term9630, 0, 173061710);
        setIntElement(term9630, 1, 1097938680);
        setIntElement(term9630, 2, -722608097);
        setIntElement(term9630, 3, 1936967028);
        setField(term9629, term9629.getClass(), "mag", term9630);
        setIntField(term9629, term9629.getClass(), "bitCountPlusOne", 0);
        setIntField(term9629, term9629.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9629, term9629.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9629, term9629.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9626, term9626.getClass(), "denominator", term9629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "longValue", argTypes, term964, args);
        assertTrue(recursiveEquals(term964, term9626));
        assertTrue(recursiveEquals(retValue, 1L));
    }

};
