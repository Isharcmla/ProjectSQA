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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249871;
     Object term249963;
     Object term250055;
     Object term250072;
     Object term250073;
     Object term250074;
     Object term250057;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249871 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term249963 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term249963, term249963.getClass(), "type", 52);
        term250055 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term250072 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term250072, term250072.getClass(), "currentTraversal", null);
        term250073 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250073, term250073.getClass(), "str", null);
        setIntField(term250073, term250073.getClass(), "type", 52);
        setField(term250073, term250073.getClass(), "next", null);
        setField(term250073, term250073.getClass(), "first", null);
        setField(term250073, term250073.getClass(), "last", null);
        setField(term250073, term250073.getClass(), "propListHead", null);
        setIntField(term250073, term250073.getClass(), "sourcePosition", 0);
        setField(term250073, term250073.getClass(), "jsType", null);
        setField(term250073, term250073.getClass(), "parent", null);
        term250074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250074, term250074.getClass(), "str", null);
        setIntField(term250074, term250074.getClass(), "type", 0);
        setField(term250074, term250074.getClass(), "next", null);
        setField(term250074, term250074.getClass(), "first", null);
        setField(term250074, term250074.getClass(), "last", null);
        setField(term250074, term250074.getClass(), "propListHead", null);
        setIntField(term250074, term250074.getClass(), "sourcePosition", 0);
        setField(term250074, term250074.getClass(), "jsType", null);
        setField(term250074, term250074.getClass(), "parent", null);
        term250057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250057, term250057.getClass(), "str", null);
        setIntField(term250057, term250057.getClass(), "type", 52);
        setField(term250057, term250057.getClass(), "next", null);
        setField(term250057, term250057.getClass(), "first", null);
        setField(term250057, term250057.getClass(), "last", null);
        setField(term250057, term250057.getClass(), "propListHead", null);
        setIntField(term250057, term250057.getClass(), "sourcePosition", 0);
        setField(term250057, term250057.getClass(), "jsType", null);
        setField(term250057, term250057.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term249963;
        args[1] = term250055;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term249871, args);
        assertTrue(recursiveEquals(term249871, term250072));
        assertTrue(recursiveEquals(term249963, term250073));
        assertTrue(recursiveEquals(term250055, term250074));
        assertTrue(recursiveEquals(retValue, term250057));
    }

};


