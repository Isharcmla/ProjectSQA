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

public class Complex_acos_1430561531477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119547;
     Object term119750;
     Object term119747;

    public Complex_acos_1430561531477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119547 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term119547, term119547.getClass(), "real", 1.45241087982698496E17);
        setDoubleField(term119547, term119547.getClass(), "imaginary", -4.6116860184273879E18);
        term119750 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term119750, term119750.getClass(), "imaginary", -4.6116860184273879E18);
        setDoubleField(term119750, term119750.getClass(), "real", 1.45241087982698496E17);
        term119747 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term119747, term119747.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term119747, term119747.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term119547, args);
        assertTrue(recursiveEquals(term119547, term119750));
        assertTrue(recursiveEquals(retValue, term119747));
    }

};


