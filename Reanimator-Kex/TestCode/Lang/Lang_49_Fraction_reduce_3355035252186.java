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

public class Fraction_reduce_3355035252186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645562;
     Object term646037;
     Object term646034;

    public Fraction_reduce_3355035252186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term645562 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term645562, term645562.getClass(), "numerator", -830503838);
        setIntField(term645562, term645562.getClass(), "denominator", 1555497191);
        term646037 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term646037, term646037.getClass(), "numerator", -830503838);
        setIntField(term646037, term646037.getClass(), "denominator", 1555497191);
        setField(term646037, term646037.getClass(), "toString", null);
        setField(term646037, term646037.getClass(), "toProperString", null);
        term646034 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term646034, term646034.getClass(), "numerator", -830503838);
        setIntField(term646034, term646034.getClass(), "denominator", 1555497191);
        setField(term646034, term646034.getClass(), "toString", null);
        setField(term646034, term646034.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term645562, args);
        assertTrue(recursiveEquals(term645562, term646037));
        assertTrue(recursiveEquals(retValue, term646034));
    }

};


