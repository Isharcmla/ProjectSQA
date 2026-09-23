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

public class Fraction_reduce_335503525497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137130;
     Object term137227;
     Object term137224;

    public Fraction_reduce_335503525497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137130 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137130, term137130.getClass(), "numerator", -230686750);
        setIntField(term137130, term137130.getClass(), "denominator", 312868727);
        term137227 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137227, term137227.getClass(), "numerator", -230686750);
        setIntField(term137227, term137227.getClass(), "denominator", 312868727);
        setField(term137227, term137227.getClass(), "toString", null);
        setField(term137227, term137227.getClass(), "toProperString", null);
        term137224 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137224, term137224.getClass(), "numerator", -230686750);
        setIntField(term137224, term137224.getClass(), "denominator", 312868727);
        setField(term137224, term137224.getClass(), "toString", null);
        setField(term137224, term137224.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term137130, args);
        assertTrue(recursiveEquals(term137130, term137227));
        assertTrue(recursiveEquals(retValue, term137224));
    }

};


