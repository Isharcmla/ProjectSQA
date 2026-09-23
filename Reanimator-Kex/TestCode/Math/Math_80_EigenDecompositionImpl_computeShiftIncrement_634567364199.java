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

public class EigenDecompositionImpl_computeShiftIncrement_634567364199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1238243;
     Object term1248317;

    public EigenDecompositionImpl_computeShiftIncrement_634567364199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1238243 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term1238243, term1238243.getClass(), "dMin", 1.15292150890181427E18);
        setIntField(term1238243, term1238243.getClass(), "pingPong", 0);
        setDoubleField(term1238243, term1238243.getClass(), "dMin2", 4.9022913462739927E18);
        setDoubleField(term1238243, term1238243.getClass(), "dN2", 6.878551322263553E15);
        term1248317 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term1248317, term1248317.getClass(), "splitTolerance", 0.0);
        setField(term1248317, term1248317.getClass(), "main", null);
        setField(term1248317, term1248317.getClass(), "secondary", null);
        setField(term1248317, term1248317.getClass(), "squaredSecondary", null);
        setField(term1248317, term1248317.getClass(), "transformer", null);
        setDoubleField(term1248317, term1248317.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "upperSpectra", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "minPivot", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "sigma", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "sigmaLow", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "tau", 1.22557283656849818E18);
        setField(term1248317, term1248317.getClass(), "work", null);
        setIntField(term1248317, term1248317.getClass(), "pingPong", 0);
        setDoubleField(term1248317, term1248317.getClass(), "qMax", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "eMin", 0.0);
        setIntField(term1248317, term1248317.getClass(), "tType", -11);
        setDoubleField(term1248317, term1248317.getClass(), "dMin", 1.15292150890181427E18);
        setDoubleField(term1248317, term1248317.getClass(), "dMin1", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "dMin2", 4.9022913462739927E18);
        setDoubleField(term1248317, term1248317.getClass(), "dN", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "dN1", 0.0);
        setDoubleField(term1248317, term1248317.getClass(), "dN2", 6.878551322263553E15);
        setDoubleField(term1248317, term1248317.getClass(), "g", 0.0);
        setField(term1248317, term1248317.getClass(), "realEigenvalues", null);
        setField(term1248317, term1248317.getClass(), "imagEigenvalues", null);
        setField(term1248317, term1248317.getClass(), "eigenvectors", null);
        setField(term1248317, term1248317.getClass(), "cachedV", null);
        setField(term1248317, term1248317.getClass(), "cachedD", null);
        setField(term1248317, term1248317.getClass(), "cachedVt", null);
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
        args[2] = 2;
        callMethod(klass, "computeShiftIncrement", argTypes, term1238243, args);
        assertTrue(recursiveEquals(term1238243, term1248317));
    }

};


