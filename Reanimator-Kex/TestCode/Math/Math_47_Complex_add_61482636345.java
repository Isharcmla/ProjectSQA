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
     Object term12;
     Object term17;
     Object term323;
     Object term324;
     Object term313;

    public Complex_add_61482636345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12, term12.getClass(), "imaginary", 0.40176586625454525);
        setDoubleField(term12, term12.getClass(), "real", 0.2641345529914265);
        setBooleanField(term12, term12.getClass(), "isNaN", false);
        setBooleanField(term12, term12.getClass(), "isInfinite", false);
        term17 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17, term17.getClass(), "imaginary", 0.36923381893433327);
        setDoubleField(term17, term17.getClass(), "real", 0.6076495596892013);
        setBooleanField(term17, term17.getClass(), "isNaN", true);
        setBooleanField(term17, term17.getClass(), "isInfinite", true);
        term323 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term323, term323.getClass(), "imaginary", 0.40176586625454525);
        setDoubleField(term323, term323.getClass(), "real", 0.2641345529914265);
        setBooleanField(term323, term323.getClass(), "isNaN", false);
        setBooleanField(term323, term323.getClass(), "isInfinite", false);
        term324 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term324, term324.getClass(), "imaginary", 0.36923381893433327);
        setDoubleField(term324, term324.getClass(), "real", 0.6076495596892013);
        setBooleanField(term324, term324.getClass(), "isNaN", true);
        setBooleanField(term324, term324.getClass(), "isInfinite", true);
        term313 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term313, term313.getClass(), "imaginary", Double.NaN);
        setDoubleField(term313, term313.getClass(), "real", Double.NaN);
        setBooleanField(term313, term313.getClass(), "isNaN", true);
        setBooleanField(term313, term313.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term17;
        Object retValue = callMethod(klass, "add", argTypes, term12, args);
        assertTrue(recursiveEquals(term12, term323));
        assertTrue(recursiveEquals(term17, term324));
        assertTrue(recursiveEquals(retValue, term313));
    }

};


