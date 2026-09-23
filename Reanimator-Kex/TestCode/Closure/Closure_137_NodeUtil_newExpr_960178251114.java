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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newExpr_960178251114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242;

    public NodeUtil_newExpr_960178251114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term255 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term242, term242.getClass(), "type", -1347665717);
        setIntField(term244, term244.getClass(), "type", -268815336);
        setIntField(term246, term246.getClass(), "type", 0);
        setField(term246, term246.getClass(), "next", null);
        setField(term246, term246.getClass(), "first", null);
        setField(term246, term246.getClass(), "last", null);
        setField(term246, term246.getClass(), "propListHead", null);
        setIntField(term246, term246.getClass(), "sourcePosition", 0);
        setField(term246, term246.getClass(), "jsType", null);
        setField(term246, term246.getClass(), "parent", null);
        setField(term244, term244.getClass(), "next", term246);
        setIntField(term249, term249.getClass(), "type", 0);
        setField(term249, term249.getClass(), "next", null);
        setField(term249, term249.getClass(), "first", null);
        setField(term249, term249.getClass(), "last", null);
        setField(term249, term249.getClass(), "propListHead", null);
        setIntField(term249, term249.getClass(), "sourcePosition", 0);
        setField(term249, term249.getClass(), "jsType", null);
        setField(term249, term249.getClass(), "parent", null);
        setField(term244, term244.getClass(), "first", term249);
        setIntField(term252, term252.getClass(), "type", 0);
        setField(term252, term252.getClass(), "next", null);
        setField(term252, term252.getClass(), "first", null);
        setField(term252, term252.getClass(), "last", null);
        setField(term252, term252.getClass(), "propListHead", null);
        setIntField(term252, term252.getClass(), "sourcePosition", 0);
        setField(term252, term252.getClass(), "jsType", null);
        setField(term252, term252.getClass(), "parent", null);
        setField(term244, term244.getClass(), "last", term252);
        setField(term255, term255.getClass(), "next", null);
        setIntField(term255, term255.getClass(), "type", 0);
        setIntField(term255, term255.getClass(), "intValue", 0);
        setField(term255, term255.getClass(), "objectValue", null);
        setField(term244, term244.getClass(), "propListHead", term255);
        setIntField(term244, term244.getClass(), "sourcePosition", 339854490);
        setField(term244, term244.getClass(), "jsType", null);
        setField(term244, term244.getClass(), "parent", null);
        setField(term242, term242.getClass(), "next", term244);
        setIntField(term259, term259.getClass(), "type", 0);
        setField(term259, term259.getClass(), "next", null);
        setField(term259, term259.getClass(), "first", null);
        setField(term259, term259.getClass(), "last", null);
        setField(term259, term259.getClass(), "propListHead", null);
        setIntField(term259, term259.getClass(), "sourcePosition", 0);
        setField(term259, term259.getClass(), "jsType", null);
        setField(term259, term259.getClass(), "parent", null);
        setField(term242, term242.getClass(), "first", term259);
        setIntField(term262, term262.getClass(), "type", 0);
        setField(term262, term262.getClass(), "next", null);
        setField(term262, term262.getClass(), "first", null);
        setField(term262, term262.getClass(), "last", null);
        setField(term262, term262.getClass(), "propListHead", null);
        setIntField(term262, term262.getClass(), "sourcePosition", 0);
        setField(term262, term262.getClass(), "jsType", null);
        setField(term262, term262.getClass(), "parent", null);
        setField(term242, term242.getClass(), "last", term262);
        setField(term265, term265.getClass(), "next", null);
        setIntField(term265, term265.getClass(), "type", 0);
        setIntField(term265, term265.getClass(), "intValue", 0);
        setField(term265, term265.getClass(), "objectValue", null);
        setField(term242, term242.getClass(), "propListHead", term265);
        setIntField(term242, term242.getClass(), "sourcePosition", -615654495);
        setField(term242, term242.getClass(), "jsType", null);
        setField(term242, term242.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term242;
        try {
            callMethod(klass, "newExpr", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


