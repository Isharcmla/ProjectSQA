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

public class Complex_conjugate_453303191101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6286;
     Object term6450;
     Object term6445;

    public Complex_conjugate_453303191101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6286 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6286, term6286.getClass(), "isNaN", false);
        setDoubleField(term6286, term6286.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term6286, term6286.getClass(), "imaginary", -4.503599627370496E15);
        term6450 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6450, term6450.getClass(), "imaginary", -4.503599627370496E15);
        setDoubleField(term6450, term6450.getClass(), "real", -9.2166166374137201E18);
        setBooleanField(term6450, term6450.getClass(), "isNaN", false);
        setBooleanField(term6450, term6450.getClass(), "isInfinite", false);
        term6445 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6445, term6445.getClass(), "imaginary", 4.503599627370496E15);
        setDoubleField(term6445, term6445.getClass(), "real", -9.2166166374137201E18);
        setBooleanField(term6445, term6445.getClass(), "isNaN", false);
        setBooleanField(term6445, term6445.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term6286, args);
        assertTrue(recursiveEquals(term6286, term6450));
        assertTrue(recursiveEquals(retValue, term6445));
    }

};


