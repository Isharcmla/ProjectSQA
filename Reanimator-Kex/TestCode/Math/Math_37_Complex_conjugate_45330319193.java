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

public class Complex_conjugate_45330319193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2227;
     Object term10617;
     Object term10612;

    public Complex_conjugate_45330319193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2227 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term2227, term2227.getClass(), "isNaN", false);
        setDoubleField(term2227, term2227.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term2227, term2227.getClass(), "imaginary", -9.223372036854776E18);
        term10617 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10617, term10617.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term10617, term10617.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term10617, term10617.getClass(), "isNaN", false);
        setBooleanField(term10617, term10617.getClass(), "isInfinite", false);
        term10612 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10612, term10612.getClass(), "imaginary", 9.223372036854776E18);
        setDoubleField(term10612, term10612.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term10612, term10612.getClass(), "isNaN", false);
        setBooleanField(term10612, term10612.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term2227, args);
        assertTrue(recursiveEquals(term2227, term10617));
        assertTrue(recursiveEquals(retValue, term10612));
    }

};


