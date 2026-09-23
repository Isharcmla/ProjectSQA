package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58087;
     Object term58175;

    public Fraction_add_1925368547191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58087 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term58087, term58087.getClass(), "numerator", 32768);
        setIntField(term58087, term58087.getClass(), "denominator", -1739640601);
        term58175 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term58175, term58175.getClass(), "numerator", 1024);
        setIntField(term58175, term58175.getClass(), "denominator", 1638642425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term58175;
        try {
            callMethod(klass, "add", argTypes, term58087, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


