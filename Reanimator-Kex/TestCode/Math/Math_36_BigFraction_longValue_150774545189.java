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

public class BigFraction_longValue_150774545189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term964;
     Object term7744;

    public BigFraction_longValue_150774545189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term964 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term7744 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7745 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7746 = (int[]) newIntArray(4);
        Object term7747 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7748 = (int[]) newIntArray(4);
        setIntField(term7745, term7745.getClass(), "signum", 1);
        setIntElement(term7746, 0, 173949109);
        setIntElement(term7746, 1, 1470940093);
        setIntElement(term7746, 2, -586014309);
        setIntElement(term7746, 3, -233794276);
        setField(term7745, term7745.getClass(), "mag", term7746);
        setIntField(term7745, term7745.getClass(), "bitCountPlusOne", 0);
        setIntField(term7745, term7745.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7745, term7745.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7745, term7745.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7744, term7744.getClass(), "numerator", term7745);
        setIntField(term7747, term7747.getClass(), "signum", 1);
        setIntElement(term7748, 0, 173061710);
        setIntElement(term7748, 1, 1097938680);
        setIntElement(term7748, 2, -722608097);
        setIntElement(term7748, 3, 1936967028);
        setField(term7747, term7747.getClass(), "mag", term7748);
        setIntField(term7747, term7747.getClass(), "bitCountPlusOne", 0);
        setIntField(term7747, term7747.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7747, term7747.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7747, term7747.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7744, term7744.getClass(), "denominator", term7747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "longValue", argTypes, term964, args);
        assertTrue(recursiveEquals(term964, term7744));
        assertTrue(recursiveEquals(retValue, 1L));
    }

};


