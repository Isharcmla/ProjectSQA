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
import java.lang.Object;

public class EigenDecompositionImpl_getVT_193577698186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25043;
     Object term25161;
     Object term25141;

    public EigenDecompositionImpl_getVT_193577698186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25043 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term25139 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term25043, term25043.getClass(), "cachedVt", term25139);
        term25161 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term25162 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setDoubleField(term25161, term25161.getClass(), "splitTolerance", 0.0);
        setField(term25161, term25161.getClass(), "main", null);
        setField(term25161, term25161.getClass(), "secondary", null);
        setField(term25161, term25161.getClass(), "squaredSecondary", null);
        setField(term25161, term25161.getClass(), "transformer", null);
        setDoubleField(term25161, term25161.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term25161, term25161.getClass(), "upperSpectra", 0.0);
        setDoubleField(term25161, term25161.getClass(), "minPivot", 0.0);
        setDoubleField(term25161, term25161.getClass(), "sigma", 0.0);
        setDoubleField(term25161, term25161.getClass(), "sigmaLow", 0.0);
        setDoubleField(term25161, term25161.getClass(), "tau", 0.0);
        setField(term25161, term25161.getClass(), "work", null);
        setIntField(term25161, term25161.getClass(), "pingPong", 0);
        setDoubleField(term25161, term25161.getClass(), "qMax", 0.0);
        setDoubleField(term25161, term25161.getClass(), "eMin", 0.0);
        setIntField(term25161, term25161.getClass(), "tType", 0);
        setDoubleField(term25161, term25161.getClass(), "dMin", 0.0);
        setDoubleField(term25161, term25161.getClass(), "dMin1", 0.0);
        setDoubleField(term25161, term25161.getClass(), "dMin2", 0.0);
        setDoubleField(term25161, term25161.getClass(), "dN", 0.0);
        setDoubleField(term25161, term25161.getClass(), "dN1", 0.0);
        setDoubleField(term25161, term25161.getClass(), "dN2", 0.0);
        setDoubleField(term25161, term25161.getClass(), "g", 0.0);
        setField(term25161, term25161.getClass(), "realEigenvalues", null);
        setField(term25161, term25161.getClass(), "imagEigenvalues", null);
        setField(term25161, term25161.getClass(), "eigenvectors", null);
        setField(term25161, term25161.getClass(), "cachedV", null);
        setField(term25161, term25161.getClass(), "cachedD", null);
        setField(term25162, term25162.getClass(), "data", null);
        setField(term25162, term25162.getClass(), "lu", null);
        setField(term25161, term25161.getClass(), "cachedVt", term25162);
        term25141 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term25141, term25141.getClass(), "data", null);
        setField(term25141, term25141.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVT", argTypes, term25043, args);
        assertTrue(recursiveEquals(term25043, term25161));
        assertTrue(recursiveEquals(retValue, term25141));
    }

};


