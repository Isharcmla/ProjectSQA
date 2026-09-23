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

public class EigenDecompositionImpl_updateSigma_1577781155108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34170;
     Object term34193;

    public EigenDecompositionImpl_updateSigma_1577781155108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34170 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term34170, term34170.getClass(), "sigma", -8.6469112842829169E18);
        term34193 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term34193, term34193.getClass(), "splitTolerance", 0.0);
        setField(term34193, term34193.getClass(), "main", null);
        setField(term34193, term34193.getClass(), "secondary", null);
        setField(term34193, term34193.getClass(), "squaredSecondary", null);
        setField(term34193, term34193.getClass(), "transformer", null);
        setDoubleField(term34193, term34193.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term34193, term34193.getClass(), "upperSpectra", 0.0);
        setDoubleField(term34193, term34193.getClass(), "minPivot", 0.0);
        setDoubleField(term34193, term34193.getClass(), "sigma", -8.6469112842829169E18);
        setDoubleField(term34193, term34193.getClass(), "sigmaLow", 0.0);
        setDoubleField(term34193, term34193.getClass(), "tau", 0.0);
        setField(term34193, term34193.getClass(), "work", null);
        setIntField(term34193, term34193.getClass(), "pingPong", 0);
        setDoubleField(term34193, term34193.getClass(), "qMax", 0.0);
        setDoubleField(term34193, term34193.getClass(), "eMin", 0.0);
        setIntField(term34193, term34193.getClass(), "tType", 0);
        setDoubleField(term34193, term34193.getClass(), "dMin", 0.0);
        setDoubleField(term34193, term34193.getClass(), "dMin1", 0.0);
        setDoubleField(term34193, term34193.getClass(), "dMin2", 0.0);
        setDoubleField(term34193, term34193.getClass(), "dN", 0.0);
        setDoubleField(term34193, term34193.getClass(), "dN1", 0.0);
        setDoubleField(term34193, term34193.getClass(), "dN2", 0.0);
        setDoubleField(term34193, term34193.getClass(), "g", 0.0);
        setField(term34193, term34193.getClass(), "realEigenvalues", null);
        setField(term34193, term34193.getClass(), "imagEigenvalues", null);
        setField(term34193, term34193.getClass(), "eigenvectors", null);
        setField(term34193, term34193.getClass(), "cachedV", null);
        setField(term34193, term34193.getClass(), "cachedD", null);
        setField(term34193, term34193.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -3.785767221382976E-270;
        callMethod(klass, "updateSigma", argTypes, term34170, args);
        assertTrue(recursiveEquals(term34170, term34193));
    }

};


