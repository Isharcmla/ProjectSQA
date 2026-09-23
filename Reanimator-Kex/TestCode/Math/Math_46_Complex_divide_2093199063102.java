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

public class Complex_divide_2093199063102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5684;
     Object term5703;
     Object term5690;

    public Complex_divide_2093199063102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5684 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term5684, term5684.getClass(), "isNaN", false);
        term5703 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5703, term5703.getClass(), "imaginary", 0.0);
        setDoubleField(term5703, term5703.getClass(), "real", 0.0);
        setBooleanField(term5703, term5703.getClass(), "isNaN", false);
        setBooleanField(term5703, term5703.getClass(), "isInfinite", false);
        setBooleanField(term5703, term5703.getClass(), "isZero", false);
        term5690 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5690, term5690.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term5690, term5690.getClass(), "real", Double.POSITIVE_INFINITY);
        setBooleanField(term5690, term5690.getClass(), "isNaN", false);
        setBooleanField(term5690, term5690.getClass(), "isInfinite", true);
        setBooleanField(term5690, term5690.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "divide", argTypes, term5684, args);
        assertTrue(recursiveEquals(term5684, term5703));
        assertTrue(recursiveEquals(retValue, term5690));
    }

};


