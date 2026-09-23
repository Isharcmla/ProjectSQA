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

public class Complex_nthRoot_28446784465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;
     Object term183;
     Object term3670;
     Object term3655;

    public Complex_nthRoot_28446784465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term178, term178.getClass(), "imaginary", 0.6355029654528058);
        setDoubleField(term178, term178.getClass(), "real", 0.0022646783892913414);
        setBooleanField(term178, term178.getClass(), "isNaN", true);
        setBooleanField(term178, term178.getClass(), "isInfinite", false);
        term183 = new Integer(568599855);
        term3670 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3670, term3670.getClass(), "imaginary", 0.6355029654528058);
        setDoubleField(term3670, term3670.getClass(), "real", 0.0022646783892913414);
        setBooleanField(term3670, term3670.getClass(), "isNaN", true);
        setBooleanField(term3670, term3670.getClass(), "isInfinite", false);
        Object term3657 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3657, term3657.getClass(), "imaginary", Double.NaN);
        setDoubleField(term3657, term3657.getClass(), "real", Double.NaN);
        setBooleanField(term3657, term3657.getClass(), "isNaN", true);
        setBooleanField(term3657, term3657.getClass(), "isInfinite", false);
        term3655 = new ArrayList();
        ((ArrayList) term3655).add(term3657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term183;
        Object retValue = callMethod(klass, "nthRoot", argTypes, term178, args);
        assertTrue(recursiveEquals(term178, term3670));
        assertTrue(recursiveEquals(term183, 568599855));
        assertTrue(recursiveEquals(retValue, term3655));
    }

};


