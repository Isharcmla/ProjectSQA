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

public class Complex_getImaginary_74926337252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term495;

    public Complex_getImaginary_74926337252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term72, term72.getClass(), "imaginary", 0.3800088629986428);
        setDoubleField(term72, term72.getClass(), "real", 0.5840714198152577);
        setBooleanField(term72, term72.getClass(), "isNaN", true);
        setBooleanField(term72, term72.getClass(), "isInfinite", true);
        setBooleanField(term72, term72.getClass(), "isZero", true);
        term495 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term495, term495.getClass(), "imaginary", 0.3800088629986428);
        setDoubleField(term495, term495.getClass(), "real", 0.5840714198152577);
        setBooleanField(term495, term495.getClass(), "isNaN", true);
        setBooleanField(term495, term495.getClass(), "isInfinite", true);
        setBooleanField(term495, term495.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImaginary", argTypes, term72, args);
        assertTrue(recursiveEquals(term72, term495));
        assertTrue(recursiveEquals(retValue, 0.3800088629986428));
    }

};


