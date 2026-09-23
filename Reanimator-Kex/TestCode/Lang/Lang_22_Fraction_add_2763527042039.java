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

public class Fraction_add_2763527042039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663567;
     Object term663649;

    public Fraction_add_2763527042039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term663567 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term663567, term663567.getClass(), "numerator", 1);
        setIntField(term663567, term663567.getClass(), "denominator", 1218719956);
        term663649 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term663649, term663649.getClass(), "numerator", -2147483648);
        setIntField(term663649, term663649.getClass(), "denominator", -1688681030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term663649;
        try {
            callMethod(klass, "add", argTypes, term663567, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


