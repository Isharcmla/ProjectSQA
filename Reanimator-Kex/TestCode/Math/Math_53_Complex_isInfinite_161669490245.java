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

public class Complex_isInfinite_161669490245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term405;

    public Complex_isInfinite_161669490245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term61, term61.getClass(), "imaginary", 0.13481025392611334);
        setDoubleField(term61, term61.getClass(), "real", 0.3800088629986428);
        setBooleanField(term61, term61.getClass(), "isNaN", true);
        setBooleanField(term61, term61.getClass(), "isInfinite", true);
        term405 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term405, term405.getClass(), "imaginary", 0.13481025392611334);
        setDoubleField(term405, term405.getClass(), "real", 0.3800088629986428);
        setBooleanField(term405, term405.getClass(), "isNaN", true);
        setBooleanField(term405, term405.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term61, args);
        assertTrue(recursiveEquals(term61, term405));
    }

};


