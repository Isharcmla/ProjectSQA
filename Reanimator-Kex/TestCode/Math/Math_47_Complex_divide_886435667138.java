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

public class Complex_divide_886435667138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11865;
     Object term11949;
     Object term12001;
     Object term12002;
     Object term11996;

    public Complex_divide_886435667138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11865 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term11865, term11865.getClass(), "isNaN", false);
        term11949 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term11949, term11949.getClass(), "isNaN", false);
        setDoubleField(term11949, term11949.getClass(), "real", 2.8823037615171174E17);
        setBooleanField(term11949, term11949.getClass(), "isInfinite", false);
        setDoubleField(term11949, term11949.getClass(), "imaginary", 4.503599627370497E15);
        term12001 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12001, term12001.getClass(), "imaginary", 0.0);
        setDoubleField(term12001, term12001.getClass(), "real", 0.0);
        setBooleanField(term12001, term12001.getClass(), "isNaN", false);
        setBooleanField(term12001, term12001.getClass(), "isInfinite", false);
        term12002 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12002, term12002.getClass(), "imaginary", 4.503599627370497E15);
        setDoubleField(term12002, term12002.getClass(), "real", 2.8823037615171174E17);
        setBooleanField(term12002, term12002.getClass(), "isNaN", false);
        setBooleanField(term12002, term12002.getClass(), "isInfinite", false);
        term11996 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11996, term11996.getClass(), "imaginary", 0.0);
        setDoubleField(term11996, term11996.getClass(), "real", 0.0);
        setBooleanField(term11996, term11996.getClass(), "isNaN", false);
        setBooleanField(term11996, term11996.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term11949;
        Object retValue = callMethod(klass, "divide", argTypes, term11865, args);
        assertTrue(recursiveEquals(term11865, term12001));
        assertTrue(recursiveEquals(term11949, term12002));
        assertTrue(recursiveEquals(retValue, term11996));
    }

};


