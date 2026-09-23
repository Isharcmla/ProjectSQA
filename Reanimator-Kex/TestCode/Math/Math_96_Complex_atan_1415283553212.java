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

public class Complex_atan_1415283553212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35193;
     Object term35771;
     Object term35768;

    public Complex_atan_1415283553212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35193 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term35193, term35193.getClass(), "real", 4.503599627370498E15);
        setDoubleField(term35193, term35193.getClass(), "imaginary", -8.6469112845177979E18);
        term35771 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term35771, term35771.getClass(), "imaginary", -8.6469112845177979E18);
        setDoubleField(term35771, term35771.getClass(), "real", 4.503599627370498E15);
        term35768 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term35768, term35768.getClass(), "imaginary", 0.0);
        setDoubleField(term35768, term35768.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term35193, args);
        assertTrue(recursiveEquals(term35193, term35771));
        assertTrue(recursiveEquals(retValue, term35768));
    }

};


