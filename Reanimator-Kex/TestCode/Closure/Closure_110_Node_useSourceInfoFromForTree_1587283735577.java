package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class Node_useSourceInfoFromForTree_1587283735577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49076;
     Object term49426;
     Object term49732;
     Object term49737;
     Object term49621;

    public Node_useSourceInfoFromForTree_1587283735577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49076, term49076.getClass(), "propListHead", null);
        setIntField(term49076, term49076.getClass(), "sourcePosition", 0);
        setField(term49146, term49146.getClass(), "propListHead", null);
        setIntField(term49146, term49146.getClass(), "sourcePosition", 0);
        setField(term49216, term49216.getClass(), "propListHead", null);
        setIntField(term49216, term49216.getClass(), "sourcePosition", 0);
        setField(term49216, term49216.getClass(), "first", null);
        setField(term49216, term49216.getClass(), "next", null);
        setField(term49146, term49146.getClass(), "first", term49216);
        setField(term49286, term49286.getClass(), "propListHead", null);
        setIntField(term49286, term49286.getClass(), "sourcePosition", 0);
        setField(term49286, term49286.getClass(), "first", null);
        setField(term49286, term49286.getClass(), "next", term49356);
        setField(term49146, term49146.getClass(), "next", term49286);
        setField(term49076, term49076.getClass(), "first", term49146);
        term49426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49426, term49426.getClass(), "propListHead", null);
        setIntField(term49426, term49426.getClass(), "sourcePosition", 0);
        term49732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49732, term49732.getClass(), "type", 0);
        setField(term49732, term49732.getClass(), "next", null);
        setIntField(term49733, term49733.getClass(), "type", 0);
        setIntField(term49734, term49734.getClass(), "type", 0);
        setIntField(term49735, term49735.getClass(), "type", 0);
        setField(term49735, term49735.getClass(), "next", null);
        setField(term49735, term49735.getClass(), "first", null);
        setField(term49735, term49735.getClass(), "last", null);
        setField(term49735, term49735.getClass(), "propListHead", null);
        setIntField(term49735, term49735.getClass(), "sourcePosition", 0);
        setField(term49735, term49735.getClass(), "jsType", null);
        setField(term49735, term49735.getClass(), "parent", null);
        setField(term49734, term49734.getClass(), "next", term49735);
        setField(term49734, term49734.getClass(), "first", null);
        setField(term49734, term49734.getClass(), "last", null);
        setField(term49734, term49734.getClass(), "propListHead", null);
        setIntField(term49734, term49734.getClass(), "sourcePosition", 0);
        setField(term49734, term49734.getClass(), "jsType", null);
        setField(term49734, term49734.getClass(), "parent", null);
        setField(term49733, term49733.getClass(), "next", term49734);
        setIntField(term49736, term49736.getClass(), "type", 0);
        setField(term49736, term49736.getClass(), "next", null);
        setField(term49736, term49736.getClass(), "first", null);
        setField(term49736, term49736.getClass(), "last", null);
        setField(term49736, term49736.getClass(), "propListHead", null);
        setIntField(term49736, term49736.getClass(), "sourcePosition", 0);
        setField(term49736, term49736.getClass(), "jsType", null);
        setField(term49736, term49736.getClass(), "parent", null);
        setField(term49733, term49733.getClass(), "first", term49736);
        setField(term49733, term49733.getClass(), "last", null);
        setField(term49733, term49733.getClass(), "propListHead", null);
        setIntField(term49733, term49733.getClass(), "sourcePosition", 0);
        setField(term49733, term49733.getClass(), "jsType", null);
        setField(term49733, term49733.getClass(), "parent", null);
        setField(term49732, term49732.getClass(), "first", term49733);
        setField(term49732, term49732.getClass(), "last", null);
        setField(term49732, term49732.getClass(), "propListHead", null);
        setIntField(term49732, term49732.getClass(), "sourcePosition", 0);
        setField(term49732, term49732.getClass(), "jsType", null);
        setField(term49732, term49732.getClass(), "parent", null);
        term49737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49737, term49737.getClass(), "type", 0);
        setField(term49737, term49737.getClass(), "next", null);
        setField(term49737, term49737.getClass(), "first", null);
        setField(term49737, term49737.getClass(), "last", null);
        setField(term49737, term49737.getClass(), "propListHead", null);
        setIntField(term49737, term49737.getClass(), "sourcePosition", 0);
        setField(term49737, term49737.getClass(), "jsType", null);
        setField(term49737, term49737.getClass(), "parent", null);
        term49621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49621, term49621.getClass(), "type", 0);
        setField(term49621, term49621.getClass(), "next", null);
        setIntField(term49623, term49623.getClass(), "type", 0);
        setIntField(term49625, term49625.getClass(), "type", 0);
        setIntField(term49627, term49627.getClass(), "type", 0);
        setField(term49627, term49627.getClass(), "next", null);
        setField(term49627, term49627.getClass(), "first", null);
        setField(term49627, term49627.getClass(), "last", null);
        setField(term49627, term49627.getClass(), "propListHead", null);
        setIntField(term49627, term49627.getClass(), "sourcePosition", 0);
        setField(term49627, term49627.getClass(), "jsType", null);
        setField(term49627, term49627.getClass(), "parent", null);
        setField(term49625, term49625.getClass(), "next", term49627);
        setField(term49625, term49625.getClass(), "first", null);
        setField(term49625, term49625.getClass(), "last", null);
        setField(term49625, term49625.getClass(), "propListHead", null);
        setIntField(term49625, term49625.getClass(), "sourcePosition", 0);
        setField(term49625, term49625.getClass(), "jsType", null);
        setField(term49625, term49625.getClass(), "parent", null);
        setField(term49623, term49623.getClass(), "next", term49625);
        setIntField(term49631, term49631.getClass(), "type", 0);
        setField(term49631, term49631.getClass(), "next", null);
        setField(term49631, term49631.getClass(), "first", null);
        setField(term49631, term49631.getClass(), "last", null);
        setField(term49631, term49631.getClass(), "propListHead", null);
        setIntField(term49631, term49631.getClass(), "sourcePosition", 0);
        setField(term49631, term49631.getClass(), "jsType", null);
        setField(term49631, term49631.getClass(), "parent", null);
        setField(term49623, term49623.getClass(), "first", term49631);
        setField(term49623, term49623.getClass(), "last", null);
        setField(term49623, term49623.getClass(), "propListHead", null);
        setIntField(term49623, term49623.getClass(), "sourcePosition", 0);
        setField(term49623, term49623.getClass(), "jsType", null);
        setField(term49623, term49623.getClass(), "parent", null);
        setField(term49621, term49621.getClass(), "first", term49623);
        setField(term49621, term49621.getClass(), "last", null);
        setField(term49621, term49621.getClass(), "propListHead", null);
        setIntField(term49621, term49621.getClass(), "sourcePosition", 0);
        setField(term49621, term49621.getClass(), "jsType", null);
        setField(term49621, term49621.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49426;
        Object retValue = callMethod(klass, "useSourceInfoFromForTree", argTypes, term49076, args);
        assertTrue(recursiveEquals(term49076, term49732));
        assertTrue(recursiveEquals(term49426, term49737));
        assertTrue(recursiveEquals(retValue, term49621));
    }

};


