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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Double;

public class Complex_nthRoot_28446784477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;
     Object term213;
     Object term4483;
     Object term4468;

    public Complex_nthRoot_28446784477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term208, term208.getClass(), "imaginary", 0.53094494792755);
        setDoubleField(term208, term208.getClass(), "real", 0.146431486357265);
        setBooleanField(term208, term208.getClass(), "isNaN", true);
        setBooleanField(term208, term208.getClass(), "isInfinite", false);
        term213 = new Integer(568599855);
        term4483 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4483, term4483.getClass(), "imaginary", 0.53094494792755);
        setDoubleField(term4483, term4483.getClass(), "real", 0.146431486357265);
        setBooleanField(term4483, term4483.getClass(), "isNaN", true);
        setBooleanField(term4483, term4483.getClass(), "isInfinite", false);
        Object term4470 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4470, term4470.getClass(), "imaginary", Double.NaN);
        setDoubleField(term4470, term4470.getClass(), "real", Double.NaN);
        setBooleanField(term4470, term4470.getClass(), "isNaN", true);
        setBooleanField(term4470, term4470.getClass(), "isInfinite", false);
        term4468 = new ArrayList();
        ((ArrayList) term4468).add(term4470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term213;
        Object retValue = callMethod(klass, "nthRoot", argTypes, term208, args);
        assertTrue(recursiveEquals(term208, term4483));
        assertTrue(recursiveEquals(term213, 568599855));
        assertTrue(recursiveEquals(retValue, term4468));
    }

};


