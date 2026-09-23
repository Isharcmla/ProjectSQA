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
import java.lang.Object;

public class NodeUtil_constructorCallHasSideEffects_566563438179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478;

    public NodeUtil_constructorCallHasSideEffects_566563438179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term478, term478.getClass(), "type", -1410220680);
        setIntField(term480, term480.getClass(), "type", -1667990367);
        setIntField(term482, term482.getClass(), "type", 0);
        setField(term482, term482.getClass(), "next", null);
        setField(term482, term482.getClass(), "first", null);
        setField(term482, term482.getClass(), "last", null);
        setField(term482, term482.getClass(), "propListHead", null);
        setIntField(term482, term482.getClass(), "sourcePosition", 0);
        setField(term482, term482.getClass(), "jsType", null);
        setField(term482, term482.getClass(), "parent", null);
        setField(term480, term480.getClass(), "next", term482);
        setIntField(term485, term485.getClass(), "type", 0);
        setField(term485, term485.getClass(), "next", null);
        setField(term485, term485.getClass(), "first", null);
        setField(term485, term485.getClass(), "last", null);
        setField(term485, term485.getClass(), "propListHead", null);
        setIntField(term485, term485.getClass(), "sourcePosition", 0);
        setField(term485, term485.getClass(), "jsType", null);
        setField(term485, term485.getClass(), "parent", null);
        setField(term480, term480.getClass(), "first", term485);
        setIntField(term488, term488.getClass(), "type", 0);
        setField(term488, term488.getClass(), "next", null);
        setField(term488, term488.getClass(), "first", null);
        setField(term488, term488.getClass(), "last", null);
        setField(term488, term488.getClass(), "propListHead", null);
        setIntField(term488, term488.getClass(), "sourcePosition", 0);
        setField(term488, term488.getClass(), "jsType", null);
        setField(term488, term488.getClass(), "parent", null);
        setField(term480, term480.getClass(), "last", term488);
        setField(term480, term480.getClass(), "propListHead", null);
        setIntField(term480, term480.getClass(), "sourcePosition", 0);
        setField(term480, term480.getClass(), "jsType", null);
        setField(term480, term480.getClass(), "parent", null);
        setField(term478, term478.getClass(), "next", term480);
        setIntField(term492, term492.getClass(), "type", 0);
        setField(term492, term492.getClass(), "next", null);
        setField(term492, term492.getClass(), "first", null);
        setField(term492, term492.getClass(), "last", null);
        setField(term492, term492.getClass(), "propListHead", null);
        setIntField(term492, term492.getClass(), "sourcePosition", 0);
        setField(term492, term492.getClass(), "jsType", null);
        setField(term492, term492.getClass(), "parent", null);
        setField(term478, term478.getClass(), "first", term492);
        setIntField(term495, term495.getClass(), "type", 0);
        setField(term495, term495.getClass(), "next", null);
        setField(term495, term495.getClass(), "first", null);
        setField(term495, term495.getClass(), "last", null);
        setField(term495, term495.getClass(), "propListHead", null);
        setIntField(term495, term495.getClass(), "sourcePosition", 0);
        setField(term495, term495.getClass(), "jsType", null);
        setField(term495, term495.getClass(), "parent", null);
        setField(term478, term478.getClass(), "last", term495);
        setField(term478, term478.getClass(), "propListHead", null);
        setIntField(term478, term478.getClass(), "sourcePosition", 0);
        setField(term478, term478.getClass(), "jsType", null);
        setField(term478, term478.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term478;
        try {
            callMethod(klass, "constructorCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


