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

public class Fraction_reduce_3355035251307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383819;
     Object term383926;
     Object term383923;

    public Fraction_reduce_3355035251307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383819 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term383819, term383819.getClass(), "numerator", 428484634);
        setIntField(term383819, term383819.getClass(), "denominator", 2063757193);
        term383926 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term383926, term383926.getClass(), "numerator", 428484634);
        setIntField(term383926, term383926.getClass(), "denominator", 2063757193);
        setField(term383926, term383926.getClass(), "toString", null);
        setField(term383926, term383926.getClass(), "toProperString", null);
        term383923 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term383923, term383923.getClass(), "numerator", 428484634);
        setIntField(term383923, term383923.getClass(), "denominator", 2063757193);
        setField(term383923, term383923.getClass(), "toString", null);
        setField(term383923, term383923.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term383819, args);
        assertTrue(recursiveEquals(term383819, term383926));
        assertTrue(recursiveEquals(retValue, term383923));
    }

};


