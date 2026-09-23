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

public class Fraction_reduce_5358591311583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515744;
     Object term516247;
     Object term516241;

    public Fraction_reduce_5358591311583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515744 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term515744, term515744.getClass(), "numerator", -995011974);
        setIntField(term515744, term515744.getClass(), "denominator", 1174495323);
        term516247 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term516247, term516247.getClass(), "numerator", -995011974);
        setIntField(term516247, term516247.getClass(), "denominator", 1174495323);
        setField(term516247, term516247.getClass(), "toString", null);
        setField(term516247, term516247.getClass(), "toProperString", null);
        term516241 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term516241, term516241.getClass(), "numerator", -331670658);
        setIntField(term516241, term516241.getClass(), "denominator", 391498441);
        setField(term516241, term516241.getClass(), "toString", null);
        setField(term516241, term516241.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term515744, args);
        assertTrue(recursiveEquals(term515744, term516247));
        assertTrue(recursiveEquals(retValue, term516241));
    }

};


