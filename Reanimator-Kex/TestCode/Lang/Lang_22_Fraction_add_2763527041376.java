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

public class Fraction_add_2763527041376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448502;
     Object term448584;

    public Fraction_add_2763527041376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448502 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term448502, term448502.getClass(), "numerator", 268435456);
        setIntField(term448502, term448502.getClass(), "denominator", 1210039340);
        term448584 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term448584, term448584.getClass(), "numerator", 268435456);
        setIntField(term448584, term448584.getClass(), "denominator", -1301174842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term448584;
        try {
            callMethod(klass, "add", argTypes, term448502, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


