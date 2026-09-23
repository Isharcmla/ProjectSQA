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
import java.lang.Integer;

public class Complex_multiply_125761987760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term102;
     Object term562;
     Object term556;

    public Complex_multiply_125761987760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term97, term97.getClass(), "imaginary", 0.3202192021706908);
        setDoubleField(term97, term97.getClass(), "real", 0.22651340641904605);
        setBooleanField(term97, term97.getClass(), "isNaN", false);
        setBooleanField(term97, term97.getClass(), "isInfinite", true);
        term102 = new Integer(568599855);
        term562 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term562, term562.getClass(), "imaginary", 0.3202192021706908);
        setDoubleField(term562, term562.getClass(), "real", 0.22651340641904605);
        setBooleanField(term562, term562.getClass(), "isNaN", false);
        setBooleanField(term562, term562.getClass(), "isInfinite", true);
        term556 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term556, term556.getClass(), "imaginary", 1.8207659192247045E8);
        setDoubleField(term556, term556.getClass(), "real", 1.2879549004542565E8);
        setBooleanField(term556, term556.getClass(), "isNaN", false);
        setBooleanField(term556, term556.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term102;
        Object retValue = callMethod(klass, "multiply", argTypes, term97, args);
        assertTrue(recursiveEquals(term97, term562));
        assertTrue(recursiveEquals(term102, 568599855));
        assertTrue(recursiveEquals(retValue, term556));
    }

};


