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

public class CholeskyDecompositionImpl_init_214403625327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15622;
     Object term15644;
     Object term15646;

    public CholeskyDecompositionImpl_init_214403625327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15524 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        term15622 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        term15644 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term15645 = (Object[]) newArray("[D", 0);
        setField(term15644, term15644.getClass(), "lTData", term15645);
        setField(term15644, term15644.getClass(), "cachedL", null);
        setField(term15644, term15644.getClass(), "cachedLT", null);
        term15646 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(term15646, term15646.getClass(), "blocks", null);
        setIntField(term15646, term15646.getClass(), "rows", 0);
        setIntField(term15646, term15646.getClass(), "columns", 0);
        setIntField(term15646, term15646.getClass(), "blockRows", 0);
        setIntField(term15646, term15646.getClass(), "blockColumns", 0);
        setField(term15646, term15646.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term15622;
        args[1] = 0.0;
        args[2] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15644));
        assertTrue(recursiveEquals(term15622, term15646));
    }

};


