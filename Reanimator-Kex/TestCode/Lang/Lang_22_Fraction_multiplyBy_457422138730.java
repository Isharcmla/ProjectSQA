package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_457422138730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230916;
     Object term230998;

    public Fraction_multiplyBy_457422138730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230916 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term230916, term230916.getClass(), "numerator", 319890178);
        term230998 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term230998, term230998.getClass(), "numerator", 286326786);
        setIntField(term230998, term230998.getClass(), "denominator", 744247677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term230998;
        try {
            callMethod(klass, "multiplyBy", argTypes, term230916, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


