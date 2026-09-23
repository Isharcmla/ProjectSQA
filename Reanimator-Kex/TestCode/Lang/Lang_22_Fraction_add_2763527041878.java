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

public class Fraction_add_2763527041878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613784;
     Object term613866;

    public Fraction_add_2763527041878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613784 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term613784, term613784.getClass(), "numerator", -2147483648);
        setIntField(term613784, term613784.getClass(), "denominator", 1073741825);
        term613866 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term613866, term613866.getClass(), "numerator", -2147483648);
        setIntField(term613866, term613866.getClass(), "denominator", -268468224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term613866;
        try {
            callMethod(klass, "add", argTypes, term613784, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


