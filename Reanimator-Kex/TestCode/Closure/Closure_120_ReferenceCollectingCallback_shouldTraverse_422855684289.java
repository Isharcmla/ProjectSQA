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

public class ReferenceCollectingCallback_shouldTraverse_422855684289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59004;
     Object term59096;
     Object term60313;
     Object term60314;

    public ReferenceCollectingCallback_shouldTraverse_422855684289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59004 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term59096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term59096, term59096.getClass(), "type", 100);
        term60313 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term60313, term60313.getClass(), "referenceMap", null);
        setField(term60313, term60313.getClass(), "blockStack", null);
        setField(term60313, term60313.getClass(), "behavior", null);
        setField(term60313, term60313.getClass(), "compiler", null);
        setField(term60313, term60313.getClass(), "varFilter", null);
        term60314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term60314, term60314.getClass(), "str", null);
        setIntField(term60314, term60314.getClass(), "type", 100);
        setField(term60314, term60314.getClass(), "next", null);
        setField(term60314, term60314.getClass(), "first", null);
        setField(term60314, term60314.getClass(), "last", null);
        setField(term60314, term60314.getClass(), "propListHead", null);
        setIntField(term60314, term60314.getClass(), "sourcePosition", 0);
        setField(term60314, term60314.getClass(), "jsType", null);
        setField(term60314, term60314.getClass(), "parent", null);
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
        args[2] = term59096;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term59004, args);
        assertTrue(recursiveEquals(term59004, term60313));
        assertTrue(recursiveEquals(term59096, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


