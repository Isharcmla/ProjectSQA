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

public class ReferenceCollectingCallback_shouldTraverse_422855684953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258131;
     Object term258223;
     Object term258315;
     Object term258830;
     Object term258831;
     Object term258832;

    public ReferenceCollectingCallback_shouldTraverse_422855684953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258131 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term258223 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term258315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term258315, term258315.getClass(), "type", 12);
        term258830 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term258830, term258830.getClass(), "referenceMap", null);
        setField(term258830, term258830.getClass(), "blockStack", null);
        setField(term258830, term258830.getClass(), "behavior", null);
        setField(term258830, term258830.getClass(), "compiler", null);
        setField(term258830, term258830.getClass(), "varFilter", null);
        term258831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258831, term258831.getClass(), "str", null);
        setIntField(term258831, term258831.getClass(), "type", 12);
        setField(term258831, term258831.getClass(), "next", null);
        setField(term258831, term258831.getClass(), "first", null);
        setField(term258831, term258831.getClass(), "last", null);
        setField(term258831, term258831.getClass(), "propListHead", null);
        setIntField(term258831, term258831.getClass(), "sourcePosition", 0);
        setField(term258831, term258831.getClass(), "jsType", null);
        setField(term258831, term258831.getClass(), "parent", null);
        term258832 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term258832, term258832.getClass(), "number", 0.0);
        setIntField(term258832, term258832.getClass(), "type", 0);
        setField(term258832, term258832.getClass(), "next", null);
        setField(term258832, term258832.getClass(), "first", null);
        setField(term258832, term258832.getClass(), "last", null);
        setField(term258832, term258832.getClass(), "propListHead", null);
        setIntField(term258832, term258832.getClass(), "sourcePosition", 0);
        setField(term258832, term258832.getClass(), "jsType", null);
        setField(term258832, term258832.getClass(), "parent", null);
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
        args[1] = term258223;
        args[2] = term258315;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term258131, args);
        assertTrue(recursiveEquals(term258131, term258830));
        assertTrue(recursiveEquals(term258223, term258832));
        assertTrue(recursiveEquals(term258315, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


