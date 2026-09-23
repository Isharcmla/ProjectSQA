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

public class TypeInference_traverseChildren_1478920219188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91551;
     Object term91621;
     Object term97143;
     Object term97144;

    public TypeInference_traverseChildren_1478920219188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91551 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term91621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91691, term91691.getClass(), "type", -516303035);
        setIntField(term91761, term91761.getClass(), "type", 65);
        setField(term91691, term91691.getClass(), "next", term91761);
        setField(term91621, term91621.getClass(), "first", term91691);
        term97143 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term97143, term97143.getClass(), "compiler", null);
        setField(term97143, term97143.getClass(), "registry", null);
        setField(term97143, term97143.getClass(), "reverseInterpreter", null);
        setField(term97143, term97143.getClass(), "syntacticScope", null);
        setField(term97143, term97143.getClass(), "functionScope", null);
        setField(term97143, term97143.getClass(), "bottomScope", null);
        setField(term97143, term97143.getClass(), "assertionFunctionsMap", null);
        setField(term97143, term97143.getClass(), "unknownType", null);
        setField(term97143, term97143.getClass(), "cfg", null);
        setField(term97143, term97143.getClass(), "joinOp", null);
        setField(term97143, term97143.getClass(), "orderedWorkSet", null);
        term97144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97144, term97144.getClass(), "type", 0);
        setField(term97144, term97144.getClass(), "next", null);
        setIntField(term97145, term97145.getClass(), "type", -516303035);
        setIntField(term97146, term97146.getClass(), "type", 65);
        setField(term97146, term97146.getClass(), "next", null);
        setField(term97146, term97146.getClass(), "first", null);
        setField(term97146, term97146.getClass(), "last", null);
        setField(term97146, term97146.getClass(), "propListHead", null);
        setIntField(term97146, term97146.getClass(), "sourcePosition", 0);
        setField(term97146, term97146.getClass(), "jsType", null);
        setField(term97146, term97146.getClass(), "parent", null);
        setField(term97145, term97145.getClass(), "next", term97146);
        setField(term97145, term97145.getClass(), "first", null);
        setField(term97145, term97145.getClass(), "last", null);
        setField(term97145, term97145.getClass(), "propListHead", null);
        setIntField(term97145, term97145.getClass(), "sourcePosition", 0);
        setField(term97145, term97145.getClass(), "jsType", null);
        setField(term97145, term97145.getClass(), "parent", null);
        setField(term97144, term97144.getClass(), "first", term97145);
        setField(term97144, term97144.getClass(), "last", null);
        setField(term97144, term97144.getClass(), "propListHead", null);
        setIntField(term97144, term97144.getClass(), "sourcePosition", 0);
        setField(term97144, term97144.getClass(), "jsType", null);
        setField(term97144, term97144.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term91621;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term91551, args);
        assertTrue(recursiveEquals(term91551, term97143));
        assertTrue(recursiveEquals(term91621, term97144));
        assertTrue(recursiveEquals(retValue, null));
    }

};


