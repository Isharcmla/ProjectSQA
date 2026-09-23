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

public class Complex_sqrt1z_86661266475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4803;
     Object term4937;
     Object term4934;

    public Complex_sqrt1z_86661266475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4803 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4803, term4803.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term4803, term4803.getClass(), "imaginary", 9.2188684372274053E18);
        term4937 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4937, term4937.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term4937, term4937.getClass(), "real", -9.2166166374137201E18);
        term4934 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4934, term4934.getClass(), "imaginary", 9.2166166374137201E18);
        setDoubleField(term4934, term4934.getClass(), "real", 9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term4803, args);
        assertTrue(recursiveEquals(term4803, term4937));
        assertTrue(recursiveEquals(retValue, term4934));
    }

};


