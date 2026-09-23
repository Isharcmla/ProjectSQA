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

public class TypeCheck_process_10560252651301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386033;
     Object term386447;
     Object term386902;
     Object term386907;

    public TypeCheck_process_10560252651301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386033 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term386131 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term386205 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term386285 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term386377 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setField(term386033, term386033.getClass(), "scopeCreator", term386131);
        setField(term386205, term386205.getClass(), "parent", null);
        setField(term386033, term386033.getClass(), "topScope", term386205);
        setField(term386033, term386033.getClass(), "compiler", term386285);
        setBooleanField(term386033, term386033.getClass(), "inExterns", false);
        setField(term386033, term386033.getClass(), "inferJSDocInfo", term386377);
        term386447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term386447, term386447.getClass(), "parent", term386517);
        setIntField(term386447, term386447.getClass(), "type", 110);
        setField(term386447, term386447.getClass(), "first", null);
        term386902 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term386903 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term386904 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term386905 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term386906 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setField(term386903, term386903.getClass(), "options", null);
        setField(term386903, term386903.getClass(), "passes", null);
        setField(term386903, term386903.getClass(), "externs", null);
        setField(term386903, term386903.getClass(), "modules", null);
        setField(term386903, term386903.getClass(), "moduleGraph", null);
        setField(term386903, term386903.getClass(), "inputs", null);
        setField(term386903, term386903.getClass(), "errorManager", null);
        setField(term386903, term386903.getClass(), "warningsGuard", null);
        setField(term386903, term386903.getClass(), "injectedLibraries", null);
        setField(term386903, term386903.getClass(), "externsRoot", null);
        setField(term386903, term386903.getClass(), "jsRoot", null);
        setField(term386903, term386903.getClass(), "externAndJsRoot", null);
        setField(term386903, term386903.getClass(), "inputsById", null);
        setField(term386903, term386903.getClass(), "sourceMap", null);
        setField(term386903, term386903.getClass(), "externExports", null);
        setIntField(term386903, term386903.getClass(), "uniqueNameId", 0);
        setBooleanField(term386903, term386903.getClass(), "hasRegExpGlobalReferences", false);
        setField(term386903, term386903.getClass(), "functionInformationMap", null);
        setField(term386903, term386903.getClass(), "debugLog", null);
        setField(term386903, term386903.getClass(), "defaultCodingConvention", null);
        setField(term386903, term386903.getClass(), "typeRegistry", null);
        setField(term386903, term386903.getClass(), "parserConfig", null);
        setField(term386903, term386903.getClass(), "abstractInterpreter", null);
        setField(term386903, term386903.getClass(), "typeValidator", null);
        setField(term386903, term386903.getClass(), "tracker", null);
        setField(term386903, term386903.getClass(), "oldErrorReporter", null);
        setField(term386903, term386903.getClass(), "defaultErrorReporter", null);
        setField(term386903, term386903.getClass(), "compilerThread", null);
        setBooleanField(term386903, term386903.getClass(), "useThreads", false);
        setField(term386903, term386903.getClass(), "outStream", null);
        setField(term386903, term386903.getClass(), "globalRefMap", null);
        setDoubleField(term386903, term386903.getClass(), "progress", 0.0);
        setField(term386903, term386903.getClass(), "sanityCheck", null);
        setField(term386903, term386903.getClass(), "currentTracer", null);
        setField(term386903, term386903.getClass(), "currentPassName", null);
        setIntField(term386903, term386903.getClass(), "syntheticCodeId", 0);
        setField(term386903, term386903.getClass(), "recentChange", null);
        setField(term386903, term386903.getClass(), "codeChangeHandlers", null);
        setField(term386903, term386903.getClass(), "synthesizedExternsInput", null);
        setField(term386903, term386903.getClass(), "stage", null);
        setField(term386902, term386902.getClass(), "compiler", term386903);
        setField(term386902, term386902.getClass(), "validator", null);
        setField(term386902, term386902.getClass(), "reverseInterpreter", null);
        setField(term386902, term386902.getClass(), "typeRegistry", null);
        setField(term386904, term386904.getClass(), "vars", null);
        setField(term386904, term386904.getClass(), "parent", null);
        setIntField(term386904, term386904.getClass(), "depth", 0);
        setField(term386904, term386904.getClass(), "rootNode", null);
        setField(term386904, term386904.getClass(), "thisType", null);
        setBooleanField(term386904, term386904.getClass(), "isBottom", false);
        setField(term386904, term386904.getClass(), "arguments", null);
        setField(term386902, term386902.getClass(), "topScope", term386904);
        setField(term386905, term386905.getClass(), "compiler", null);
        setField(term386905, term386905.getClass(), "typeParsingErrorReporter", null);
        setField(term386905, term386905.getClass(), "validator", null);
        setField(term386905, term386905.getClass(), "codingConvention", null);
        setField(term386905, term386905.getClass(), "typeRegistry", null);
        setField(term386905, term386905.getClass(), "delegateProxyPrototypes", null);
        setField(term386905, term386905.getClass(), "delegateCallingConventions", null);
        setField(term386905, term386905.getClass(), "functionAnalysisResults", null);
        setField(term386902, term386902.getClass(), "scopeCreator", term386905);
        setField(term386902, term386902.getClass(), "reportMissingOverride", null);
        setField(term386902, term386902.getClass(), "reportUnknownTypes", null);
        setBooleanField(term386902, term386902.getClass(), "reportMissingProperties", false);
        setField(term386906, term386906.getClass(), "compiler", null);
        setBooleanField(term386906, term386906.getClass(), "inExterns", false);
        setField(term386902, term386902.getClass(), "inferJSDocInfo", term386906);
        setIntField(term386902, term386902.getClass(), "typedCount", 0);
        setIntField(term386902, term386902.getClass(), "nullCount", 0);
        setIntField(term386902, term386902.getClass(), "unknownCount", 0);
        setBooleanField(term386902, term386902.getClass(), "inExterns", false);
        setIntField(term386902, term386902.getClass(), "noTypeCheckSection", 0);
        term386907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term386907, term386907.getClass(), "type", 110);
        setField(term386907, term386907.getClass(), "next", null);
        setField(term386907, term386907.getClass(), "first", null);
        setField(term386907, term386907.getClass(), "last", null);
        setField(term386907, term386907.getClass(), "propListHead", null);
        setIntField(term386907, term386907.getClass(), "sourcePosition", 0);
        setField(term386907, term386907.getClass(), "jsType", null);
        setIntField(term386908, term386908.getClass(), "type", 0);
        setField(term386908, term386908.getClass(), "next", null);
        setField(term386908, term386908.getClass(), "first", null);
        setField(term386908, term386908.getClass(), "last", null);
        setField(term386908, term386908.getClass(), "propListHead", null);
        setIntField(term386908, term386908.getClass(), "sourcePosition", 0);
        setField(term386908, term386908.getClass(), "jsType", null);
        setField(term386908, term386908.getClass(), "parent", null);
        setField(term386907, term386907.getClass(), "parent", term386908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term386447;
        callMethod(klass, "process", argTypes, term386033, args);
        assertTrue(recursiveEquals(term386033, term386902));
        assertTrue(recursiveEquals(term386447, null));
    }

};


