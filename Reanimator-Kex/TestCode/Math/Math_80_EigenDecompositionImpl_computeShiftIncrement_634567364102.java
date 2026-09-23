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

public class EigenDecompositionImpl_computeShiftIncrement_634567364102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29984;
     Object term33192;

    public EigenDecompositionImpl_computeShiftIncrement_634567364102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29984 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term29984, term29984.getClass(), "dMin", -4.503599627370495E15);
        setIntField(term29984, term29984.getClass(), "pingPong", 0);
        setDoubleField(term29984, term29984.getClass(), "dN", 9.2188684372274053E18);
        term33192 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term33192, term33192.getClass(), "splitTolerance", 0.0);
        setField(term33192, term33192.getClass(), "main", null);
        setField(term33192, term33192.getClass(), "secondary", null);
        setField(term33192, term33192.getClass(), "squaredSecondary", null);
        setField(term33192, term33192.getClass(), "transformer", null);
        setDoubleField(term33192, term33192.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term33192, term33192.getClass(), "upperSpectra", 0.0);
        setDoubleField(term33192, term33192.getClass(), "minPivot", 0.0);
        setDoubleField(term33192, term33192.getClass(), "sigma", 0.0);
        setDoubleField(term33192, term33192.getClass(), "sigmaLow", 0.0);
        setDoubleField(term33192, term33192.getClass(), "tau", 4.503599627370495E15);
        setField(term33192, term33192.getClass(), "work", null);
        setIntField(term33192, term33192.getClass(), "pingPong", 0);
        setDoubleField(term33192, term33192.getClass(), "qMax", 0.0);
        setDoubleField(term33192, term33192.getClass(), "eMin", 0.0);
        setIntField(term33192, term33192.getClass(), "tType", -1);
        setDoubleField(term33192, term33192.getClass(), "dMin", -4.503599627370495E15);
        setDoubleField(term33192, term33192.getClass(), "dMin1", 0.0);
        setDoubleField(term33192, term33192.getClass(), "dMin2", 0.0);
        setDoubleField(term33192, term33192.getClass(), "dN", 9.2188684372274053E18);
        setDoubleField(term33192, term33192.getClass(), "dN1", 0.0);
        setDoubleField(term33192, term33192.getClass(), "dN2", 0.0);
        setDoubleField(term33192, term33192.getClass(), "g", 0.0);
        setField(term33192, term33192.getClass(), "realEigenvalues", null);
        setField(term33192, term33192.getClass(), "imagEigenvalues", null);
        setField(term33192, term33192.getClass(), "eigenvectors", null);
        setField(term33192, term33192.getClass(), "cachedV", null);
        setField(term33192, term33192.getClass(), "cachedD", null);
        setField(term33192, term33192.getClass(), "cachedVt", null);
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
        callMethod(klass, "computeShiftIncrement", argTypes, term29984, args);
        assertTrue(recursiveEquals(term29984, term33192));
    }

};


