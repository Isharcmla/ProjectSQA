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

public class Complex_multiply_178725535856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term102;
     Object term540;
     Object term541;
     Object term528;

    public Complex_multiply_178725535856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term96, term96.getClass(), "imaginary", 0.6300849762307866);
        setDoubleField(term96, term96.getClass(), "real", 0.9737083944266686);
        setBooleanField(term96, term96.getClass(), "isNaN", true);
        setBooleanField(term96, term96.getClass(), "isInfinite", true);
        setBooleanField(term96, term96.getClass(), "isZero", false);
        term102 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term102, term102.getClass(), "imaginary", 0.0668892744806211);
        setDoubleField(term102, term102.getClass(), "real", 0.3587267442738795);
        setBooleanField(term102, term102.getClass(), "isNaN", true);
        setBooleanField(term102, term102.getClass(), "isInfinite", true);
        setBooleanField(term102, term102.getClass(), "isZero", true);
        term540 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term540, term540.getClass(), "imaginary", 0.6300849762307866);
        setDoubleField(term540, term540.getClass(), "real", 0.9737083944266686);
        setBooleanField(term540, term540.getClass(), "isNaN", true);
        setBooleanField(term540, term540.getClass(), "isInfinite", true);
        setBooleanField(term540, term540.getClass(), "isZero", false);
        term541 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term541, term541.getClass(), "imaginary", 0.0668892744806211);
        setDoubleField(term541, term541.getClass(), "real", 0.3587267442738795);
        setBooleanField(term541, term541.getClass(), "isNaN", true);
        setBooleanField(term541, term541.getClass(), "isInfinite", true);
        setBooleanField(term541, term541.getClass(), "isZero", true);
        term528 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term528, term528.getClass(), "imaginary", Double.NaN);
        setDoubleField(term528, term528.getClass(), "real", Double.NaN);
        setBooleanField(term528, term528.getClass(), "isNaN", true);
        setBooleanField(term528, term528.getClass(), "isInfinite", false);
        setBooleanField(term528, term528.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term102;
        Object retValue = callMethod(klass, "multiply", argTypes, term96, args);
        assertTrue(recursiveEquals(term96, term540));
        assertTrue(recursiveEquals(term102, term541));
        assertTrue(recursiveEquals(retValue, term528));
    }

};


