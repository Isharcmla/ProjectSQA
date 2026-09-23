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
import java.lang.Double;

public class Complex_sqrt_90221718572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;
     Object term3289;
     Object term3279;

    public Complex_sqrt_90221718572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term183, term183.getClass(), "imaginary", 0.03699061125289671);
        setDoubleField(term183, term183.getClass(), "real", 0.6047137830113202);
        setBooleanField(term183, term183.getClass(), "isNaN", true);
        setBooleanField(term183, term183.getClass(), "isInfinite", true);
        term3289 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3289, term3289.getClass(), "imaginary", 0.03699061125289671);
        setDoubleField(term3289, term3289.getClass(), "real", 0.6047137830113202);
        setBooleanField(term3289, term3289.getClass(), "isNaN", true);
        setBooleanField(term3289, term3289.getClass(), "isInfinite", true);
        term3279 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3279, term3279.getClass(), "imaginary", Double.NaN);
        setDoubleField(term3279, term3279.getClass(), "real", Double.NaN);
        setBooleanField(term3279, term3279.getClass(), "isNaN", true);
        setBooleanField(term3279, term3279.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term183, args);
        assertTrue(recursiveEquals(term183, term3289));
        assertTrue(recursiveEquals(retValue, term3279));
    }

};


