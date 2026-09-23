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

public class Fraction_reduce_3355035251814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531002;
     Object term531842;
     Object term531839;

    public Fraction_reduce_3355035251814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531002 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term531002, term531002.getClass(), "numerator", -469628262);
        setIntField(term531002, term531002.getClass(), "denominator", 1929958411);
        term531842 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term531842, term531842.getClass(), "numerator", -469628262);
        setIntField(term531842, term531842.getClass(), "denominator", 1929958411);
        setField(term531842, term531842.getClass(), "toString", null);
        setField(term531842, term531842.getClass(), "toProperString", null);
        term531839 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term531839, term531839.getClass(), "numerator", -469628262);
        setIntField(term531839, term531839.getClass(), "denominator", 1929958411);
        setField(term531839, term531839.getClass(), "toString", null);
        setField(term531839, term531839.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term531002, args);
        assertTrue(recursiveEquals(term531002, term531842));
        assertTrue(recursiveEquals(retValue, term531839));
    }

};


