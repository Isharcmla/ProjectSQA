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

public class SingularValueDecompositionImpl_getCovariance_1916306125141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68250;

    public SingularValueDecompositionImpl_getCovariance_1916306125141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68250 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term68069 = (double[]) newDoubleArray(1);
        Object term68362 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term68460 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setDoubleElement(term68069, 0, 2.3238930130464276E18);
        setField(term68250, term68250.getClass(), "singularValues", term68069);
        setField(term68250, term68250.getClass(), "cachedVt", null);
        setField(term68250, term68250.getClass(), "cachedV", null);
        setIntField(term68250, term68250.getClass(), "m", -2147483648);
        setIntField(term68250, term68250.getClass(), "n", -2147483648);
        setField(term68362, term68362.getClass(), "cachedV", term68460);
        setField(term68250, term68250.getClass(), "eigenDecomposition", term68362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 7.601370375226478E-270;
        try {
            callMethod(klass, "getCovariance", argTypes, term68250, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


