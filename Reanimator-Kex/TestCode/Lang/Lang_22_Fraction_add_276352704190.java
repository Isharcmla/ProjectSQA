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

public class Fraction_add_276352704190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46162;
     Object term46244;

    public Fraction_add_276352704190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46162 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term46162, term46162.getClass(), "numerator", 4);
        setIntField(term46162, term46162.getClass(), "denominator", 1378833116);
        term46244 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term46244, term46244.getClass(), "numerator", 33554432);
        setIntField(term46244, term46244.getClass(), "denominator", -1421347234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term46244;
        try {
            callMethod(klass, "add", argTypes, term46162, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


