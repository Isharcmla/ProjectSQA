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

public class EigenDecompositionImpl_computeShiftIncrement_634567364206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310703;
     Object term1310736;

    public EigenDecompositionImpl_computeShiftIncrement_634567364206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1310703 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term1310703, term1310703.getClass(), "dMin", 4.6297004169368699E18);
        setIntField(term1310703, term1310703.getClass(), "pingPong", 0);
        setDoubleField(term1310703, term1310703.getClass(), "dN", 4.6161896180547584E18);
        setDoubleField(term1310703, term1310703.getClass(), "dN1", 2.251799813685248E16);
        setDoubleField(term1310703, term1310703.getClass(), "dN2", 4.503599627370497E15);
        setIntField(term1310703, term1310703.getClass(), "tType", -18);
        term1310736 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term1310736, term1310736.getClass(), "splitTolerance", 0.0);
        setField(term1310736, term1310736.getClass(), "main", null);
        setField(term1310736, term1310736.getClass(), "secondary", null);
        setField(term1310736, term1310736.getClass(), "squaredSecondary", null);
        setField(term1310736, term1310736.getClass(), "transformer", null);
        setDoubleField(term1310736, term1310736.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term1310736, term1310736.getClass(), "upperSpectra", 0.0);
        setDoubleField(term1310736, term1310736.getClass(), "minPivot", 0.0);
        setDoubleField(term1310736, term1310736.getClass(), "sigma", 0.0);
        setDoubleField(term1310736, term1310736.getClass(), "sigmaLow", 0.0);
        setDoubleField(term1310736, term1310736.getClass(), "tau", 3.8542255970999443E17);
        setField(term1310736, term1310736.getClass(), "work", null);
        setIntField(term1310736, term1310736.getClass(), "pingPong", 0);
        setDoubleField(term1310736, term1310736.getClass(), "qMax", 0.0);
        setDoubleField(term1310736, term1310736.getClass(), "eMin", 0.0);
        setIntField(term1310736, term1310736.getClass(), "tType", -6);
        setDoubleField(term1310736, term1310736.getClass(), "dMin", 4.6297004169368699E18);
        setDoubleField(term1310736, term1310736.getClass(), "dMin1", 0.0);
        setDoubleField(term1310736, term1310736.getClass(), "dMin2", 0.0);
        setDoubleField(term1310736, term1310736.getClass(), "dN", 4.6161896180547584E18);
        setDoubleField(term1310736, term1310736.getClass(), "dN1", 2.251799813685248E16);
        setDoubleField(term1310736, term1310736.getClass(), "dN2", 4.503599627370497E15);
        setDoubleField(term1310736, term1310736.getClass(), "g", 0.08325);
        setField(term1310736, term1310736.getClass(), "realEigenvalues", null);
        setField(term1310736, term1310736.getClass(), "imagEigenvalues", null);
        setField(term1310736, term1310736.getClass(), "eigenvectors", null);
        setField(term1310736, term1310736.getClass(), "cachedV", null);
        setField(term1310736, term1310736.getClass(), "cachedD", null);
        setField(term1310736, term1310736.getClass(), "cachedVt", null);
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
        callMethod(klass, "computeShiftIncrement", argTypes, term1310703, args);
        assertTrue(recursiveEquals(term1310703, term1310736));
    }

};


