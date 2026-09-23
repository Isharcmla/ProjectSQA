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

public class Fraction_reduce_3355035251742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509922;
     Object term510742;
     Object term510736;

    public Fraction_reduce_3355035251742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509922 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term509922, term509922.getClass(), "numerator", -2002245966);
        setIntField(term509922, term509922.getClass(), "denominator", 1025061775);
        term510742 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term510742, term510742.getClass(), "numerator", -2002245966);
        setIntField(term510742, term510742.getClass(), "denominator", 1025061775);
        setField(term510742, term510742.getClass(), "toString", null);
        setField(term510742, term510742.getClass(), "toProperString", null);
        term510736 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term510736, term510736.getClass(), "numerator", -42600978);
        setIntField(term510736, term510736.getClass(), "denominator", 21809825);
        setField(term510736, term510736.getClass(), "toString", null);
        setField(term510736, term510736.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term509922, args);
        assertTrue(recursiveEquals(term509922, term510742));
        assertTrue(recursiveEquals(retValue, term510736));
    }

};


