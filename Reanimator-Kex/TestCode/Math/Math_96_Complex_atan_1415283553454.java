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

public class Complex_atan_1415283553454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112840;
     Object term113537;
     Object term113534;

    public Complex_atan_1415283553454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112840 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term112840, term112840.getClass(), "real", 2.8823037621882061E17);
        setDoubleField(term112840, term112840.getClass(), "imaginary", -9.2053576383452856E18);
        term113537 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term113537, term113537.getClass(), "imaginary", -9.2053576383452856E18);
        setDoubleField(term113537, term113537.getClass(), "real", 2.8823037621882061E17);
        term113534 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term113534, term113534.getClass(), "imaginary", 0.0);
        setDoubleField(term113534, term113534.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term112840, args);
        assertTrue(recursiveEquals(term112840, term113537));
        assertTrue(recursiveEquals(retValue, term113534));
    }

};


