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

public class TypeCheck_visit_8595247841076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307679;
     Object term307771;
     Object term307787;
     Object term307788;

    public TypeCheck_visit_8595247841076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307679 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term307771 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term307771, term307771.getClass(), "type", 77);
        term307787 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term307787, term307787.getClass(), "compiler", null);
        setField(term307787, term307787.getClass(), "validator", null);
        setField(term307787, term307787.getClass(), "reverseInterpreter", null);
        setField(term307787, term307787.getClass(), "typeRegistry", null);
        setField(term307787, term307787.getClass(), "topScope", null);
        setField(term307787, term307787.getClass(), "scopeCreator", null);
        setField(term307787, term307787.getClass(), "reportMissingOverride", null);
        setField(term307787, term307787.getClass(), "reportUnknownTypes", null);
        setBooleanField(term307787, term307787.getClass(), "reportMissingProperties", false);
        setField(term307787, term307787.getClass(), "inferJSDocInfo", null);
        setIntField(term307787, term307787.getClass(), "typedCount", 0);
        setIntField(term307787, term307787.getClass(), "nullCount", 0);
        setIntField(term307787, term307787.getClass(), "unknownCount", 0);
        setBooleanField(term307787, term307787.getClass(), "inExterns", false);
        setIntField(term307787, term307787.getClass(), "noTypeCheckSection", 0);
        term307788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term307788, term307788.getClass(), "str", null);
        setIntField(term307788, term307788.getClass(), "type", 77);
        setField(term307788, term307788.getClass(), "next", null);
        setField(term307788, term307788.getClass(), "first", null);
        setField(term307788, term307788.getClass(), "last", null);
        setField(term307788, term307788.getClass(), "propListHead", null);
        setIntField(term307788, term307788.getClass(), "sourcePosition", 0);
        setField(term307788, term307788.getClass(), "jsType", null);
        setField(term307788, term307788.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term307771;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term307679, args);
        assertTrue(recursiveEquals(term307679, term307787));
        assertTrue(recursiveEquals(term307771, null));
    }

};


