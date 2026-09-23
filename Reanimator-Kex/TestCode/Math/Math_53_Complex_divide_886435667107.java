package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;
import java.lang.Double;

public class Complex_divide_886435667107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9363;
     Object term9447;
     Object term9466;
     Object term9467;
     Object term9456;

    public Complex_divide_886435667107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9363 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term9363, term9363.getClass(), "isNaN", false);
        term9447 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term9447, term9447.getClass(), "isNaN", true);
        term9466 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9466, term9466.getClass(), "imaginary", 0.0);
        setDoubleField(term9466, term9466.getClass(), "real", 0.0);
        setBooleanField(term9466, term9466.getClass(), "isNaN", false);
        setBooleanField(term9466, term9466.getClass(), "isInfinite", false);
        term9467 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9467, term9467.getClass(), "imaginary", 0.0);
        setDoubleField(term9467, term9467.getClass(), "real", 0.0);
        setBooleanField(term9467, term9467.getClass(), "isNaN", true);
        setBooleanField(term9467, term9467.getClass(), "isInfinite", false);
        term9456 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9456, term9456.getClass(), "imaginary", Double.NaN);
        setDoubleField(term9456, term9456.getClass(), "real", Double.NaN);
        setBooleanField(term9456, term9456.getClass(), "isNaN", true);
        setBooleanField(term9456, term9456.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term9447;
        Object retValue = callMethod(klass, "divide", argTypes, term9363, args);
        assertTrue(recursiveEquals(term9363, term9466));
        assertTrue(recursiveEquals(term9447, term9467));
        assertTrue(recursiveEquals(retValue, term9456));
    }

};


