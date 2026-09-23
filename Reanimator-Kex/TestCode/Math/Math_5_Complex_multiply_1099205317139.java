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

public class Complex_multiply_1099205317139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19845;
     Object term19872;
     Object term19866;

    public Complex_multiply_1099205317139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19845 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term19845, term19845.getClass(), "isNaN", false);
        setDoubleField(term19845, term19845.getClass(), "real", 9.2188684372274053E18);
        term19872 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term19872, term19872.getClass(), "imaginary", 0.0);
        setDoubleField(term19872, term19872.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term19872, term19872.getClass(), "isNaN", false);
        setBooleanField(term19872, term19872.getClass(), "isInfinite", false);
        term19866 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term19866, term19866.getClass(), "imaginary", 0.0);
        setDoubleField(term19866, term19866.getClass(), "real", 0.0);
        setBooleanField(term19866, term19866.getClass(), "isNaN", false);
        setBooleanField(term19866, term19866.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "multiply", argTypes, term19845, args);
        assertTrue(recursiveEquals(term19845, term19872));
        assertTrue(recursiveEquals(retValue, term19866));
    }

};


