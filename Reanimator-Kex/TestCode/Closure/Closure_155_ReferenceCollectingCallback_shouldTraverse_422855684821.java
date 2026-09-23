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

public class ReferenceCollectingCallback_shouldTraverse_422855684821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210431;
     Object term210523;
     Object term210615;
     Object term210692;
     Object term210693;
     Object term210694;

    public ReferenceCollectingCallback_shouldTraverse_422855684821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210431 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term210523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term210615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term210615, term210615.getClass(), "type", 4);
        term210692 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term210692, term210692.getClass(), "referenceMap", null);
        setField(term210692, term210692.getClass(), "blockStack", null);
        setField(term210692, term210692.getClass(), "behavior", null);
        setField(term210692, term210692.getClass(), "compiler", null);
        setField(term210692, term210692.getClass(), "varFilter", null);
        term210693 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term210693, term210693.getClass(), "str", null);
        setIntField(term210693, term210693.getClass(), "type", 4);
        setField(term210693, term210693.getClass(), "next", null);
        setField(term210693, term210693.getClass(), "first", null);
        setField(term210693, term210693.getClass(), "last", null);
        setField(term210693, term210693.getClass(), "propListHead", null);
        setIntField(term210693, term210693.getClass(), "sourcePosition", 0);
        setField(term210693, term210693.getClass(), "jsType", null);
        setField(term210693, term210693.getClass(), "parent", null);
        term210694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term210694, term210694.getClass(), "str", null);
        setIntField(term210694, term210694.getClass(), "type", 0);
        setField(term210694, term210694.getClass(), "next", null);
        setField(term210694, term210694.getClass(), "first", null);
        setField(term210694, term210694.getClass(), "last", null);
        setField(term210694, term210694.getClass(), "propListHead", null);
        setIntField(term210694, term210694.getClass(), "sourcePosition", 0);
        setField(term210694, term210694.getClass(), "jsType", null);
        setField(term210694, term210694.getClass(), "parent", null);
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
        args[1] = term210523;
        args[2] = term210615;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term210431, args);
        assertTrue(recursiveEquals(term210431, term210692));
        assertTrue(recursiveEquals(term210523, term210694));
        assertTrue(recursiveEquals(term210615, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


