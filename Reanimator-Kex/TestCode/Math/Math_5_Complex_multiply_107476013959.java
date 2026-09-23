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
import java.lang.Double;

public class Complex_multiply_107476013959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term92;
     Object term791;
     Object term792;
     Object term781;

    public Complex_multiply_107476013959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term87, term87.getClass(), "imaginary", 0.0668892744806211);
        setDoubleField(term87, term87.getClass(), "real", 0.3587267442738795);
        setBooleanField(term87, term87.getClass(), "isNaN", true);
        setBooleanField(term87, term87.getClass(), "isInfinite", true);
        term92 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term92, term92.getClass(), "imaginary", 0.07802449704920456);
        setDoubleField(term92, term92.getClass(), "real", 0.5279279537140873);
        setBooleanField(term92, term92.getClass(), "isNaN", true);
        setBooleanField(term92, term92.getClass(), "isInfinite", true);
        term791 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term791, term791.getClass(), "imaginary", 0.0668892744806211);
        setDoubleField(term791, term791.getClass(), "real", 0.3587267442738795);
        setBooleanField(term791, term791.getClass(), "isNaN", true);
        setBooleanField(term791, term791.getClass(), "isInfinite", true);
        term792 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term792, term792.getClass(), "imaginary", 0.07802449704920456);
        setDoubleField(term792, term792.getClass(), "real", 0.5279279537140873);
        setBooleanField(term792, term792.getClass(), "isNaN", true);
        setBooleanField(term792, term792.getClass(), "isInfinite", true);
        term781 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term781, term781.getClass(), "imaginary", Double.NaN);
        setDoubleField(term781, term781.getClass(), "real", Double.NaN);
        setBooleanField(term781, term781.getClass(), "isNaN", true);
        setBooleanField(term781, term781.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term92;
        Object retValue = callMethod(klass, "multiply", argTypes, term87, args);
        assertTrue(recursiveEquals(term87, term791));
        assertTrue(recursiveEquals(term92, term792));
        assertTrue(recursiveEquals(retValue, term781));
    }

};


