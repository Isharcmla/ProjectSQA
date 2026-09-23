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

public class ScopedAliases_process_840655313110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57549;
     Object term57699;
     Object term58261;
     Object term58263;

    public ScopedAliases_process_840655313110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57549 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term57629 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term57549, term57549.getClass(), "compiler", term57629);
        term57699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57785 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term57699, term57699.getClass(), "type", 0);
        setField(term57699, term57699.getClass(), "parent", null);
        setField(term57785, term57785.getClass(), "next", null);
        setIntField(term57785, term57785.getClass(), "type", 0);
        setField(term57785, term57785.getClass(), "first", null);
        setField(term57699, term57699.getClass(), "first", term57785);
        term58261 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term58262 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58262, term58262.getClass(), "options", null);
        setField(term58262, term58262.getClass(), "passes", null);
        setField(term58262, term58262.getClass(), "externs", null);
        setField(term58262, term58262.getClass(), "modules", null);
        setField(term58262, term58262.getClass(), "moduleGraph", null);
        setField(term58262, term58262.getClass(), "inputs", null);
        setField(term58262, term58262.getClass(), "errorManager", null);
        setField(term58262, term58262.getClass(), "warningsGuard", null);
        setField(term58262, term58262.getClass(), "externsRoot", null);
        setField(term58262, term58262.getClass(), "jsRoot", null);
        setField(term58262, term58262.getClass(), "externAndJsRoot", null);
        setField(term58262, term58262.getClass(), "inputsById", null);
        setField(term58262, term58262.getClass(), "sourceMap", null);
        setField(term58262, term58262.getClass(), "externExports", null);
        setIntField(term58262, term58262.getClass(), "uniqueNameId", 0);
        setBooleanField(term58262, term58262.getClass(), "useThreads", false);
        setBooleanField(term58262, term58262.getClass(), "hasRegExpGlobalReferences", false);
        setField(term58262, term58262.getClass(), "functionInformationMap", null);
        setField(term58262, term58262.getClass(), "debugLog", null);
        setField(term58262, term58262.getClass(), "defaultCodingConvention", null);
        setField(term58262, term58262.getClass(), "typeRegistry", null);
        setField(term58262, term58262.getClass(), "parserConfig", null);
        setField(term58262, term58262.getClass(), "abstractInterpreter", null);
        setField(term58262, term58262.getClass(), "typeValidator", null);
        setField(term58262, term58262.getClass(), "tracker", null);
        setField(term58262, term58262.getClass(), "oldErrorReporter", null);
        setField(term58262, term58262.getClass(), "defaultErrorReporter", null);
        setField(term58262, term58262.getClass(), "outStream", null);
        setField(term58262, term58262.getClass(), "globalRefMap", null);
        setField(term58262, term58262.getClass(), "sanityCheck", null);
        setField(term58262, term58262.getClass(), "currentTracer", null);
        setField(term58262, term58262.getClass(), "currentPassName", null);
        setIntField(term58262, term58262.getClass(), "syntheticCodeId", 0);
        setField(term58262, term58262.getClass(), "recentChange", null);
        setField(term58262, term58262.getClass(), "codeChangeHandlers", null);
        setField(term58262, term58262.getClass(), "stage", null);
        setField(term58261, term58261.getClass(), "compiler", term58262);
        setField(term58261, term58261.getClass(), "preprocessorSymbolTable", null);
        setField(term58261, term58261.getClass(), "transformationHandler", null);
        term58263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58264 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term58263, term58263.getClass(), "type", 0);
        setField(term58263, term58263.getClass(), "next", null);
        setField(term58264, term58264.getClass(), "functionName", null);
        setBooleanField(term58264, term58264.getClass(), "itsNeedsActivation", false);
        setIntField(term58264, term58264.getClass(), "itsFunctionType", 0);
        setBooleanField(term58264, term58264.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58264, term58264.getClass(), "encodedSourceStart", 0);
        setIntField(term58264, term58264.getClass(), "encodedSourceEnd", 0);
        setField(term58264, term58264.getClass(), "sourceName", null);
        setIntField(term58264, term58264.getClass(), "baseLineno", 0);
        setIntField(term58264, term58264.getClass(), "endLineno", 0);
        setField(term58264, term58264.getClass(), "functions", null);
        setField(term58264, term58264.getClass(), "regexps", null);
        setField(term58264, term58264.getClass(), "itsVariables", null);
        setField(term58264, term58264.getClass(), "itsConst", null);
        setField(term58264, term58264.getClass(), "itsVariableNames", null);
        setIntField(term58264, term58264.getClass(), "varStart", 0);
        setField(term58264, term58264.getClass(), "compilerData", null);
        setIntField(term58264, term58264.getClass(), "type", 0);
        setField(term58264, term58264.getClass(), "next", null);
        setField(term58264, term58264.getClass(), "first", null);
        setField(term58264, term58264.getClass(), "last", null);
        setField(term58264, term58264.getClass(), "propListHead", null);
        setIntField(term58264, term58264.getClass(), "sourcePosition", 0);
        setField(term58264, term58264.getClass(), "jsType", null);
        setField(term58264, term58264.getClass(), "parent", null);
        setField(term58263, term58263.getClass(), "first", term58264);
        setField(term58263, term58263.getClass(), "last", null);
        setField(term58263, term58263.getClass(), "propListHead", null);
        setIntField(term58263, term58263.getClass(), "sourcePosition", 0);
        setField(term58263, term58263.getClass(), "jsType", null);
        setField(term58263, term58263.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term57699;
        callMethod(klass, "process", argTypes, term57549, args);
        assertTrue(recursiveEquals(term57549, term58261));
        assertTrue(recursiveEquals(term57699, null));
    }

};


