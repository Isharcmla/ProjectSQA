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

public class EigenDecompositionImpl_goodStep_1467100277136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50740;
     Object term50765;

    public EigenDecompositionImpl_goodStep_1467100277136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50740 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term50740, term50740.getClass(), "g", 0.0);
        term50765 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term50765, term50765.getClass(), "splitTolerance", 0.0);
        setField(term50765, term50765.getClass(), "main", null);
        setField(term50765, term50765.getClass(), "secondary", null);
        setField(term50765, term50765.getClass(), "squaredSecondary", null);
        setField(term50765, term50765.getClass(), "transformer", null);
        setDoubleField(term50765, term50765.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term50765, term50765.getClass(), "upperSpectra", 0.0);
        setDoubleField(term50765, term50765.getClass(), "minPivot", 0.0);
        setDoubleField(term50765, term50765.getClass(), "sigma", 0.0);
        setDoubleField(term50765, term50765.getClass(), "sigmaLow", 0.0);
        setDoubleField(term50765, term50765.getClass(), "tau", 0.0);
        setField(term50765, term50765.getClass(), "work", null);
        setIntField(term50765, term50765.getClass(), "pingPong", 0);
        setDoubleField(term50765, term50765.getClass(), "qMax", 0.0);
        setDoubleField(term50765, term50765.getClass(), "eMin", 0.0);
        setIntField(term50765, term50765.getClass(), "tType", 0);
        setDoubleField(term50765, term50765.getClass(), "dMin", 0.0);
        setDoubleField(term50765, term50765.getClass(), "dMin1", 0.0);
        setDoubleField(term50765, term50765.getClass(), "dMin2", 0.0);
        setDoubleField(term50765, term50765.getClass(), "dN", 0.0);
        setDoubleField(term50765, term50765.getClass(), "dN1", 0.0);
        setDoubleField(term50765, term50765.getClass(), "dN2", 0.0);
        setDoubleField(term50765, term50765.getClass(), "g", 0.0);
        setField(term50765, term50765.getClass(), "realEigenvalues", null);
        setField(term50765, term50765.getClass(), "imagEigenvalues", null);
        setField(term50765, term50765.getClass(), "eigenvectors", null);
        setField(term50765, term50765.getClass(), "cachedV", null);
        setField(term50765, term50765.getClass(), "cachedD", null);
        setField(term50765, term50765.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -2147483648;
        args[1] = -2147483648;
        Object retValue = callMethod(klass, "goodStep", argTypes, term50740, args);
        assertTrue(recursiveEquals(term50740, term50765));
        assertTrue(recursiveEquals(retValue, -2147483648));
    }

};


