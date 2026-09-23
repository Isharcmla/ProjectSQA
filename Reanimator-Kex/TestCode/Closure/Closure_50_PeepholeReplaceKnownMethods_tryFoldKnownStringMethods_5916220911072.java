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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4503505;
     Object term4503597;
     Object term4504016;
     Object term4504017;
     Object term4503935;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4503505 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4503597 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503781 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503873 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4503597, term4503597.getClass(), "type", 37);
        setIntField(term4503689, term4503689.getClass(), "type", 35);
        setIntField(term4503873, term4503873.getClass(), "type", 40);
        setField(term4503873, term4503873.getClass(), "str", "");
        setField(term4503781, term4503781.getClass(), "next", term4503873);
        setIntField(term4503781, term4503781.getClass(), "type", 40);
        setField(term4503689, term4503689.getClass(), "first", term4503781);
        setField(term4503689, term4503689.getClass(), "next", null);
        setField(term4503597, term4503597.getClass(), "first", term4503689);
        term4504016 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4504016, term4504016.getClass(), "currentTraversal", null);
        term4504017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4504018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4504019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4504020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4504017, term4504017.getClass(), "str", null);
        setIntField(term4504017, term4504017.getClass(), "type", 37);
        setField(term4504017, term4504017.getClass(), "next", null);
        setField(term4504018, term4504018.getClass(), "str", null);
        setIntField(term4504018, term4504018.getClass(), "type", 35);
        setField(term4504018, term4504018.getClass(), "next", null);
        setField(term4504019, term4504019.getClass(), "str", null);
        setIntField(term4504019, term4504019.getClass(), "type", 40);
        setField(term4504020, term4504020.getClass(), "str", "");
        setIntField(term4504020, term4504020.getClass(), "type", 40);
        setField(term4504020, term4504020.getClass(), "next", null);
        setField(term4504020, term4504020.getClass(), "first", null);
        setField(term4504020, term4504020.getClass(), "last", null);
        setField(term4504020, term4504020.getClass(), "propListHead", null);
        setIntField(term4504020, term4504020.getClass(), "sourcePosition", 0);
        setField(term4504020, term4504020.getClass(), "jsType", null);
        setField(term4504020, term4504020.getClass(), "parent", null);
        setField(term4504019, term4504019.getClass(), "next", term4504020);
        setField(term4504019, term4504019.getClass(), "first", null);
        setField(term4504019, term4504019.getClass(), "last", null);
        setField(term4504019, term4504019.getClass(), "propListHead", null);
        setIntField(term4504019, term4504019.getClass(), "sourcePosition", 0);
        setField(term4504019, term4504019.getClass(), "jsType", null);
        setField(term4504019, term4504019.getClass(), "parent", null);
        setField(term4504018, term4504018.getClass(), "first", term4504019);
        setField(term4504018, term4504018.getClass(), "last", null);
        setField(term4504018, term4504018.getClass(), "propListHead", null);
        setIntField(term4504018, term4504018.getClass(), "sourcePosition", 0);
        setField(term4504018, term4504018.getClass(), "jsType", null);
        setField(term4504018, term4504018.getClass(), "parent", null);
        setField(term4504017, term4504017.getClass(), "first", term4504018);
        setField(term4504017, term4504017.getClass(), "last", null);
        setField(term4504017, term4504017.getClass(), "propListHead", null);
        setIntField(term4504017, term4504017.getClass(), "sourcePosition", 0);
        setField(term4504017, term4504017.getClass(), "jsType", null);
        setField(term4504017, term4504017.getClass(), "parent", null);
        term4503935 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503939 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4503941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4503935, term4503935.getClass(), "str", null);
        setIntField(term4503935, term4503935.getClass(), "type", 37);
        setField(term4503935, term4503935.getClass(), "next", null);
        setField(term4503937, term4503937.getClass(), "str", null);
        setIntField(term4503937, term4503937.getClass(), "type", 35);
        setField(term4503937, term4503937.getClass(), "next", null);
        setField(term4503939, term4503939.getClass(), "str", null);
        setIntField(term4503939, term4503939.getClass(), "type", 40);
        setField(term4503941, term4503941.getClass(), "str", "");
        setIntField(term4503941, term4503941.getClass(), "type", 40);
        setField(term4503941, term4503941.getClass(), "next", null);
        setField(term4503941, term4503941.getClass(), "first", null);
        setField(term4503941, term4503941.getClass(), "last", null);
        setField(term4503941, term4503941.getClass(), "propListHead", null);
        setIntField(term4503941, term4503941.getClass(), "sourcePosition", 0);
        setField(term4503941, term4503941.getClass(), "jsType", null);
        setField(term4503941, term4503941.getClass(), "parent", null);
        setField(term4503939, term4503939.getClass(), "next", term4503941);
        setField(term4503939, term4503939.getClass(), "first", null);
        setField(term4503939, term4503939.getClass(), "last", null);
        setField(term4503939, term4503939.getClass(), "propListHead", null);
        setIntField(term4503939, term4503939.getClass(), "sourcePosition", 0);
        setField(term4503939, term4503939.getClass(), "jsType", null);
        setField(term4503939, term4503939.getClass(), "parent", null);
        setField(term4503937, term4503937.getClass(), "first", term4503939);
        setField(term4503937, term4503937.getClass(), "last", null);
        setField(term4503937, term4503937.getClass(), "propListHead", null);
        setIntField(term4503937, term4503937.getClass(), "sourcePosition", 0);
        setField(term4503937, term4503937.getClass(), "jsType", null);
        setField(term4503937, term4503937.getClass(), "parent", null);
        setField(term4503935, term4503935.getClass(), "first", term4503937);
        setField(term4503935, term4503935.getClass(), "last", null);
        setField(term4503935, term4503935.getClass(), "propListHead", null);
        setIntField(term4503935, term4503935.getClass(), "sourcePosition", 0);
        setField(term4503935, term4503935.getClass(), "jsType", null);
        setField(term4503935, term4503935.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4503597;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4503505, args);
        assertTrue(recursiveEquals(term4503505, term4504016));
        assertTrue(recursiveEquals(term4503597, term4504017));
        assertTrue(recursiveEquals(retValue, term4503935));
    }

};


