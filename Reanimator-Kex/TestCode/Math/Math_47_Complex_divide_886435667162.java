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

public class Complex_divide_886435667162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15387;
     Object term15471;
     Object term15843;
     Object term15844;
     Object term15838;

    public Complex_divide_886435667162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15387 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term15387, term15387.getClass(), "isNaN", false);
        setBooleanField(term15387, term15387.getClass(), "isInfinite", true);
        term15471 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term15471, term15471.getClass(), "isNaN", false);
        setDoubleField(term15471, term15471.getClass(), "real", 3.6028797018963968E16);
        setBooleanField(term15471, term15471.getClass(), "isInfinite", true);
        setDoubleField(term15471, term15471.getClass(), "imaginary", 3.6028797018963968E16);
        term15843 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15843, term15843.getClass(), "imaginary", 0.0);
        setDoubleField(term15843, term15843.getClass(), "real", 0.0);
        setBooleanField(term15843, term15843.getClass(), "isNaN", false);
        setBooleanField(term15843, term15843.getClass(), "isInfinite", true);
        term15844 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15844, term15844.getClass(), "imaginary", 3.6028797018963968E16);
        setDoubleField(term15844, term15844.getClass(), "real", 3.6028797018963968E16);
        setBooleanField(term15844, term15844.getClass(), "isNaN", false);
        setBooleanField(term15844, term15844.getClass(), "isInfinite", true);
        term15838 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15838, term15838.getClass(), "imaginary", 0.0);
        setDoubleField(term15838, term15838.getClass(), "real", 0.0);
        setBooleanField(term15838, term15838.getClass(), "isNaN", false);
        setBooleanField(term15838, term15838.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term15471;
        Object retValue = callMethod(klass, "divide", argTypes, term15387, args);
        assertTrue(recursiveEquals(term15387, term15843));
        assertTrue(recursiveEquals(term15471, term15844));
        assertTrue(recursiveEquals(retValue, term15838));
    }

};


