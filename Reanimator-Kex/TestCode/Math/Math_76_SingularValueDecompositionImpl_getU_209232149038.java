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

public class SingularValueDecompositionImpl_getU_209232149038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6191;

    public SingularValueDecompositionImpl_getU_209232149038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6191 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term6039 = (double[]) newDoubleArray(0);
        Object term6303 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(term6191, term6191.getClass(), "cachedU", null);
        setField(term6191, term6191.getClass(), "singularValues", term6039);
        setIntField(term6191, term6191.getClass(), "m", -2147483648);
        setIntField(term6191, term6191.getClass(), "n", -2147483647);
        setField(term6191, term6191.getClass(), "eigenDecomposition", term6303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getU", argTypes, term6191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


