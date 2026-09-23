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

public class ReferenceCollectingCallback_shouldTraverse_422855684989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252151;
     Object term252243;
     Object term252669;
     Object term252670;

    public ReferenceCollectingCallback_shouldTraverse_422855684989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252151 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term252243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term252669 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term252669, term252669.getClass(), "referenceMap", null);
        setField(term252669, term252669.getClass(), "blockStack", null);
        setField(term252669, term252669.getClass(), "behavior", null);
        setField(term252669, term252669.getClass(), "compiler", null);
        setField(term252669, term252669.getClass(), "varFilter", null);
        term252670 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term252670, term252670.getClass(), "number", 0.0);
        setIntField(term252670, term252670.getClass(), "type", 0);
        setField(term252670, term252670.getClass(), "next", null);
        setField(term252670, term252670.getClass(), "first", null);
        setField(term252670, term252670.getClass(), "last", null);
        setField(term252670, term252670.getClass(), "propListHead", null);
        setIntField(term252670, term252670.getClass(), "sourcePosition", 0);
        setField(term252670, term252670.getClass(), "jsType", null);
        setField(term252670, term252670.getClass(), "parent", null);
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
        args[1] = term252243;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term252151, args);
        assertTrue(recursiveEquals(term252151, term252669));
        assertTrue(recursiveEquals(term252243, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


