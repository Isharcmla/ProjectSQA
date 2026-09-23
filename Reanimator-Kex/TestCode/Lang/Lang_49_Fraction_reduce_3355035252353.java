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

public class Fraction_reduce_3355035252353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696712;
     Object term697288;
     Object term697285;

    public Fraction_reduce_3355035252353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term696712 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term696712, term696712.getClass(), "numerator", 14692514);
        setIntField(term696712, term696712.getClass(), "denominator", 2146441289);
        term697288 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term697288, term697288.getClass(), "numerator", 14692514);
        setIntField(term697288, term697288.getClass(), "denominator", 2146441289);
        setField(term697288, term697288.getClass(), "toString", null);
        setField(term697288, term697288.getClass(), "toProperString", null);
        term697285 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term697285, term697285.getClass(), "numerator", 14692514);
        setIntField(term697285, term697285.getClass(), "denominator", 2146441289);
        setField(term697285, term697285.getClass(), "toString", null);
        setField(term697285, term697285.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term696712, args);
        assertTrue(recursiveEquals(term696712, term697288));
        assertTrue(recursiveEquals(retValue, term697285));
    }

};


