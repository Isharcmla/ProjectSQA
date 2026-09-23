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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3686440;
     Object term3686532;
     Object term3687231;
     Object term3687232;
     Object term3686966;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3686440 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3686532 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3686624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3686716 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3686808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3686938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3686624, term3686624.getClass(), "type", 35);
        setIntField(term3686808, term3686808.getClass(), "type", 40);
        setField(term3686808, term3686808.getClass(), "str", "substr");
        setField(term3686716, term3686716.getClass(), "next", term3686808);
        setIntField(term3686716, term3686716.getClass(), "type", 40);
        setField(term3686624, term3686624.getClass(), "first", term3686716);
        setIntField(term3686938, term3686938.getClass(), "type", 44);
        setField(term3686624, term3686624.getClass(), "next", term3686938);
        setField(term3686532, term3686532.getClass(), "first", term3686624);
        setIntField(term3686532, term3686532.getClass(), "type", 37);
        term3687231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3687231, term3687231.getClass(), "currentTraversal", null);
        term3687232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3687233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3687234 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3687235 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3687236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3687232, term3687232.getClass(), "str", null);
        setIntField(term3687232, term3687232.getClass(), "type", 37);
        setField(term3687232, term3687232.getClass(), "next", null);
        setField(term3687233, term3687233.getClass(), "str", null);
        setIntField(term3687233, term3687233.getClass(), "type", 35);
        setDoubleField(term3687234, term3687234.getClass(), "number", 0.0);
        setIntField(term3687234, term3687234.getClass(), "type", 44);
        setField(term3687234, term3687234.getClass(), "next", null);
        setField(term3687234, term3687234.getClass(), "first", null);
        setField(term3687234, term3687234.getClass(), "last", null);
        setField(term3687234, term3687234.getClass(), "propListHead", null);
        setIntField(term3687234, term3687234.getClass(), "sourcePosition", 0);
        setField(term3687234, term3687234.getClass(), "jsType", null);
        setField(term3687234, term3687234.getClass(), "parent", null);
        setField(term3687233, term3687233.getClass(), "next", term3687234);
        setField(term3687235, term3687235.getClass(), "str", null);
        setIntField(term3687235, term3687235.getClass(), "type", 40);
        setField(term3687236, term3687236.getClass(), "str", "");
        setIntField(term3687236, term3687236.getClass(), "type", 40);
        setField(term3687236, term3687236.getClass(), "next", null);
        setField(term3687236, term3687236.getClass(), "first", null);
        setField(term3687236, term3687236.getClass(), "last", null);
        setField(term3687236, term3687236.getClass(), "propListHead", null);
        setIntField(term3687236, term3687236.getClass(), "sourcePosition", 0);
        setField(term3687236, term3687236.getClass(), "jsType", null);
        setField(term3687236, term3687236.getClass(), "parent", null);
        setField(term3687235, term3687235.getClass(), "next", term3687236);
        setField(term3687235, term3687235.getClass(), "first", null);
        setField(term3687235, term3687235.getClass(), "last", null);
        setField(term3687235, term3687235.getClass(), "propListHead", null);
        setIntField(term3687235, term3687235.getClass(), "sourcePosition", 0);
        setField(term3687235, term3687235.getClass(), "jsType", null);
        setField(term3687235, term3687235.getClass(), "parent", null);
        setField(term3687233, term3687233.getClass(), "first", term3687235);
        setField(term3687233, term3687233.getClass(), "last", null);
        setField(term3687233, term3687233.getClass(), "propListHead", null);
        setIntField(term3687233, term3687233.getClass(), "sourcePosition", 0);
        setField(term3687233, term3687233.getClass(), "jsType", null);
        setField(term3687233, term3687233.getClass(), "parent", null);
        setField(term3687232, term3687232.getClass(), "first", term3687233);
        setField(term3687232, term3687232.getClass(), "last", null);
        setField(term3687232, term3687232.getClass(), "propListHead", null);
        setIntField(term3687232, term3687232.getClass(), "sourcePosition", 0);
        setField(term3687232, term3687232.getClass(), "jsType", null);
        setField(term3687232, term3687232.getClass(), "parent", null);
        term3686966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3686968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3686970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3686974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3686976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3686966, term3686966.getClass(), "str", null);
        setIntField(term3686966, term3686966.getClass(), "type", 37);
        setField(term3686966, term3686966.getClass(), "next", null);
        setField(term3686968, term3686968.getClass(), "str", null);
        setIntField(term3686968, term3686968.getClass(), "type", 35);
        setDoubleField(term3686970, term3686970.getClass(), "number", 0.0);
        setIntField(term3686970, term3686970.getClass(), "type", 44);
        setField(term3686970, term3686970.getClass(), "next", null);
        setField(term3686970, term3686970.getClass(), "first", null);
        setField(term3686970, term3686970.getClass(), "last", null);
        setField(term3686970, term3686970.getClass(), "propListHead", null);
        setIntField(term3686970, term3686970.getClass(), "sourcePosition", 0);
        setField(term3686970, term3686970.getClass(), "jsType", null);
        setField(term3686970, term3686970.getClass(), "parent", null);
        setField(term3686968, term3686968.getClass(), "next", term3686970);
        setField(term3686974, term3686974.getClass(), "str", null);
        setIntField(term3686974, term3686974.getClass(), "type", 40);
        setField(term3686976, term3686976.getClass(), "str", "");
        setIntField(term3686976, term3686976.getClass(), "type", 40);
        setField(term3686976, term3686976.getClass(), "next", null);
        setField(term3686976, term3686976.getClass(), "first", null);
        setField(term3686976, term3686976.getClass(), "last", null);
        setField(term3686976, term3686976.getClass(), "propListHead", null);
        setIntField(term3686976, term3686976.getClass(), "sourcePosition", 0);
        setField(term3686976, term3686976.getClass(), "jsType", null);
        setField(term3686976, term3686976.getClass(), "parent", null);
        setField(term3686974, term3686974.getClass(), "next", term3686976);
        setField(term3686974, term3686974.getClass(), "first", null);
        setField(term3686974, term3686974.getClass(), "last", null);
        setField(term3686974, term3686974.getClass(), "propListHead", null);
        setIntField(term3686974, term3686974.getClass(), "sourcePosition", 0);
        setField(term3686974, term3686974.getClass(), "jsType", null);
        setField(term3686974, term3686974.getClass(), "parent", null);
        setField(term3686968, term3686968.getClass(), "first", term3686974);
        setField(term3686968, term3686968.getClass(), "last", null);
        setField(term3686968, term3686968.getClass(), "propListHead", null);
        setIntField(term3686968, term3686968.getClass(), "sourcePosition", 0);
        setField(term3686968, term3686968.getClass(), "jsType", null);
        setField(term3686968, term3686968.getClass(), "parent", null);
        setField(term3686966, term3686966.getClass(), "first", term3686968);
        setField(term3686966, term3686966.getClass(), "last", null);
        setField(term3686966, term3686966.getClass(), "propListHead", null);
        setIntField(term3686966, term3686966.getClass(), "sourcePosition", 0);
        setField(term3686966, term3686966.getClass(), "jsType", null);
        setField(term3686966, term3686966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3686532;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3686440, args);
        assertTrue(recursiveEquals(term3686440, term3687231));
        assertTrue(recursiveEquals(term3686532, term3687232));
        assertTrue(recursiveEquals(retValue, term3686966));
    }

};


