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

public class EigenDecompositionImpl_findEigenvalues_1740117355120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40341;
     Object term43593;

    public EigenDecompositionImpl_findEigenvalues_1740117355120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40341 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term39963 = (double[]) newDoubleArray(233);
        double[] term40199 = (double[]) newDoubleArray(0);
        setField(term40341, term40341.getClass(), "main", term39963);
        setField(term40341, term40341.getClass(), "secondary", term40199);
        term43593 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term43594 = (double[]) newDoubleArray(233);
        double[] term43595 = (double[]) newDoubleArray(0);
        double[] term43596 = (double[]) newDoubleArray(233);
        double[] term43597 = (double[]) newDoubleArray(233);
        setDoubleField(term43593, term43593.getClass(), "splitTolerance", 0.0);
        setField(term43593, term43593.getClass(), "main", term43594);
        setField(term43593, term43593.getClass(), "secondary", term43595);
        setField(term43593, term43593.getClass(), "squaredSecondary", null);
        setField(term43593, term43593.getClass(), "transformer", null);
        setDoubleField(term43593, term43593.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term43593, term43593.getClass(), "upperSpectra", 0.0);
        setDoubleField(term43593, term43593.getClass(), "minPivot", 0.0);
        setDoubleField(term43593, term43593.getClass(), "sigma", 0.0);
        setDoubleField(term43593, term43593.getClass(), "sigmaLow", 0.0);
        setDoubleField(term43593, term43593.getClass(), "tau", 0.0);
        setField(term43593, term43593.getClass(), "work", null);
        setIntField(term43593, term43593.getClass(), "pingPong", 0);
        setDoubleField(term43593, term43593.getClass(), "qMax", 0.0);
        setDoubleField(term43593, term43593.getClass(), "eMin", 0.0);
        setIntField(term43593, term43593.getClass(), "tType", 0);
        setDoubleField(term43593, term43593.getClass(), "dMin", 0.0);
        setDoubleField(term43593, term43593.getClass(), "dMin1", 0.0);
        setDoubleField(term43593, term43593.getClass(), "dMin2", 0.0);
        setDoubleField(term43593, term43593.getClass(), "dN", 0.0);
        setDoubleField(term43593, term43593.getClass(), "dN1", 0.0);
        setDoubleField(term43593, term43593.getClass(), "dN2", 0.0);
        setDoubleField(term43593, term43593.getClass(), "g", 0.0);
        setField(term43593, term43593.getClass(), "realEigenvalues", term43596);
        setField(term43593, term43593.getClass(), "imagEigenvalues", term43597);
        setField(term43593, term43593.getClass(), "eigenvectors", null);
        setField(term43593, term43593.getClass(), "cachedV", null);
        setField(term43593, term43593.getClass(), "cachedD", null);
        setField(term43593, term43593.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findEigenvalues", argTypes, term40341, args);
        assertTrue(recursiveEquals(term40341, term43593));
    }

};


