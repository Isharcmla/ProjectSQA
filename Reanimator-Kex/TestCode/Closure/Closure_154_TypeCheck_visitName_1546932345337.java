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

public class TypeCheck_visitName_1546932345337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94108;
     Object term94178;
     Object term94558;
     Object term94622;
     Object term94623;
     Object term94624;

    public TypeCheck_visitName_1546932345337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94108 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term94178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term94392 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term94488 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term94178, term94178.getClass(), "jsType", term94296);
        setIntField(term94178, term94178.getClass(), "type", 0);
        setIntField(term94392, term94392.getClass(), "type", -30);
        setField(term94392, term94392.getClass(), "next", term94488);
        setField(term94178, term94178.getClass(), "propListHead", term94392);
        term94558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94558, term94558.getClass(), "type", 0);
        term94622 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term94622, term94622.getClass(), "compiler", null);
        setField(term94622, term94622.getClass(), "validator", null);
        setField(term94622, term94622.getClass(), "reverseInterpreter", null);
        setField(term94622, term94622.getClass(), "typeRegistry", null);
        setField(term94622, term94622.getClass(), "topScope", null);
        setField(term94622, term94622.getClass(), "scopeCreator", null);
        setField(term94622, term94622.getClass(), "reportMissingOverride", null);
        setField(term94622, term94622.getClass(), "reportUnknownTypes", null);
        setBooleanField(term94622, term94622.getClass(), "reportMissingProperties", false);
        setField(term94622, term94622.getClass(), "inferJSDocInfo", null);
        setIntField(term94622, term94622.getClass(), "typedCount", 0);
        setIntField(term94622, term94622.getClass(), "nullCount", 0);
        setIntField(term94622, term94622.getClass(), "unknownCount", 0);
        setBooleanField(term94622, term94622.getClass(), "inExterns", false);
        setIntField(term94622, term94622.getClass(), "noTypeCheckSection", 0);
        term94623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94623, term94623.getClass(), "type", 0);
        setField(term94623, term94623.getClass(), "next", null);
        setField(term94623, term94623.getClass(), "first", null);
        setField(term94623, term94623.getClass(), "last", null);
        setField(term94623, term94623.getClass(), "propListHead", null);
        setIntField(term94623, term94623.getClass(), "sourcePosition", 0);
        setField(term94623, term94623.getClass(), "jsType", null);
        setField(term94623, term94623.getClass(), "parent", null);
        term94624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94625 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term94626 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term94627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term94624, term94624.getClass(), "type", 0);
        setField(term94624, term94624.getClass(), "next", null);
        setField(term94624, term94624.getClass(), "first", null);
        setField(term94624, term94624.getClass(), "last", null);
        setField(term94626, term94626.getClass(), "next", null);
        setIntField(term94626, term94626.getClass(), "type", 0);
        setIntField(term94626, term94626.getClass(), "intValue", 0);
        setField(term94626, term94626.getClass(), "objectValue", null);
        setField(term94625, term94625.getClass(), "next", term94626);
        setIntField(term94625, term94625.getClass(), "type", -30);
        setIntField(term94625, term94625.getClass(), "intValue", 0);
        setField(term94625, term94625.getClass(), "objectValue", null);
        setField(term94624, term94624.getClass(), "propListHead", term94625);
        setIntField(term94624, term94624.getClass(), "sourcePosition", 0);
        setField(term94627, term94627.getClass(), "ownerFunction", null);
        setField(term94627, term94627.getClass(), "className", null);
        setField(term94627, term94627.getClass(), "properties", null);
        setBooleanField(term94627, term94627.getClass(), "nativeType", false);
        setField(term94627, term94627.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term94627, term94627.getClass(), "prettyPrint", false);
        setBooleanField(term94627, term94627.getClass(), "visited", false);
        setField(term94627, term94627.getClass(), "docInfo", null);
        setBooleanField(term94627, term94627.getClass(), "unknown", false);
        setBooleanField(term94627, term94627.getClass(), "resolved", false);
        setField(term94627, term94627.getClass(), "resolveResult", null);
        setField(term94627, term94627.getClass(), "registry", null);
        setField(term94624, term94624.getClass(), "jsType", term94627);
        setField(term94624, term94624.getClass(), "parent", null);
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
        args[1] = term94178;
        args[2] = term94558;
        Object retValue = callMethod(klass, "visitName", argTypes, term94108, args);
        assertTrue(recursiveEquals(term94108, term94622));
        assertTrue(recursiveEquals(term94178, term94624));
        assertTrue(recursiveEquals(term94558, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


