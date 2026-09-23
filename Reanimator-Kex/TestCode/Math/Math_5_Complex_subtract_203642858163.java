package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;
import java.lang.Double;

public class Complex_subtract_203642858163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116;
     Object term121;
     Object term863;
     Object term864;
     Object term853;

    public Complex_subtract_203642858163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term116, term116.getClass(), "imaginary", 0.8823181080774973);
        setDoubleField(term116, term116.getClass(), "real", 0.2192450926212024);
        setBooleanField(term116, term116.getClass(), "isNaN", false);
        setBooleanField(term116, term116.getClass(), "isInfinite", false);
        term121 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term121, term121.getClass(), "imaginary", 0.7591353014991907);
        setDoubleField(term121, term121.getClass(), "real", 0.791695029600875);
        setBooleanField(term121, term121.getClass(), "isNaN", true);
        setBooleanField(term121, term121.getClass(), "isInfinite", true);
        term863 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term863, term863.getClass(), "imaginary", 0.8823181080774973);
        setDoubleField(term863, term863.getClass(), "real", 0.2192450926212024);
        setBooleanField(term863, term863.getClass(), "isNaN", false);
        setBooleanField(term863, term863.getClass(), "isInfinite", false);
        term864 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term864, term864.getClass(), "imaginary", 0.7591353014991907);
        setDoubleField(term864, term864.getClass(), "real", 0.791695029600875);
        setBooleanField(term864, term864.getClass(), "isNaN", true);
        setBooleanField(term864, term864.getClass(), "isInfinite", true);
        term853 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term853, term853.getClass(), "imaginary", Double.NaN);
        setDoubleField(term853, term853.getClass(), "real", Double.NaN);
        setBooleanField(term853, term853.getClass(), "isNaN", true);
        setBooleanField(term853, term853.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term121;
        Object retValue = callMethod(klass, "subtract", argTypes, term116, args);
        assertTrue(recursiveEquals(term116, term863));
        assertTrue(recursiveEquals(term121, term864));
        assertTrue(recursiveEquals(retValue, term853));
    }

};


