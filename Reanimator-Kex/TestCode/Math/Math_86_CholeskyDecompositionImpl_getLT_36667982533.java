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

public class CholeskyDecompositionImpl_getLT_36667982533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17475;
     Object term20462;
     Object term20251;

    public CholeskyDecompositionImpl_getLT_36667982533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17475 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term16553 = (Object[]) newArray("[D", 1);
        double[] term16554 = (double[]) newDoubleArray(100);
        setField(term17475, term17475.getClass(), "cachedLT", null);
        setElement(term16553, 0, term16554);
        setField(term17475, term17475.getClass(), "lTData", term16553);
        term20462 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term20463 = (Object[]) newArray("[D", 1);
        double[] term20464 = (double[]) newDoubleArray(100);
        Object term20465 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        Object[] term20466 = (Object[]) newArray("[D", 2);
        double[] term20467 = (double[]) newDoubleArray(52);
        double[] term20468 = (double[]) newDoubleArray(48);
        setElement(term20463, 0, term20464);
        setField(term20462, term20462.getClass(), "lTData", term20463);
        setField(term20462, term20462.getClass(), "cachedL", null);
        setElement(term20466, 0, term20467);
        setElement(term20466, 1, term20468);
        setField(term20465, term20465.getClass(), "blocks", term20466);
        setIntField(term20465, term20465.getClass(), "rows", 1);
        setIntField(term20465, term20465.getClass(), "columns", 100);
        setIntField(term20465, term20465.getClass(), "blockRows", 1);
        setIntField(term20465, term20465.getClass(), "blockColumns", 2);
        setField(term20465, term20465.getClass(), "lu", null);
        setField(term20462, term20462.getClass(), "cachedLT", term20465);
        term20251 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        Object[] term20252 = (Object[]) newArray("[D", 2);
        double[] term20253 = (double[]) newDoubleArray(52);
        double[] term20306 = (double[]) newDoubleArray(48);
        setElement(term20252, 0, term20253);
        setElement(term20252, 1, term20306);
        setField(term20251, term20251.getClass(), "blocks", term20252);
        setIntField(term20251, term20251.getClass(), "rows", 1);
        setIntField(term20251, term20251.getClass(), "columns", 100);
        setIntField(term20251, term20251.getClass(), "blockRows", 1);
        setIntField(term20251, term20251.getClass(), "blockColumns", 2);
        setField(term20251, term20251.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLT", argTypes, term17475, args);
        assertTrue(recursiveEquals(term17475, term20462));
        assertTrue(recursiveEquals(retValue, term20251));
    }

};


