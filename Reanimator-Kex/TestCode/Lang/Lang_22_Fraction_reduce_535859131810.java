package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_535859131810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256149;
     Object term256629;
     Object term256626;

    public Fraction_reduce_535859131810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256149 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term256149, term256149.getClass(), "numerator", 1342173138);
        setIntField(term256149, term256149.getClass(), "denominator", 1879050241);
        term256629 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term256629, term256629.getClass(), "numerator", 1342173138);
        setIntField(term256629, term256629.getClass(), "denominator", 1879050241);
        setField(term256629, term256629.getClass(), "toString", null);
        setField(term256629, term256629.getClass(), "toProperString", null);
        term256626 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term256626, term256626.getClass(), "numerator", 1342173138);
        setIntField(term256626, term256626.getClass(), "denominator", 1879050241);
        setField(term256626, term256626.getClass(), "toString", null);
        setField(term256626, term256626.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term256149, args);
        assertTrue(recursiveEquals(term256149, term256629));
        assertTrue(recursiveEquals(retValue, term256626));
    }

};


