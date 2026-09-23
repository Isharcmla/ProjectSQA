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

public class Complex_acos_1430561531134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17498;
     Object term17909;
     Object term17906;

    public Complex_acos_1430561531134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17498 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17498, term17498.getClass(), "real", 5.7649593667551232E17);
        setDoubleField(term17498, term17498.getClass(), "imaginary", -9.1513144428168479E18);
        term17909 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17909, term17909.getClass(), "imaginary", -9.1513144428168479E18);
        setDoubleField(term17909, term17909.getClass(), "real", 5.7649593667551232E17);
        term17906 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term17906, term17906.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term17906, term17906.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term17498, args);
        assertTrue(recursiveEquals(term17498, term17909));
        assertTrue(recursiveEquals(retValue, term17906));
    }

};


