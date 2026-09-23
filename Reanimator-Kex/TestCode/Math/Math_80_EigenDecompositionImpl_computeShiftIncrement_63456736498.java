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
     Object term27590;
     Object term27615;

    public EigenDecompositionImpl_computeShiftIncrement_63456736498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27590 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term27590, term27590.getClass(), "dMin", -4.5035996273664E15);
        setIntField(term27590, term27590.getClass(), "pingPong", 0);
        setDoubleField(term27590, term27590.getClass(), "dN", 1.7592186044417E13);
        setDoubleField(term27590, term27590.getClass(), "dN1", -9.223372036854776E18);
        setDoubleField(term27590, term27590.getClass(), "dN2", 9.2188684372274053E18);
        term27615 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleField(term27615, term27615.getClass(), "splitTolerance", 0.0);
        setField(term27615, term27615.getClass(), "main", null);
        setField(term27615, term27615.getClass(), "secondary", null);
        setField(term27615, term27615.getClass(), "squaredSecondary", null);
        setField(term27615, term27615.getClass(), "transformer", null);
        setDoubleField(term27615, term27615.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term27615, term27615.getClass(), "upperSpectra", 0.0);
        setDoubleField(term27615, term27615.getClass(), "minPivot", 0.0);
        setDoubleField(term27615, term27615.getClass(), "sigma", 0.0);
        setDoubleField(term27615, term27615.getClass(), "sigmaLow", 0.0);
        setDoubleField(term27615, term27615.getClass(), "tau", 4.5035996273664E15);
        setField(term27615, term27615.getClass(), "work", null);
        setIntField(term27615, term27615.getClass(), "pingPong", 0);
        setDoubleField(term27615, term27615.getClass(), "qMax", 0.0);
        setDoubleField(term27615, term27615.getClass(), "eMin", 0.0);
        setIntField(term27615, term27615.getClass(), "tType", -1);
        setDoubleField(term27615, term27615.getClass(), "dMin", -4.5035996273664E15);
        setDoubleField(term27615, term27615.getClass(), "dMin1", 0.0);
        setDoubleField(term27615, term27615.getClass(), "dMin2", 0.0);
        setDoubleField(term27615, term27615.getClass(), "dN", 1.7592186044417E13);
        setDoubleField(term27615, term27615.getClass(), "dN1", -9.223372036854776E18);
        setDoubleField(term27615, term27615.getClass(), "dN2", 9.2188684372274053E18);
        setDoubleField(term27615, term27615.getClass(), "g", 0.0);
        setField(term27615, term27615.getClass(), "realEigenvalues", null);
        setField(term27615, term27615.getClass(), "imagEigenvalues", null);
        setField(term27615, term27615.getClass(), "eigenvectors", null);
        setField(term27615, term27615.getClass(), "cachedV", null);
        setField(term27615, term27615.getClass(), "cachedD", null);
        setField(term27615, term27615.getClass(), "cachedVt", null);
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
        callMethod(klass, "computeShiftIncrement", argTypes, term27590, args);
        assertTrue(recursiveEquals(term27590, term27615));
    }

};


