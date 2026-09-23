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

public class EigenDecompositionImpl_getV_761512193107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36237;
     Object term36564;
     Object term36542;

    public EigenDecompositionImpl_getV_761512193107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36237 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term36339 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term36237, term36237.getClass(), "cachedV", term36339);
        term36564 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term36565 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setDoubleField(term36564, term36564.getClass(), "splitTolerance", 0.0);
        setField(term36564, term36564.getClass(), "main", null);
        setField(term36564, term36564.getClass(), "secondary", null);
        setField(term36564, term36564.getClass(), "squaredSecondary", null);
        setField(term36564, term36564.getClass(), "transformer", null);
        setDoubleField(term36564, term36564.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term36564, term36564.getClass(), "upperSpectra", 0.0);
        setDoubleField(term36564, term36564.getClass(), "minPivot", 0.0);
        setDoubleField(term36564, term36564.getClass(), "sigma", 0.0);
        setDoubleField(term36564, term36564.getClass(), "sigmaLow", 0.0);
        setDoubleField(term36564, term36564.getClass(), "tau", 0.0);
        setField(term36564, term36564.getClass(), "work", null);
        setIntField(term36564, term36564.getClass(), "pingPong", 0);
        setDoubleField(term36564, term36564.getClass(), "qMax", 0.0);
        setDoubleField(term36564, term36564.getClass(), "eMin", 0.0);
        setIntField(term36564, term36564.getClass(), "tType", 0);
        setDoubleField(term36564, term36564.getClass(), "dMin", 0.0);
        setDoubleField(term36564, term36564.getClass(), "dMin1", 0.0);
        setDoubleField(term36564, term36564.getClass(), "dMin2", 0.0);
        setDoubleField(term36564, term36564.getClass(), "dN", 0.0);
        setDoubleField(term36564, term36564.getClass(), "dN1", 0.0);
        setDoubleField(term36564, term36564.getClass(), "dN2", 0.0);
        setDoubleField(term36564, term36564.getClass(), "g", 0.0);
        setField(term36564, term36564.getClass(), "realEigenvalues", null);
        setField(term36564, term36564.getClass(), "imagEigenvalues", null);
        setField(term36564, term36564.getClass(), "eigenvectors", null);
        setIntField(term36565, term36565.getClass(), "rows", 0);
        setIntField(term36565, term36565.getClass(), "columns", 0);
        setField(term36565, term36565.getClass(), "entries", null);
        setField(term36565, term36565.getClass(), "lu", null);
        setField(term36564, term36564.getClass(), "cachedV", term36565);
        setField(term36564, term36564.getClass(), "cachedD", null);
        setField(term36564, term36564.getClass(), "cachedVt", null);
        term36542 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term36542, term36542.getClass(), "rows", 0);
        setIntField(term36542, term36542.getClass(), "columns", 0);
        setField(term36542, term36542.getClass(), "entries", null);
        setField(term36542, term36542.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getV", argTypes, term36237, args);
        assertTrue(recursiveEquals(term36237, term36564));
        assertTrue(recursiveEquals(retValue, term36542));
    }

};


