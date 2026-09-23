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
     Object term215;
     Object term220;
     Object term222;
     Object term4501;
     Object term4489;

    public Complex_createComplex_32893291578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term215, term215.getClass(), "imaginary", 0.24259014218848696);
        setDoubleField(term215, term215.getClass(), "real", 0.1544348383112728);
        setBooleanField(term215, term215.getClass(), "isNaN", false);
        setBooleanField(term215, term215.getClass(), "isInfinite", true);
        term220 = new Double(0.5187846213101265);
        term222 = new Double(0.045893173090043815);
        term4501 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4501, term4501.getClass(), "imaginary", 0.24259014218848696);
        setDoubleField(term4501, term4501.getClass(), "real", 0.1544348383112728);
        setBooleanField(term4501, term4501.getClass(), "isNaN", false);
        setBooleanField(term4501, term4501.getClass(), "isInfinite", true);
        term4489 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4489, term4489.getClass(), "imaginary", 0.045893173090043815);
        setDoubleField(term4489, term4489.getClass(), "real", 0.5187846213101265);
        setBooleanField(term4489, term4489.getClass(), "isNaN", false);
        setBooleanField(term4489, term4489.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term220;
        args[1] = term222;
        Object retValue = callMethod(klass, "createComplex", argTypes, term215, args);
        assertTrue(recursiveEquals(term215, term4501));
        assertTrue(recursiveEquals(term220, 0.5187846213101265));
        assertTrue(recursiveEquals(term222, 0.045893173090043815));
        assertTrue(recursiveEquals(retValue, term4489));
    }

};


