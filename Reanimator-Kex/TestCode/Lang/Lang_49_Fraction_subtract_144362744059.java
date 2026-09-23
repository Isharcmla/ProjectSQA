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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_144362744059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;
     Object term797;

    public Fraction_subtract_144362744059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term770, term770.getClass(), "numerator", 1324040357);
        setIntField(term770, term770.getClass(), "denominator", -1588772968);
        setField(term770, term770.getClass(), "toString", "dWRymuLBtr");
        setField(term770, term770.getClass(), "toProperString", "AijpHYOFuy");
        term797 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term797, term797.getClass(), "numerator", -112921587);
        setIntField(term797, term797.getClass(), "denominator", 933028652);
        setField(term797, term797.getClass(), "toString", "SbAoxhfrkn");
        setField(term797, term797.getClass(), "toProperString", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term797;
        try {
            callMethod(klass, "subtract", argTypes, term770, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


