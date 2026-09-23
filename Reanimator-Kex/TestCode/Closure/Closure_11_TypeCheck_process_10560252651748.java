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

public class TypeCheck_process_10560252651748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569805;
     Object term570225;
     Object term570515;
     Object term570520;

    public TypeCheck_process_10560252651748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term569805 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term569909 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term569983 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term570063 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term570155 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setField(term569805, term569805.getClass(), "scopeCreator", term569909);
        setField(term569983, term569983.getClass(), "parent", null);
        setField(term569805, term569805.getClass(), "topScope", term569983);
        setField(term569805, term569805.getClass(), "compiler", term570063);
        setBooleanField(term569805, term569805.getClass(), "inExterns", false);
        setField(term569805, term569805.getClass(), "inferJSDocInfo", term570155);
        term570225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term570295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term570225, term570225.getClass(), "parent", term570295);
        setIntField(term570225, term570225.getClass(), "type", 49);
        setField(term570225, term570225.getClass(), "first", null);
        term570515 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term570516 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term570517 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term570518 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term570519 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setField(term570516, term570516.getClass(), "options", null);
        setField(term570516, term570516.getClass(), "passes", null);
        setField(term570516, term570516.getClass(), "externs", null);
        setField(term570516, term570516.getClass(), "modules", null);
        setField(term570516, term570516.getClass(), "moduleGraph", null);
        setField(term570516, term570516.getClass(), "inputs", null);
        setField(term570516, term570516.getClass(), "errorManager", null);
        setField(term570516, term570516.getClass(), "warningsGuard", null);
        setField(term570516, term570516.getClass(), "injectedLibraries", null);
        setField(term570516, term570516.getClass(), "externsRoot", null);
        setField(term570516, term570516.getClass(), "jsRoot", null);
        setField(term570516, term570516.getClass(), "externAndJsRoot", null);
        setField(term570516, term570516.getClass(), "inputsById", null);
        setField(term570516, term570516.getClass(), "sourceMap", null);
        setField(term570516, term570516.getClass(), "externExports", null);
        setIntField(term570516, term570516.getClass(), "uniqueNameId", 0);
        setBooleanField(term570516, term570516.getClass(), "hasRegExpGlobalReferences", false);
        setField(term570516, term570516.getClass(), "functionInformationMap", null);
        setField(term570516, term570516.getClass(), "debugLog", null);
        setField(term570516, term570516.getClass(), "defaultCodingConvention", null);
        setField(term570516, term570516.getClass(), "typeRegistry", null);
        setField(term570516, term570516.getClass(), "parserConfig", null);
        setField(term570516, term570516.getClass(), "abstractInterpreter", null);
        setField(term570516, term570516.getClass(), "typeValidator", null);
        setField(term570516, term570516.getClass(), "tracker", null);
        setField(term570516, term570516.getClass(), "oldErrorReporter", null);
        setField(term570516, term570516.getClass(), "defaultErrorReporter", null);
        setField(term570516, term570516.getClass(), "compilerThread", null);
        setBooleanField(term570516, term570516.getClass(), "useThreads", false);
        setField(term570516, term570516.getClass(), "outStream", null);
        setField(term570516, term570516.getClass(), "globalRefMap", null);
        setDoubleField(term570516, term570516.getClass(), "progress", 0.0);
        setField(term570516, term570516.getClass(), "sanityCheck", null);
        setField(term570516, term570516.getClass(), "currentTracer", null);
        setField(term570516, term570516.getClass(), "currentPassName", null);
        setIntField(term570516, term570516.getClass(), "syntheticCodeId", 0);
        setField(term570516, term570516.getClass(), "recentChange", null);
        setField(term570516, term570516.getClass(), "codeChangeHandlers", null);
        setField(term570516, term570516.getClass(), "synthesizedExternsInput", null);
        setField(term570516, term570516.getClass(), "stage", null);
        setField(term570515, term570515.getClass(), "compiler", term570516);
        setField(term570515, term570515.getClass(), "validator", null);
        setField(term570515, term570515.getClass(), "reverseInterpreter", null);
        setField(term570515, term570515.getClass(), "typeRegistry", null);
        setField(term570517, term570517.getClass(), "vars", null);
        setField(term570517, term570517.getClass(), "parent", null);
        setIntField(term570517, term570517.getClass(), "depth", 0);
        setField(term570517, term570517.getClass(), "rootNode", null);
        setField(term570517, term570517.getClass(), "thisType", null);
        setBooleanField(term570517, term570517.getClass(), "isBottom", false);
        setField(term570517, term570517.getClass(), "arguments", null);
        setField(term570515, term570515.getClass(), "topScope", term570517);
        setField(term570518, term570518.getClass(), "scopes", null);
        setField(term570518, term570518.getClass(), "delegate", null);
        setField(term570515, term570515.getClass(), "scopeCreator", term570518);
        setField(term570515, term570515.getClass(), "reportMissingOverride", null);
        setField(term570515, term570515.getClass(), "reportUnknownTypes", null);
        setBooleanField(term570515, term570515.getClass(), "reportMissingProperties", false);
        setField(term570519, term570519.getClass(), "compiler", null);
        setBooleanField(term570519, term570519.getClass(), "inExterns", false);
        setField(term570515, term570515.getClass(), "inferJSDocInfo", term570519);
        setIntField(term570515, term570515.getClass(), "typedCount", 0);
        setIntField(term570515, term570515.getClass(), "nullCount", 0);
        setIntField(term570515, term570515.getClass(), "unknownCount", 0);
        setBooleanField(term570515, term570515.getClass(), "inExterns", false);
        setIntField(term570515, term570515.getClass(), "noTypeCheckSection", 0);
        term570520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term570521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term570520, term570520.getClass(), "type", 49);
        setField(term570520, term570520.getClass(), "next", null);
        setField(term570520, term570520.getClass(), "first", null);
        setField(term570520, term570520.getClass(), "last", null);
        setField(term570520, term570520.getClass(), "propListHead", null);
        setIntField(term570520, term570520.getClass(), "sourcePosition", 0);
        setField(term570520, term570520.getClass(), "jsType", null);
        setIntField(term570521, term570521.getClass(), "type", 0);
        setField(term570521, term570521.getClass(), "next", null);
        setField(term570521, term570521.getClass(), "first", null);
        setField(term570521, term570521.getClass(), "last", null);
        setField(term570521, term570521.getClass(), "propListHead", null);
        setIntField(term570521, term570521.getClass(), "sourcePosition", 0);
        setField(term570521, term570521.getClass(), "jsType", null);
        setField(term570521, term570521.getClass(), "parent", null);
        setField(term570520, term570520.getClass(), "parent", term570521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term570225;
        callMethod(klass, "process", argTypes, term569805, args);
        assertTrue(recursiveEquals(term569805, term570515));
        assertTrue(recursiveEquals(term570225, null));
    }

};


