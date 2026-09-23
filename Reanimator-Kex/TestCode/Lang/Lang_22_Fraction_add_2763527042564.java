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

public class Fraction_add_2763527042564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841160;
     Object term841242;

    public Fraction_add_2763527042564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term841160 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term841160, term841160.getClass(), "numerator", 134217728);
        setIntField(term841160, term841160.getClass(), "denominator", 1055771988);
        term841242 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term841242, term841242.getClass(), "numerator", 512);
        setIntField(term841242, term841242.getClass(), "denominator", -1480296710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term841242;
        try {
            callMethod(klass, "add", argTypes, term841160, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


