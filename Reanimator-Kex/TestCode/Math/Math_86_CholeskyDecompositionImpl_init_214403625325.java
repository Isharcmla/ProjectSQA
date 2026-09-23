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

public class CholeskyDecompositionImpl_init_214403625325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15367;
     Object term15391;
     Object term15393;

    public CholeskyDecompositionImpl_init_214403625325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15271 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        term15367 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        term15391 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term15392 = (Object[]) newArray("[D", 0);
        setField(term15391, term15391.getClass(), "lTData", term15392);
        setField(term15391, term15391.getClass(), "cachedL", null);
        setField(term15391, term15391.getClass(), "cachedLT", null);
        term15393 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term15393, term15393.getClass(), "data", null);
        setField(term15393, term15393.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term15367;
        args[1] = 0.0;
        args[2] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15391));
        assertTrue(recursiveEquals(term15367, term15393));
    }

};


