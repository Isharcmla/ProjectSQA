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

public class EigenDecompositionImpl_getV_761512193152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311129;
     Object term311253;
     Object term311229;

    public EigenDecompositionImpl_getV_761512193152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311129 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term311227 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term311129, term311129.getClass(), "cachedV", term311227);
        term311253 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term311254 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setDoubleField(term311253, term311253.getClass(), "splitTolerance", 0.0);
        setField(term311253, term311253.getClass(), "main", null);
        setField(term311253, term311253.getClass(), "secondary", null);
        setField(term311253, term311253.getClass(), "squaredSecondary", null);
        setField(term311253, term311253.getClass(), "transformer", null);
        setDoubleField(term311253, term311253.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term311253, term311253.getClass(), "upperSpectra", 0.0);
        setDoubleField(term311253, term311253.getClass(), "minPivot", 0.0);
        setDoubleField(term311253, term311253.getClass(), "sigma", 0.0);
        setDoubleField(term311253, term311253.getClass(), "sigmaLow", 0.0);
        setDoubleField(term311253, term311253.getClass(), "tau", 0.0);
        setField(term311253, term311253.getClass(), "work", null);
        setIntField(term311253, term311253.getClass(), "pingPong", 0);
        setDoubleField(term311253, term311253.getClass(), "qMax", 0.0);
        setDoubleField(term311253, term311253.getClass(), "eMin", 0.0);
        setIntField(term311253, term311253.getClass(), "tType", 0);
        setDoubleField(term311253, term311253.getClass(), "dMin", 0.0);
        setDoubleField(term311253, term311253.getClass(), "dMin1", 0.0);
        setDoubleField(term311253, term311253.getClass(), "dMin2", 0.0);
        setDoubleField(term311253, term311253.getClass(), "dN", 0.0);
        setDoubleField(term311253, term311253.getClass(), "dN1", 0.0);
        setDoubleField(term311253, term311253.getClass(), "dN2", 0.0);
        setDoubleField(term311253, term311253.getClass(), "g", 0.0);
        setField(term311253, term311253.getClass(), "realEigenvalues", null);
        setField(term311253, term311253.getClass(), "imagEigenvalues", null);
        setField(term311253, term311253.getClass(), "eigenvectors", null);
        setField(term311254, term311254.getClass(), "blocks", null);
        setIntField(term311254, term311254.getClass(), "rows", 0);
        setIntField(term311254, term311254.getClass(), "columns", 0);
        setIntField(term311254, term311254.getClass(), "blockRows", 0);
        setIntField(term311254, term311254.getClass(), "blockColumns", 0);
        setField(term311254, term311254.getClass(), "lu", null);
        setField(term311253, term311253.getClass(), "cachedV", term311254);
        setField(term311253, term311253.getClass(), "cachedD", null);
        setField(term311253, term311253.getClass(), "cachedVt", null);
        term311229 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term311229, term311229.getClass(), "blocks", null);
        setIntField(term311229, term311229.getClass(), "rows", 0);
        setIntField(term311229, term311229.getClass(), "columns", 0);
        setIntField(term311229, term311229.getClass(), "blockRows", 0);
        setIntField(term311229, term311229.getClass(), "blockColumns", 0);
        setField(term311229, term311229.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getV", argTypes, term311129, args);
        assertTrue(recursiveEquals(term311129, term311253));
        assertTrue(recursiveEquals(retValue, term311229));
    }

};


