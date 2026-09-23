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

public class Complex_asin_1415968746405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99399;
     Object term99607;
     Object term99604;

    public Complex_asin_1415968746405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99399 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term99399, term99399.getClass(), "real", -6.917529027636822E18);
        setDoubleField(term99399, term99399.getClass(), "imaginary", 4.6116865681832018E18);
        term99607 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term99607, term99607.getClass(), "imaginary", 4.6116865681832018E18);
        setDoubleField(term99607, term99607.getClass(), "real", -6.917529027636822E18);
        term99604 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term99604, term99604.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term99604, term99604.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term99399, args);
        assertTrue(recursiveEquals(term99399, term99607));
        assertTrue(recursiveEquals(retValue, term99604));
    }

};


