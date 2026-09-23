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

public class TypeCheck_process_10560252651042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293540;
     Object term293882;
     Object term294142;
     Object term294146;

    public TypeCheck_process_10560252651042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293540 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term293646 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term293720 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term293812 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setField(term293540, term293540.getClass(), "scopeCreator", term293646);
        setField(term293720, term293720.getClass(), "parent", null);
        setField(term293540, term293540.getClass(), "topScope", term293720);
        setField(term293540, term293540.getClass(), "compiler", null);
        setBooleanField(term293540, term293540.getClass(), "inExterns", false);
        setField(term293540, term293540.getClass(), "inferJSDocInfo", term293812);
        term293882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term293882, term293882.getClass(), "parent", term293952);
        setIntField(term293882, term293882.getClass(), "type", 77);
        setField(term293882, term293882.getClass(), "first", null);
        term294142 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term294143 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term294144 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term294145 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setField(term294142, term294142.getClass(), "compiler", null);
        setField(term294142, term294142.getClass(), "validator", null);
        setField(term294142, term294142.getClass(), "reverseInterpreter", null);
        setField(term294142, term294142.getClass(), "typeRegistry", null);
        setField(term294143, term294143.getClass(), "vars", null);
        setField(term294143, term294143.getClass(), "parent", null);
        setIntField(term294143, term294143.getClass(), "depth", 0);
        setField(term294143, term294143.getClass(), "rootNode", null);
        setField(term294143, term294143.getClass(), "thisType", null);
        setBooleanField(term294143, term294143.getClass(), "isBottom", false);
        setField(term294143, term294143.getClass(), "arguments", null);
        setField(term294142, term294142.getClass(), "topScope", term294143);
        setField(term294144, term294144.getClass(), "compiler", null);
        setField(term294144, term294144.getClass(), "scope", null);
        setField(term294144, term294144.getClass(), "inputId", null);
        setField(term294144, term294144.getClass(), "redeclarationHandler", null);
        setField(term294142, term294142.getClass(), "scopeCreator", term294144);
        setField(term294142, term294142.getClass(), "reportMissingOverride", null);
        setField(term294142, term294142.getClass(), "reportUnknownTypes", null);
        setBooleanField(term294142, term294142.getClass(), "reportMissingProperties", false);
        setField(term294145, term294145.getClass(), "compiler", null);
        setBooleanField(term294145, term294145.getClass(), "inExterns", false);
        setField(term294142, term294142.getClass(), "inferJSDocInfo", term294145);
        setIntField(term294142, term294142.getClass(), "typedCount", 0);
        setIntField(term294142, term294142.getClass(), "nullCount", 0);
        setIntField(term294142, term294142.getClass(), "unknownCount", 0);
        setBooleanField(term294142, term294142.getClass(), "inExterns", false);
        setIntField(term294142, term294142.getClass(), "noTypeCheckSection", 0);
        term294146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term294146, term294146.getClass(), "type", 77);
        setField(term294146, term294146.getClass(), "next", null);
        setField(term294146, term294146.getClass(), "first", null);
        setField(term294146, term294146.getClass(), "last", null);
        setField(term294146, term294146.getClass(), "propListHead", null);
        setIntField(term294146, term294146.getClass(), "sourcePosition", 0);
        setField(term294146, term294146.getClass(), "jsType", null);
        setIntField(term294147, term294147.getClass(), "type", 0);
        setField(term294147, term294147.getClass(), "next", null);
        setField(term294147, term294147.getClass(), "first", null);
        setField(term294147, term294147.getClass(), "last", null);
        setField(term294147, term294147.getClass(), "propListHead", null);
        setIntField(term294147, term294147.getClass(), "sourcePosition", 0);
        setField(term294147, term294147.getClass(), "jsType", null);
        setField(term294147, term294147.getClass(), "parent", null);
        setField(term294146, term294146.getClass(), "parent", term294147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term293882;
        callMethod(klass, "process", argTypes, term293540, args);
        assertTrue(recursiveEquals(term293540, term294142));
        assertTrue(recursiveEquals(term293882, null));
    }

};


