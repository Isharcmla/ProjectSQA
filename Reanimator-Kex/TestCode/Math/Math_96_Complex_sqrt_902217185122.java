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

public class Complex_sqrt_902217185122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14745;
     Object term15277;
     Object term15274;

    public Complex_sqrt_902217185122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14745 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14745, term14745.getClass(), "real", -9.223372036854776E18);
        setDoubleField(term14745, term14745.getClass(), "imaginary", 1.0);
        term15277 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15277, term15277.getClass(), "imaginary", 1.0);
        setDoubleField(term15277, term15277.getClass(), "real", -9.223372036854776E18);
        term15274 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15274, term15274.getClass(), "imaginary", 3.03700049997605E9);
        setDoubleField(term15274, term15274.getClass(), "real", 1.646361269956798E-10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term14745, args);
        assertTrue(recursiveEquals(term14745, term15277));
        assertTrue(recursiveEquals(retValue, term15274));
    }

};


