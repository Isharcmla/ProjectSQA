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

public class Fraction_add_1925368547468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170976;
     Object term171064;

    public Fraction_add_1925368547468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170976 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term170976, term170976.getClass(), "numerator", 1073741824);
        setIntField(term170976, term170976.getClass(), "denominator", -2269495);
        term171064 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term171064, term171064.getClass(), "numerator", 1073741824);
        setIntField(term171064, term171064.getClass(), "denominator", 2141707669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term171064;
        try {
            callMethod(klass, "add", argTypes, term170976, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


