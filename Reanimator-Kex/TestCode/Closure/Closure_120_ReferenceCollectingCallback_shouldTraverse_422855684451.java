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

public class ReferenceCollectingCallback_shouldTraverse_422855684451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115786;
     Object term115878;
     Object term116116;
     Object term116117;

    public ReferenceCollectingCallback_shouldTraverse_422855684451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115786 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term115878 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term115878, term115878.getClass(), "type", 101);
        term116116 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term116116, term116116.getClass(), "referenceMap", null);
        setField(term116116, term116116.getClass(), "blockStack", null);
        setField(term116116, term116116.getClass(), "behavior", null);
        setField(term116116, term116116.getClass(), "compiler", null);
        setField(term116116, term116116.getClass(), "varFilter", null);
        term116117 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term116117, term116117.getClass(), "str", null);
        setIntField(term116117, term116117.getClass(), "type", 101);
        setField(term116117, term116117.getClass(), "next", null);
        setField(term116117, term116117.getClass(), "first", null);
        setField(term116117, term116117.getClass(), "last", null);
        setField(term116117, term116117.getClass(), "propListHead", null);
        setIntField(term116117, term116117.getClass(), "sourcePosition", 0);
        setField(term116117, term116117.getClass(), "jsType", null);
        setField(term116117, term116117.getClass(), "parent", null);
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
        args[2] = term115878;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term115786, args);
        assertTrue(recursiveEquals(term115786, term116116));
        assertTrue(recursiveEquals(term115878, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


