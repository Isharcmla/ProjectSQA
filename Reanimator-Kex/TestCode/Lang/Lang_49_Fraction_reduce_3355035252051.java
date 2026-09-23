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

public class Fraction_reduce_3355035252051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602395;
     Object term602874;
     Object term602871;

    public Fraction_reduce_3355035252051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term602395 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term602395, term602395.getClass(), "numerator", 1476395058);
        setIntField(term602395, term602395.getClass(), "denominator", 1073741857);
        term602874 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term602874, term602874.getClass(), "numerator", 1476395058);
        setIntField(term602874, term602874.getClass(), "denominator", 1073741857);
        setField(term602874, term602874.getClass(), "toString", null);
        setField(term602874, term602874.getClass(), "toProperString", null);
        term602871 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term602871, term602871.getClass(), "numerator", 1476395058);
        setIntField(term602871, term602871.getClass(), "denominator", 1073741857);
        setField(term602871, term602871.getClass(), "toString", null);
        setField(term602871, term602871.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term602395, args);
        assertTrue(recursiveEquals(term602395, term602874));
        assertTrue(recursiveEquals(retValue, term602871));
    }

};


