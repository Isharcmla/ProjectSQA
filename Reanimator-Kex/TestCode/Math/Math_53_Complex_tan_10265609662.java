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

public class Complex_tan_10265609662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term2897;
     Object term2887;

    public Complex_tan_10265609662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term163, term163.getClass(), "imaginary", 0.5306473989087822);
        setDoubleField(term163, term163.getClass(), "real", 0.022483645678509023);
        setBooleanField(term163, term163.getClass(), "isNaN", true);
        setBooleanField(term163, term163.getClass(), "isInfinite", true);
        term2897 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2897, term2897.getClass(), "imaginary", 0.5306473989087822);
        setDoubleField(term2897, term2897.getClass(), "real", 0.022483645678509023);
        setBooleanField(term2897, term2897.getClass(), "isNaN", true);
        setBooleanField(term2897, term2897.getClass(), "isInfinite", true);
        term2887 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2887, term2887.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2887, term2887.getClass(), "real", Double.NaN);
        setBooleanField(term2887, term2887.getClass(), "isNaN", true);
        setBooleanField(term2887, term2887.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tan", argTypes, term163, args);
        assertTrue(recursiveEquals(term163, term2897));
        assertTrue(recursiveEquals(retValue, term2887));
    }

};


