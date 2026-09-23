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

public class Fraction_add_2763527041604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521512;
     Object term521594;

    public Fraction_add_2763527041604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521512 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term521512, term521512.getClass(), "numerator", 1073741824);
        setIntField(term521512, term521512.getClass(), "denominator", 1066797612);
        term521594 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term521594, term521594.getClass(), "numerator", 1073741824);
        setIntField(term521594, term521594.getClass(), "denominator", -1574178106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term521594;
        try {
            callMethod(klass, "add", argTypes, term521512, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


