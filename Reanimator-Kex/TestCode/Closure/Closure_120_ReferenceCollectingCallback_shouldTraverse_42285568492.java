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

public class ReferenceCollectingCallback_shouldTraverse_42285568492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12148;
     Object term12218;
     Object term12451;
     Object term12452;

    public ReferenceCollectingCallback_shouldTraverse_42285568492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12148 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term12218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12218, term12218.getClass(), "type", 108);
        term12451 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term12451, term12451.getClass(), "referenceMap", null);
        setField(term12451, term12451.getClass(), "blockStack", null);
        setField(term12451, term12451.getClass(), "behavior", null);
        setField(term12451, term12451.getClass(), "compiler", null);
        setField(term12451, term12451.getClass(), "varFilter", null);
        term12452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12452, term12452.getClass(), "type", 108);
        setField(term12452, term12452.getClass(), "next", null);
        setField(term12452, term12452.getClass(), "first", null);
        setField(term12452, term12452.getClass(), "last", null);
        setField(term12452, term12452.getClass(), "propListHead", null);
        setIntField(term12452, term12452.getClass(), "sourcePosition", 0);
        setField(term12452, term12452.getClass(), "jsType", null);
        setField(term12452, term12452.getClass(), "parent", null);
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
        args[2] = term12218;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term12148, args);
        assertTrue(recursiveEquals(term12148, term12451));
        assertTrue(recursiveEquals(term12218, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


