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

public class Fraction_toString_8019445741280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524448;
     Object term525742;

    public Fraction_toString_8019445741280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524448 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term524448, term524448.getClass(), "denominator", 1);
        term525742 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term525742, term525742.getClass(), "denominator", 1);
        setIntField(term525742, term525742.getClass(), "numerator", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term524448, args);
        assertTrue(recursiveEquals(term524448, term525742));
        assertTrue(recursiveEquals(retValue, "0"));
    }

};


