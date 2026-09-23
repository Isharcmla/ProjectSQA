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

public class BigFraction_init_99154079461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;
     Object term70;
     Object term3921;

    public BigFraction_init_99154079461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = new Integer(-616727354);
        term70 = new Integer(-1955890973);
        term3921 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term3922 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3923 = (int[]) newIntArray(1);
        Object term3924 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3925 = (int[]) newIntArray(1);
        setIntField(term3922, term3922.getClass(), "signum", 1);
        setIntElement(term3923, 0, 616727354);
        setField(term3922, term3922.getClass(), "mag", term3923);
        setIntField(term3922, term3922.getClass(), "bitCountPlusOne", 0);
        setIntField(term3922, term3922.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3922, term3922.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3922, term3922.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3921, term3921.getClass(), "numerator", term3922);
        setIntField(term3924, term3924.getClass(), "signum", 1);
        setIntElement(term3925, 0, 1955890973);
        setField(term3924, term3924.getClass(), "mag", term3925);
        setIntField(term3924, term3924.getClass(), "bitCountPlusOne", 0);
        setIntField(term3924, term3924.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3924, term3924.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3924, term3924.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3921, term3921.getClass(), "denominator", term3924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term68;
        args[1] = term70;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3921));
        assertTrue(recursiveEquals(term68, -616727354));
        assertTrue(recursiveEquals(term70, -1955890973));
    }

};


