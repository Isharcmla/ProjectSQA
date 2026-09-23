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

public class Complex_isInfinite_161669490263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2133;
     Object term2144;

    public Complex_isInfinite_161669490263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2133 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2133, term2133.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term2133, term2133.getClass(), "imaginary", 9.2188684372274053E18);
        term2144 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2144, term2144.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term2144, term2144.getClass(), "real", -9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term2133, args);
        assertTrue(recursiveEquals(term2133, term2144));
        assertTrue(recursiveEquals(retValue, false));
    }

};


