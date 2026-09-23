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

public class Complex_equals_1180899430135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17622;
     Object term17706;
     Object term17932;
     Object term17933;

    public Complex_equals_1180899430135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17622 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17622, term17622.getClass(), "real", -9.2166166374137201E18);
        term17706 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17706, term17706.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term17706, term17706.getClass(), "imaginary", -9.2166166374137201E18);
        term17932 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17932, term17932.getClass(), "imaginary", 0.0);
        setDoubleField(term17932, term17932.getClass(), "real", -9.2166166374137201E18);
        term17933 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17933, term17933.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term17933, term17933.getClass(), "real", -9.2166166374137201E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17706;
        Object retValue = callMethod(klass, "equals", argTypes, term17622, args);
        assertTrue(recursiveEquals(term17622, term17932));
        assertTrue(recursiveEquals(term17706, term17933));
        assertTrue(recursiveEquals(retValue, false));
    }

};


