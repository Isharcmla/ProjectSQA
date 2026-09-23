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

public class Complex_divide_886435667109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7024;
     Object term7108;
     Object term7160;
     Object term7161;
     Object term7155;

    public Complex_divide_886435667109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7024 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7024, term7024.getClass(), "isNaN", false);
        term7108 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7108, term7108.getClass(), "isNaN", false);
        setDoubleField(term7108, term7108.getClass(), "real", 4.503599627370497E15);
        setBooleanField(term7108, term7108.getClass(), "isInfinite", false);
        term7160 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7160, term7160.getClass(), "imaginary", 0.0);
        setDoubleField(term7160, term7160.getClass(), "real", 0.0);
        setBooleanField(term7160, term7160.getClass(), "isNaN", false);
        setBooleanField(term7160, term7160.getClass(), "isInfinite", false);
        term7161 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7161, term7161.getClass(), "imaginary", 0.0);
        setDoubleField(term7161, term7161.getClass(), "real", 4.503599627370497E15);
        setBooleanField(term7161, term7161.getClass(), "isNaN", false);
        setBooleanField(term7161, term7161.getClass(), "isInfinite", false);
        term7155 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7155, term7155.getClass(), "imaginary", 0.0);
        setDoubleField(term7155, term7155.getClass(), "real", 0.0);
        setBooleanField(term7155, term7155.getClass(), "isNaN", false);
        setBooleanField(term7155, term7155.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term7108;
        Object retValue = callMethod(klass, "divide", argTypes, term7024, args);
        assertTrue(recursiveEquals(term7024, term7160));
        assertTrue(recursiveEquals(term7108, term7161));
        assertTrue(recursiveEquals(retValue, term7155));
    }

};


