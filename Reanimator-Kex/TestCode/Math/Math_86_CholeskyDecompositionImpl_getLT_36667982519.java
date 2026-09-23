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

public class CholeskyDecompositionImpl_getLT_36667982519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4285;
     Object term8521;
     Object term8515;

    public CholeskyDecompositionImpl_getLT_36667982519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4285 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object term4383 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(term4285, term4285.getClass(), "cachedLT", term4383);
        term8521 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object term8522 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(term8521, term8521.getClass(), "lTData", null);
        setField(term8521, term8521.getClass(), "cachedL", null);
        setField(term8522, term8522.getClass(), "blocks", null);
        setIntField(term8522, term8522.getClass(), "rows", 0);
        setIntField(term8522, term8522.getClass(), "columns", 0);
        setIntField(term8522, term8522.getClass(), "blockRows", 0);
        setIntField(term8522, term8522.getClass(), "blockColumns", 0);
        setField(term8522, term8522.getClass(), "lu", null);
        setField(term8521, term8521.getClass(), "cachedLT", term8522);
        term8515 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(term8515, term8515.getClass(), "blocks", null);
        setIntField(term8515, term8515.getClass(), "rows", 0);
        setIntField(term8515, term8515.getClass(), "columns", 0);
        setIntField(term8515, term8515.getClass(), "blockRows", 0);
        setIntField(term8515, term8515.getClass(), "blockColumns", 0);
        setField(term8515, term8515.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLT", argTypes, term4285, args);
        assertTrue(recursiveEquals(term4285, term8521));
        assertTrue(recursiveEquals(retValue, term8515));
    }

};


