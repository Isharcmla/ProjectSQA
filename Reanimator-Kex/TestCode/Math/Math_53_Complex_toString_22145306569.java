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

public class Complex_toString_22145306569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;
     Object term3769;

    public Complex_toString_22145306569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term204, term204.getClass(), "imaginary", 0.32554480512985284);
        setDoubleField(term204, term204.getClass(), "real", 0.8924855581421237);
        setBooleanField(term204, term204.getClass(), "isNaN", true);
        setBooleanField(term204, term204.getClass(), "isInfinite", false);
        term3769 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3769, term3769.getClass(), "imaginary", 0.32554480512985284);
        setDoubleField(term3769, term3769.getClass(), "real", 0.8924855581421237);
        setBooleanField(term3769, term3769.getClass(), "isNaN", true);
        setBooleanField(term3769, term3769.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term204, args);
        assertTrue(recursiveEquals(term204, term3769));
        assertTrue(recursiveEquals(retValue, "(0.8924855581421237, 0.32554480512985284)"));
    }

};


