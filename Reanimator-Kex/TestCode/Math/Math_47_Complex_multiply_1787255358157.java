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

public class Complex_multiply_1787255358157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14742;
     Object term14826;
     Object term14861;
     Object term14862;
     Object term14856;

    public Complex_multiply_1787255358157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14742 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term14742, term14742.getClass(), "isNaN", false);
        setDoubleField(term14742, term14742.getClass(), "real", 0.0);
        setDoubleField(term14742, term14742.getClass(), "imaginary", 0.0);
        term14826 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term14826, term14826.getClass(), "isNaN", false);
        setDoubleField(term14826, term14826.getClass(), "real", 9.2188684372274053E18);
        term14861 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14861, term14861.getClass(), "imaginary", 0.0);
        setDoubleField(term14861, term14861.getClass(), "real", 0.0);
        setBooleanField(term14861, term14861.getClass(), "isNaN", false);
        setBooleanField(term14861, term14861.getClass(), "isInfinite", false);
        term14862 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14862, term14862.getClass(), "imaginary", 0.0);
        setDoubleField(term14862, term14862.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term14862, term14862.getClass(), "isNaN", false);
        setBooleanField(term14862, term14862.getClass(), "isInfinite", false);
        term14856 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14856, term14856.getClass(), "imaginary", 0.0);
        setDoubleField(term14856, term14856.getClass(), "real", 0.0);
        setBooleanField(term14856, term14856.getClass(), "isNaN", false);
        setBooleanField(term14856, term14856.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term14826;
        Object retValue = callMethod(klass, "multiply", argTypes, term14742, args);
        assertTrue(recursiveEquals(term14742, term14861));
        assertTrue(recursiveEquals(term14826, term14862));
        assertTrue(recursiveEquals(retValue, term14856));
    }

};


