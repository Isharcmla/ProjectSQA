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

public class EigenDecompositionImpl_findEigenvalues_1740117355184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726539;
     Object term729603;

    public EigenDecompositionImpl_findEigenvalues_1740117355184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term726539 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term726161 = (double[]) newDoubleArray(233);
        double[] term726397 = (double[]) newDoubleArray(0);
        setField(term726539, term726539.getClass(), "main", term726161);
        setField(term726539, term726539.getClass(), "secondary", term726397);
        term729603 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term729604 = (double[]) newDoubleArray(233);
        double[] term729605 = (double[]) newDoubleArray(0);
        double[] term729606 = (double[]) newDoubleArray(233);
        double[] term729607 = (double[]) newDoubleArray(233);
        setDoubleField(term729603, term729603.getClass(), "splitTolerance", 0.0);
        setField(term729603, term729603.getClass(), "main", term729604);
        setField(term729603, term729603.getClass(), "secondary", term729605);
        setField(term729603, term729603.getClass(), "squaredSecondary", null);
        setField(term729603, term729603.getClass(), "transformer", null);
        setDoubleField(term729603, term729603.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term729603, term729603.getClass(), "upperSpectra", 0.0);
        setDoubleField(term729603, term729603.getClass(), "minPivot", 0.0);
        setDoubleField(term729603, term729603.getClass(), "sigma", 0.0);
        setDoubleField(term729603, term729603.getClass(), "sigmaLow", 0.0);
        setDoubleField(term729603, term729603.getClass(), "tau", 0.0);
        setField(term729603, term729603.getClass(), "work", null);
        setIntField(term729603, term729603.getClass(), "pingPong", 0);
        setDoubleField(term729603, term729603.getClass(), "qMax", 0.0);
        setDoubleField(term729603, term729603.getClass(), "eMin", 0.0);
        setIntField(term729603, term729603.getClass(), "tType", 0);
        setDoubleField(term729603, term729603.getClass(), "dMin", 0.0);
        setDoubleField(term729603, term729603.getClass(), "dMin1", 0.0);
        setDoubleField(term729603, term729603.getClass(), "dMin2", 0.0);
        setDoubleField(term729603, term729603.getClass(), "dN", 0.0);
        setDoubleField(term729603, term729603.getClass(), "dN1", 0.0);
        setDoubleField(term729603, term729603.getClass(), "dN2", 0.0);
        setDoubleField(term729603, term729603.getClass(), "g", 0.0);
        setField(term729603, term729603.getClass(), "realEigenvalues", term729606);
        setField(term729603, term729603.getClass(), "imagEigenvalues", term729607);
        setField(term729603, term729603.getClass(), "eigenvectors", null);
        setField(term729603, term729603.getClass(), "cachedV", null);
        setField(term729603, term729603.getClass(), "cachedD", null);
        setField(term729603, term729603.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findEigenvalues", argTypes, term726539, args);
        assertTrue(recursiveEquals(term726539, term729603));
    }

};


