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

public class Complex_add_61482636345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term19;
     Object term376;
     Object term377;
     Object term364;

    public Complex_add_61482636345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13, term13.getClass(), "imaginary", 0.40176586625454525);
        setDoubleField(term13, term13.getClass(), "real", 0.2641345529914265);
        setBooleanField(term13, term13.getClass(), "isNaN", false);
        setBooleanField(term13, term13.getClass(), "isInfinite", true);
        setBooleanField(term13, term13.getClass(), "isZero", true);
        term19 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19, term19.getClass(), "imaginary", 0.36923381893433327);
        setDoubleField(term19, term19.getClass(), "real", 0.6076495596892013);
        setBooleanField(term19, term19.getClass(), "isNaN", true);
        setBooleanField(term19, term19.getClass(), "isInfinite", true);
        setBooleanField(term19, term19.getClass(), "isZero", false);
        term376 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term376, term376.getClass(), "imaginary", 0.40176586625454525);
        setDoubleField(term376, term376.getClass(), "real", 0.2641345529914265);
        setBooleanField(term376, term376.getClass(), "isNaN", false);
        setBooleanField(term376, term376.getClass(), "isInfinite", true);
        setBooleanField(term376, term376.getClass(), "isZero", true);
        term377 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term377, term377.getClass(), "imaginary", 0.36923381893433327);
        setDoubleField(term377, term377.getClass(), "real", 0.6076495596892013);
        setBooleanField(term377, term377.getClass(), "isNaN", true);
        setBooleanField(term377, term377.getClass(), "isInfinite", true);
        setBooleanField(term377, term377.getClass(), "isZero", false);
        term364 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term364, term364.getClass(), "imaginary", Double.NaN);
        setDoubleField(term364, term364.getClass(), "real", Double.NaN);
        setBooleanField(term364, term364.getClass(), "isNaN", true);
        setBooleanField(term364, term364.getClass(), "isInfinite", false);
        setBooleanField(term364, term364.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term19;
        Object retValue = callMethod(klass, "add", argTypes, term13, args);
        assertTrue(recursiveEquals(term13, term376));
        assertTrue(recursiveEquals(term19, term377));
        assertTrue(recursiveEquals(retValue, term364));
    }

};


