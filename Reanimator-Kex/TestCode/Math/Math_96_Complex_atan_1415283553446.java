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

public class Complex_atan_1415283553446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110657;
     Object term111375;
     Object term111372;

    public Complex_atan_1415283553446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110657 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term110657, term110657.getClass(), "real", 4.512395720392704E15);
        setDoubleField(term110657, term110657.getClass(), "imaginary", 4.50359962738688E15);
        term111375 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111375, term111375.getClass(), "imaginary", 4.50359962738688E15);
        setDoubleField(term111375, term111375.getClass(), "real", 4.512395720392704E15);
        term111372 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111372, term111372.getClass(), "imaginary", 1.1102230246251564E-16);
        setDoubleField(term111372, term111372.getClass(), "real", 1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term110657, args);
        assertTrue(recursiveEquals(term110657, term111375));
        assertTrue(recursiveEquals(retValue, term111372));
    }

};


