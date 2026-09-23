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

public class ReferenceCollectingCallback_shouldTraverse_42285568462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7055;
     Object term7160;
     Object term7383;
     Object term7384;
     Object term7385;

    public ReferenceCollectingCallback_shouldTraverse_42285568462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7055 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term7160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7160, term7160.getClass(), "type", 12);
        term7383 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term7383, term7383.getClass(), "referenceMap", null);
        setField(term7383, term7383.getClass(), "blockStack", null);
        setField(term7383, term7383.getClass(), "behavior", null);
        setField(term7383, term7383.getClass(), "compiler", null);
        setField(term7383, term7383.getClass(), "varFilter", null);
        term7384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7384, term7384.getClass(), "type", 12);
        setField(term7384, term7384.getClass(), "next", null);
        setField(term7384, term7384.getClass(), "first", null);
        setField(term7384, term7384.getClass(), "last", null);
        setField(term7384, term7384.getClass(), "propListHead", null);
        setIntField(term7384, term7384.getClass(), "sourcePosition", 0);
        setField(term7384, term7384.getClass(), "jsType", null);
        setField(term7384, term7384.getClass(), "parent", null);
        term7385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7385, term7385.getClass(), "type", 12);
        setField(term7385, term7385.getClass(), "next", null);
        setField(term7385, term7385.getClass(), "first", null);
        setField(term7385, term7385.getClass(), "last", null);
        setField(term7385, term7385.getClass(), "propListHead", null);
        setIntField(term7385, term7385.getClass(), "sourcePosition", 0);
        setField(term7385, term7385.getClass(), "jsType", null);
        setField(term7385, term7385.getClass(), "parent", null);
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
        args[1] = term7160;
        args[2] = term7160;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term7055, args);
        assertTrue(recursiveEquals(term7055, term7383));
        assertTrue(recursiveEquals(term7160, term7385));
        assertTrue(recursiveEquals(term7160, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


