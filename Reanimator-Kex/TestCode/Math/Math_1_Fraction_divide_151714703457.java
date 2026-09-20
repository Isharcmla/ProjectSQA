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
import java.lang.Integer;

public class Fraction_divide_151714703457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;
     Object term117;
     Object term6348;
     Object term6339;

    public Fraction_divide_151714703457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term114, term114.getClass(), "denominator", -1371869594);
        setIntField(term114, term114.getClass(), "numerator", -2095575670);
        term117 = new Integer(1225272962);
        term6348 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term6348, term6348.getClass(), "denominator", -1371869594);
        setIntField(term6348, term6348.getClass(), "numerator", -2095575670);
        term6339 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term6339, term6339.getClass(), "denominator", 856051226);
        setIntField(term6339, term6339.getClass(), "numerator", 1047787835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term117;
        Object retValue = callMethod(klass, "divide", argTypes, term114, args);
        assertTrue(recursiveEquals(term114, term6348));
        assertTrue(recursiveEquals(term117, 1225272962));
        assertTrue(recursiveEquals(retValue, term6339));
    }

};
