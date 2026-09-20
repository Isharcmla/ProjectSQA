package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_multiply_1924204567111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33650;
     Object term34464;
     Object term34465;
     Object term34458;

    public Fraction_multiply_1924204567111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33650 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term33650, term33650.getClass(), "numerator", 0);
        term34464 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term34464, term34464.getClass(), "denominator", 0);
        setIntField(term34464, term34464.getClass(), "numerator", 0);
        term34465 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term34465, term34465.getClass(), "denominator", 0);
        setIntField(term34465, term34465.getClass(), "numerator", 0);
        term34458 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term34458, term34458.getClass(), "denominator", 1);
        setIntField(term34458, term34458.getClass(), "numerator", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term33650;
        Object retValue = callMethod(klass, "multiply", argTypes, term33650, args);
        assertTrue(recursiveEquals(term33650, term34464));
        assertTrue(recursiveEquals(term33650, term34465));
        assertTrue(recursiveEquals(retValue, term34458));
    }

};
