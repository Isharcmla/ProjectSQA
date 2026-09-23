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

public class Fraction_reduce_3355035251351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394975;
     Object term395431;
     Object term395428;

    public Fraction_reduce_3355035251351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394975 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term394975, term394975.getClass(), "numerator", 536870913);
        setIntField(term394975, term394975.getClass(), "denominator", 1073741824);
        term395431 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term395431, term395431.getClass(), "numerator", 536870913);
        setIntField(term395431, term395431.getClass(), "denominator", 1073741824);
        setField(term395431, term395431.getClass(), "toString", null);
        setField(term395431, term395431.getClass(), "toProperString", null);
        term395428 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term395428, term395428.getClass(), "numerator", 536870913);
        setIntField(term395428, term395428.getClass(), "denominator", 1073741824);
        setField(term395428, term395428.getClass(), "toString", null);
        setField(term395428, term395428.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term394975, args);
        assertTrue(recursiveEquals(term394975, term395431));
        assertTrue(recursiveEquals(retValue, term395428));
    }

};


