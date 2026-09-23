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

public class Fraction_reduce_3355035252202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649855;
     Object term650782;
     Object term650779;

    public Fraction_reduce_3355035252202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649855 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term649855, term649855.getClass(), "numerator", -81201054);
        setIntField(term649855, term649855.getClass(), "denominator", 1906761767);
        term650782 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term650782, term650782.getClass(), "numerator", -81201054);
        setIntField(term650782, term650782.getClass(), "denominator", 1906761767);
        setField(term650782, term650782.getClass(), "toString", null);
        setField(term650782, term650782.getClass(), "toProperString", null);
        term650779 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term650779, term650779.getClass(), "numerator", -81201054);
        setIntField(term650779, term650779.getClass(), "denominator", 1906761767);
        setField(term650779, term650779.getClass(), "toString", null);
        setField(term650779, term650779.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term649855, args);
        assertTrue(recursiveEquals(term649855, term650782));
        assertTrue(recursiveEquals(retValue, term650779));
    }

};


