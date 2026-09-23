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

public class Complex_atan_1415283553463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115535;
     Object term115908;
     Object term115905;

    public Complex_atan_1415283553463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115535 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term115535, term115535.getClass(), "real", -9.2143648376000348E18);
        setDoubleField(term115535, term115535.getClass(), "imaginary", 9.007267974217728E15);
        term115908 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term115908, term115908.getClass(), "imaginary", 9.007267974217728E15);
        setDoubleField(term115908, term115908.getClass(), "real", -9.2143648376000348E18);
        term115905 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term115905, term115905.getClass(), "imaginary", 0.0);
        setDoubleField(term115905, term115905.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term115535, args);
        assertTrue(recursiveEquals(term115535, term115908));
        assertTrue(recursiveEquals(retValue, term115905));
    }

};


