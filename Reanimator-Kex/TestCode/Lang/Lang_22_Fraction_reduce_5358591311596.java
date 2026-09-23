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

public class Fraction_reduce_5358591311596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519502;
     Object term519948;
     Object term519945;

    public Fraction_reduce_5358591311596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519502 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term519502, term519502.getClass(), "numerator", -207781182);
        setIntField(term519502, term519502.getClass(), "denominator", 1720478087);
        term519948 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term519948, term519948.getClass(), "numerator", -207781182);
        setIntField(term519948, term519948.getClass(), "denominator", 1720478087);
        setField(term519948, term519948.getClass(), "toString", null);
        setField(term519948, term519948.getClass(), "toProperString", null);
        term519945 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term519945, term519945.getClass(), "numerator", -207781182);
        setIntField(term519945, term519945.getClass(), "denominator", 1720478087);
        setField(term519945, term519945.getClass(), "toString", null);
        setField(term519945, term519945.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term519502, args);
        assertTrue(recursiveEquals(term519502, term519948));
        assertTrue(recursiveEquals(retValue, term519945));
    }

};


