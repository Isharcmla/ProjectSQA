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

public class ScopedAliases_hotSwapScript_88341709114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59516;
     Object term59688;
     Object term61038;
     Object term61040;

    public ScopedAliases_hotSwapScript_88341709114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59516 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term59596 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term59516, term59516.getClass(), "compiler", term59596);
        term59688 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59780 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59866 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term59688, term59688.getClass(), "type", 0);
        setField(term59688, term59688.getClass(), "parent", null);
        setField(term59780, term59780.getClass(), "next", null);
        setIntField(term59780, term59780.getClass(), "type", 0);
        setField(term59866, term59866.getClass(), "next", null);
        setIntField(term59866, term59866.getClass(), "type", 0);
        setField(term59866, term59866.getClass(), "first", null);
        setField(term59780, term59780.getClass(), "first", term59866);
        setField(term59688, term59688.getClass(), "first", term59780);
        term61038 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term61039 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term61039, term61039.getClass(), "options", null);
        setField(term61039, term61039.getClass(), "passes", null);
        setField(term61039, term61039.getClass(), "externs", null);
        setField(term61039, term61039.getClass(), "modules", null);
        setField(term61039, term61039.getClass(), "moduleGraph", null);
        setField(term61039, term61039.getClass(), "inputs", null);
        setField(term61039, term61039.getClass(), "errorManager", null);
        setField(term61039, term61039.getClass(), "warningsGuard", null);
        setField(term61039, term61039.getClass(), "externsRoot", null);
        setField(term61039, term61039.getClass(), "jsRoot", null);
        setField(term61039, term61039.getClass(), "externAndJsRoot", null);
        setField(term61039, term61039.getClass(), "inputsById", null);
        setField(term61039, term61039.getClass(), "sourceMap", null);
        setField(term61039, term61039.getClass(), "externExports", null);
        setIntField(term61039, term61039.getClass(), "uniqueNameId", 0);
        setBooleanField(term61039, term61039.getClass(), "useThreads", false);
        setBooleanField(term61039, term61039.getClass(), "hasRegExpGlobalReferences", false);
        setField(term61039, term61039.getClass(), "functionInformationMap", null);
        setField(term61039, term61039.getClass(), "debugLog", null);
        setField(term61039, term61039.getClass(), "defaultCodingConvention", null);
        setField(term61039, term61039.getClass(), "typeRegistry", null);
        setField(term61039, term61039.getClass(), "parserConfig", null);
        setField(term61039, term61039.getClass(), "abstractInterpreter", null);
        setField(term61039, term61039.getClass(), "typeValidator", null);
        setField(term61039, term61039.getClass(), "tracker", null);
        setField(term61039, term61039.getClass(), "oldErrorReporter", null);
        setField(term61039, term61039.getClass(), "defaultErrorReporter", null);
        setField(term61039, term61039.getClass(), "outStream", null);
        setField(term61039, term61039.getClass(), "globalRefMap", null);
        setField(term61039, term61039.getClass(), "sanityCheck", null);
        setField(term61039, term61039.getClass(), "currentTracer", null);
        setField(term61039, term61039.getClass(), "currentPassName", null);
        setIntField(term61039, term61039.getClass(), "syntheticCodeId", 0);
        setField(term61039, term61039.getClass(), "recentChange", null);
        setField(term61039, term61039.getClass(), "codeChangeHandlers", null);
        setField(term61039, term61039.getClass(), "stage", null);
        setField(term61038, term61038.getClass(), "compiler", term61039);
        setField(term61038, term61038.getClass(), "preprocessorSymbolTable", null);
        setField(term61038, term61038.getClass(), "transformationHandler", null);
        term61040 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61041 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61042 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term61040, term61040.getClass(), "number", 0.0);
        setIntField(term61040, term61040.getClass(), "type", 0);
        setField(term61040, term61040.getClass(), "next", null);
        setDoubleField(term61041, term61041.getClass(), "number", 0.0);
        setIntField(term61041, term61041.getClass(), "type", 0);
        setField(term61041, term61041.getClass(), "next", null);
        setField(term61042, term61042.getClass(), "functionName", null);
        setBooleanField(term61042, term61042.getClass(), "itsNeedsActivation", false);
        setIntField(term61042, term61042.getClass(), "itsFunctionType", 0);
        setBooleanField(term61042, term61042.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61042, term61042.getClass(), "encodedSourceStart", 0);
        setIntField(term61042, term61042.getClass(), "encodedSourceEnd", 0);
        setField(term61042, term61042.getClass(), "sourceName", null);
        setIntField(term61042, term61042.getClass(), "baseLineno", 0);
        setIntField(term61042, term61042.getClass(), "endLineno", 0);
        setField(term61042, term61042.getClass(), "functions", null);
        setField(term61042, term61042.getClass(), "regexps", null);
        setField(term61042, term61042.getClass(), "itsVariables", null);
        setField(term61042, term61042.getClass(), "itsConst", null);
        setField(term61042, term61042.getClass(), "itsVariableNames", null);
        setIntField(term61042, term61042.getClass(), "varStart", 0);
        setField(term61042, term61042.getClass(), "compilerData", null);
        setIntField(term61042, term61042.getClass(), "type", 0);
        setField(term61042, term61042.getClass(), "next", null);
        setField(term61042, term61042.getClass(), "first", null);
        setField(term61042, term61042.getClass(), "last", null);
        setField(term61042, term61042.getClass(), "propListHead", null);
        setIntField(term61042, term61042.getClass(), "sourcePosition", 0);
        setField(term61042, term61042.getClass(), "jsType", null);
        setField(term61042, term61042.getClass(), "parent", null);
        setField(term61041, term61041.getClass(), "first", term61042);
        setField(term61041, term61041.getClass(), "last", null);
        setField(term61041, term61041.getClass(), "propListHead", null);
        setIntField(term61041, term61041.getClass(), "sourcePosition", 0);
        setField(term61041, term61041.getClass(), "jsType", null);
        setField(term61041, term61041.getClass(), "parent", null);
        setField(term61040, term61040.getClass(), "first", term61041);
        setField(term61040, term61040.getClass(), "last", null);
        setField(term61040, term61040.getClass(), "propListHead", null);
        setIntField(term61040, term61040.getClass(), "sourcePosition", 0);
        setField(term61040, term61040.getClass(), "jsType", null);
        setField(term61040, term61040.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term59688;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term59516, args);
        assertTrue(recursiveEquals(term59516, term61038));
        assertTrue(recursiveEquals(term59688, term61040));
    }

};


