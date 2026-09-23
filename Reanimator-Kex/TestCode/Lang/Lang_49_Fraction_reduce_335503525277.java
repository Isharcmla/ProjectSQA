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

public class Fraction_reduce_335503525277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69394;
     Object term69872;
     Object term69869;

    public Fraction_reduce_335503525277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69394 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term69394, term69394.getClass(), "numerator", 9082510);
        setIntField(term69394, term69394.getClass(), "denominator", 1053171519);
        term69872 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term69872, term69872.getClass(), "numerator", 9082510);
        setIntField(term69872, term69872.getClass(), "denominator", 1053171519);
        setField(term69872, term69872.getClass(), "toString", null);
        setField(term69872, term69872.getClass(), "toProperString", null);
        term69869 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term69869, term69869.getClass(), "numerator", 9082510);
        setIntField(term69869, term69869.getClass(), "denominator", 1053171519);
        setField(term69869, term69869.getClass(), "toString", null);
        setField(term69869, term69869.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term69394, args);
        assertTrue(recursiveEquals(term69394, term69872));
        assertTrue(recursiveEquals(retValue, term69869));
    }

};


