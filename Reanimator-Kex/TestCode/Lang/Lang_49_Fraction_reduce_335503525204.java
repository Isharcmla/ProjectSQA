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

public class Fraction_reduce_335503525204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47917;
     Object term48441;
     Object term48435;

    public Fraction_reduce_335503525204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47917 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term47917, term47917.getClass(), "numerator", 338168274);
        setIntField(term47917, term47917.getClass(), "denominator", 1925974593);
        term48441 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term48441, term48441.getClass(), "numerator", 338168274);
        setIntField(term48441, term48441.getClass(), "denominator", 1925974593);
        setField(term48441, term48441.getClass(), "toString", null);
        setField(term48441, term48441.getClass(), "toProperString", null);
        term48435 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term48435, term48435.getClass(), "numerator", 112722758);
        setIntField(term48435, term48435.getClass(), "denominator", 641991531);
        setField(term48435, term48435.getClass(), "toString", null);
        setField(term48435, term48435.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term47917, args);
        assertTrue(recursiveEquals(term47917, term48441));
        assertTrue(recursiveEquals(retValue, term48435));
    }

};


