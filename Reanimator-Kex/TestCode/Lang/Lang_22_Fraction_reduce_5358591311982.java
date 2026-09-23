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

public class Fraction_reduce_5358591311982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646647;
     Object term647709;
     Object term647706;

    public Fraction_reduce_5358591311982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term646647 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term646647, term646647.getClass(), "numerator", 142229986);
        setIntField(term646647, term646647.getClass(), "denominator", 1409404713);
        term647709 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term647709, term647709.getClass(), "numerator", 142229986);
        setIntField(term647709, term647709.getClass(), "denominator", 1409404713);
        setField(term647709, term647709.getClass(), "toString", null);
        setField(term647709, term647709.getClass(), "toProperString", null);
        term647706 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term647706, term647706.getClass(), "numerator", 142229986);
        setIntField(term647706, term647706.getClass(), "denominator", 1409404713);
        setField(term647706, term647706.getClass(), "toString", null);
        setField(term647706, term647706.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term646647, args);
        assertTrue(recursiveEquals(term646647, term647709));
        assertTrue(recursiveEquals(retValue, term647706));
    }

};


