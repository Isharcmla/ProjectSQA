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
import java.lang.Double;

public class Complex_pow_629025138517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131887;
     Object term131954;
     Object term131955;
     Object term131951;

    public Complex_pow_629025138517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131887 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131887, term131887.getClass(), "real", 0.0);
        setDoubleField(term131887, term131887.getClass(), "imaginary", 0.0);
        term131954 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131954, term131954.getClass(), "imaginary", 0.0);
        setDoubleField(term131954, term131954.getClass(), "real", 0.0);
        term131955 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131955, term131955.getClass(), "imaginary", 0.0);
        setDoubleField(term131955, term131955.getClass(), "real", 0.0);
        term131951 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131951, term131951.getClass(), "imaginary", Double.NaN);
        setDoubleField(term131951, term131951.getClass(), "real", Double.NaN);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term131887;
        Object retValue = callMethod(klass, "pow", argTypes, term131887, args);
        assertTrue(recursiveEquals(term131887, term131954));
        assertTrue(recursiveEquals(term131887, term131955));
        assertTrue(recursiveEquals(retValue, term131951));
    }

};


