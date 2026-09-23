package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_add_1771744369103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12863;
     Object term12889;
     Object term12883;

    public Complex_add_1771744369103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12863 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term12863, term12863.getClass(), "isNaN", false);
        term12889 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term12889, term12889.getClass(), "imaginary", 0.0);
        setDoubleField(term12889, term12889.getClass(), "real", 0.0);
        setBooleanField(term12889, term12889.getClass(), "isNaN", false);
        setBooleanField(term12889, term12889.getClass(), "isInfinite", false);
        term12883 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term12883, term12883.getClass(), "imaginary", 0.0);
        setDoubleField(term12883, term12883.getClass(), "real", 0.0);
        setBooleanField(term12883, term12883.getClass(), "isNaN", false);
        setBooleanField(term12883, term12883.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "add", argTypes, term12863, args);
        assertTrue(recursiveEquals(term12863, term12889));
        assertTrue(recursiveEquals(retValue, term12883));
    }

};


