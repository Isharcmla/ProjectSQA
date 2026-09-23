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
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35589;
     Object term35819;
     Object term35773;
     Object term36561;
     Object term36562;
     Object term36563;

    public ReferenceCollectingCallback_visit_872273174150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35589 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term35819 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term35819, term35819.getClass(), "type", 100);
        term35773 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term35773, term35773.getClass(), "type", 100);
        setField(term35773, term35773.getClass(), "first", term35819);
        term36561 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term36561, term36561.getClass(), "referenceMap", null);
        setField(term36561, term36561.getClass(), "blockStack", null);
        setField(term36561, term36561.getClass(), "behavior", null);
        setField(term36561, term36561.getClass(), "compiler", null);
        setField(term36561, term36561.getClass(), "varFilter", null);
        term36562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36562, term36562.getClass(), "str", null);
        setIntField(term36562, term36562.getClass(), "type", 100);
        setField(term36562, term36562.getClass(), "next", null);
        setField(term36562, term36562.getClass(), "first", null);
        setField(term36562, term36562.getClass(), "last", null);
        setField(term36562, term36562.getClass(), "propListHead", null);
        setIntField(term36562, term36562.getClass(), "sourcePosition", 0);
        setField(term36562, term36562.getClass(), "jsType", null);
        setField(term36562, term36562.getClass(), "parent", null);
        term36563 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36564 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36563, term36563.getClass(), "str", null);
        setIntField(term36563, term36563.getClass(), "type", 100);
        setField(term36563, term36563.getClass(), "next", null);
        setField(term36564, term36564.getClass(), "str", null);
        setIntField(term36564, term36564.getClass(), "type", 100);
        setField(term36564, term36564.getClass(), "next", null);
        setField(term36564, term36564.getClass(), "first", null);
        setField(term36564, term36564.getClass(), "last", null);
        setField(term36564, term36564.getClass(), "propListHead", null);
        setIntField(term36564, term36564.getClass(), "sourcePosition", 0);
        setField(term36564, term36564.getClass(), "jsType", null);
        setField(term36564, term36564.getClass(), "parent", null);
        setField(term36563, term36563.getClass(), "first", term36564);
        setField(term36563, term36563.getClass(), "last", null);
        setField(term36563, term36563.getClass(), "propListHead", null);
        setIntField(term36563, term36563.getClass(), "sourcePosition", 0);
        setField(term36563, term36563.getClass(), "jsType", null);
        setField(term36563, term36563.getClass(), "parent", null);
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
        args[1] = term35819;
        args[2] = term35773;
        callMethod(klass, "visit", argTypes, term35589, args);
        assertTrue(recursiveEquals(term35589, term36561));
        assertTrue(recursiveEquals(term35819, term36563));
        assertTrue(recursiveEquals(term35773, null));
    }

};


