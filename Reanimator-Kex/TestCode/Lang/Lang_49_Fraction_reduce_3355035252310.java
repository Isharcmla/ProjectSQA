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

public class Fraction_reduce_3355035252310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683975;
     Object term684404;
     Object term684401;

    public Fraction_reduce_3355035252310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683975 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term683975, term683975.getClass(), "numerator", -1161822122);
        setIntField(term683975, term683975.getClass(), "denominator", 1504063373);
        term684404 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term684404, term684404.getClass(), "numerator", -1161822122);
        setIntField(term684404, term684404.getClass(), "denominator", 1504063373);
        setField(term684404, term684404.getClass(), "toString", null);
        setField(term684404, term684404.getClass(), "toProperString", null);
        term684401 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term684401, term684401.getClass(), "numerator", -1161822122);
        setIntField(term684401, term684401.getClass(), "denominator", 1504063373);
        setField(term684401, term684401.getClass(), "toString", null);
        setField(term684401, term684401.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term683975, args);
        assertTrue(recursiveEquals(term683975, term684404));
        assertTrue(recursiveEquals(retValue, term684401));
    }

};


