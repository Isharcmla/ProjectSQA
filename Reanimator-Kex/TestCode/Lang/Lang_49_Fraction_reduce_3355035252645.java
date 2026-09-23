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

public class Fraction_reduce_3355035252645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term788946;
     Object term789837;
     Object term789831;

    public Fraction_reduce_3355035252645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term788946 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term788946, term788946.getClass(), "numerator", -88862622);
        setIntField(term788946, term788946.getClass(), "denominator", 558268455);
        term789837 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term789837, term789837.getClass(), "numerator", -88862622);
        setIntField(term789837, term789837.getClass(), "denominator", 558268455);
        setField(term789837, term789837.getClass(), "toString", null);
        setField(term789837, term789837.getClass(), "toProperString", null);
        term789831 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term789831, term789831.getClass(), "numerator", -29620874);
        setIntField(term789831, term789831.getClass(), "denominator", 186089485);
        setField(term789831, term789831.getClass(), "toString", null);
        setField(term789831, term789831.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term788946, args);
        assertTrue(recursiveEquals(term788946, term789837));
        assertTrue(recursiveEquals(retValue, term789831));
    }

};


