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

public class Fraction_reduce_3355035252180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644180;
     Object term644861;
     Object term644858;

    public Fraction_reduce_3355035252180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term644180 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term644180, term644180.getClass(), "numerator", 349765642);
        setIntField(term644180, term644180.getClass(), "denominator", 810579933);
        term644861 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term644861, term644861.getClass(), "numerator", 349765642);
        setIntField(term644861, term644861.getClass(), "denominator", 810579933);
        setField(term644861, term644861.getClass(), "toString", null);
        setField(term644861, term644861.getClass(), "toProperString", null);
        term644858 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term644858, term644858.getClass(), "numerator", 349765642);
        setIntField(term644858, term644858.getClass(), "denominator", 810579933);
        setField(term644858, term644858.getClass(), "toString", null);
        setField(term644858, term644858.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term644180, args);
        assertTrue(recursiveEquals(term644180, term644861));
        assertTrue(recursiveEquals(retValue, term644858));
    }

};


