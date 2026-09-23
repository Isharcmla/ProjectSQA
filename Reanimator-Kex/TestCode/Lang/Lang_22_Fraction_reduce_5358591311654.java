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

public class Fraction_reduce_5358591311654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538905;
     Object term539208;
     Object term539205;

    public Fraction_reduce_5358591311654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term538905 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term538905, term538905.getClass(), "numerator", -266272682);
        setIntField(term538905, term538905.getClass(), "denominator", 276840861);
        term539208 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539208, term539208.getClass(), "numerator", -266272682);
        setIntField(term539208, term539208.getClass(), "denominator", 276840861);
        setField(term539208, term539208.getClass(), "toString", null);
        setField(term539208, term539208.getClass(), "toProperString", null);
        term539205 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539205, term539205.getClass(), "numerator", -266272682);
        setIntField(term539205, term539205.getClass(), "denominator", 276840861);
        setField(term539205, term539205.getClass(), "toString", null);
        setField(term539205, term539205.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term538905, args);
        assertTrue(recursiveEquals(term538905, term539208));
        assertTrue(recursiveEquals(retValue, term539205));
    }

};


