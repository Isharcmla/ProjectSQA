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

public class Complex_isInfinite_161669490255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term497;

    public Complex_isInfinite_161669490255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term77, term77.getClass(), "imaginary", 0.6805867182029153);
        setDoubleField(term77, term77.getClass(), "real", 0.2852810965221698);
        setBooleanField(term77, term77.getClass(), "isNaN", false);
        setBooleanField(term77, term77.getClass(), "isInfinite", false);
        term497 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term497, term497.getClass(), "imaginary", 0.6805867182029153);
        setDoubleField(term497, term497.getClass(), "real", 0.2852810965221698);
        setBooleanField(term497, term497.getClass(), "isNaN", false);
        setBooleanField(term497, term497.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term77, args);
        assertTrue(recursiveEquals(term77, term497));
    }

};


