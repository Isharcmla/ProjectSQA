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

public class Complex_readResolve_129001964781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;
     Object term4012;
     Object term4006;

    public Complex_readResolve_129001964781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term270, term270.getClass(), "imaginary", 0.5412182593116958);
        setDoubleField(term270, term270.getClass(), "real", 0.16988691727397487);
        setBooleanField(term270, term270.getClass(), "isNaN", false);
        setBooleanField(term270, term270.getClass(), "isInfinite", false);
        setBooleanField(term270, term270.getClass(), "isZero", false);
        term4012 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4012, term4012.getClass(), "imaginary", 0.5412182593116958);
        setDoubleField(term4012, term4012.getClass(), "real", 0.16988691727397487);
        setBooleanField(term4012, term4012.getClass(), "isNaN", false);
        setBooleanField(term4012, term4012.getClass(), "isInfinite", false);
        setBooleanField(term4012, term4012.getClass(), "isZero", false);
        term4006 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4006, term4006.getClass(), "imaginary", 0.5412182593116958);
        setDoubleField(term4006, term4006.getClass(), "real", 0.16988691727397487);
        setBooleanField(term4006, term4006.getClass(), "isNaN", false);
        setBooleanField(term4006, term4006.getClass(), "isInfinite", false);
        setBooleanField(term4006, term4006.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term270, args);
        assertTrue(recursiveEquals(term270, term4012));
        assertTrue(recursiveEquals(retValue, term4006));
    }

};


