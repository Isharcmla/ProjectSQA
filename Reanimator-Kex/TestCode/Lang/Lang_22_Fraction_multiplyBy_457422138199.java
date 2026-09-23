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

public class Fraction_multiplyBy_457422138199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49635;
     Object term49717;

    public Fraction_multiplyBy_457422138199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49635 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term49635, term49635.getClass(), "numerator", 16949786);
        term49717 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term49717, term49717.getClass(), "numerator", 50463250);
        setIntField(term49717, term49717.getClass(), "denominator", 677207737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term49717;
        try {
            callMethod(klass, "multiplyBy", argTypes, term49635, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


