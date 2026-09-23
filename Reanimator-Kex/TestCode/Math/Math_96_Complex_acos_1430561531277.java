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

public class Complex_acos_1430561531277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53460;
     Object term53892;
     Object term53889;

    public Complex_acos_1430561531277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53460 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term53460, term53460.getClass(), "real", -9.2188684372274012E18);
        setDoubleField(term53460, term53460.getClass(), "imaginary", 2.8823037615171174E17);
        term53892 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term53892, term53892.getClass(), "imaginary", 2.8823037615171174E17);
        setDoubleField(term53892, term53892.getClass(), "real", -9.2188684372274012E18);
        term53889 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term53889, term53889.getClass(), "imaginary", -44.361419675045774);
        setDoubleField(term53889, term53889.getClass(), "real", 3.110337568817408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term53460, args);
        assertTrue(recursiveEquals(term53460, term53892));
        assertTrue(recursiveEquals(retValue, term53889));
    }

};


