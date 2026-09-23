package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_3355035251852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542551;
     Object term543359;
     Object term543356;

    public Fraction_reduce_3355035251852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term542551 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term542551, term542551.getClass(), "numerator", 72679586);
        setIntField(term542551, term542551.getClass(), "denominator", 1959002569);
        term543359 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term543359, term543359.getClass(), "numerator", 72679586);
        setIntField(term543359, term543359.getClass(), "denominator", 1959002569);
        setField(term543359, term543359.getClass(), "toString", null);
        setField(term543359, term543359.getClass(), "toProperString", null);
        term543356 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term543356, term543356.getClass(), "numerator", 72679586);
        setIntField(term543356, term543356.getClass(), "denominator", 1959002569);
        setField(term543356, term543356.getClass(), "toString", null);
        setField(term543356, term543356.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term542551, args);
        assertTrue(recursiveEquals(term542551, term543359));
        assertTrue(recursiveEquals(retValue, term543356));
    }

};


