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

public class Complex_abs_88765624246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term573;

    public Complex_abs_88765624246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term7, term7.getClass(), "imaginary", 0.544608645520025);
        setDoubleField(term7, term7.getClass(), "real", 0.28570734989730284);
        setBooleanField(term7, term7.getClass(), "isNaN", false);
        setBooleanField(term7, term7.getClass(), "isInfinite", false);
        term573 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term573, term573.getClass(), "imaginary", 0.544608645520025);
        setDoubleField(term573, term573.getClass(), "real", 0.28570734989730284);
        setBooleanField(term573, term573.getClass(), "isNaN", false);
        setBooleanField(term573, term573.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term573));
        assertTrue(recursiveEquals(retValue, 0.6150018427293499));
    }

};


