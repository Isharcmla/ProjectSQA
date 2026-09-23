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

public class Fraction_reduce_3355035251797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525323;
     Object term526097;
     Object term526094;

    public Fraction_reduce_3355035251797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term525323 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term525323, term525323.getClass(), "numerator", -442502682);
        setIntField(term525323, term525323.getClass(), "denominator", 956561653);
        term526097 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term526097, term526097.getClass(), "numerator", -442502682);
        setIntField(term526097, term526097.getClass(), "denominator", 956561653);
        setField(term526097, term526097.getClass(), "toString", null);
        setField(term526097, term526097.getClass(), "toProperString", null);
        term526094 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term526094, term526094.getClass(), "numerator", -442502682);
        setIntField(term526094, term526094.getClass(), "denominator", 956561653);
        setField(term526094, term526094.getClass(), "toString", null);
        setField(term526094, term526094.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term525323, args);
        assertTrue(recursiveEquals(term525323, term526097));
        assertTrue(recursiveEquals(retValue, term526094));
    }

};


