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

public class Fraction_subtract_123418814952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term87;
     Object term4073;
     Object term4064;

    public Fraction_subtract_123418814952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term84, term84.getClass(), "denominator", 1876565163);
        setIntField(term84, term84.getClass(), "numerator", -817164822);
        term87 = new Integer(-1016503459);
        term4073 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term4073, term4073.getClass(), "denominator", 1876565163);
        setIntField(term4073, term4073.getClass(), "numerator", -817164822);
        term4064 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term4064, term4064.getClass(), "denominator", 625521721);
        setIntField(term4064, term4064.getClass(), "numerator", -263771239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87;
        Object retValue = callMethod(klass, "subtract", argTypes, term84, args);
        assertTrue(recursiveEquals(term84, term4073));
        assertTrue(recursiveEquals(term87, -1016503459));
        assertTrue(recursiveEquals(retValue, term4064));
    }

};


