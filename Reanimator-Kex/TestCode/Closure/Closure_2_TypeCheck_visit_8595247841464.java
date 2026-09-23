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

public class TypeCheck_visit_8595247841464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469387;
     Object term469457;
     Object term469527;
     Object term469552;
     Object term469553;
     Object term469554;

    public TypeCheck_visit_8595247841464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469387 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term469457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term469457, term469457.getClass(), "type", 38);
        term469527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term469527, term469527.getClass(), "type", 118);
        term469552 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term469552, term469552.getClass(), "compiler", null);
        setField(term469552, term469552.getClass(), "validator", null);
        setField(term469552, term469552.getClass(), "reverseInterpreter", null);
        setField(term469552, term469552.getClass(), "typeRegistry", null);
        setField(term469552, term469552.getClass(), "topScope", null);
        setField(term469552, term469552.getClass(), "scopeCreator", null);
        setField(term469552, term469552.getClass(), "reportMissingOverride", null);
        setField(term469552, term469552.getClass(), "reportUnknownTypes", null);
        setBooleanField(term469552, term469552.getClass(), "reportMissingProperties", false);
        setField(term469552, term469552.getClass(), "inferJSDocInfo", null);
        setIntField(term469552, term469552.getClass(), "typedCount", 0);
        setIntField(term469552, term469552.getClass(), "nullCount", 0);
        setIntField(term469552, term469552.getClass(), "unknownCount", 0);
        setBooleanField(term469552, term469552.getClass(), "inExterns", false);
        setIntField(term469552, term469552.getClass(), "noTypeCheckSection", 0);
        term469553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term469553, term469553.getClass(), "type", 38);
        setField(term469553, term469553.getClass(), "next", null);
        setField(term469553, term469553.getClass(), "first", null);
        setField(term469553, term469553.getClass(), "last", null);
        setField(term469553, term469553.getClass(), "propListHead", null);
        setIntField(term469553, term469553.getClass(), "sourcePosition", 0);
        setField(term469553, term469553.getClass(), "jsType", null);
        setField(term469553, term469553.getClass(), "parent", null);
        term469554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term469554, term469554.getClass(), "type", 118);
        setField(term469554, term469554.getClass(), "next", null);
        setField(term469554, term469554.getClass(), "first", null);
        setField(term469554, term469554.getClass(), "last", null);
        setField(term469554, term469554.getClass(), "propListHead", null);
        setIntField(term469554, term469554.getClass(), "sourcePosition", 0);
        setField(term469554, term469554.getClass(), "jsType", null);
        setField(term469554, term469554.getClass(), "parent", null);
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
        args[1] = term469457;
        args[2] = term469527;
        callMethod(klass, "visit", argTypes, term469387, args);
        assertTrue(recursiveEquals(term469387, term469552));
        assertTrue(recursiveEquals(term469457, term469554));
        assertTrue(recursiveEquals(term469527, null));
    }

};


