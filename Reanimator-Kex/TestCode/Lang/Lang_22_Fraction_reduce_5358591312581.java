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

public class Fraction_reduce_5358591312581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846557;
     Object term847325;
     Object term847322;

    public Fraction_reduce_5358591312581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term846557 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term846557, term846557.getClass(), "numerator", -805304218);
        setIntField(term846557, term846557.getClass(), "denominator", 713490469);
        term847325 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term847325, term847325.getClass(), "numerator", -805304218);
        setIntField(term847325, term847325.getClass(), "denominator", 713490469);
        setField(term847325, term847325.getClass(), "toString", null);
        setField(term847325, term847325.getClass(), "toProperString", null);
        term847322 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term847322, term847322.getClass(), "numerator", -805304218);
        setIntField(term847322, term847322.getClass(), "denominator", 713490469);
        setField(term847322, term847322.getClass(), "toString", null);
        setField(term847322, term847322.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term846557, args);
        assertTrue(recursiveEquals(term846557, term847325));
        assertTrue(recursiveEquals(retValue, term847322));
    }

};


