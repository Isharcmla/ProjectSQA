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

public class SingularValueDecompositionImpl_getRank_1335771250146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78777;
     Object term81904;

    public SingularValueDecompositionImpl_getRank_1335771250146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78777 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term78570 = (double[]) newDoubleArray(1);
        setIntField(term78777, term78777.getClass(), "m", 0);
        setIntField(term78777, term78777.getClass(), "n", -2147483647);
        setField(term78777, term78777.getClass(), "singularValues", term78570);
        term81904 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term81905 = (double[]) newDoubleArray(1);
        setIntField(term81904, term81904.getClass(), "m", 0);
        setIntField(term81904, term81904.getClass(), "n", -2147483647);
        setField(term81904, term81904.getClass(), "transformer", null);
        setField(term81904, term81904.getClass(), "mainBidiagonal", null);
        setField(term81904, term81904.getClass(), "secondaryBidiagonal", null);
        setField(term81904, term81904.getClass(), "mainTridiagonal", null);
        setField(term81904, term81904.getClass(), "secondaryTridiagonal", null);
        setField(term81904, term81904.getClass(), "eigenDecomposition", null);
        setField(term81904, term81904.getClass(), "singularValues", term81905);
        setField(term81904, term81904.getClass(), "cachedU", null);
        setField(term81904, term81904.getClass(), "cachedUt", null);
        setField(term81904, term81904.getClass(), "cachedS", null);
        setField(term81904, term81904.getClass(), "cachedV", null);
        setField(term81904, term81904.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRank", argTypes, term78777, args);
        assertTrue(recursiveEquals(term78777, term81904));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


