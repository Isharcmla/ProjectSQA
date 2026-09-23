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

public class Complex_sqrt_90221718584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2930;
     Object term4250;
     Object term4244;

    public Complex_sqrt_90221718584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2930 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2930, term2930.getClass(), "imaginary", 0.0);
        setDoubleField(term2930, term2930.getClass(), "real", 0.0);
        setBooleanField(term2930, term2930.getClass(), "isNaN", false);
        setBooleanField(term2930, term2930.getClass(), "isInfinite", false);
        setBooleanField(term2930, term2930.getClass(), "isZero", false);
        term4250 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4250, term4250.getClass(), "imaginary", 0.0);
        setDoubleField(term4250, term4250.getClass(), "real", 0.0);
        setBooleanField(term4250, term4250.getClass(), "isNaN", false);
        setBooleanField(term4250, term4250.getClass(), "isInfinite", false);
        setBooleanField(term4250, term4250.getClass(), "isZero", false);
        term4244 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4244, term4244.getClass(), "imaginary", 0.0);
        setDoubleField(term4244, term4244.getClass(), "real", 0.0);
        setBooleanField(term4244, term4244.getClass(), "isNaN", false);
        setBooleanField(term4244, term4244.getClass(), "isInfinite", false);
        setBooleanField(term4244, term4244.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term2930, args);
        assertTrue(recursiveEquals(term2930, term4250));
        assertTrue(recursiveEquals(retValue, term4244));
    }

};


