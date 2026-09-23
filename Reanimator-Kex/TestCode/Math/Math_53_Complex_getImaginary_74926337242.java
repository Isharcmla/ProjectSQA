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

public class Complex_getImaginary_74926337242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term384;

    public Complex_getImaginary_74926337242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term46, term46.getClass(), "imaginary", 0.6436713023569729);
        setDoubleField(term46, term46.getClass(), "real", 0.7332741045694002);
        setBooleanField(term46, term46.getClass(), "isNaN", true);
        setBooleanField(term46, term46.getClass(), "isInfinite", true);
        term384 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term384, term384.getClass(), "imaginary", 0.6436713023569729);
        setDoubleField(term384, term384.getClass(), "real", 0.7332741045694002);
        setBooleanField(term384, term384.getClass(), "isNaN", true);
        setBooleanField(term384, term384.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImaginary", argTypes, term46, args);
        assertTrue(recursiveEquals(term46, term384));
        assertTrue(recursiveEquals(retValue, 0.6436713023569729));
    }

};


