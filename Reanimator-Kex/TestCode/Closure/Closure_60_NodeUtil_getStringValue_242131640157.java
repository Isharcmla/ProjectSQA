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

public class NodeUtil_getStringValue_242131640157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term4275;

    public NodeUtil_getStringValue_242131640157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43, term43.getClass(), "type", -117576464);
        setIntField(term45, term45.getClass(), "type", 865208305);
        setIntField(term47, term47.getClass(), "type", 0);
        setField(term47, term47.getClass(), "next", null);
        setField(term47, term47.getClass(), "first", null);
        setField(term47, term47.getClass(), "last", null);
        setField(term47, term47.getClass(), "propListHead", null);
        setIntField(term47, term47.getClass(), "sourcePosition", 0);
        setField(term47, term47.getClass(), "jsType", null);
        setField(term47, term47.getClass(), "parent", null);
        setField(term45, term45.getClass(), "next", term47);
        setIntField(term50, term50.getClass(), "type", 0);
        setField(term50, term50.getClass(), "next", null);
        setField(term50, term50.getClass(), "first", null);
        setField(term50, term50.getClass(), "last", null);
        setField(term50, term50.getClass(), "propListHead", null);
        setIntField(term50, term50.getClass(), "sourcePosition", 0);
        setField(term50, term50.getClass(), "jsType", null);
        setField(term50, term50.getClass(), "parent", null);
        setField(term45, term45.getClass(), "first", term50);
        setIntField(term53, term53.getClass(), "type", 0);
        setField(term53, term53.getClass(), "next", null);
        setField(term53, term53.getClass(), "first", null);
        setField(term53, term53.getClass(), "last", null);
        setField(term53, term53.getClass(), "propListHead", null);
        setIntField(term53, term53.getClass(), "sourcePosition", 0);
        setField(term53, term53.getClass(), "jsType", null);
        setField(term53, term53.getClass(), "parent", null);
        setField(term45, term45.getClass(), "last", term53);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term43, term43.getClass(), "next", term45);
        setIntField(term57, term57.getClass(), "type", 0);
        setField(term57, term57.getClass(), "next", null);
        setField(term57, term57.getClass(), "first", null);
        setField(term57, term57.getClass(), "last", null);
        setField(term57, term57.getClass(), "propListHead", null);
        setIntField(term57, term57.getClass(), "sourcePosition", 0);
        setField(term57, term57.getClass(), "jsType", null);
        setField(term57, term57.getClass(), "parent", null);
        setField(term43, term43.getClass(), "first", term57);
        setIntField(term60, term60.getClass(), "type", 0);
        setField(term60, term60.getClass(), "next", null);
        setField(term60, term60.getClass(), "first", null);
        setField(term60, term60.getClass(), "last", null);
        setField(term60, term60.getClass(), "propListHead", null);
        setIntField(term60, term60.getClass(), "sourcePosition", 0);
        setField(term60, term60.getClass(), "jsType", null);
        setField(term60, term60.getClass(), "parent", null);
        setField(term43, term43.getClass(), "last", term60);
        setField(term43, term43.getClass(), "propListHead", null);
        setIntField(term43, term43.getClass(), "sourcePosition", 0);
        setField(term43, term43.getClass(), "jsType", null);
        setField(term43, term43.getClass(), "parent", null);
        term4275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4275, term4275.getClass(), "type", -117576464);
        setIntField(term4276, term4276.getClass(), "type", 865208305);
        setIntField(term4277, term4277.getClass(), "type", 0);
        setField(term4277, term4277.getClass(), "next", null);
        setField(term4277, term4277.getClass(), "first", null);
        setField(term4277, term4277.getClass(), "last", null);
        setField(term4277, term4277.getClass(), "propListHead", null);
        setIntField(term4277, term4277.getClass(), "sourcePosition", 0);
        setField(term4277, term4277.getClass(), "jsType", null);
        setField(term4277, term4277.getClass(), "parent", null);
        setField(term4276, term4276.getClass(), "next", term4277);
        setIntField(term4278, term4278.getClass(), "type", 0);
        setField(term4278, term4278.getClass(), "next", null);
        setField(term4278, term4278.getClass(), "first", null);
        setField(term4278, term4278.getClass(), "last", null);
        setField(term4278, term4278.getClass(), "propListHead", null);
        setIntField(term4278, term4278.getClass(), "sourcePosition", 0);
        setField(term4278, term4278.getClass(), "jsType", null);
        setField(term4278, term4278.getClass(), "parent", null);
        setField(term4276, term4276.getClass(), "first", term4278);
        setIntField(term4279, term4279.getClass(), "type", 0);
        setField(term4279, term4279.getClass(), "next", null);
        setField(term4279, term4279.getClass(), "first", null);
        setField(term4279, term4279.getClass(), "last", null);
        setField(term4279, term4279.getClass(), "propListHead", null);
        setIntField(term4279, term4279.getClass(), "sourcePosition", 0);
        setField(term4279, term4279.getClass(), "jsType", null);
        setField(term4279, term4279.getClass(), "parent", null);
        setField(term4276, term4276.getClass(), "last", term4279);
        setField(term4276, term4276.getClass(), "propListHead", null);
        setIntField(term4276, term4276.getClass(), "sourcePosition", 0);
        setField(term4276, term4276.getClass(), "jsType", null);
        setField(term4276, term4276.getClass(), "parent", null);
        setField(term4275, term4275.getClass(), "next", term4276);
        setIntField(term4280, term4280.getClass(), "type", 0);
        setField(term4280, term4280.getClass(), "next", null);
        setField(term4280, term4280.getClass(), "first", null);
        setField(term4280, term4280.getClass(), "last", null);
        setField(term4280, term4280.getClass(), "propListHead", null);
        setIntField(term4280, term4280.getClass(), "sourcePosition", 0);
        setField(term4280, term4280.getClass(), "jsType", null);
        setField(term4280, term4280.getClass(), "parent", null);
        setField(term4275, term4275.getClass(), "first", term4280);
        setIntField(term4281, term4281.getClass(), "type", 0);
        setField(term4281, term4281.getClass(), "next", null);
        setField(term4281, term4281.getClass(), "first", null);
        setField(term4281, term4281.getClass(), "last", null);
        setField(term4281, term4281.getClass(), "propListHead", null);
        setIntField(term4281, term4281.getClass(), "sourcePosition", 0);
        setField(term4281, term4281.getClass(), "jsType", null);
        setField(term4281, term4281.getClass(), "parent", null);
        setField(term4275, term4275.getClass(), "last", term4281);
        setField(term4275, term4275.getClass(), "propListHead", null);
        setIntField(term4275, term4275.getClass(), "sourcePosition", 0);
        setField(term4275, term4275.getClass(), "jsType", null);
        setField(term4275, term4275.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term43, term4275));
        assertTrue(recursiveEquals(retValue, null));
    }

};


