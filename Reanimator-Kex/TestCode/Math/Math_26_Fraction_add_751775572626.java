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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_751775572626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289592;
     Object term289682;

    public Fraction_add_751775572626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289592 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term289592, term289592.getClass(), "numerator", 1073741824);
        setIntField(term289592, term289592.getClass(), "denominator", -16777374);
        term289682 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term289682, term289682.getClass(), "numerator", 1073741824);
        setIntField(term289682, term289682.getClass(), "denominator", -866889723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term289682;
        try {
            callMethod(klass, "add", argTypes, term289592, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


