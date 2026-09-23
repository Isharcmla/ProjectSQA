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

public class Fraction_reduce_3355035251529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450010;
     Object term450717;
     Object term450711;

    public Fraction_reduce_3355035251529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450010 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term450010, term450010.getClass(), "numerator", 136181058);
        setIntField(term450010, term450010.getClass(), "denominator", 67037793);
        term450717 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term450717, term450717.getClass(), "numerator", 136181058);
        setIntField(term450717, term450717.getClass(), "denominator", 67037793);
        setField(term450717, term450717.getClass(), "toString", null);
        setField(term450717, term450717.getClass(), "toProperString", null);
        term450711 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term450711, term450711.getClass(), "numerator", 45393686);
        setIntField(term450711, term450711.getClass(), "denominator", 22345931);
        setField(term450711, term450711.getClass(), "toString", null);
        setField(term450711, term450711.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term450010, args);
        assertTrue(recursiveEquals(term450010, term450717));
        assertTrue(recursiveEquals(retValue, term450711));
    }

};


