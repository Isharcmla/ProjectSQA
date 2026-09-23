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

public class ReferenceCollectingCallback_shouldTraverse_422855684662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178886;
     Object term178978;
     Object term179272;
     Object term179273;

    public ReferenceCollectingCallback_shouldTraverse_422855684662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178886 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term178978 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term178978, term178978.getClass(), "type", 101);
        term179272 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term179272, term179272.getClass(), "referenceMap", null);
        setField(term179272, term179272.getClass(), "blockStack", null);
        setField(term179272, term179272.getClass(), "behavior", null);
        setField(term179272, term179272.getClass(), "compiler", null);
        setField(term179272, term179272.getClass(), "varFilter", null);
        term179273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179273, term179273.getClass(), "str", null);
        setIntField(term179273, term179273.getClass(), "type", 101);
        setField(term179273, term179273.getClass(), "next", null);
        setField(term179273, term179273.getClass(), "first", null);
        setField(term179273, term179273.getClass(), "last", null);
        setField(term179273, term179273.getClass(), "propListHead", null);
        setIntField(term179273, term179273.getClass(), "sourcePosition", 0);
        setField(term179273, term179273.getClass(), "jsType", null);
        setField(term179273, term179273.getClass(), "parent", null);
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
        args[2] = term178978;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term178886, args);
        assertTrue(recursiveEquals(term178886, term179272));
        assertTrue(recursiveEquals(term178978, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


