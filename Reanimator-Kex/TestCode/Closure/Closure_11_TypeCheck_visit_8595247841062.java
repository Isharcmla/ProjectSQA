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

public class TypeCheck_visit_8595247841062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303394;
     Object term303464;
     Object term303534;
     Object term304530;
     Object term304531;
     Object term304532;

    public TypeCheck_visit_8595247841062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303394 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term303464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term303464, term303464.getClass(), "type", 38);
        term303534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term303534, term303534.getClass(), "type", 118);
        term304530 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term304530, term304530.getClass(), "compiler", null);
        setField(term304530, term304530.getClass(), "validator", null);
        setField(term304530, term304530.getClass(), "reverseInterpreter", null);
        setField(term304530, term304530.getClass(), "typeRegistry", null);
        setField(term304530, term304530.getClass(), "topScope", null);
        setField(term304530, term304530.getClass(), "scopeCreator", null);
        setField(term304530, term304530.getClass(), "reportMissingOverride", null);
        setField(term304530, term304530.getClass(), "reportUnknownTypes", null);
        setBooleanField(term304530, term304530.getClass(), "reportMissingProperties", false);
        setField(term304530, term304530.getClass(), "inferJSDocInfo", null);
        setIntField(term304530, term304530.getClass(), "typedCount", 0);
        setIntField(term304530, term304530.getClass(), "nullCount", 0);
        setIntField(term304530, term304530.getClass(), "unknownCount", 0);
        setBooleanField(term304530, term304530.getClass(), "inExterns", false);
        setIntField(term304530, term304530.getClass(), "noTypeCheckSection", 0);
        term304531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term304531, term304531.getClass(), "type", 38);
        setField(term304531, term304531.getClass(), "next", null);
        setField(term304531, term304531.getClass(), "first", null);
        setField(term304531, term304531.getClass(), "last", null);
        setField(term304531, term304531.getClass(), "propListHead", null);
        setIntField(term304531, term304531.getClass(), "sourcePosition", 0);
        setField(term304531, term304531.getClass(), "jsType", null);
        setField(term304531, term304531.getClass(), "parent", null);
        term304532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term304532, term304532.getClass(), "type", 118);
        setField(term304532, term304532.getClass(), "next", null);
        setField(term304532, term304532.getClass(), "first", null);
        setField(term304532, term304532.getClass(), "last", null);
        setField(term304532, term304532.getClass(), "propListHead", null);
        setIntField(term304532, term304532.getClass(), "sourcePosition", 0);
        setField(term304532, term304532.getClass(), "jsType", null);
        setField(term304532, term304532.getClass(), "parent", null);
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
        args[1] = term303464;
        args[2] = term303534;
        callMethod(klass, "visit", argTypes, term303394, args);
        assertTrue(recursiveEquals(term303394, term304530));
        assertTrue(recursiveEquals(term303464, term304532));
        assertTrue(recursiveEquals(term303534, null));
    }

};


