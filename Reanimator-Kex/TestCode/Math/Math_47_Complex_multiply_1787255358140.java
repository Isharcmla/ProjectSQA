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

public class Complex_multiply_1787255358140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12137;
     Object term12221;
     Object term12256;
     Object term12257;
     Object term12251;

    public Complex_multiply_1787255358140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12137 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term12137, term12137.getClass(), "isNaN", false);
        setDoubleField(term12137, term12137.getClass(), "real", 0.0);
        setDoubleField(term12137, term12137.getClass(), "imaginary", 0.0);
        term12221 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term12221, term12221.getClass(), "isNaN", false);
        setDoubleField(term12221, term12221.getClass(), "real", 0.0);
        setDoubleField(term12221, term12221.getClass(), "imaginary", 9.2188684372274053E18);
        term12256 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12256, term12256.getClass(), "imaginary", 0.0);
        setDoubleField(term12256, term12256.getClass(), "real", 0.0);
        setBooleanField(term12256, term12256.getClass(), "isNaN", false);
        setBooleanField(term12256, term12256.getClass(), "isInfinite", false);
        term12257 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12257, term12257.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term12257, term12257.getClass(), "real", 0.0);
        setBooleanField(term12257, term12257.getClass(), "isNaN", false);
        setBooleanField(term12257, term12257.getClass(), "isInfinite", false);
        term12251 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12251, term12251.getClass(), "imaginary", 0.0);
        setDoubleField(term12251, term12251.getClass(), "real", 0.0);
        setBooleanField(term12251, term12251.getClass(), "isNaN", false);
        setBooleanField(term12251, term12251.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term12221;
        Object retValue = callMethod(klass, "multiply", argTypes, term12137, args);
        assertTrue(recursiveEquals(term12137, term12256));
        assertTrue(recursiveEquals(term12221, term12257));
        assertTrue(recursiveEquals(retValue, term12251));
    }

};


