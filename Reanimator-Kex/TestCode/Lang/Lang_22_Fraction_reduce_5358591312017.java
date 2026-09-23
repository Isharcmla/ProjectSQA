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

public class Fraction_reduce_5358591312017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656676;
     Object term656885;
     Object term656882;

    public Fraction_reduce_5358591312017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term656676 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term656676, term656676.getClass(), "numerator", -754576158);
        setIntField(term656676, term656676.getClass(), "denominator", 553664519);
        term656885 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term656885, term656885.getClass(), "numerator", -754576158);
        setIntField(term656885, term656885.getClass(), "denominator", 553664519);
        setField(term656885, term656885.getClass(), "toString", null);
        setField(term656885, term656885.getClass(), "toProperString", null);
        term656882 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term656882, term656882.getClass(), "numerator", -754576158);
        setIntField(term656882, term656882.getClass(), "denominator", 553664519);
        setField(term656882, term656882.getClass(), "toString", null);
        setField(term656882, term656882.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term656676, args);
        assertTrue(recursiveEquals(term656676, term656885));
        assertTrue(recursiveEquals(retValue, term656882));
    }

};


