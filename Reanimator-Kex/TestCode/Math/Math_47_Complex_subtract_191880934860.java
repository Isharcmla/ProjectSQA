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

public class Complex_subtract_191880934860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;
     Object term119;
     Object term598;
     Object term592;

    public Complex_subtract_191880934860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term114, term114.getClass(), "imaginary", 0.8823181080774973);
        setDoubleField(term114, term114.getClass(), "real", 0.2192450926212024);
        setBooleanField(term114, term114.getClass(), "isNaN", false);
        setBooleanField(term114, term114.getClass(), "isInfinite", false);
        term119 = new Double(0.7591353014991907);
        term598 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term598, term598.getClass(), "imaginary", 0.8823181080774973);
        setDoubleField(term598, term598.getClass(), "real", 0.2192450926212024);
        setBooleanField(term598, term598.getClass(), "isNaN", false);
        setBooleanField(term598, term598.getClass(), "isInfinite", false);
        term592 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term592, term592.getClass(), "imaginary", 0.8823181080774973);
        setDoubleField(term592, term592.getClass(), "real", -0.5398902088779883);
        setBooleanField(term592, term592.getClass(), "isNaN", false);
        setBooleanField(term592, term592.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term119;
        Object retValue = callMethod(klass, "subtract", argTypes, term114, args);
        assertTrue(recursiveEquals(term114, term598));
        assertTrue(recursiveEquals(term119, 0.7591353014991907));
        assertTrue(recursiveEquals(retValue, term592));
    }

};


