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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class EigenDecompositionImpl_eigenvaluesRange_205900342672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15191;
     Object term15210;
     Object term15212;

    public EigenDecompositionImpl_eigenvaluesRange_205900342672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15191 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term15191, term15191.getClass(), "splitTolerance", 0.0);
        setField(term15191, term15191.getClass(), "main", null);
        setField(term15191, term15191.getClass(), "secondary", null);
        setField(term15191, term15191.getClass(), "squaredSecondary", null);
        setField(term15191, term15191.getClass(), "transformer", null);
        setDoubleField(term15191, term15191.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term15191, term15191.getClass(), "upperSpectra", 0.0);
        setDoubleField(term15191, term15191.getClass(), "minPivot", 0.0);
        setDoubleField(term15191, term15191.getClass(), "sigma", 0.0);
        setDoubleField(term15191, term15191.getClass(), "sigmaLow", 0.0);
        setDoubleField(term15191, term15191.getClass(), "tau", 0.0);
        setField(term15191, term15191.getClass(), "work", null);
        setIntField(term15191, term15191.getClass(), "pingPong", 0);
        setDoubleField(term15191, term15191.getClass(), "qMax", 0.0);
        setDoubleField(term15191, term15191.getClass(), "eMin", 0.0);
        setIntField(term15191, term15191.getClass(), "tType", 0);
        setDoubleField(term15191, term15191.getClass(), "dMin", 0.0);
        setDoubleField(term15191, term15191.getClass(), "dMin1", 0.0);
        setDoubleField(term15191, term15191.getClass(), "dMin2", 0.0);
        setDoubleField(term15191, term15191.getClass(), "dN", 0.0);
        setDoubleField(term15191, term15191.getClass(), "dN1", 0.0);
        setDoubleField(term15191, term15191.getClass(), "dN2", 0.0);
        setDoubleField(term15191, term15191.getClass(), "g", 0.0);
        setField(term15191, term15191.getClass(), "realEigenvalues", null);
        setField(term15191, term15191.getClass(), "imagEigenvalues", null);
        setField(term15191, term15191.getClass(), "eigenvectors", null);
        setField(term15191, term15191.getClass(), "cachedV", null);
        setField(term15191, term15191.getClass(), "cachedD", null);
        setField(term15191, term15191.getClass(), "cachedVt", null);
        term15210 = new Integer(0);
        term15212 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term15210;
        args[1] = term15212;
        try {
            callMethod(klass, "eigenvaluesRange", argTypes, term15191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


