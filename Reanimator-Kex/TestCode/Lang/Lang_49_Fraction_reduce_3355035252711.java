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

public class Fraction_reduce_3355035252711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808639;
     Object term808837;
     Object term808834;

    public Fraction_reduce_3355035252711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term808639 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term808639, term808639.getClass(), "numerator", 607262834);
        setIntField(term808639, term808639.getClass(), "denominator", 1375276081);
        term808837 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term808837, term808837.getClass(), "numerator", 607262834);
        setIntField(term808837, term808837.getClass(), "denominator", 1375276081);
        setField(term808837, term808837.getClass(), "toString", null);
        setField(term808837, term808837.getClass(), "toProperString", null);
        term808834 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term808834, term808834.getClass(), "numerator", 607262834);
        setIntField(term808834, term808834.getClass(), "denominator", 1375276081);
        setField(term808834, term808834.getClass(), "toString", null);
        setField(term808834, term808834.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term808639, args);
        assertTrue(recursiveEquals(term808639, term808837));
        assertTrue(recursiveEquals(retValue, term808834));
    }

};


