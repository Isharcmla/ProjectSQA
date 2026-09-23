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

public class Fraction_reduce_3355035252112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621466;
     Object term621979;
     Object term621976;

    public Fraction_reduce_3355035252112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621466 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term621466, term621466.getClass(), "numerator", 1981341798);
        setIntField(term621466, term621466.getClass(), "denominator", 80220635);
        term621979 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term621979, term621979.getClass(), "numerator", 1981341798);
        setIntField(term621979, term621979.getClass(), "denominator", 80220635);
        setField(term621979, term621979.getClass(), "toString", null);
        setField(term621979, term621979.getClass(), "toProperString", null);
        term621976 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term621976, term621976.getClass(), "numerator", 1981341798);
        setIntField(term621976, term621976.getClass(), "denominator", 80220635);
        setField(term621976, term621976.getClass(), "toString", null);
        setField(term621976, term621976.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term621466, args);
        assertTrue(recursiveEquals(term621466, term621979));
        assertTrue(recursiveEquals(retValue, term621976));
    }

};


