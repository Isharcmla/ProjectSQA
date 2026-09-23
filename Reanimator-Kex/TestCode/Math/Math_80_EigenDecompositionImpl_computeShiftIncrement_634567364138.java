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

public class EigenDecompositionImpl_computeShiftIncrement_634567364138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50910;
     Object term50935;

    public EigenDecompositionImpl_computeShiftIncrement_634567364138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50910 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term50910, term50910.getClass(), "dMin", -4.503599560261632E15);
        setIntField(term50910, term50910.getClass(), "pingPong", 0);
        setDoubleField(term50910, term50910.getClass(), "dN", -9.223372036854776E18);
        setDoubleField(term50910, term50910.getClass(), "dN1", 9.2188684372274053E18);
        term50935 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term50935, term50935.getClass(), "splitTolerance", 0.0);
        setField(term50935, term50935.getClass(), "main", null);
        setField(term50935, term50935.getClass(), "secondary", null);
        setField(term50935, term50935.getClass(), "squaredSecondary", null);
        setField(term50935, term50935.getClass(), "transformer", null);
        setDoubleField(term50935, term50935.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term50935, term50935.getClass(), "upperSpectra", 0.0);
        setDoubleField(term50935, term50935.getClass(), "minPivot", 0.0);
        setDoubleField(term50935, term50935.getClass(), "sigma", 0.0);
        setDoubleField(term50935, term50935.getClass(), "sigmaLow", 0.0);
        setDoubleField(term50935, term50935.getClass(), "tau", 4.503599560261632E15);
        setField(term50935, term50935.getClass(), "work", null);
        setIntField(term50935, term50935.getClass(), "pingPong", 0);
        setDoubleField(term50935, term50935.getClass(), "qMax", 0.0);
        setDoubleField(term50935, term50935.getClass(), "eMin", 0.0);
        setIntField(term50935, term50935.getClass(), "tType", -1);
        setDoubleField(term50935, term50935.getClass(), "dMin", -4.503599560261632E15);
        setDoubleField(term50935, term50935.getClass(), "dMin1", 0.0);
        setDoubleField(term50935, term50935.getClass(), "dMin2", 0.0);
        setDoubleField(term50935, term50935.getClass(), "dN", -9.223372036854776E18);
        setDoubleField(term50935, term50935.getClass(), "dN1", 9.2188684372274053E18);
        setDoubleField(term50935, term50935.getClass(), "dN2", 0.0);
        setDoubleField(term50935, term50935.getClass(), "g", 0.0);
        setField(term50935, term50935.getClass(), "realEigenvalues", null);
        setField(term50935, term50935.getClass(), "imagEigenvalues", null);
        setField(term50935, term50935.getClass(), "eigenvectors", null);
        setField(term50935, term50935.getClass(), "cachedV", null);
        setField(term50935, term50935.getClass(), "cachedD", null);
        setField(term50935, term50935.getClass(), "cachedVt", null);
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
        callMethod(klass, "computeShiftIncrement", argTypes, term50910, args);
        assertTrue(recursiveEquals(term50910, term50935));
    }

};


