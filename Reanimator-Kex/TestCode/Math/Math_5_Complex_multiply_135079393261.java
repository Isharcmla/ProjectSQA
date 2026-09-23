package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;
import java.lang.Double;

public class Complex_multiply_135079393261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term109;
     Object term832;
     Object term821;

    public Complex_multiply_135079393261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term104, term104.getClass(), "imaginary", 0.8878841294187743);
        setDoubleField(term104, term104.getClass(), "real", 0.6588948704887806);
        setBooleanField(term104, term104.getClass(), "isNaN", true);
        setBooleanField(term104, term104.getClass(), "isInfinite", true);
        term109 = new Double(0.6397214730945112);
        term832 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term832, term832.getClass(), "imaginary", 0.8878841294187743);
        setDoubleField(term832, term832.getClass(), "real", 0.6588948704887806);
        setBooleanField(term832, term832.getClass(), "isNaN", true);
        setBooleanField(term832, term832.getClass(), "isInfinite", true);
        term821 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term821, term821.getClass(), "imaginary", Double.NaN);
        setDoubleField(term821, term821.getClass(), "real", Double.NaN);
        setBooleanField(term821, term821.getClass(), "isNaN", true);
        setBooleanField(term821, term821.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term109;
        Object retValue = callMethod(klass, "multiply", argTypes, term104, args);
        assertTrue(recursiveEquals(term104, term832));
        assertTrue(recursiveEquals(term109, 0.6397214730945112));
        assertTrue(recursiveEquals(retValue, term821));
    }

};


