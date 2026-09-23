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

public class Fraction_add_276352704224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57200;
     Object term57282;

    public Fraction_add_276352704224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57200 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term57200, term57200.getClass(), "numerator", 8388608);
        setIntField(term57200, term57200.getClass(), "denominator", 1073741825);
        term57282 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term57282, term57282.getClass(), "numerator", 16777216);
        setIntField(term57282, term57282.getClass(), "denominator", -65536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term57282;
        try {
            callMethod(klass, "add", argTypes, term57200, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


