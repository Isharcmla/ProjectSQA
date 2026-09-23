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

public class TypeCheck_visitName_1546932345163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43052;
     Object term43255;
     Object term45253;
     Object term45254;
     Object term45256;

    public TypeCheck_visitName_1546932345163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43052 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term43255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term43255, term43255.getClass(), "type", 0);
        setField(term43255, term43255.getClass(), "jsType", term43304);
        term45253 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term45253, term45253.getClass(), "compiler", null);
        setField(term45253, term45253.getClass(), "validator", null);
        setField(term45253, term45253.getClass(), "reverseInterpreter", null);
        setField(term45253, term45253.getClass(), "typeRegistry", null);
        setField(term45253, term45253.getClass(), "topScope", null);
        setField(term45253, term45253.getClass(), "scopeCreator", null);
        setField(term45253, term45253.getClass(), "reportMissingOverride", null);
        setField(term45253, term45253.getClass(), "reportUnknownTypes", null);
        setBooleanField(term45253, term45253.getClass(), "reportMissingProperties", false);
        setField(term45253, term45253.getClass(), "inferJSDocInfo", null);
        setIntField(term45253, term45253.getClass(), "typedCount", 0);
        setIntField(term45253, term45253.getClass(), "nullCount", 0);
        setIntField(term45253, term45253.getClass(), "unknownCount", 0);
        setBooleanField(term45253, term45253.getClass(), "inExterns", false);
        setIntField(term45253, term45253.getClass(), "noTypeCheckSection", 0);
        term45254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term45254, term45254.getClass(), "type", 0);
        setField(term45254, term45254.getClass(), "next", null);
        setField(term45254, term45254.getClass(), "first", null);
        setField(term45254, term45254.getClass(), "last", null);
        setField(term45254, term45254.getClass(), "propListHead", null);
        setIntField(term45254, term45254.getClass(), "sourcePosition", 0);
        setBooleanField(term45255, term45255.getClass(), "isChecked", false);
        setBooleanField(term45255, term45255.getClass(), "visited", false);
        setField(term45255, term45255.getClass(), "docInfo", null);
        setBooleanField(term45255, term45255.getClass(), "unknown", false);
        setBooleanField(term45255, term45255.getClass(), "resolved", false);
        setField(term45255, term45255.getClass(), "resolveResult", null);
        setField(term45255, term45255.getClass(), "registry", null);
        setField(term45254, term45254.getClass(), "jsType", term45255);
        setField(term45254, term45254.getClass(), "parent", null);
        term45256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term45256, term45256.getClass(), "type", 0);
        setField(term45256, term45256.getClass(), "next", null);
        setField(term45256, term45256.getClass(), "first", null);
        setField(term45256, term45256.getClass(), "last", null);
        setField(term45256, term45256.getClass(), "propListHead", null);
        setIntField(term45256, term45256.getClass(), "sourcePosition", 0);
        setBooleanField(term45257, term45257.getClass(), "isChecked", false);
        setBooleanField(term45257, term45257.getClass(), "visited", false);
        setField(term45257, term45257.getClass(), "docInfo", null);
        setBooleanField(term45257, term45257.getClass(), "unknown", false);
        setBooleanField(term45257, term45257.getClass(), "resolved", false);
        setField(term45257, term45257.getClass(), "resolveResult", null);
        setField(term45257, term45257.getClass(), "registry", null);
        setField(term45256, term45256.getClass(), "jsType", term45257);
        setField(term45256, term45256.getClass(), "parent", null);
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
        args[1] = term43255;
        args[2] = term43255;
        Object retValue = callMethod(klass, "visitName", argTypes, term43052, args);
        assertTrue(recursiveEquals(term43052, term45253));
        assertTrue(recursiveEquals(term43255, term45256));
        assertTrue(recursiveEquals(term43255, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


