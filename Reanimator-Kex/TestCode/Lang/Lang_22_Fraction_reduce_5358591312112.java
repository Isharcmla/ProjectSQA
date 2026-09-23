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

public class Fraction_reduce_5358591312112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687963;
     Object term688900;
     Object term688897;

    public Fraction_reduce_5358591312112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687963 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term687963, term687963.getClass(), "numerator", 2);
        setIntField(term687963, term687963.getClass(), "denominator", 2113912841);
        term688900 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term688900, term688900.getClass(), "numerator", 2);
        setIntField(term688900, term688900.getClass(), "denominator", 2113912841);
        setField(term688900, term688900.getClass(), "toString", null);
        setField(term688900, term688900.getClass(), "toProperString", null);
        term688897 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term688897, term688897.getClass(), "numerator", 2);
        setIntField(term688897, term688897.getClass(), "denominator", 2113912841);
        setField(term688897, term688897.getClass(), "toString", null);
        setField(term688897, term688897.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term687963, args);
        assertTrue(recursiveEquals(term687963, term688900));
        assertTrue(recursiveEquals(retValue, term688897));
    }

};


