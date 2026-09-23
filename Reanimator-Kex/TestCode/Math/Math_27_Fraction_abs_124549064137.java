package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_abs_124549064137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term1786;
     Object term1783;

    public Fraction_abs_124549064137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term27, term27.getClass(), "denominator", -2038273078);
        setIntField(term27, term27.getClass(), "numerator", 1227103734);
        term1786 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1786, term1786.getClass(), "denominator", -2038273078);
        setIntField(term1786, term1786.getClass(), "numerator", 1227103734);
        term1783 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1783, term1783.getClass(), "denominator", -2038273078);
        setIntField(term1783, term1783.getClass(), "numerator", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term27, args);
        assertTrue(recursiveEquals(term27, term1786));
        assertTrue(recursiveEquals(retValue, term1783));
    }

};


