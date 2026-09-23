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

public class Fraction_add_1925368547695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261705;
     Object term261793;

    public Fraction_add_1925368547695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261705 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term261705, term261705.getClass(), "numerator", 1073741824);
        setIntField(term261705, term261705.getClass(), "denominator", -260053433);
        term261793 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term261793, term261793.getClass(), "numerator", 1073741824);
        setIntField(term261793, term261793.getClass(), "denominator", 1275057019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term261793;
        try {
            callMethod(klass, "add", argTypes, term261705, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


