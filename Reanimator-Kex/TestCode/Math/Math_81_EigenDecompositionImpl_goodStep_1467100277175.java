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

public class EigenDecompositionImpl_goodStep_1467100277175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711958;
     Object term712335;

    public EigenDecompositionImpl_goodStep_1467100277175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711958 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term711958, term711958.getClass(), "g", 0.0);
        term712335 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term712335, term712335.getClass(), "splitTolerance", 0.0);
        setField(term712335, term712335.getClass(), "main", null);
        setField(term712335, term712335.getClass(), "secondary", null);
        setField(term712335, term712335.getClass(), "squaredSecondary", null);
        setField(term712335, term712335.getClass(), "transformer", null);
        setDoubleField(term712335, term712335.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term712335, term712335.getClass(), "upperSpectra", 0.0);
        setDoubleField(term712335, term712335.getClass(), "minPivot", 0.0);
        setDoubleField(term712335, term712335.getClass(), "sigma", 0.0);
        setDoubleField(term712335, term712335.getClass(), "sigmaLow", 0.0);
        setDoubleField(term712335, term712335.getClass(), "tau", 0.0);
        setField(term712335, term712335.getClass(), "work", null);
        setIntField(term712335, term712335.getClass(), "pingPong", 0);
        setDoubleField(term712335, term712335.getClass(), "qMax", 0.0);
        setDoubleField(term712335, term712335.getClass(), "eMin", 0.0);
        setIntField(term712335, term712335.getClass(), "tType", 0);
        setDoubleField(term712335, term712335.getClass(), "dMin", 0.0);
        setDoubleField(term712335, term712335.getClass(), "dMin1", 0.0);
        setDoubleField(term712335, term712335.getClass(), "dMin2", 0.0);
        setDoubleField(term712335, term712335.getClass(), "dN", 0.0);
        setDoubleField(term712335, term712335.getClass(), "dN1", 0.0);
        setDoubleField(term712335, term712335.getClass(), "dN2", 0.0);
        setDoubleField(term712335, term712335.getClass(), "g", 0.0);
        setField(term712335, term712335.getClass(), "realEigenvalues", null);
        setField(term712335, term712335.getClass(), "imagEigenvalues", null);
        setField(term712335, term712335.getClass(), "eigenvectors", null);
        setField(term712335, term712335.getClass(), "cachedV", null);
        setField(term712335, term712335.getClass(), "cachedD", null);
        setField(term712335, term712335.getClass(), "cachedVt", null);
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
        Object retValue = callMethod(klass, "goodStep", argTypes, term711958, args);
        assertTrue(recursiveEquals(term711958, term712335));
        assertTrue(recursiveEquals(retValue, -2147483648));
    }

};


