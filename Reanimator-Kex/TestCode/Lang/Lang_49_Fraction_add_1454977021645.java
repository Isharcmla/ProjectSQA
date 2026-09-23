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

public class Fraction_add_1454977021645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179570;
     Object term179650;

    public Fraction_add_1454977021645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179570 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term179570, term179570.getClass(), "numerator", 64);
        setIntField(term179570, term179570.getClass(), "denominator", 1199043580);
        term179650 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term179650, term179650.getClass(), "numerator", 1073741824);
        setIntField(term179650, term179650.getClass(), "denominator", -1078108306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term179650;
        try {
            callMethod(klass, "add", argTypes, term179570, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


