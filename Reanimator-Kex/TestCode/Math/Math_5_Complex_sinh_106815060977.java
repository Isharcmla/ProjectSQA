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

public class Complex_sinh_106815060977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190;
     Object term9230;
     Object term9220;

    public Complex_sinh_106815060977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term190, term190.getClass(), "imaginary", 0.6767213143579776);
        setDoubleField(term190, term190.getClass(), "real", 0.48862955528902696);
        setBooleanField(term190, term190.getClass(), "isNaN", true);
        setBooleanField(term190, term190.getClass(), "isInfinite", false);
        term9230 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term9230, term9230.getClass(), "imaginary", 0.6767213143579776);
        setDoubleField(term9230, term9230.getClass(), "real", 0.48862955528902696);
        setBooleanField(term9230, term9230.getClass(), "isNaN", true);
        setBooleanField(term9230, term9230.getClass(), "isInfinite", false);
        term9220 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term9220, term9220.getClass(), "imaginary", Double.NaN);
        setDoubleField(term9220, term9220.getClass(), "real", Double.NaN);
        setBooleanField(term9220, term9220.getClass(), "isNaN", true);
        setBooleanField(term9220, term9220.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sinh", argTypes, term190, args);
        assertTrue(recursiveEquals(term190, term9230));
        assertTrue(recursiveEquals(retValue, term9220));
    }

};


