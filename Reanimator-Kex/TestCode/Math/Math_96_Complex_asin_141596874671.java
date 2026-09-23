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

public class Complex_asin_141596874671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4305;
     Object term4508;
     Object term4505;

    public Complex_asin_141596874671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4305 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4305, term4305.getClass(), "real", 5.066549580791808E15);
        setDoubleField(term4305, term4305.getClass(), "imaginary", 1.44115188075864064E17);
        term4508 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4508, term4508.getClass(), "imaginary", 1.44115188075864064E17);
        setDoubleField(term4508, term4508.getClass(), "real", 5.066549580791808E15);
        term4505 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4505, term4505.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term4505, term4505.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term4305, args);
        assertTrue(recursiveEquals(term4305, term4508));
        assertTrue(recursiveEquals(retValue, term4505));
    }

};


