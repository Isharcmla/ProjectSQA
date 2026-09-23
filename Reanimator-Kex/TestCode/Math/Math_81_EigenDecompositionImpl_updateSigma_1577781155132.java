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

public class EigenDecompositionImpl_updateSigma_1577781155132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47827;
     Object term47850;

    public EigenDecompositionImpl_updateSigma_1577781155132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47827 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term47827, term47827.getClass(), "sigma", -8.6469112842829169E18);
        term47850 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term47850, term47850.getClass(), "splitTolerance", 0.0);
        setField(term47850, term47850.getClass(), "main", null);
        setField(term47850, term47850.getClass(), "secondary", null);
        setField(term47850, term47850.getClass(), "squaredSecondary", null);
        setField(term47850, term47850.getClass(), "transformer", null);
        setDoubleField(term47850, term47850.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term47850, term47850.getClass(), "upperSpectra", 0.0);
        setDoubleField(term47850, term47850.getClass(), "minPivot", 0.0);
        setDoubleField(term47850, term47850.getClass(), "sigma", -8.6469112842829169E18);
        setDoubleField(term47850, term47850.getClass(), "sigmaLow", 0.0);
        setDoubleField(term47850, term47850.getClass(), "tau", 0.0);
        setField(term47850, term47850.getClass(), "work", null);
        setIntField(term47850, term47850.getClass(), "pingPong", 0);
        setDoubleField(term47850, term47850.getClass(), "qMax", 0.0);
        setDoubleField(term47850, term47850.getClass(), "eMin", 0.0);
        setIntField(term47850, term47850.getClass(), "tType", 0);
        setDoubleField(term47850, term47850.getClass(), "dMin", 0.0);
        setDoubleField(term47850, term47850.getClass(), "dMin1", 0.0);
        setDoubleField(term47850, term47850.getClass(), "dMin2", 0.0);
        setDoubleField(term47850, term47850.getClass(), "dN", 0.0);
        setDoubleField(term47850, term47850.getClass(), "dN1", 0.0);
        setDoubleField(term47850, term47850.getClass(), "dN2", 0.0);
        setDoubleField(term47850, term47850.getClass(), "g", 0.0);
        setField(term47850, term47850.getClass(), "realEigenvalues", null);
        setField(term47850, term47850.getClass(), "imagEigenvalues", null);
        setField(term47850, term47850.getClass(), "eigenvectors", null);
        setField(term47850, term47850.getClass(), "cachedV", null);
        setField(term47850, term47850.getClass(), "cachedD", null);
        setField(term47850, term47850.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -3.785767221382976E-270;
        callMethod(klass, "updateSigma", argTypes, term47827, args);
        assertTrue(recursiveEquals(term47827, term47850));
    }

};


