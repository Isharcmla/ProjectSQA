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

public class Fraction_multiplyBy_1636046455950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272641;
     Object term272721;

    public Fraction_multiplyBy_1636046455950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272641 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term272641, term272641.getClass(), "numerator", 826972318);
        setIntField(term272641, term272641.getClass(), "denominator", 1074515963);
        term272721 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term272721, term272721.getClass(), "numerator", 1074257922);
        setIntField(term272721, term272721.getClass(), "denominator", 1074515963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term272721;
        try {
            callMethod(klass, "multiplyBy", argTypes, term272641, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


