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

public class Fraction_reduce_5358591311710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554190;
     Object term555163;
     Object term555160;

    public Fraction_reduce_5358591311710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554190 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term554190, term554190.getClass(), "numerator", 389350006);
        setIntField(term554190, term554190.getClass(), "denominator", 539615011);
        term555163 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term555163, term555163.getClass(), "numerator", 389350006);
        setIntField(term555163, term555163.getClass(), "denominator", 539615011);
        setField(term555163, term555163.getClass(), "toString", null);
        setField(term555163, term555163.getClass(), "toProperString", null);
        term555160 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term555160, term555160.getClass(), "numerator", 389350006);
        setIntField(term555160, term555160.getClass(), "denominator", 539615011);
        setField(term555160, term555160.getClass(), "toString", null);
        setField(term555160, term555160.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term554190, args);
        assertTrue(recursiveEquals(term554190, term555163));
        assertTrue(recursiveEquals(retValue, term555160));
    }

};


