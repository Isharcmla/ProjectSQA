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

public class Complex_valueOf_1863834553106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5882;

    public Complex_valueOf_1863834553106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5882 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5882, term5882.getClass(), "imaginary", -2.225073858507202E-308);
        setDoubleField(term5882, term5882.getClass(), "real", 0.0);
        setBooleanField(term5882, term5882.getClass(), "isNaN", false);
        setBooleanField(term5882, term5882.getClass(), "isInfinite", false);
        setBooleanField(term5882, term5882.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 0.0;
        args[1] = -2.225073858507202E-308;
        Object retValue = callMethod(klass, "valueOf", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term5882));
    }

};


