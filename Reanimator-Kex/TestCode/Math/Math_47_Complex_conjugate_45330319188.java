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

public class Complex_conjugate_45330319188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5315;
     Object term5548;
     Object term5543;

    public Complex_conjugate_45330319188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5315 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term5315, term5315.getClass(), "isNaN", false);
        setDoubleField(term5315, term5315.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term5315, term5315.getClass(), "imaginary", -9.223372036854776E18);
        term5548 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5548, term5548.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term5548, term5548.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term5548, term5548.getClass(), "isNaN", false);
        setBooleanField(term5548, term5548.getClass(), "isInfinite", false);
        term5543 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5543, term5543.getClass(), "imaginary", 9.223372036854776E18);
        setDoubleField(term5543, term5543.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term5543, term5543.getClass(), "isNaN", false);
        setBooleanField(term5543, term5543.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term5315, args);
        assertTrue(recursiveEquals(term5315, term5548));
        assertTrue(recursiveEquals(retValue, term5543));
    }

};


