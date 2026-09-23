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

public class Fraction_add_7517755721278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638024;
     Object term638114;

    public Fraction_add_7517755721278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638024 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term638024, term638024.getClass(), "numerator", 1073741824);
        setIntField(term638024, term638024.getClass(), "denominator", -958);
        term638114 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term638114, term638114.getClass(), "numerator", 1073741824);
        setIntField(term638114, term638114.getClass(), "denominator", -528482295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term638114;
        try {
            callMethod(klass, "add", argTypes, term638024, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


