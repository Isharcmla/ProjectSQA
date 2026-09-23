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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getV_209232052982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36705;

    public SingularValueDecompositionImpl_getV_209232052982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36705 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term36553 = (double[]) newDoubleArray(0);
        Object term36817 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(term36705, term36705.getClass(), "cachedV", null);
        setField(term36705, term36705.getClass(), "singularValues", term36553);
        setIntField(term36705, term36705.getClass(), "m", -2147483648);
        setIntField(term36705, term36705.getClass(), "n", -2147483647);
        setField(term36705, term36705.getClass(), "eigenDecomposition", term36817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getV", argTypes, term36705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


