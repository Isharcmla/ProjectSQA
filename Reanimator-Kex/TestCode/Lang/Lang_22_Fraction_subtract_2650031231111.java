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

public class Fraction_subtract_2650031231111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356839;
     Object term356921;

    public Fraction_subtract_2650031231111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356839 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term356839, term356839.getClass(), "numerator", -2147483648);
        setIntField(term356839, term356839.getClass(), "denominator", -553779768);
        term356921 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term356921, term356921.getClass(), "numerator", 131072);
        setIntField(term356921, term356921.getClass(), "denominator", 293705476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term356921;
        try {
            callMethod(klass, "subtract", argTypes, term356839, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


