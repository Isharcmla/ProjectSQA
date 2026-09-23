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

public class Complex_exp_8949039666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;
     Object term2017;
     Object term2007;

    public Complex_exp_8949039666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term146, term146.getClass(), "imaginary", 0.2109867221632754);
        setDoubleField(term146, term146.getClass(), "real", 0.3227335400819148);
        setBooleanField(term146, term146.getClass(), "isNaN", true);
        setBooleanField(term146, term146.getClass(), "isInfinite", false);
        term2017 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2017, term2017.getClass(), "imaginary", 0.2109867221632754);
        setDoubleField(term2017, term2017.getClass(), "real", 0.3227335400819148);
        setBooleanField(term2017, term2017.getClass(), "isNaN", true);
        setBooleanField(term2017, term2017.getClass(), "isInfinite", false);
        term2007 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2007, term2007.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2007, term2007.getClass(), "real", Double.NaN);
        setBooleanField(term2007, term2007.getClass(), "isNaN", true);
        setBooleanField(term2007, term2007.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "exp", argTypes, term146, args);
        assertTrue(recursiveEquals(term146, term2017));
        assertTrue(recursiveEquals(retValue, term2007));
    }

};


