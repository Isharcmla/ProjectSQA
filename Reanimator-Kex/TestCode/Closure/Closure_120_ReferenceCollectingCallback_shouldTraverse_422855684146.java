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

public class ReferenceCollectingCallback_shouldTraverse_422855684146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24587;
     Object term24679;
     Object term24802;
     Object term24803;

    public ReferenceCollectingCallback_shouldTraverse_422855684146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24587 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term24679 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term24679, term24679.getClass(), "type", 108);
        term24802 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term24802, term24802.getClass(), "referenceMap", null);
        setField(term24802, term24802.getClass(), "blockStack", null);
        setField(term24802, term24802.getClass(), "behavior", null);
        setField(term24802, term24802.getClass(), "compiler", null);
        setField(term24802, term24802.getClass(), "varFilter", null);
        term24803 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term24803, term24803.getClass(), "str", null);
        setIntField(term24803, term24803.getClass(), "type", 108);
        setField(term24803, term24803.getClass(), "next", null);
        setField(term24803, term24803.getClass(), "first", null);
        setField(term24803, term24803.getClass(), "last", null);
        setField(term24803, term24803.getClass(), "propListHead", null);
        setIntField(term24803, term24803.getClass(), "sourcePosition", 0);
        setField(term24803, term24803.getClass(), "jsType", null);
        setField(term24803, term24803.getClass(), "parent", null);
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
        args[2] = term24679;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term24587, args);
        assertTrue(recursiveEquals(term24587, term24802));
        assertTrue(recursiveEquals(term24679, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


