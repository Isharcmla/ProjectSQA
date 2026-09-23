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

public class ReferenceCollectingCallback_shouldTraverse_422855684538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145363;
     Object term145433;
     Object term145444;
     Object term145445;

    public ReferenceCollectingCallback_shouldTraverse_422855684538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145363 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term145433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145433, term145433.getClass(), "type", 98);
        term145444 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term145444, term145444.getClass(), "referenceMap", null);
        setField(term145444, term145444.getClass(), "blockStack", null);
        setField(term145444, term145444.getClass(), "behavior", null);
        setField(term145444, term145444.getClass(), "compiler", null);
        setField(term145444, term145444.getClass(), "varFilter", null);
        term145445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145445, term145445.getClass(), "type", 98);
        setField(term145445, term145445.getClass(), "next", null);
        setField(term145445, term145445.getClass(), "first", null);
        setField(term145445, term145445.getClass(), "last", null);
        setField(term145445, term145445.getClass(), "propListHead", null);
        setIntField(term145445, term145445.getClass(), "sourcePosition", 0);
        setField(term145445, term145445.getClass(), "jsType", null);
        setField(term145445, term145445.getClass(), "parent", null);
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
        args[2] = term145433;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term145363, args);
        assertTrue(recursiveEquals(term145363, term145444));
        assertTrue(recursiveEquals(term145433, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


