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

public class Complex_negate_913636225126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7676;
     Object term7705;
     Object term7699;

    public Complex_negate_913636225126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7676 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7676, term7676.getClass(), "isNaN", false);
        setDoubleField(term7676, term7676.getClass(), "real", -4.503599627370496E15);
        setDoubleField(term7676, term7676.getClass(), "imaginary", -9.223372036854776E18);
        term7705 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7705, term7705.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term7705, term7705.getClass(), "real", -4.503599627370496E15);
        setBooleanField(term7705, term7705.getClass(), "isNaN", false);
        setBooleanField(term7705, term7705.getClass(), "isInfinite", false);
        setBooleanField(term7705, term7705.getClass(), "isZero", false);
        term7699 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7699, term7699.getClass(), "imaginary", 9.223372036854776E18);
        setDoubleField(term7699, term7699.getClass(), "real", 4.503599627370496E15);
        setBooleanField(term7699, term7699.getClass(), "isNaN", false);
        setBooleanField(term7699, term7699.getClass(), "isInfinite", false);
        setBooleanField(term7699, term7699.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term7676, args);
        assertTrue(recursiveEquals(term7676, term7705));
        assertTrue(recursiveEquals(retValue, term7699));
    }

};


