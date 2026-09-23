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

public class ReferenceCollectingCallback_shouldTraverse_42285568493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12348;
     Object term12440;
     Object term12465;
     Object term12466;

    public ReferenceCollectingCallback_shouldTraverse_42285568493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12348 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term12440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term12465 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term12465, term12465.getClass(), "referenceMap", null);
        setField(term12465, term12465.getClass(), "blockStack", null);
        setField(term12465, term12465.getClass(), "behavior", null);
        setField(term12465, term12465.getClass(), "compiler", null);
        setField(term12465, term12465.getClass(), "varFilter", null);
        term12466 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term12466, term12466.getClass(), "str", null);
        setIntField(term12466, term12466.getClass(), "type", 0);
        setField(term12466, term12466.getClass(), "next", null);
        setField(term12466, term12466.getClass(), "first", null);
        setField(term12466, term12466.getClass(), "last", null);
        setField(term12466, term12466.getClass(), "propListHead", null);
        setIntField(term12466, term12466.getClass(), "sourcePosition", 0);
        setField(term12466, term12466.getClass(), "jsType", null);
        setField(term12466, term12466.getClass(), "parent", null);
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
        args[1] = term12440;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term12348, args);
        assertTrue(recursiveEquals(term12348, term12465));
        assertTrue(recursiveEquals(term12440, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


