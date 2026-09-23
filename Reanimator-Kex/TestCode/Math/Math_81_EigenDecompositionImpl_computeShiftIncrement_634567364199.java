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

public class EigenDecompositionImpl_computeShiftIncrement_634567364199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term985710;
     Object term985742;

    public EigenDecompositionImpl_computeShiftIncrement_634567364199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term985710 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term985710, term985710.getClass(), "dMin", 4.6297004169368699E18);
        setIntField(term985710, term985710.getClass(), "pingPong", 0);
        setDoubleField(term985710, term985710.getClass(), "dN", 4.6161896180547584E18);
        setDoubleField(term985710, term985710.getClass(), "dN1", 2.251799813685248E16);
        setDoubleField(term985710, term985710.getClass(), "dN2", 4.503599627370497E15);
        setIntField(term985710, term985710.getClass(), "tType", -6);
        term985742 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term985742, term985742.getClass(), "splitTolerance", 0.0);
        setField(term985742, term985742.getClass(), "main", null);
        setField(term985742, term985742.getClass(), "secondary", null);
        setField(term985742, term985742.getClass(), "squaredSecondary", null);
        setField(term985742, term985742.getClass(), "transformer", null);
        setDoubleField(term985742, term985742.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term985742, term985742.getClass(), "upperSpectra", 0.0);
        setDoubleField(term985742, term985742.getClass(), "minPivot", 0.0);
        setDoubleField(term985742, term985742.getClass(), "sigma", 0.0);
        setDoubleField(term985742, term985742.getClass(), "sigmaLow", 0.0);
        setDoubleField(term985742, term985742.getClass(), "tau", 1.54169023883997773E18);
        setField(term985742, term985742.getClass(), "work", null);
        setIntField(term985742, term985742.getClass(), "pingPong", 0);
        setDoubleField(term985742, term985742.getClass(), "qMax", 0.0);
        setDoubleField(term985742, term985742.getClass(), "eMin", 0.0);
        setIntField(term985742, term985742.getClass(), "tType", -6);
        setDoubleField(term985742, term985742.getClass(), "dMin", 4.6297004169368699E18);
        setDoubleField(term985742, term985742.getClass(), "dMin1", 0.0);
        setDoubleField(term985742, term985742.getClass(), "dMin2", 0.0);
        setDoubleField(term985742, term985742.getClass(), "dN", 4.6161896180547584E18);
        setDoubleField(term985742, term985742.getClass(), "dN1", 2.251799813685248E16);
        setDoubleField(term985742, term985742.getClass(), "dN2", 4.503599627370497E15);
        setDoubleField(term985742, term985742.getClass(), "g", 0.333);
        setField(term985742, term985742.getClass(), "realEigenvalues", null);
        setField(term985742, term985742.getClass(), "imagEigenvalues", null);
        setField(term985742, term985742.getClass(), "eigenvectors", null);
        setField(term985742, term985742.getClass(), "cachedV", null);
        setField(term985742, term985742.getClass(), "cachedD", null);
        setField(term985742, term985742.getClass(), "cachedVt", null);
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
        callMethod(klass, "computeShiftIncrement", argTypes, term985710, args);
        assertTrue(recursiveEquals(term985710, term985742));
    }

};


