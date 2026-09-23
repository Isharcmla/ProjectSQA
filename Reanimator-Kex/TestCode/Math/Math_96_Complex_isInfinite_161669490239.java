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

public class Complex_isInfinite_161669490239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term618;

    public Complex_isInfinite_161669490239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39, term39.getClass(), "imaginary", 0.13481025392611334);
        setDoubleField(term39, term39.getClass(), "real", 0.3800088629986428);
        term618 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term618, term618.getClass(), "imaginary", 0.13481025392611334);
        setDoubleField(term618, term618.getClass(), "real", 0.3800088629986428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term39, args);
        assertTrue(recursiveEquals(term39, term618));
        assertTrue(recursiveEquals(retValue, false));
    }

};


