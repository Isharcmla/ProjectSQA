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

public class SingularValueDecompositionImpl_getUT_918085532143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72993;

    public SingularValueDecompositionImpl_getUT_918085532143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72993 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term72838 = (double[]) newDoubleArray(0);
        Object term73105 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term73203 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term72993, term72993.getClass(), "cachedUt", null);
        setField(term72993, term72993.getClass(), "cachedU", null);
        setField(term72993, term72993.getClass(), "singularValues", term72838);
        setIntField(term72993, term72993.getClass(), "m", -2147483648);
        setIntField(term72993, term72993.getClass(), "n", -2147483648);
        setField(term73105, term73105.getClass(), "cachedV", term73203);
        setField(term72993, term72993.getClass(), "eigenDecomposition", term73105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getUT", argTypes, term72993, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


