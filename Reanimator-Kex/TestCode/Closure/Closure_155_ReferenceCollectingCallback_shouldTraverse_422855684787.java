package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class ReferenceCollectingCallback_shouldTraverse_422855684787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203233;
     Object term203325;
     Object term203351;
     Object term203352;

    public ReferenceCollectingCallback_shouldTraverse_422855684787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203233 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term203325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term203351 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term203351, term203351.getClass(), "referenceMap", null);
        setField(term203351, term203351.getClass(), "blockStack", null);
        setField(term203351, term203351.getClass(), "behavior", null);
        setField(term203351, term203351.getClass(), "compiler", null);
        setField(term203351, term203351.getClass(), "varFilter", null);
        term203352 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term203352, term203352.getClass(), "str", null);
        setIntField(term203352, term203352.getClass(), "type", 0);
        setField(term203352, term203352.getClass(), "next", null);
        setField(term203352, term203352.getClass(), "first", null);
        setField(term203352, term203352.getClass(), "last", null);
        setField(term203352, term203352.getClass(), "propListHead", null);
        setIntField(term203352, term203352.getClass(), "sourcePosition", 0);
        setField(term203352, term203352.getClass(), "jsType", null);
        setField(term203352, term203352.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term203325;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term203233, args);
        assertTrue(recursiveEquals(term203233, term203351));
        assertTrue(recursiveEquals(term203325, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


