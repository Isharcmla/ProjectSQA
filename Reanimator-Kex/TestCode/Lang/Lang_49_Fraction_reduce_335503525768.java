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

public class Fraction_reduce_335503525768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213699;
     Object term214650;
     Object term214647;

    public Fraction_reduce_335503525768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213699 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term213699, term213699.getClass(), "numerator", -1257230270);
        setIntField(term213699, term213699.getClass(), "denominator", 1464794071);
        term214650 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term214650, term214650.getClass(), "numerator", -1257230270);
        setIntField(term214650, term214650.getClass(), "denominator", 1464794071);
        setField(term214650, term214650.getClass(), "toString", null);
        setField(term214650, term214650.getClass(), "toProperString", null);
        term214647 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term214647, term214647.getClass(), "numerator", -1257230270);
        setIntField(term214647, term214647.getClass(), "denominator", 1464794071);
        setField(term214647, term214647.getClass(), "toString", null);
        setField(term214647, term214647.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term213699, args);
        assertTrue(recursiveEquals(term213699, term214650));
        assertTrue(recursiveEquals(retValue, term214647));
    }

};


