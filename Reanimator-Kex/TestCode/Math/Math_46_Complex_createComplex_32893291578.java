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

public class Complex_createComplex_32893291578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;
     Object term260;
     Object term262;
     Object term3939;
     Object term3925;

    public Complex_createComplex_32893291578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term254, term254.getClass(), "imaginary", 0.24259014218848696);
        setDoubleField(term254, term254.getClass(), "real", 0.1544348383112728);
        setBooleanField(term254, term254.getClass(), "isNaN", true);
        setBooleanField(term254, term254.getClass(), "isInfinite", false);
        setBooleanField(term254, term254.getClass(), "isZero", false);
        term260 = new Double(0.5187846213101265);
        term262 = new Double(0.045893173090043815);
        term3939 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3939, term3939.getClass(), "imaginary", 0.24259014218848696);
        setDoubleField(term3939, term3939.getClass(), "real", 0.1544348383112728);
        setBooleanField(term3939, term3939.getClass(), "isNaN", true);
        setBooleanField(term3939, term3939.getClass(), "isInfinite", false);
        setBooleanField(term3939, term3939.getClass(), "isZero", false);
        term3925 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3925, term3925.getClass(), "imaginary", 0.045893173090043815);
        setDoubleField(term3925, term3925.getClass(), "real", 0.5187846213101265);
        setBooleanField(term3925, term3925.getClass(), "isNaN", false);
        setBooleanField(term3925, term3925.getClass(), "isInfinite", false);
        setBooleanField(term3925, term3925.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term260;
        args[1] = term262;
        Object retValue = callMethod(klass, "createComplex", argTypes, term254, args);
        assertTrue(recursiveEquals(term254, term3939));
        assertTrue(recursiveEquals(term260, 0.5187846213101265));
        assertTrue(recursiveEquals(term262, 0.045893173090043815));
        assertTrue(recursiveEquals(retValue, term3925));
    }

};


