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

public class EigenDecompositionImpl_computeShiftIncrement_63456736498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33992;
     Object term34025;

    public EigenDecompositionImpl_computeShiftIncrement_63456736498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33992 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term33992, term33992.getClass(), "dMin", 4.503599627370497E15);
        setIntField(term33992, term33992.getClass(), "pingPong", 0);
        term34025 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term34025, term34025.getClass(), "splitTolerance", 0.0);
        setField(term34025, term34025.getClass(), "main", null);
        setField(term34025, term34025.getClass(), "secondary", null);
        setField(term34025, term34025.getClass(), "squaredSecondary", null);
        setField(term34025, term34025.getClass(), "transformer", null);
        setDoubleField(term34025, term34025.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term34025, term34025.getClass(), "upperSpectra", 0.0);
        setDoubleField(term34025, term34025.getClass(), "minPivot", 0.0);
        setDoubleField(term34025, term34025.getClass(), "sigma", 0.0);
        setDoubleField(term34025, term34025.getClass(), "sigmaLow", 0.0);
        setDoubleField(term34025, term34025.getClass(), "tau", 1.1258999068426242E15);
        setField(term34025, term34025.getClass(), "work", null);
        setIntField(term34025, term34025.getClass(), "pingPong", 0);
        setDoubleField(term34025, term34025.getClass(), "qMax", 0.0);
        setDoubleField(term34025, term34025.getClass(), "eMin", 0.0);
        setIntField(term34025, term34025.getClass(), "tType", -6);
        setDoubleField(term34025, term34025.getClass(), "dMin", 4.503599627370497E15);
        setDoubleField(term34025, term34025.getClass(), "dMin1", 0.0);
        setDoubleField(term34025, term34025.getClass(), "dMin2", 0.0);
        setDoubleField(term34025, term34025.getClass(), "dN", 0.0);
        setDoubleField(term34025, term34025.getClass(), "dN1", 0.0);
        setDoubleField(term34025, term34025.getClass(), "dN2", 0.0);
        setDoubleField(term34025, term34025.getClass(), "g", 0.25);
        setField(term34025, term34025.getClass(), "realEigenvalues", null);
        setField(term34025, term34025.getClass(), "imagEigenvalues", null);
        setField(term34025, term34025.getClass(), "eigenvectors", null);
        setField(term34025, term34025.getClass(), "cachedV", null);
        setField(term34025, term34025.getClass(), "cachedD", null);
        setField(term34025, term34025.getClass(), "cachedVt", null);
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
        callMethod(klass, "computeShiftIncrement", argTypes, term33992, args);
        assertTrue(recursiveEquals(term33992, term34025));
    }

};


