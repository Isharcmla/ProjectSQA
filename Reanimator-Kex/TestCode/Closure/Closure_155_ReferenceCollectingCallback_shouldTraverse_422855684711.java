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

public class ReferenceCollectingCallback_shouldTraverse_422855684711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189095;
     Object term189165;
     Object term189176;
     Object term189177;

    public ReferenceCollectingCallback_shouldTraverse_422855684711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189095 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term189165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term189176 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term189176, term189176.getClass(), "referenceMap", null);
        setField(term189176, term189176.getClass(), "blockStack", null);
        setField(term189176, term189176.getClass(), "behavior", null);
        setField(term189176, term189176.getClass(), "compiler", null);
        setField(term189176, term189176.getClass(), "varFilter", null);
        term189177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term189177, term189177.getClass(), "type", 0);
        setField(term189177, term189177.getClass(), "next", null);
        setField(term189177, term189177.getClass(), "first", null);
        setField(term189177, term189177.getClass(), "last", null);
        setField(term189177, term189177.getClass(), "propListHead", null);
        setIntField(term189177, term189177.getClass(), "sourcePosition", 0);
        setField(term189177, term189177.getClass(), "jsType", null);
        setField(term189177, term189177.getClass(), "parent", null);
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
        args[1] = term189165;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term189095, args);
        assertTrue(recursiveEquals(term189095, term189176));
        assertTrue(recursiveEquals(term189165, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


