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

public class ScopedAliases_process_840655313170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96048;
     Object term96214;
     Object term96714;
     Object term96716;

    public ScopedAliases_process_840655313170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96048 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term96128 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term96048, term96048.getClass(), "compiler", term96128);
        term96214 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96300 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term96214, term96214.getClass(), "type", 0);
        setIntField(term96300, term96300.getClass(), "type", 0);
        setField(term96300, term96300.getClass(), "parent", null);
        setField(term96214, term96214.getClass(), "parent", term96300);
        setField(term96214, term96214.getClass(), "first", null);
        term96714 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term96715 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term96715, term96715.getClass(), "options", null);
        setField(term96715, term96715.getClass(), "passes", null);
        setField(term96715, term96715.getClass(), "externs", null);
        setField(term96715, term96715.getClass(), "modules", null);
        setField(term96715, term96715.getClass(), "moduleGraph", null);
        setField(term96715, term96715.getClass(), "inputs", null);
        setField(term96715, term96715.getClass(), "errorManager", null);
        setField(term96715, term96715.getClass(), "warningsGuard", null);
        setField(term96715, term96715.getClass(), "externsRoot", null);
        setField(term96715, term96715.getClass(), "jsRoot", null);
        setField(term96715, term96715.getClass(), "externAndJsRoot", null);
        setField(term96715, term96715.getClass(), "inputsById", null);
        setField(term96715, term96715.getClass(), "sourceMap", null);
        setField(term96715, term96715.getClass(), "externExports", null);
        setIntField(term96715, term96715.getClass(), "uniqueNameId", 0);
        setBooleanField(term96715, term96715.getClass(), "useThreads", false);
        setBooleanField(term96715, term96715.getClass(), "hasRegExpGlobalReferences", false);
        setField(term96715, term96715.getClass(), "functionInformationMap", null);
        setField(term96715, term96715.getClass(), "debugLog", null);
        setField(term96715, term96715.getClass(), "defaultCodingConvention", null);
        setField(term96715, term96715.getClass(), "typeRegistry", null);
        setField(term96715, term96715.getClass(), "parserConfig", null);
        setField(term96715, term96715.getClass(), "abstractInterpreter", null);
        setField(term96715, term96715.getClass(), "typeValidator", null);
        setField(term96715, term96715.getClass(), "tracker", null);
        setField(term96715, term96715.getClass(), "oldErrorReporter", null);
        setField(term96715, term96715.getClass(), "defaultErrorReporter", null);
        setField(term96715, term96715.getClass(), "outStream", null);
        setField(term96715, term96715.getClass(), "globalRefMap", null);
        setField(term96715, term96715.getClass(), "sanityCheck", null);
        setField(term96715, term96715.getClass(), "currentTracer", null);
        setField(term96715, term96715.getClass(), "currentPassName", null);
        setIntField(term96715, term96715.getClass(), "syntheticCodeId", 0);
        setField(term96715, term96715.getClass(), "recentChange", null);
        setField(term96715, term96715.getClass(), "codeChangeHandlers", null);
        setField(term96715, term96715.getClass(), "stage", null);
        setField(term96714, term96714.getClass(), "compiler", term96715);
        setField(term96714, term96714.getClass(), "preprocessorSymbolTable", null);
        setField(term96714, term96714.getClass(), "transformationHandler", null);
        term96716 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96717 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term96716, term96716.getClass(), "functionName", null);
        setBooleanField(term96716, term96716.getClass(), "itsNeedsActivation", false);
        setIntField(term96716, term96716.getClass(), "itsFunctionType", 0);
        setBooleanField(term96716, term96716.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96716, term96716.getClass(), "encodedSourceStart", 0);
        setIntField(term96716, term96716.getClass(), "encodedSourceEnd", 0);
        setField(term96716, term96716.getClass(), "sourceName", null);
        setIntField(term96716, term96716.getClass(), "baseLineno", 0);
        setIntField(term96716, term96716.getClass(), "endLineno", 0);
        setField(term96716, term96716.getClass(), "functions", null);
        setField(term96716, term96716.getClass(), "regexps", null);
        setField(term96716, term96716.getClass(), "itsVariables", null);
        setField(term96716, term96716.getClass(), "itsConst", null);
        setField(term96716, term96716.getClass(), "itsVariableNames", null);
        setIntField(term96716, term96716.getClass(), "varStart", 0);
        setField(term96716, term96716.getClass(), "compilerData", null);
        setIntField(term96716, term96716.getClass(), "type", 0);
        setField(term96716, term96716.getClass(), "next", null);
        setField(term96716, term96716.getClass(), "first", null);
        setField(term96716, term96716.getClass(), "last", null);
        setField(term96716, term96716.getClass(), "propListHead", null);
        setIntField(term96716, term96716.getClass(), "sourcePosition", 0);
        setField(term96716, term96716.getClass(), "jsType", null);
        setField(term96717, term96717.getClass(), "functionName", null);
        setBooleanField(term96717, term96717.getClass(), "itsNeedsActivation", false);
        setIntField(term96717, term96717.getClass(), "itsFunctionType", 0);
        setBooleanField(term96717, term96717.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96717, term96717.getClass(), "encodedSourceStart", 0);
        setIntField(term96717, term96717.getClass(), "encodedSourceEnd", 0);
        setField(term96717, term96717.getClass(), "sourceName", null);
        setIntField(term96717, term96717.getClass(), "baseLineno", 0);
        setIntField(term96717, term96717.getClass(), "endLineno", 0);
        setField(term96717, term96717.getClass(), "functions", null);
        setField(term96717, term96717.getClass(), "regexps", null);
        setField(term96717, term96717.getClass(), "itsVariables", null);
        setField(term96717, term96717.getClass(), "itsConst", null);
        setField(term96717, term96717.getClass(), "itsVariableNames", null);
        setIntField(term96717, term96717.getClass(), "varStart", 0);
        setField(term96717, term96717.getClass(), "compilerData", null);
        setIntField(term96717, term96717.getClass(), "type", 0);
        setField(term96717, term96717.getClass(), "next", null);
        setField(term96717, term96717.getClass(), "first", null);
        setField(term96717, term96717.getClass(), "last", null);
        setField(term96717, term96717.getClass(), "propListHead", null);
        setIntField(term96717, term96717.getClass(), "sourcePosition", 0);
        setField(term96717, term96717.getClass(), "jsType", null);
        setField(term96717, term96717.getClass(), "parent", null);
        setField(term96716, term96716.getClass(), "parent", term96717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term96214;
        callMethod(klass, "process", argTypes, term96048, args);
        assertTrue(recursiveEquals(term96048, term96714));
        assertTrue(recursiveEquals(term96214, null));
    }

};


