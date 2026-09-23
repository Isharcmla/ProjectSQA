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

public class Complex_asin_1415968746367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85267;
     Object term85681;
     Object term85678;

    public Complex_asin_1415968746367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85267 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term85267, term85267.getClass(), "real", 2.0266198323167232E16);
        setDoubleField(term85267, term85267.getClass(), "imaginary", 1.15292370363010253E18);
        term85681 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term85681, term85681.getClass(), "imaginary", 1.15292370363010253E18);
        setDoubleField(term85681, term85681.getClass(), "real", 2.0266198323167232E16);
        term85678 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term85678, term85678.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term85678, term85678.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term85267, args);
        assertTrue(recursiveEquals(term85267, term85681));
        assertTrue(recursiveEquals(retValue, term85678));
    }

};


