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

public class Complex_sqrt1z_86661266461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;
     Object term2885;
     Object term2880;

    public Complex_sqrt1z_86661266461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term158, term158.getClass(), "imaginary", 0.9126850255993704);
        setDoubleField(term158, term158.getClass(), "real", 0.11179067076100713);
        setBooleanField(term158, term158.getClass(), "isNaN", false);
        setBooleanField(term158, term158.getClass(), "isInfinite", false);
        term2885 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2885, term2885.getClass(), "imaginary", 0.9126850255993704);
        setDoubleField(term2885, term2885.getClass(), "real", 0.11179067076100713);
        setBooleanField(term2885, term2885.getClass(), "isNaN", false);
        setBooleanField(term2885, term2885.getClass(), "isInfinite", false);
        term2880 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2880, term2880.getClass(), "imaginary", -0.0755009907559453);
        setDoubleField(term2880, term2880.getClass(), "real", 1.3513686401161071);
        setBooleanField(term2880, term2880.getClass(), "isNaN", false);
        setBooleanField(term2880, term2880.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term158, args);
        assertTrue(recursiveEquals(term158, term2885));
        assertTrue(recursiveEquals(retValue, term2880));
    }

};


