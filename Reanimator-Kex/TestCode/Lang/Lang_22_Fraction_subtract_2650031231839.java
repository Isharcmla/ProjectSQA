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

public class Fraction_subtract_2650031231839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600060;
     Object term600142;

    public Fraction_subtract_2650031231839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600060 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term600060, term600060.getClass(), "numerator", 1024);
        setIntField(term600060, term600060.getClass(), "denominator", -196473544);
        term600142 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term600142, term600142.getClass(), "numerator", 16);
        setIntField(term600142, term600142.getClass(), "denominator", 151034748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term600142;
        try {
            callMethod(klass, "subtract", argTypes, term600060, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


