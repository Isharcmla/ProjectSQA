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

public class Fraction_reduce_5358591312117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690070;
     Object term690569;
     Object term690566;

    public Fraction_reduce_5358591312117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term690070 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term690070, term690070.getClass(), "numerator", -837287738);
        setIntField(term690070, term690070.getClass(), "denominator", 2072281189);
        term690569 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term690569, term690569.getClass(), "numerator", -837287738);
        setIntField(term690569, term690569.getClass(), "denominator", 2072281189);
        setField(term690569, term690569.getClass(), "toString", null);
        setField(term690569, term690569.getClass(), "toProperString", null);
        term690566 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term690566, term690566.getClass(), "numerator", -837287738);
        setIntField(term690566, term690566.getClass(), "denominator", 2072281189);
        setField(term690566, term690566.getClass(), "toString", null);
        setField(term690566, term690566.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term690070, args);
        assertTrue(recursiveEquals(term690070, term690569));
        assertTrue(recursiveEquals(retValue, term690566));
    }

};


