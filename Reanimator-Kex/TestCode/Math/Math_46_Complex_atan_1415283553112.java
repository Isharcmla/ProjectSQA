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

public class Complex_atan_1415283553112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6674;
     Object term6688;
     Object term6676;

    public Complex_atan_1415283553112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6674 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6674, term6674.getClass(), "isNaN", true);
        term6688 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6688, term6688.getClass(), "imaginary", 0.0);
        setDoubleField(term6688, term6688.getClass(), "real", 0.0);
        setBooleanField(term6688, term6688.getClass(), "isNaN", true);
        setBooleanField(term6688, term6688.getClass(), "isInfinite", false);
        setBooleanField(term6688, term6688.getClass(), "isZero", false);
        term6676 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6676, term6676.getClass(), "imaginary", Double.NaN);
        setDoubleField(term6676, term6676.getClass(), "real", Double.NaN);
        setBooleanField(term6676, term6676.getClass(), "isNaN", true);
        setBooleanField(term6676, term6676.getClass(), "isInfinite", false);
        setBooleanField(term6676, term6676.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term6674, args);
        assertTrue(recursiveEquals(term6674, term6688));
        assertTrue(recursiveEquals(retValue, term6676));
    }

};


