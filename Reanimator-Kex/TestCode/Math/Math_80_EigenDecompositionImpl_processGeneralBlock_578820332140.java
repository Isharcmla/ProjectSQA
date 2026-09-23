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

public class EigenDecompositionImpl_processGeneralBlock_578820332140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51553;
     Object term52557;

    public EigenDecompositionImpl_processGeneralBlock_578820332140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51553 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term50938 = (double[]) newDoubleArray(489);
        setField(term51553, term51553.getClass(), "work", term50938);
        term52557 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term52558 = (double[]) newDoubleArray(489);
        setDoubleField(term52557, term52557.getClass(), "splitTolerance", 0.0);
        setField(term52557, term52557.getClass(), "main", null);
        setField(term52557, term52557.getClass(), "secondary", null);
        setField(term52557, term52557.getClass(), "squaredSecondary", null);
        setField(term52557, term52557.getClass(), "transformer", null);
        setDoubleField(term52557, term52557.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term52557, term52557.getClass(), "upperSpectra", 0.0);
        setDoubleField(term52557, term52557.getClass(), "minPivot", 0.0);
        setDoubleField(term52557, term52557.getClass(), "sigma", 0.0);
        setDoubleField(term52557, term52557.getClass(), "sigmaLow", 0.0);
        setDoubleField(term52557, term52557.getClass(), "tau", 0.0);
        setField(term52557, term52557.getClass(), "work", term52558);
        setIntField(term52557, term52557.getClass(), "pingPong", 0);
        setDoubleField(term52557, term52557.getClass(), "qMax", 0.0);
        setDoubleField(term52557, term52557.getClass(), "eMin", 0.0);
        setIntField(term52557, term52557.getClass(), "tType", 0);
        setDoubleField(term52557, term52557.getClass(), "dMin", 0.0);
        setDoubleField(term52557, term52557.getClass(), "dMin1", 0.0);
        setDoubleField(term52557, term52557.getClass(), "dMin2", 0.0);
        setDoubleField(term52557, term52557.getClass(), "dN", 0.0);
        setDoubleField(term52557, term52557.getClass(), "dN1", 0.0);
        setDoubleField(term52557, term52557.getClass(), "dN2", 0.0);
        setDoubleField(term52557, term52557.getClass(), "g", 0.0);
        setField(term52557, term52557.getClass(), "realEigenvalues", null);
        setField(term52557, term52557.getClass(), "imagEigenvalues", null);
        setField(term52557, term52557.getClass(), "eigenvectors", null);
        setField(term52557, term52557.getClass(), "cachedV", null);
        setField(term52557, term52557.getClass(), "cachedD", null);
        setField(term52557, term52557.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2;
        callMethod(klass, "processGeneralBlock", argTypes, term51553, args);
        assertTrue(recursiveEquals(term51553, term52557));
    }

};


