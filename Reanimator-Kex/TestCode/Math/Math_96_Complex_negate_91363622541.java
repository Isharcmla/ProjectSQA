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

public class Complex_negate_91363622541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term663;
     Object term660;

    public Complex_negate_91363622541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48, term48.getClass(), "imaginary", 0.37161417339133307);
        setDoubleField(term48, term48.getClass(), "real", 0.6805867182029153);
        term663 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term663, term663.getClass(), "imaginary", 0.37161417339133307);
        setDoubleField(term663, term663.getClass(), "real", 0.6805867182029153);
        term660 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term660, term660.getClass(), "imaginary", -0.37161417339133307);
        setDoubleField(term660, term660.getClass(), "real", -0.6805867182029153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term48, args);
        assertTrue(recursiveEquals(term48, term663));
        assertTrue(recursiveEquals(retValue, term660));
    }

};


