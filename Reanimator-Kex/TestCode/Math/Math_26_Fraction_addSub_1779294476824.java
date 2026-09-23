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

public class Fraction_addSub_1779294476824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399528;
     Object term399618;

    public Fraction_addSub_1779294476824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399528 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term399528, term399528.getClass(), "numerator", 8192);
        setIntField(term399528, term399528.getClass(), "denominator", -2027483199);
        term399618 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term399618, term399618.getClass(), "numerator", 8192);
        setIntField(term399618, term399618.getClass(), "denominator", -925855743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term399618;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term399528, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


