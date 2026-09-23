package org.apache.commons.math.complex;

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
import org.apache.commons.math.exception.NullArgumentException;
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Complex_pow_62902513884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2449;

    public Complex_pow_62902513884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2449 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2449, term2449.getClass(), "imaginary", 0.0);
        setDoubleField(term2449, term2449.getClass(), "real", 0.0);
        setBooleanField(term2449, term2449.getClass(), "isNaN", false);
        setBooleanField(term2449, term2449.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "pow", argTypes, term2449, args);
            assertTrue(false);
        }
        catch (NullArgumentException e) {
        }

    }

};


