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

public class Fraction_multiplyBy_16360464552704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806637;
     Object term806717;

    public Fraction_multiplyBy_16360464552704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term806637 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term806637, term806637.getClass(), "numerator", 69659770);
        term806717 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term806717, term806717.getClass(), "numerator", 69613578);
        setIntField(term806717, term806717.getClass(), "denominator", 964952065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term806717;
        try {
            callMethod(klass, "multiplyBy", argTypes, term806637, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


