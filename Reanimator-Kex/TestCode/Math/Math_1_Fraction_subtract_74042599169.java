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

public class Fraction_subtract_74042599169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10044;
     Object term10134;
     Object term10243;
     Object term10244;
     Object term10240;

    public Fraction_subtract_74042599169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10044 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term10044, term10044.getClass(), "numerator", 4);
        setIntField(term10044, term10044.getClass(), "denominator", 10569600);
        term10134 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term10134, term10134.getClass(), "numerator", 65536);
        setIntField(term10134, term10134.getClass(), "denominator", -1775692800);
        term10243 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term10243, term10243.getClass(), "denominator", 10569600);
        setIntField(term10243, term10243.getClass(), "numerator", 4);
        term10244 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term10244, term10244.getClass(), "denominator", -1775692800);
        setIntField(term10244, term10244.getClass(), "numerator", 65536);
        term10240 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term10240, term10240.getClass(), "denominator", 55490400);
        setIntField(term10240, term10240.getClass(), "numerator", 2069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term10134;
        Object retValue = callMethod(klass, "subtract", argTypes, term10044, args);
        assertTrue(recursiveEquals(term10044, term10243));
        assertTrue(recursiveEquals(term10134, term10244));
        assertTrue(recursiveEquals(retValue, term10240));
    }

};
