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

public class Fraction_reduce_5358591312390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781228;
     Object term782091;
     Object term782088;

    public Fraction_reduce_5358591312390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781228 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term781228, term781228.getClass(), "numerator", -46136734);
        setIntField(term781228, term781228.getClass(), "denominator", 2074083623);
        term782091 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term782091, term782091.getClass(), "numerator", -46136734);
        setIntField(term782091, term782091.getClass(), "denominator", 2074083623);
        setField(term782091, term782091.getClass(), "toString", null);
        setField(term782091, term782091.getClass(), "toProperString", null);
        term782088 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term782088, term782088.getClass(), "numerator", -46136734);
        setIntField(term782088, term782088.getClass(), "denominator", 2074083623);
        setField(term782088, term782088.getClass(), "toString", null);
        setField(term782088, term782088.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term781228, args);
        assertTrue(recursiveEquals(term781228, term782091));
        assertTrue(recursiveEquals(retValue, term782088));
    }

};


