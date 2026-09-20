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
import java.lang.Boolean;

public class Fraction_addSub_177929447653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term92;
     Object term95;

    public Fraction_addSub_177929447653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term89, term89.getClass(), "denominator", -1968847291);
        setIntField(term89, term89.getClass(), "numerator", 579005622);
        term92 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term92, term92.getClass(), "denominator", -14890619);
        setIntField(term92, term92.getClass(), "numerator", 1632125673);
        term95 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term92;
        args[1] = term95;
        try {
            callMethod(klass, "addSub", argTypes, term89, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
