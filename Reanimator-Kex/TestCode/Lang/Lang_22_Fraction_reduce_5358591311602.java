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

public class Fraction_reduce_5358591311602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521122;
     Object term521700;
     Object term521697;

    public Fraction_reduce_5358591311602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521122 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term521122, term521122.getClass(), "numerator", -2066736510);
        setIntField(term521122, term521122.getClass(), "denominator", 1514543143);
        term521700 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term521700, term521700.getClass(), "numerator", -2066736510);
        setIntField(term521700, term521700.getClass(), "denominator", 1514543143);
        setField(term521700, term521700.getClass(), "toString", null);
        setField(term521700, term521700.getClass(), "toProperString", null);
        term521697 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term521697, term521697.getClass(), "numerator", -2066736510);
        setIntField(term521697, term521697.getClass(), "denominator", 1514543143);
        setField(term521697, term521697.getClass(), "toString", null);
        setField(term521697, term521697.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term521122, args);
        assertTrue(recursiveEquals(term521122, term521700));
        assertTrue(recursiveEquals(retValue, term521697));
    }

};


