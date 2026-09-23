package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;

public class EigenDecompositionImpl_computeShiftIncrement_63456736488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25294;
     Object term25327;

    public EigenDecompositionImpl_computeShiftIncrement_63456736488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25294 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term25294, term25294.getClass(), "dMin", 4.503599627370497E15);
        setIntField(term25294, term25294.getClass(), "pingPong", 0);
        term25327 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term25327, term25327.getClass(), "splitTolerance", 0.0);
        setField(term25327, term25327.getClass(), "main", null);
        setField(term25327, term25327.getClass(), "secondary", null);
        setField(term25327, term25327.getClass(), "squaredSecondary", null);
        setField(term25327, term25327.getClass(), "transformer", null);
        setDoubleField(term25327, term25327.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term25327, term25327.getClass(), "upperSpectra", 0.0);
        setDoubleField(term25327, term25327.getClass(), "minPivot", 0.0);
        setDoubleField(term25327, term25327.getClass(), "sigma", 0.0);
        setDoubleField(term25327, term25327.getClass(), "sigmaLow", 0.0);
        setDoubleField(term25327, term25327.getClass(), "tau", 1.1258999068426242E15);
        setField(term25327, term25327.getClass(), "work", null);
        setIntField(term25327, term25327.getClass(), "pingPong", 0);
        setDoubleField(term25327, term25327.getClass(), "qMax", 0.0);
        setDoubleField(term25327, term25327.getClass(), "eMin", 0.0);
        setIntField(term25327, term25327.getClass(), "tType", -6);
        setDoubleField(term25327, term25327.getClass(), "dMin", 4.503599627370497E15);
        setDoubleField(term25327, term25327.getClass(), "dMin1", 0.0);
        setDoubleField(term25327, term25327.getClass(), "dMin2", 0.0);
        setDoubleField(term25327, term25327.getClass(), "dN", 0.0);
        setDoubleField(term25327, term25327.getClass(), "dN1", 0.0);
        setDoubleField(term25327, term25327.getClass(), "dN2", 0.0);
        setDoubleField(term25327, term25327.getClass(), "g", 0.25);
        setField(term25327, term25327.getClass(), "realEigenvalues", null);
        setField(term25327, term25327.getClass(), "imagEigenvalues", null);
        setField(term25327, term25327.getClass(), "eigenvectors", null);
        setField(term25327, term25327.getClass(), "cachedV", null);
        setField(term25327, term25327.getClass(), "cachedD", null);
        setField(term25327, term25327.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "computeShiftIncrement", argTypes, term25294, args);
        assertTrue(recursiveEquals(term25294, term25327));
    }

};


