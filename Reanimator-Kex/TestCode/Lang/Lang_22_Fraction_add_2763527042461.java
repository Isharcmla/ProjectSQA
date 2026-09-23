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

public class Fraction_add_2763527042461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805956;
     Object term806038;

    public Fraction_add_2763527042461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term805956 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term805956, term805956.getClass(), "numerator", 8388608);
        setIntField(term805956, term805956.getClass(), "denominator", 1079512916);
        term806038 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term806038, term806038.getClass(), "numerator", -2147483648);
        setIntField(term806038, term806038.getClass(), "denominator", -1277430662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term806038;
        try {
            callMethod(klass, "add", argTypes, term805956, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


