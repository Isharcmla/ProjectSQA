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

public class Fraction_reduce_5358591312558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839634;
     Object term839997;
     Object term839994;

    public Fraction_reduce_5358591312558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term839634 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term839634, term839634.getClass(), "numerator", -937294834);
        setIntField(term839634, term839634.getClass(), "denominator", 1444439617);
        term839997 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term839997, term839997.getClass(), "numerator", -937294834);
        setIntField(term839997, term839997.getClass(), "denominator", 1444439617);
        setField(term839997, term839997.getClass(), "toString", null);
        setField(term839997, term839997.getClass(), "toProperString", null);
        term839994 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term839994, term839994.getClass(), "numerator", -937294834);
        setIntField(term839994, term839994.getClass(), "denominator", 1444439617);
        setField(term839994, term839994.getClass(), "toString", null);
        setField(term839994, term839994.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term839634, args);
        assertTrue(recursiveEquals(term839634, term839997));
        assertTrue(recursiveEquals(retValue, term839994));
    }

};


