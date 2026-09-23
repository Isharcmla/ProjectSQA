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

public class Complex_multiply_178725535885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6477;
     Object term6507;
     Object term6508;
     Object term6502;

    public Complex_multiply_178725535885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6477 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6477, term6477.getClass(), "isNaN", false);
        term6507 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6507, term6507.getClass(), "imaginary", 0.0);
        setDoubleField(term6507, term6507.getClass(), "real", 0.0);
        setBooleanField(term6507, term6507.getClass(), "isNaN", false);
        setBooleanField(term6507, term6507.getClass(), "isInfinite", false);
        term6508 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6508, term6508.getClass(), "imaginary", 0.0);
        setDoubleField(term6508, term6508.getClass(), "real", 0.0);
        setBooleanField(term6508, term6508.getClass(), "isNaN", false);
        setBooleanField(term6508, term6508.getClass(), "isInfinite", false);
        term6502 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6502, term6502.getClass(), "imaginary", 0.0);
        setDoubleField(term6502, term6502.getClass(), "real", 0.0);
        setBooleanField(term6502, term6502.getClass(), "isNaN", false);
        setBooleanField(term6502, term6502.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term6477;
        Object retValue = callMethod(klass, "multiply", argTypes, term6477, args);
        assertTrue(recursiveEquals(term6477, term6507));
        assertTrue(recursiveEquals(term6477, term6508));
        assertTrue(recursiveEquals(retValue, term6502));
    }

};


