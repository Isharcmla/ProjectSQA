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

public class EigenDecompositionImpl_computeShiftIncrement_634567364205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065049;
     Object term1069661;

    public EigenDecompositionImpl_computeShiftIncrement_634567364205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1065049 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term1065049, term1065049.getClass(), "dMin", -4.5035996273664E15);
        setIntField(term1065049, term1065049.getClass(), "pingPong", 0);
        setDoubleField(term1065049, term1065049.getClass(), "dN", 1.7592186044417E13);
        setDoubleField(term1065049, term1065049.getClass(), "dN1", -9.223372036854776E18);
        setDoubleField(term1065049, term1065049.getClass(), "dN2", 9.2188684372274053E18);
        term1069661 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term1069661, term1069661.getClass(), "splitTolerance", 0.0);
        setField(term1069661, term1069661.getClass(), "main", null);
        setField(term1069661, term1069661.getClass(), "secondary", null);
        setField(term1069661, term1069661.getClass(), "squaredSecondary", null);
        setField(term1069661, term1069661.getClass(), "transformer", null);
        setDoubleField(term1069661, term1069661.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term1069661, term1069661.getClass(), "upperSpectra", 0.0);
        setDoubleField(term1069661, term1069661.getClass(), "minPivot", 0.0);
        setDoubleField(term1069661, term1069661.getClass(), "sigma", 0.0);
        setDoubleField(term1069661, term1069661.getClass(), "sigmaLow", 0.0);
        setDoubleField(term1069661, term1069661.getClass(), "tau", 4.5035996273664E15);
        setField(term1069661, term1069661.getClass(), "work", null);
        setIntField(term1069661, term1069661.getClass(), "pingPong", 0);
        setDoubleField(term1069661, term1069661.getClass(), "qMax", 0.0);
        setDoubleField(term1069661, term1069661.getClass(), "eMin", 0.0);
        setIntField(term1069661, term1069661.getClass(), "tType", -1);
        setDoubleField(term1069661, term1069661.getClass(), "dMin", -4.5035996273664E15);
        setDoubleField(term1069661, term1069661.getClass(), "dMin1", 0.0);
        setDoubleField(term1069661, term1069661.getClass(), "dMin2", 0.0);
        setDoubleField(term1069661, term1069661.getClass(), "dN", 1.7592186044417E13);
        setDoubleField(term1069661, term1069661.getClass(), "dN1", -9.223372036854776E18);
        setDoubleField(term1069661, term1069661.getClass(), "dN2", 9.2188684372274053E18);
        setDoubleField(term1069661, term1069661.getClass(), "g", 0.0);
        setField(term1069661, term1069661.getClass(), "realEigenvalues", null);
        setField(term1069661, term1069661.getClass(), "imagEigenvalues", null);
        setField(term1069661, term1069661.getClass(), "eigenvectors", null);
        setField(term1069661, term1069661.getClass(), "cachedV", null);
        setField(term1069661, term1069661.getClass(), "cachedD", null);
        setField(term1069661, term1069661.getClass(), "cachedVt", null);
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
        callMethod(klass, "computeShiftIncrement", argTypes, term1065049, args);
        assertTrue(recursiveEquals(term1065049, term1069661));
    }

};


