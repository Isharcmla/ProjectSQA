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

public class ReferenceCollectingCallback_shouldTraverse_422855684655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177337;
     Object term177407;
     Object term178001;
     Object term178002;

    public ReferenceCollectingCallback_shouldTraverse_422855684655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177337 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term177407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term177407, term177407.getClass(), "type", 100);
        term178001 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term178001, term178001.getClass(), "referenceMap", null);
        setField(term178001, term178001.getClass(), "blockStack", null);
        setField(term178001, term178001.getClass(), "behavior", null);
        setField(term178001, term178001.getClass(), "compiler", null);
        setField(term178001, term178001.getClass(), "varFilter", null);
        term178002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term178002, term178002.getClass(), "type", 100);
        setField(term178002, term178002.getClass(), "next", null);
        setField(term178002, term178002.getClass(), "first", null);
        setField(term178002, term178002.getClass(), "last", null);
        setField(term178002, term178002.getClass(), "propListHead", null);
        setIntField(term178002, term178002.getClass(), "sourcePosition", 0);
        setField(term178002, term178002.getClass(), "jsType", null);
        setField(term178002, term178002.getClass(), "parent", null);
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
        args[2] = term177407;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term177337, args);
        assertTrue(recursiveEquals(term177337, term178001));
        assertTrue(recursiveEquals(term177407, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


