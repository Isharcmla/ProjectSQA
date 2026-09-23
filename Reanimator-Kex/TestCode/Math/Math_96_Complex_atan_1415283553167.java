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

public class Complex_atan_1415283553167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24806;
     Object term24990;
     Object term24987;

    public Complex_atan_1415283553167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24806 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24806, term24806.getClass(), "real", 1.15292150460697805E18);
        setDoubleField(term24806, term24806.getClass(), "imaginary", 2.3058430135086612E18);
        term24990 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24990, term24990.getClass(), "imaginary", 2.3058430135086612E18);
        setDoubleField(term24990, term24990.getClass(), "real", 1.15292150460697805E18);
        term24987 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term24987, term24987.getClass(), "imaginary", 0.0);
        setDoubleField(term24987, term24987.getClass(), "real", 1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term24806, args);
        assertTrue(recursiveEquals(term24806, term24990));
        assertTrue(recursiveEquals(retValue, term24987));
    }

};


