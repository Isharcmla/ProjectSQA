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

public class ReferenceCollectingCallback_isBlockBoundary_68469872156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6477;
     Object term6569;
     Object term6819;
     Object term6820;

    public ReferenceCollectingCallback_isBlockBoundary_68469872156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term6569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term6569, term6569.getClass(), "type", 12);
        term6819 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term6819, term6819.getClass(), "number", 0.0);
        setIntField(term6819, term6819.getClass(), "type", 12);
        setField(term6819, term6819.getClass(), "next", null);
        setField(term6819, term6819.getClass(), "first", null);
        setField(term6819, term6819.getClass(), "last", null);
        setField(term6819, term6819.getClass(), "propListHead", null);
        setIntField(term6819, term6819.getClass(), "sourcePosition", 0);
        setField(term6819, term6819.getClass(), "jsType", null);
        setField(term6819, term6819.getClass(), "parent", null);
        term6820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term6820, term6820.getClass(), "number", 0.0);
        setIntField(term6820, term6820.getClass(), "type", 0);
        setField(term6820, term6820.getClass(), "next", null);
        setField(term6820, term6820.getClass(), "first", null);
        setField(term6820, term6820.getClass(), "last", null);
        setField(term6820, term6820.getClass(), "propListHead", null);
        setIntField(term6820, term6820.getClass(), "sourcePosition", 0);
        setField(term6820, term6820.getClass(), "jsType", null);
        setField(term6820, term6820.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term6477;
        args[1] = term6569;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term6477, term6819));
        assertTrue(recursiveEquals(term6569, term6820));
        assertTrue(recursiveEquals(retValue, false));
    }

};


