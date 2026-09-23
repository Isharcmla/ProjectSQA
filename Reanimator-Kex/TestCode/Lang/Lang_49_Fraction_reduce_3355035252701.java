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

public class Fraction_reduce_3355035252701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806206;
     Object term806413;
     Object term806410;

    public Fraction_reduce_3355035252701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term806206 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term806206, term806206.getClass(), "numerator", 338475010);
        setIntField(term806206, term806206.getClass(), "denominator", 1310022649);
        term806413 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term806413, term806413.getClass(), "numerator", 338475010);
        setIntField(term806413, term806413.getClass(), "denominator", 1310022649);
        setField(term806413, term806413.getClass(), "toString", null);
        setField(term806413, term806413.getClass(), "toProperString", null);
        term806410 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term806410, term806410.getClass(), "numerator", 338475010);
        setIntField(term806410, term806410.getClass(), "denominator", 1310022649);
        setField(term806410, term806410.getClass(), "toString", null);
        setField(term806410, term806410.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term806206, args);
        assertTrue(recursiveEquals(term806206, term806413));
        assertTrue(recursiveEquals(retValue, term806410));
    }

};


