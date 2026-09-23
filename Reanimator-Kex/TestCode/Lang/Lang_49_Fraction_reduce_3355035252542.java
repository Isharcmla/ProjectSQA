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

public class Fraction_reduce_3355035252542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758293;
     Object term758773;
     Object term758770;

    public Fraction_reduce_3355035252542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term758293 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term758293, term758293.getClass(), "numerator", -521764262);
        setIntField(term758293, term758293.getClass(), "denominator", 835460843);
        term758773 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term758773, term758773.getClass(), "numerator", -521764262);
        setIntField(term758773, term758773.getClass(), "denominator", 835460843);
        setField(term758773, term758773.getClass(), "toString", null);
        setField(term758773, term758773.getClass(), "toProperString", null);
        term758770 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term758770, term758770.getClass(), "numerator", -521764262);
        setIntField(term758770, term758770.getClass(), "denominator", 835460843);
        setField(term758770, term758770.getClass(), "toString", null);
        setField(term758770, term758770.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term758293, args);
        assertTrue(recursiveEquals(term758293, term758773));
        assertTrue(recursiveEquals(retValue, term758770));
    }

};


