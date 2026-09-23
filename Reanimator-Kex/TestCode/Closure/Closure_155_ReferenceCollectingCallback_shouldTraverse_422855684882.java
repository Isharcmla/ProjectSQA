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

public class ReferenceCollectingCallback_shouldTraverse_422855684882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227120;
     Object term227212;
     Object term227224;
     Object term227225;

    public ReferenceCollectingCallback_shouldTraverse_422855684882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227120 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term227212 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term227212, term227212.getClass(), "type", 101);
        term227224 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term227224, term227224.getClass(), "referenceMap", null);
        setField(term227224, term227224.getClass(), "blockStack", null);
        setField(term227224, term227224.getClass(), "behavior", null);
        setField(term227224, term227224.getClass(), "compiler", null);
        setField(term227224, term227224.getClass(), "varFilter", null);
        term227225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term227225, term227225.getClass(), "number", 0.0);
        setIntField(term227225, term227225.getClass(), "type", 101);
        setField(term227225, term227225.getClass(), "next", null);
        setField(term227225, term227225.getClass(), "first", null);
        setField(term227225, term227225.getClass(), "last", null);
        setField(term227225, term227225.getClass(), "propListHead", null);
        setIntField(term227225, term227225.getClass(), "sourcePosition", 0);
        setField(term227225, term227225.getClass(), "jsType", null);
        setField(term227225, term227225.getClass(), "parent", null);
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
        args[2] = term227212;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term227120, args);
        assertTrue(recursiveEquals(term227120, term227224));
        assertTrue(recursiveEquals(term227212, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


