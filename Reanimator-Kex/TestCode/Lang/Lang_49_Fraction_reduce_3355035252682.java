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

public class Fraction_reduce_3355035252682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term800362;
     Object term801214;
     Object term801211;

    public Fraction_reduce_3355035252682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term800362 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term800362, term800362.getClass(), "numerator", -1164506902);
        setIntField(term800362, term800362.getClass(), "denominator", 1154163715);
        term801214 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term801214, term801214.getClass(), "numerator", -1164506902);
        setIntField(term801214, term801214.getClass(), "denominator", 1154163715);
        setField(term801214, term801214.getClass(), "toString", null);
        setField(term801214, term801214.getClass(), "toProperString", null);
        term801211 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term801211, term801211.getClass(), "numerator", -1164506902);
        setIntField(term801211, term801211.getClass(), "denominator", 1154163715);
        setField(term801211, term801211.getClass(), "toString", null);
        setField(term801211, term801211.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term800362, args);
        assertTrue(recursiveEquals(term800362, term801214));
        assertTrue(recursiveEquals(retValue, term801211));
    }

};


