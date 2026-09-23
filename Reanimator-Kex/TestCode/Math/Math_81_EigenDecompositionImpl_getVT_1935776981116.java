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

public class EigenDecompositionImpl_getVT_1935776981116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41435;
     Object term43155;
     Object term43133;

    public EigenDecompositionImpl_getVT_1935776981116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41435 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term41537 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term41435, term41435.getClass(), "cachedVt", term41537);
        term43155 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term43156 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setDoubleField(term43155, term43155.getClass(), "splitTolerance", 0.0);
        setField(term43155, term43155.getClass(), "main", null);
        setField(term43155, term43155.getClass(), "secondary", null);
        setField(term43155, term43155.getClass(), "squaredSecondary", null);
        setField(term43155, term43155.getClass(), "transformer", null);
        setDoubleField(term43155, term43155.getClass(), "lowerSpectra", 0.0);
        setDoubleField(term43155, term43155.getClass(), "upperSpectra", 0.0);
        setDoubleField(term43155, term43155.getClass(), "minPivot", 0.0);
        setDoubleField(term43155, term43155.getClass(), "sigma", 0.0);
        setDoubleField(term43155, term43155.getClass(), "sigmaLow", 0.0);
        setDoubleField(term43155, term43155.getClass(), "tau", 0.0);
        setField(term43155, term43155.getClass(), "work", null);
        setIntField(term43155, term43155.getClass(), "pingPong", 0);
        setDoubleField(term43155, term43155.getClass(), "qMax", 0.0);
        setDoubleField(term43155, term43155.getClass(), "eMin", 0.0);
        setIntField(term43155, term43155.getClass(), "tType", 0);
        setDoubleField(term43155, term43155.getClass(), "dMin", 0.0);
        setDoubleField(term43155, term43155.getClass(), "dMin1", 0.0);
        setDoubleField(term43155, term43155.getClass(), "dMin2", 0.0);
        setDoubleField(term43155, term43155.getClass(), "dN", 0.0);
        setDoubleField(term43155, term43155.getClass(), "dN1", 0.0);
        setDoubleField(term43155, term43155.getClass(), "dN2", 0.0);
        setDoubleField(term43155, term43155.getClass(), "g", 0.0);
        setField(term43155, term43155.getClass(), "realEigenvalues", null);
        setField(term43155, term43155.getClass(), "imagEigenvalues", null);
        setField(term43155, term43155.getClass(), "eigenvectors", null);
        setField(term43155, term43155.getClass(), "cachedV", null);
        setField(term43155, term43155.getClass(), "cachedD", null);
        setIntField(term43156, term43156.getClass(), "rows", 0);
        setIntField(term43156, term43156.getClass(), "columns", 0);
        setField(term43156, term43156.getClass(), "entries", null);
        setField(term43156, term43156.getClass(), "lu", null);
        setField(term43155, term43155.getClass(), "cachedVt", term43156);
        term43133 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term43133, term43133.getClass(), "rows", 0);
        setIntField(term43133, term43133.getClass(), "columns", 0);
        setField(term43133, term43133.getClass(), "entries", null);
        setField(term43133, term43133.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVT", argTypes, term41435, args);
        assertTrue(recursiveEquals(term41435, term43155));
        assertTrue(recursiveEquals(retValue, term43133));
    }

};


