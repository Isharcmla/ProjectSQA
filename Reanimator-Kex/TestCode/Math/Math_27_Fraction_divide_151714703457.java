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
     Object term7283;
     Object term7274;

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
        term7283 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term7283, term7283.getClass(), "denominator", -1371869594);
        setIntField(term7283, term7283.getClass(), "numerator", -2095575670);
        term7274 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term7274, term7274.getClass(), "denominator", 856051226);
        setIntField(term7274, term7274.getClass(), "numerator", 1047787835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term117;
        Object retValue = callMethod(klass, "divide", argTypes, term114, args);
        assertTrue(recursiveEquals(term114, term7283));
        assertTrue(recursiveEquals(term117, 1225272962));
        assertTrue(recursiveEquals(retValue, term7274));
    }

};


