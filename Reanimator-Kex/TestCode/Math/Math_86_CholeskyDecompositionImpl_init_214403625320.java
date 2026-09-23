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

public class CholeskyDecompositionImpl_init_214403625320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5904;
     Object term8542;
     Object term8544;

    public CholeskyDecompositionImpl_init_214403625320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5802 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        term5904 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        term8542 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term8543 = (Object[]) newArray("[D", 0);
        setField(term8542, term8542.getClass(), "lTData", term8543);
        setField(term8542, term8542.getClass(), "cachedL", null);
        setField(term8542, term8542.getClass(), "cachedLT", null);
        term8544 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term8544, term8544.getClass(), "rowDimension", 0);
        setIntField(term8544, term8544.getClass(), "columnDimension", 0);
        setField(term8544, term8544.getClass(), "entries", null);
        setField(term8544, term8544.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term5904;
        args[1] = 0.0;
        args[2] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8542));
        assertTrue(recursiveEquals(term5904, term8544));
    }

};


