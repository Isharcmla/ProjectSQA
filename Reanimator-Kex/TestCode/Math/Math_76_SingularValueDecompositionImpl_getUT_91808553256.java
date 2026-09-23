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

public class SingularValueDecompositionImpl_getUT_91808553256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23234;
     Object term23515;
     Object term23509;

    public SingularValueDecompositionImpl_getUT_91808553256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23234 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term23336 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term23234, term23234.getClass(), "cachedUt", term23336);
        term23515 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term23516 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term23515, term23515.getClass(), "m", 0);
        setIntField(term23515, term23515.getClass(), "n", 0);
        setField(term23515, term23515.getClass(), "transformer", null);
        setField(term23515, term23515.getClass(), "mainBidiagonal", null);
        setField(term23515, term23515.getClass(), "secondaryBidiagonal", null);
        setField(term23515, term23515.getClass(), "mainTridiagonal", null);
        setField(term23515, term23515.getClass(), "secondaryTridiagonal", null);
        setField(term23515, term23515.getClass(), "eigenDecomposition", null);
        setField(term23515, term23515.getClass(), "singularValues", null);
        setField(term23515, term23515.getClass(), "cachedU", null);
        setIntField(term23516, term23516.getClass(), "rows", 0);
        setIntField(term23516, term23516.getClass(), "columns", 0);
        setField(term23516, term23516.getClass(), "entries", null);
        setField(term23516, term23516.getClass(), "lu", null);
        setField(term23515, term23515.getClass(), "cachedUt", term23516);
        setField(term23515, term23515.getClass(), "cachedS", null);
        setField(term23515, term23515.getClass(), "cachedV", null);
        setField(term23515, term23515.getClass(), "cachedVt", null);
        term23509 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term23509, term23509.getClass(), "rows", 0);
        setIntField(term23509, term23509.getClass(), "columns", 0);
        setField(term23509, term23509.getClass(), "entries", null);
        setField(term23509, term23509.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getUT", argTypes, term23234, args);
        assertTrue(recursiveEquals(term23234, term23515));
        assertTrue(recursiveEquals(retValue, term23509));
    }

};


