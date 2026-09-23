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

public class NodeUtil_isImmutableValue_1118207454164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;
     Object term7105;

    public NodeUtil_isImmutableValue_1118207454164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term263, term263.getClass(), "type", -1347665717);
        setIntField(term265, term265.getClass(), "type", -268815336);
        setIntField(term267, term267.getClass(), "type", 0);
        setField(term267, term267.getClass(), "next", null);
        setField(term267, term267.getClass(), "first", null);
        setField(term267, term267.getClass(), "last", null);
        setField(term267, term267.getClass(), "propListHead", null);
        setIntField(term267, term267.getClass(), "sourcePosition", 0);
        setField(term267, term267.getClass(), "jsType", null);
        setField(term267, term267.getClass(), "parent", null);
        setField(term265, term265.getClass(), "next", term267);
        setIntField(term270, term270.getClass(), "type", 0);
        setField(term270, term270.getClass(), "next", null);
        setField(term270, term270.getClass(), "first", null);
        setField(term270, term270.getClass(), "last", null);
        setField(term270, term270.getClass(), "propListHead", null);
        setIntField(term270, term270.getClass(), "sourcePosition", 0);
        setField(term270, term270.getClass(), "jsType", null);
        setField(term270, term270.getClass(), "parent", null);
        setField(term265, term265.getClass(), "first", term270);
        setIntField(term273, term273.getClass(), "type", 0);
        setField(term273, term273.getClass(), "next", null);
        setField(term273, term273.getClass(), "first", null);
        setField(term273, term273.getClass(), "last", null);
        setField(term273, term273.getClass(), "propListHead", null);
        setIntField(term273, term273.getClass(), "sourcePosition", 0);
        setField(term273, term273.getClass(), "jsType", null);
        setField(term273, term273.getClass(), "parent", null);
        setField(term265, term265.getClass(), "last", term273);
        setField(term276, term276.getClass(), "next", null);
        setIntField(term276, term276.getClass(), "type", 0);
        setIntField(term276, term276.getClass(), "intValue", 0);
        setField(term276, term276.getClass(), "objectValue", null);
        setField(term265, term265.getClass(), "propListHead", term276);
        setIntField(term265, term265.getClass(), "sourcePosition", 339854490);
        setField(term265, term265.getClass(), "jsType", null);
        setField(term265, term265.getClass(), "parent", null);
        setField(term263, term263.getClass(), "next", term265);
        setIntField(term280, term280.getClass(), "type", 0);
        setField(term280, term280.getClass(), "next", null);
        setField(term280, term280.getClass(), "first", null);
        setField(term280, term280.getClass(), "last", null);
        setField(term280, term280.getClass(), "propListHead", null);
        setIntField(term280, term280.getClass(), "sourcePosition", 0);
        setField(term280, term280.getClass(), "jsType", null);
        setField(term280, term280.getClass(), "parent", null);
        setField(term263, term263.getClass(), "first", term280);
        setIntField(term283, term283.getClass(), "type", 0);
        setField(term283, term283.getClass(), "next", null);
        setField(term283, term283.getClass(), "first", null);
        setField(term283, term283.getClass(), "last", null);
        setField(term283, term283.getClass(), "propListHead", null);
        setIntField(term283, term283.getClass(), "sourcePosition", 0);
        setField(term283, term283.getClass(), "jsType", null);
        setField(term283, term283.getClass(), "parent", null);
        setField(term263, term263.getClass(), "last", term283);
        setField(term286, term286.getClass(), "next", null);
        setIntField(term286, term286.getClass(), "type", 0);
        setIntField(term286, term286.getClass(), "intValue", 0);
        setField(term286, term286.getClass(), "objectValue", null);
        setField(term263, term263.getClass(), "propListHead", term286);
        setIntField(term263, term263.getClass(), "sourcePosition", -615654495);
        setField(term263, term263.getClass(), "jsType", null);
        setField(term263, term263.getClass(), "parent", null);
        term7105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7110 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7113 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7105, term7105.getClass(), "type", -1347665717);
        setIntField(term7106, term7106.getClass(), "type", -268815336);
        setIntField(term7107, term7107.getClass(), "type", 0);
        setField(term7107, term7107.getClass(), "next", null);
        setField(term7107, term7107.getClass(), "first", null);
        setField(term7107, term7107.getClass(), "last", null);
        setField(term7107, term7107.getClass(), "propListHead", null);
        setIntField(term7107, term7107.getClass(), "sourcePosition", 0);
        setField(term7107, term7107.getClass(), "jsType", null);
        setField(term7107, term7107.getClass(), "parent", null);
        setField(term7106, term7106.getClass(), "next", term7107);
        setIntField(term7108, term7108.getClass(), "type", 0);
        setField(term7108, term7108.getClass(), "next", null);
        setField(term7108, term7108.getClass(), "first", null);
        setField(term7108, term7108.getClass(), "last", null);
        setField(term7108, term7108.getClass(), "propListHead", null);
        setIntField(term7108, term7108.getClass(), "sourcePosition", 0);
        setField(term7108, term7108.getClass(), "jsType", null);
        setField(term7108, term7108.getClass(), "parent", null);
        setField(term7106, term7106.getClass(), "first", term7108);
        setIntField(term7109, term7109.getClass(), "type", 0);
        setField(term7109, term7109.getClass(), "next", null);
        setField(term7109, term7109.getClass(), "first", null);
        setField(term7109, term7109.getClass(), "last", null);
        setField(term7109, term7109.getClass(), "propListHead", null);
        setIntField(term7109, term7109.getClass(), "sourcePosition", 0);
        setField(term7109, term7109.getClass(), "jsType", null);
        setField(term7109, term7109.getClass(), "parent", null);
        setField(term7106, term7106.getClass(), "last", term7109);
        setField(term7110, term7110.getClass(), "next", null);
        setIntField(term7110, term7110.getClass(), "type", 0);
        setIntField(term7110, term7110.getClass(), "intValue", 0);
        setField(term7110, term7110.getClass(), "objectValue", null);
        setField(term7106, term7106.getClass(), "propListHead", term7110);
        setIntField(term7106, term7106.getClass(), "sourcePosition", 339854490);
        setField(term7106, term7106.getClass(), "jsType", null);
        setField(term7106, term7106.getClass(), "parent", null);
        setField(term7105, term7105.getClass(), "next", term7106);
        setIntField(term7111, term7111.getClass(), "type", 0);
        setField(term7111, term7111.getClass(), "next", null);
        setField(term7111, term7111.getClass(), "first", null);
        setField(term7111, term7111.getClass(), "last", null);
        setField(term7111, term7111.getClass(), "propListHead", null);
        setIntField(term7111, term7111.getClass(), "sourcePosition", 0);
        setField(term7111, term7111.getClass(), "jsType", null);
        setField(term7111, term7111.getClass(), "parent", null);
        setField(term7105, term7105.getClass(), "first", term7111);
        setIntField(term7112, term7112.getClass(), "type", 0);
        setField(term7112, term7112.getClass(), "next", null);
        setField(term7112, term7112.getClass(), "first", null);
        setField(term7112, term7112.getClass(), "last", null);
        setField(term7112, term7112.getClass(), "propListHead", null);
        setIntField(term7112, term7112.getClass(), "sourcePosition", 0);
        setField(term7112, term7112.getClass(), "jsType", null);
        setField(term7112, term7112.getClass(), "parent", null);
        setField(term7105, term7105.getClass(), "last", term7112);
        setField(term7113, term7113.getClass(), "next", null);
        setIntField(term7113, term7113.getClass(), "type", 0);
        setIntField(term7113, term7113.getClass(), "intValue", 0);
        setField(term7113, term7113.getClass(), "objectValue", null);
        setField(term7105, term7105.getClass(), "propListHead", term7113);
        setIntField(term7105, term7105.getClass(), "sourcePosition", -615654495);
        setField(term7105, term7105.getClass(), "jsType", null);
        setField(term7105, term7105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term263;
        Object retValue = callMethod(klass, "isImmutableValue", argTypes, null, args);
        assertTrue(recursiveEquals(term263, term7105));
        assertTrue(recursiveEquals(retValue, false));
    }

};


