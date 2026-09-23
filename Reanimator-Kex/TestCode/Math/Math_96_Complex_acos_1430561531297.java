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

public class Complex_acos_1430561531297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60069;
     Object term60280;
     Object term60277;

    public Complex_acos_1430561531297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60069 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term60069, term60069.getClass(), "real", 1.8014398509481984E16);
        setDoubleField(term60069, term60069.getClass(), "imaginary", 2.8830074489588941E17);
        term60280 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term60280, term60280.getClass(), "imaginary", 2.8830074489588941E17);
        setDoubleField(term60280, term60280.getClass(), "real", 1.8014398509481984E16);
        term60277 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term60277, term60277.getClass(), "imaginary", -40.89787613445548);
        setDoubleField(term60277, term60277.getClass(), "real", 1.508392712519823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term60069, args);
        assertTrue(recursiveEquals(term60069, term60280));
        assertTrue(recursiveEquals(retValue, term60277));
    }

};


