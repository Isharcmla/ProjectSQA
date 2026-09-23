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

public class ReferenceCollectingCallback_shouldTraverse_422855684228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43453;
     Object term43545;
     Object term43931;
     Object term43932;

    public ReferenceCollectingCallback_shouldTraverse_422855684228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43453 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term43545 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term43545, term43545.getClass(), "type", 101);
        term43931 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term43931, term43931.getClass(), "referenceMap", null);
        setField(term43931, term43931.getClass(), "blockStack", null);
        setField(term43931, term43931.getClass(), "behavior", null);
        setField(term43931, term43931.getClass(), "compiler", null);
        setField(term43931, term43931.getClass(), "varFilter", null);
        term43932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term43932, term43932.getClass(), "number", 0.0);
        setIntField(term43932, term43932.getClass(), "type", 101);
        setField(term43932, term43932.getClass(), "next", null);
        setField(term43932, term43932.getClass(), "first", null);
        setField(term43932, term43932.getClass(), "last", null);
        setField(term43932, term43932.getClass(), "propListHead", null);
        setIntField(term43932, term43932.getClass(), "sourcePosition", 0);
        setField(term43932, term43932.getClass(), "jsType", null);
        setField(term43932, term43932.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term43545;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term43453, args);
        assertTrue(recursiveEquals(term43453, term43931));
        assertTrue(recursiveEquals(term43545, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


