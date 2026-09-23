package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1454977021480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132290;
     Object term132370;

    public Fraction_add_1454977021480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132290 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term132290, term132290.getClass(), "numerator", -2147483648);
        setIntField(term132290, term132290.getClass(), "denominator", 941626956);
        term132370 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term132370, term132370.getClass(), "numerator", 4096);
        setIntField(term132370, term132370.getClass(), "denominator", -1142950698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term132370;
        try {
            callMethod(klass, "add", argTypes, term132290, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


