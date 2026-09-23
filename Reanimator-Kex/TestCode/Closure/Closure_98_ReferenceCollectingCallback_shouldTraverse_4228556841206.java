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

public class ReferenceCollectingCallback_shouldTraverse_4228556841206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359217;
     Object term359309;
     Object term359969;
     Object term359970;

    public ReferenceCollectingCallback_shouldTraverse_4228556841206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359217 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term359309 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term359969 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term359969, term359969.getClass(), "referenceMap", null);
        setField(term359969, term359969.getClass(), "blockStack", null);
        setField(term359969, term359969.getClass(), "behavior", null);
        setField(term359969, term359969.getClass(), "compiler", null);
        setField(term359969, term359969.getClass(), "varFilter", null);
        term359970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term359970, term359970.getClass(), "str", null);
        setIntField(term359970, term359970.getClass(), "type", 0);
        setField(term359970, term359970.getClass(), "next", null);
        setField(term359970, term359970.getClass(), "first", null);
        setField(term359970, term359970.getClass(), "last", null);
        setField(term359970, term359970.getClass(), "propListHead", null);
        setIntField(term359970, term359970.getClass(), "sourcePosition", 0);
        setField(term359970, term359970.getClass(), "jsType", null);
        setField(term359970, term359970.getClass(), "parent", null);
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
        args[1] = term359309;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term359217, args);
        assertTrue(recursiveEquals(term359217, term359969));
        assertTrue(recursiveEquals(term359309, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


