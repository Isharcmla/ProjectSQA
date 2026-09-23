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

public class Fraction_reduce_3355035252780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term830388;
     Object term830887;
     Object term830881;

    public Fraction_reduce_3355035252780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term830388 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830388, term830388.getClass(), "numerator", -2108922030);
        setIntField(term830388, term830388.getClass(), "denominator", 722581119);
        term830887 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830887, term830887.getClass(), "numerator", -2108922030);
        setIntField(term830887, term830887.getClass(), "denominator", 722581119);
        setField(term830887, term830887.getClass(), "toString", null);
        setField(term830887, term830887.getClass(), "toProperString", null);
        term830881 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830881, term830881.getClass(), "numerator", -234324670);
        setIntField(term830881, term830881.getClass(), "denominator", 80286791);
        setField(term830881, term830881.getClass(), "toString", null);
        setField(term830881, term830881.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term830388, args);
        assertTrue(recursiveEquals(term830388, term830887));
        assertTrue(recursiveEquals(retValue, term830881));
    }

};


