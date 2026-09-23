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

public class Fraction_reduce_3355035251329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388963;
     Object term389415;
     Object term389412;

    public Fraction_reduce_3355035251329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388963 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term388963, term388963.getClass(), "numerator", 39043742);
        setIntField(term388963, term388963.getClass(), "denominator", 19521807);
        term389415 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term389415, term389415.getClass(), "numerator", 39043742);
        setIntField(term389415, term389415.getClass(), "denominator", 19521807);
        setField(term389415, term389415.getClass(), "toString", null);
        setField(term389415, term389415.getClass(), "toProperString", null);
        term389412 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term389412, term389412.getClass(), "numerator", 39043742);
        setIntField(term389412, term389412.getClass(), "denominator", 19521807);
        setField(term389412, term389412.getClass(), "toString", null);
        setField(term389412, term389412.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term388963, args);
        assertTrue(recursiveEquals(term388963, term389415));
        assertTrue(recursiveEquals(retValue, term389412));
    }

};


