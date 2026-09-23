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

public class ScopedAliases_process_840655313132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71835;
     Object term71985;
     Object term72504;
     Object term72506;

    public ScopedAliases_process_840655313132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71835 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term71915 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71835, term71835.getClass(), "compiler", term71915);
        term71985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72071 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term71985, term71985.getClass(), "type", 0);
        setField(term71985, term71985.getClass(), "parent", null);
        setField(term72071, term72071.getClass(), "next", null);
        setIntField(term72071, term72071.getClass(), "type", 0);
        setField(term72071, term72071.getClass(), "first", null);
        setField(term71985, term71985.getClass(), "first", term72071);
        term72504 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term72505 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term72505, term72505.getClass(), "options", null);
        setField(term72505, term72505.getClass(), "passes", null);
        setField(term72505, term72505.getClass(), "externs", null);
        setField(term72505, term72505.getClass(), "modules", null);
        setField(term72505, term72505.getClass(), "moduleGraph", null);
        setField(term72505, term72505.getClass(), "inputs", null);
        setField(term72505, term72505.getClass(), "errorManager", null);
        setField(term72505, term72505.getClass(), "warningsGuard", null);
        setField(term72505, term72505.getClass(), "externsRoot", null);
        setField(term72505, term72505.getClass(), "jsRoot", null);
        setField(term72505, term72505.getClass(), "externAndJsRoot", null);
        setField(term72505, term72505.getClass(), "inputsById", null);
        setField(term72505, term72505.getClass(), "sourceMap", null);
        setField(term72505, term72505.getClass(), "externExports", null);
        setIntField(term72505, term72505.getClass(), "uniqueNameId", 0);
        setBooleanField(term72505, term72505.getClass(), "useThreads", false);
        setBooleanField(term72505, term72505.getClass(), "hasRegExpGlobalReferences", false);
        setField(term72505, term72505.getClass(), "functionInformationMap", null);
        setField(term72505, term72505.getClass(), "debugLog", null);
        setField(term72505, term72505.getClass(), "defaultCodingConvention", null);
        setField(term72505, term72505.getClass(), "typeRegistry", null);
        setField(term72505, term72505.getClass(), "parserConfig", null);
        setField(term72505, term72505.getClass(), "abstractInterpreter", null);
        setField(term72505, term72505.getClass(), "typeValidator", null);
        setField(term72505, term72505.getClass(), "tracker", null);
        setField(term72505, term72505.getClass(), "oldErrorReporter", null);
        setField(term72505, term72505.getClass(), "defaultErrorReporter", null);
        setField(term72505, term72505.getClass(), "outStream", null);
        setField(term72505, term72505.getClass(), "globalRefMap", null);
        setField(term72505, term72505.getClass(), "sanityCheck", null);
        setField(term72505, term72505.getClass(), "currentTracer", null);
        setField(term72505, term72505.getClass(), "currentPassName", null);
        setIntField(term72505, term72505.getClass(), "syntheticCodeId", 0);
        setField(term72505, term72505.getClass(), "recentChange", null);
        setField(term72505, term72505.getClass(), "codeChangeHandlers", null);
        setField(term72505, term72505.getClass(), "stage", null);
        setField(term72504, term72504.getClass(), "compiler", term72505);
        setField(term72504, term72504.getClass(), "preprocessorSymbolTable", null);
        setField(term72504, term72504.getClass(), "transformationHandler", null);
        term72506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72507 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term72506, term72506.getClass(), "type", 0);
        setField(term72506, term72506.getClass(), "next", null);
        setField(term72507, term72507.getClass(), "functionName", null);
        setBooleanField(term72507, term72507.getClass(), "itsNeedsActivation", false);
        setIntField(term72507, term72507.getClass(), "itsFunctionType", 0);
        setBooleanField(term72507, term72507.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term72507, term72507.getClass(), "encodedSourceStart", 0);
        setIntField(term72507, term72507.getClass(), "encodedSourceEnd", 0);
        setField(term72507, term72507.getClass(), "sourceName", null);
        setIntField(term72507, term72507.getClass(), "baseLineno", 0);
        setIntField(term72507, term72507.getClass(), "endLineno", 0);
        setField(term72507, term72507.getClass(), "functions", null);
        setField(term72507, term72507.getClass(), "regexps", null);
        setField(term72507, term72507.getClass(), "itsVariables", null);
        setField(term72507, term72507.getClass(), "itsConst", null);
        setField(term72507, term72507.getClass(), "itsVariableNames", null);
        setIntField(term72507, term72507.getClass(), "varStart", 0);
        setField(term72507, term72507.getClass(), "compilerData", null);
        setIntField(term72507, term72507.getClass(), "type", 0);
        setField(term72507, term72507.getClass(), "next", null);
        setField(term72507, term72507.getClass(), "first", null);
        setField(term72507, term72507.getClass(), "last", null);
        setField(term72507, term72507.getClass(), "propListHead", null);
        setIntField(term72507, term72507.getClass(), "sourcePosition", 0);
        setField(term72507, term72507.getClass(), "jsType", null);
        setField(term72507, term72507.getClass(), "parent", null);
        setField(term72506, term72506.getClass(), "first", term72507);
        setField(term72506, term72506.getClass(), "last", null);
        setField(term72506, term72506.getClass(), "propListHead", null);
        setIntField(term72506, term72506.getClass(), "sourcePosition", 0);
        setField(term72506, term72506.getClass(), "jsType", null);
        setField(term72506, term72506.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term71985;
        callMethod(klass, "process", argTypes, term71835, args);
        assertTrue(recursiveEquals(term71835, term72504));
        assertTrue(recursiveEquals(term71985, null));
    }

};


