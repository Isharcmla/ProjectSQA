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

public class ReferenceCollectingCallback_shouldTraverse_42285568477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9601;
     Object term9693;
     Object term9737;
     Object term9738;

    public ReferenceCollectingCallback_shouldTraverse_42285568477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9601 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term9693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term9737 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term9737, term9737.getClass(), "referenceMap", null);
        setField(term9737, term9737.getClass(), "blockStack", null);
        setField(term9737, term9737.getClass(), "behavior", null);
        setField(term9737, term9737.getClass(), "compiler", null);
        setField(term9737, term9737.getClass(), "varFilter", null);
        term9738 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term9738, term9738.getClass(), "number", 0.0);
        setIntField(term9738, term9738.getClass(), "type", 0);
        setField(term9738, term9738.getClass(), "next", null);
        setField(term9738, term9738.getClass(), "first", null);
        setField(term9738, term9738.getClass(), "last", null);
        setField(term9738, term9738.getClass(), "propListHead", null);
        setIntField(term9738, term9738.getClass(), "sourcePosition", 0);
        setField(term9738, term9738.getClass(), "jsType", null);
        setField(term9738, term9738.getClass(), "parent", null);
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
        args[1] = term9693;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term9601, args);
        assertTrue(recursiveEquals(term9601, term9737));
        assertTrue(recursiveEquals(term9693, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


