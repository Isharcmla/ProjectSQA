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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getV_2092320529140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67856;

    public SingularValueDecompositionImpl_getV_2092320529140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67856 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term67701 = (double[]) newDoubleArray(0);
        Object term67968 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term68066 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term67856, term67856.getClass(), "cachedV", null);
        setField(term67856, term67856.getClass(), "singularValues", term67701);
        setIntField(term67856, term67856.getClass(), "m", -2147483648);
        setIntField(term67856, term67856.getClass(), "n", -2147483647);
        setField(term67968, term67968.getClass(), "cachedV", term68066);
        setField(term67856, term67856.getClass(), "eigenDecomposition", term67968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getV", argTypes, term67856, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


