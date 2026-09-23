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

public class SingularValueDecompositionImpl_getV_209232052961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24070;
     Object term24437;
     Object term24431;

    public SingularValueDecompositionImpl_getV_209232052961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24070 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term24172 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term24070, term24070.getClass(), "cachedV", term24172);
        term24437 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term24438 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term24437, term24437.getClass(), "m", 0);
        setIntField(term24437, term24437.getClass(), "n", 0);
        setField(term24437, term24437.getClass(), "transformer", null);
        setField(term24437, term24437.getClass(), "mainBidiagonal", null);
        setField(term24437, term24437.getClass(), "secondaryBidiagonal", null);
        setField(term24437, term24437.getClass(), "mainTridiagonal", null);
        setField(term24437, term24437.getClass(), "secondaryTridiagonal", null);
        setField(term24437, term24437.getClass(), "eigenDecomposition", null);
        setField(term24437, term24437.getClass(), "singularValues", null);
        setField(term24437, term24437.getClass(), "cachedU", null);
        setField(term24437, term24437.getClass(), "cachedUt", null);
        setField(term24437, term24437.getClass(), "cachedS", null);
        setIntField(term24438, term24438.getClass(), "rows", 0);
        setIntField(term24438, term24438.getClass(), "columns", 0);
        setField(term24438, term24438.getClass(), "entries", null);
        setField(term24438, term24438.getClass(), "lu", null);
        setField(term24437, term24437.getClass(), "cachedV", term24438);
        setField(term24437, term24437.getClass(), "cachedVt", null);
        term24431 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term24431, term24431.getClass(), "rows", 0);
        setIntField(term24431, term24431.getClass(), "columns", 0);
        setField(term24431, term24431.getClass(), "entries", null);
        setField(term24431, term24431.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getV", argTypes, term24070, args);
        assertTrue(recursiveEquals(term24070, term24437));
        assertTrue(recursiveEquals(retValue, term24431));
    }

};


