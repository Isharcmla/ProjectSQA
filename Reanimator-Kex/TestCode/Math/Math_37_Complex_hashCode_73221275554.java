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

public class Complex_hashCode_73221275554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term488;

    public Complex_hashCode_73221275554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term62, term62.getClass(), "imaginary", 0.3800088629986428);
        setDoubleField(term62, term62.getClass(), "real", 0.5840714198152577);
        setBooleanField(term62, term62.getClass(), "isNaN", true);
        setBooleanField(term62, term62.getClass(), "isInfinite", true);
        term488 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term488, term488.getClass(), "imaginary", 0.3800088629986428);
        setDoubleField(term488, term488.getClass(), "real", 0.5840714198152577);
        setBooleanField(term488, term488.getClass(), "isNaN", true);
        setBooleanField(term488, term488.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term62, args);
        assertTrue(recursiveEquals(term62, term488));
        assertTrue(recursiveEquals(retValue, 7));
    }

};


