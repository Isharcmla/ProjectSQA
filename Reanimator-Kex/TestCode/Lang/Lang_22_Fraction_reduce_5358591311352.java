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

public class Fraction_reduce_5358591311352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441176;
     Object term442242;
     Object term442239;

    public Fraction_reduce_5358591311352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441176 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term441176, term441176.getClass(), "numerator", 536870882);
        setIntField(term441176, term441176.getClass(), "denominator", 1879048201);
        term442242 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term442242, term442242.getClass(), "numerator", 536870882);
        setIntField(term442242, term442242.getClass(), "denominator", 1879048201);
        setField(term442242, term442242.getClass(), "toString", null);
        setField(term442242, term442242.getClass(), "toProperString", null);
        term442239 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term442239, term442239.getClass(), "numerator", 536870882);
        setIntField(term442239, term442239.getClass(), "denominator", 1879048201);
        setField(term442239, term442239.getClass(), "toString", null);
        setField(term442239, term442239.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term441176, args);
        assertTrue(recursiveEquals(term441176, term442242));
        assertTrue(recursiveEquals(retValue, term442239));
    }

};


