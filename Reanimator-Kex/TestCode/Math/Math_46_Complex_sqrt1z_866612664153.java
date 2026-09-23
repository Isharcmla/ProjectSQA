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

public class Complex_sqrt1z_866612664153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13069;
     Object term13127;
     Object term13121;

    public Complex_sqrt1z_866612664153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13069 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term13069, term13069.getClass(), "isNaN", true);
        term13127 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13127, term13127.getClass(), "imaginary", 0.0);
        setDoubleField(term13127, term13127.getClass(), "real", 0.0);
        setBooleanField(term13127, term13127.getClass(), "isNaN", true);
        setBooleanField(term13127, term13127.getClass(), "isInfinite", false);
        setBooleanField(term13127, term13127.getClass(), "isZero", false);
        term13121 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13121, term13121.getClass(), "imaginary", Double.NaN);
        setDoubleField(term13121, term13121.getClass(), "real", Double.NaN);
        setBooleanField(term13121, term13121.getClass(), "isNaN", true);
        setBooleanField(term13121, term13121.getClass(), "isInfinite", false);
        setBooleanField(term13121, term13121.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term13069, args);
        assertTrue(recursiveEquals(term13069, term13127));
        assertTrue(recursiveEquals(retValue, term13121));
    }

};


