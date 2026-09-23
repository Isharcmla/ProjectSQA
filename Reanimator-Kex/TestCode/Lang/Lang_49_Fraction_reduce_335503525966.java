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

public class Fraction_reduce_335503525966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276895;
     Object term277735;
     Object term277732;

    public Fraction_reduce_335503525966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276895 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term276895, term276895.getClass(), "numerator", -1528364774);
        setIntField(term276895, term276895.getClass(), "denominator", 1648395979);
        term277735 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term277735, term277735.getClass(), "numerator", -1528364774);
        setIntField(term277735, term277735.getClass(), "denominator", 1648395979);
        setField(term277735, term277735.getClass(), "toString", null);
        setField(term277735, term277735.getClass(), "toProperString", null);
        term277732 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term277732, term277732.getClass(), "numerator", -1528364774);
        setIntField(term277732, term277732.getClass(), "denominator", 1648395979);
        setField(term277732, term277732.getClass(), "toString", null);
        setField(term277732, term277732.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term276895, args);
        assertTrue(recursiveEquals(term276895, term277735));
        assertTrue(recursiveEquals(retValue, term277732));
    }

};


