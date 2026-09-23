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

public class Complex_atan_1415283553131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16842;
     Object term17026;
     Object term17023;

    public Complex_atan_1415283553131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16842 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16842, term16842.getClass(), "real", -9.2053576383452938E18);
        setDoubleField(term16842, term16842.getClass(), "imaginary", -4.6116156496832102E18);
        term17026 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17026, term17026.getClass(), "imaginary", -4.6116156496832102E18);
        setDoubleField(term17026, term17026.getClass(), "real", -9.2053576383452938E18);
        term17023 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17023, term17023.getClass(), "imaginary", 0.0);
        setDoubleField(term17023, term17023.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term16842, args);
        assertTrue(recursiveEquals(term16842, term17026));
        assertTrue(recursiveEquals(retValue, term17023));
    }

};


