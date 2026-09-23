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

public class Complex_add_614826363103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6426;
     Object term6571;
     Object term6572;
     Object term6566;

    public Complex_add_614826363103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6426 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6426, term6426.getClass(), "isNaN", false);
        term6571 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6571, term6571.getClass(), "imaginary", 0.0);
        setDoubleField(term6571, term6571.getClass(), "real", 0.0);
        setBooleanField(term6571, term6571.getClass(), "isNaN", false);
        setBooleanField(term6571, term6571.getClass(), "isInfinite", false);
        term6572 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6572, term6572.getClass(), "imaginary", 0.0);
        setDoubleField(term6572, term6572.getClass(), "real", 0.0);
        setBooleanField(term6572, term6572.getClass(), "isNaN", false);
        setBooleanField(term6572, term6572.getClass(), "isInfinite", false);
        term6566 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6566, term6566.getClass(), "imaginary", 0.0);
        setDoubleField(term6566, term6566.getClass(), "real", 0.0);
        setBooleanField(term6566, term6566.getClass(), "isNaN", false);
        setBooleanField(term6566, term6566.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term6426;
        Object retValue = callMethod(klass, "add", argTypes, term6426, args);
        assertTrue(recursiveEquals(term6426, term6571));
        assertTrue(recursiveEquals(term6426, term6572));
        assertTrue(recursiveEquals(retValue, term6566));
    }

};


