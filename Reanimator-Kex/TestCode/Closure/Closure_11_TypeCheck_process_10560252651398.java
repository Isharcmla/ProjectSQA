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

public class TypeCheck_process_10560252651398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426401;
     Object term426821;
     Object term427111;
     Object term427116;

    public TypeCheck_process_10560252651398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426401 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term426505 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term426579 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term426659 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term426751 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setField(term426401, term426401.getClass(), "scopeCreator", term426505);
        setField(term426579, term426579.getClass(), "parent", null);
        setField(term426401, term426401.getClass(), "topScope", term426579);
        setField(term426401, term426401.getClass(), "compiler", term426659);
        setBooleanField(term426401, term426401.getClass(), "inExterns", false);
        setField(term426401, term426401.getClass(), "inferJSDocInfo", term426751);
        term426821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term426891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term426821, term426821.getClass(), "parent", term426891);
        setIntField(term426821, term426821.getClass(), "type", 120);
        setField(term426821, term426821.getClass(), "first", null);
        term427111 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term427112 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term427113 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term427114 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term427115 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setField(term427112, term427112.getClass(), "options", null);
        setField(term427112, term427112.getClass(), "passes", null);
        setField(term427112, term427112.getClass(), "externs", null);
        setField(term427112, term427112.getClass(), "modules", null);
        setField(term427112, term427112.getClass(), "moduleGraph", null);
        setField(term427112, term427112.getClass(), "inputs", null);
        setField(term427112, term427112.getClass(), "errorManager", null);
        setField(term427112, term427112.getClass(), "warningsGuard", null);
        setField(term427112, term427112.getClass(), "injectedLibraries", null);
        setField(term427112, term427112.getClass(), "externsRoot", null);
        setField(term427112, term427112.getClass(), "jsRoot", null);
        setField(term427112, term427112.getClass(), "externAndJsRoot", null);
        setField(term427112, term427112.getClass(), "inputsById", null);
        setField(term427112, term427112.getClass(), "sourceMap", null);
        setField(term427112, term427112.getClass(), "externExports", null);
        setIntField(term427112, term427112.getClass(), "uniqueNameId", 0);
        setBooleanField(term427112, term427112.getClass(), "hasRegExpGlobalReferences", false);
        setField(term427112, term427112.getClass(), "functionInformationMap", null);
        setField(term427112, term427112.getClass(), "debugLog", null);
        setField(term427112, term427112.getClass(), "defaultCodingConvention", null);
        setField(term427112, term427112.getClass(), "typeRegistry", null);
        setField(term427112, term427112.getClass(), "parserConfig", null);
        setField(term427112, term427112.getClass(), "abstractInterpreter", null);
        setField(term427112, term427112.getClass(), "typeValidator", null);
        setField(term427112, term427112.getClass(), "tracker", null);
        setField(term427112, term427112.getClass(), "oldErrorReporter", null);
        setField(term427112, term427112.getClass(), "defaultErrorReporter", null);
        setField(term427112, term427112.getClass(), "compilerThread", null);
        setBooleanField(term427112, term427112.getClass(), "useThreads", false);
        setField(term427112, term427112.getClass(), "outStream", null);
        setField(term427112, term427112.getClass(), "globalRefMap", null);
        setDoubleField(term427112, term427112.getClass(), "progress", 0.0);
        setField(term427112, term427112.getClass(), "sanityCheck", null);
        setField(term427112, term427112.getClass(), "currentTracer", null);
        setField(term427112, term427112.getClass(), "currentPassName", null);
        setIntField(term427112, term427112.getClass(), "syntheticCodeId", 0);
        setField(term427112, term427112.getClass(), "recentChange", null);
        setField(term427112, term427112.getClass(), "codeChangeHandlers", null);
        setField(term427112, term427112.getClass(), "synthesizedExternsInput", null);
        setField(term427112, term427112.getClass(), "stage", null);
        setField(term427111, term427111.getClass(), "compiler", term427112);
        setField(term427111, term427111.getClass(), "validator", null);
        setField(term427111, term427111.getClass(), "reverseInterpreter", null);
        setField(term427111, term427111.getClass(), "typeRegistry", null);
        setField(term427113, term427113.getClass(), "vars", null);
        setField(term427113, term427113.getClass(), "parent", null);
        setIntField(term427113, term427113.getClass(), "depth", 0);
        setField(term427113, term427113.getClass(), "rootNode", null);
        setField(term427113, term427113.getClass(), "thisType", null);
        setBooleanField(term427113, term427113.getClass(), "isBottom", false);
        setField(term427113, term427113.getClass(), "arguments", null);
        setField(term427111, term427111.getClass(), "topScope", term427113);
        setField(term427114, term427114.getClass(), "scopes", null);
        setField(term427114, term427114.getClass(), "delegate", null);
        setField(term427111, term427111.getClass(), "scopeCreator", term427114);
        setField(term427111, term427111.getClass(), "reportMissingOverride", null);
        setField(term427111, term427111.getClass(), "reportUnknownTypes", null);
        setBooleanField(term427111, term427111.getClass(), "reportMissingProperties", false);
        setField(term427115, term427115.getClass(), "compiler", null);
        setBooleanField(term427115, term427115.getClass(), "inExterns", false);
        setField(term427111, term427111.getClass(), "inferJSDocInfo", term427115);
        setIntField(term427111, term427111.getClass(), "typedCount", 0);
        setIntField(term427111, term427111.getClass(), "nullCount", 0);
        setIntField(term427111, term427111.getClass(), "unknownCount", 0);
        setBooleanField(term427111, term427111.getClass(), "inExterns", false);
        setIntField(term427111, term427111.getClass(), "noTypeCheckSection", 0);
        term427116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term427116, term427116.getClass(), "type", 120);
        setField(term427116, term427116.getClass(), "next", null);
        setField(term427116, term427116.getClass(), "first", null);
        setField(term427116, term427116.getClass(), "last", null);
        setField(term427116, term427116.getClass(), "propListHead", null);
        setIntField(term427116, term427116.getClass(), "sourcePosition", 0);
        setField(term427116, term427116.getClass(), "jsType", null);
        setIntField(term427117, term427117.getClass(), "type", 0);
        setField(term427117, term427117.getClass(), "next", null);
        setField(term427117, term427117.getClass(), "first", null);
        setField(term427117, term427117.getClass(), "last", null);
        setField(term427117, term427117.getClass(), "propListHead", null);
        setIntField(term427117, term427117.getClass(), "sourcePosition", 0);
        setField(term427117, term427117.getClass(), "jsType", null);
        setField(term427117, term427117.getClass(), "parent", null);
        setField(term427116, term427116.getClass(), "parent", term427117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term426821;
        callMethod(klass, "process", argTypes, term426401, args);
        assertTrue(recursiveEquals(term426401, term427111));
        assertTrue(recursiveEquals(term426821, null));
    }

};


