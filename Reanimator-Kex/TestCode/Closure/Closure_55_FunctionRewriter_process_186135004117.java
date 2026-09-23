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
import java.util.HashMap;

public class FunctionRewriter_process_186135004117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59713;
     Object term59879;
     Object term61162;
     Object term61164;
     Object term61165;

    public FunctionRewriter_process_186135004117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59713 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionRewriter"));
        Object term59793 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term59713, term59713.getClass(), "compiler", term59793);
        term59879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term61162 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionRewriter"));
        Object term61163 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term61163, term61163.getClass(), "options", null);
        setField(term61163, term61163.getClass(), "passes", null);
        setField(term61163, term61163.getClass(), "externs", null);
        setField(term61163, term61163.getClass(), "modules", null);
        setField(term61163, term61163.getClass(), "moduleGraph", null);
        setField(term61163, term61163.getClass(), "inputs", null);
        setField(term61163, term61163.getClass(), "errorManager", null);
        setField(term61163, term61163.getClass(), "warningsGuard", null);
        setField(term61163, term61163.getClass(), "externsRoot", null);
        setField(term61163, term61163.getClass(), "jsRoot", null);
        setField(term61163, term61163.getClass(), "externAndJsRoot", null);
        setField(term61163, term61163.getClass(), "inputsById", null);
        setField(term61163, term61163.getClass(), "sourceMap", null);
        setField(term61163, term61163.getClass(), "externExports", null);
        setIntField(term61163, term61163.getClass(), "uniqueNameId", 0);
        setBooleanField(term61163, term61163.getClass(), "useThreads", false);
        setBooleanField(term61163, term61163.getClass(), "hasRegExpGlobalReferences", false);
        setField(term61163, term61163.getClass(), "functionInformationMap", null);
        setField(term61163, term61163.getClass(), "debugLog", null);
        setField(term61163, term61163.getClass(), "defaultCodingConvention", null);
        setField(term61163, term61163.getClass(), "typeRegistry", null);
        setField(term61163, term61163.getClass(), "parserConfig", null);
        setField(term61163, term61163.getClass(), "abstractInterpreter", null);
        setField(term61163, term61163.getClass(), "typeValidator", null);
        setField(term61163, term61163.getClass(), "tracker", null);
        setField(term61163, term61163.getClass(), "oldErrorReporter", null);
        setField(term61163, term61163.getClass(), "defaultErrorReporter", null);
        setField(term61163, term61163.getClass(), "outStream", null);
        setField(term61163, term61163.getClass(), "globalRefMap", null);
        setField(term61163, term61163.getClass(), "sanityCheck", null);
        setField(term61163, term61163.getClass(), "currentTracer", null);
        setField(term61163, term61163.getClass(), "currentPassName", null);
        setIntField(term61163, term61163.getClass(), "syntheticCodeId", 0);
        setField(term61163, term61163.getClass(), "recentChange", null);
        setField(term61163, term61163.getClass(), "codeChangeHandlers", null);
        setField(term61163, term61163.getClass(), "stage", null);
        setField(term61162, term61162.getClass(), "compiler", term61163);
        term61164 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term61164, term61164.getClass(), "functionName", null);
        setBooleanField(term61164, term61164.getClass(), "itsNeedsActivation", false);
        setIntField(term61164, term61164.getClass(), "itsFunctionType", 0);
        setBooleanField(term61164, term61164.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61164, term61164.getClass(), "encodedSourceStart", 0);
        setIntField(term61164, term61164.getClass(), "encodedSourceEnd", 0);
        setField(term61164, term61164.getClass(), "sourceName", null);
        setIntField(term61164, term61164.getClass(), "baseLineno", 0);
        setIntField(term61164, term61164.getClass(), "endLineno", 0);
        setField(term61164, term61164.getClass(), "functions", null);
        setField(term61164, term61164.getClass(), "regexps", null);
        setField(term61164, term61164.getClass(), "itsVariables", null);
        setField(term61164, term61164.getClass(), "itsConst", null);
        setField(term61164, term61164.getClass(), "itsVariableNames", null);
        setIntField(term61164, term61164.getClass(), "varStart", 0);
        setField(term61164, term61164.getClass(), "compilerData", null);
        setIntField(term61164, term61164.getClass(), "type", 0);
        setField(term61164, term61164.getClass(), "next", null);
        setField(term61164, term61164.getClass(), "first", null);
        setField(term61164, term61164.getClass(), "last", null);
        setField(term61164, term61164.getClass(), "propListHead", null);
        setIntField(term61164, term61164.getClass(), "sourcePosition", 0);
        setField(term61164, term61164.getClass(), "jsType", null);
        setField(term61164, term61164.getClass(), "parent", null);
        HashMap term61166 = new HashMap();
        term61165 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term61165, term61165.getClass(), "expectedValuesPerKey", 8);
        setField(term61165, term61165.getClass(), "map", term61166);
        setIntField(term61165, term61165.getClass(), "totalSize", 0);
        setField(term61165, term61165.getClass(), "keySet", null);
        setField(term61165, term61165.getClass(), "multiset", null);
        setField(term61165, term61165.getClass(), "valuesCollection", null);
        setField(term61165, term61165.getClass(), "entries", null);
        setField(term61165, term61165.getClass(), "asMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term59879;
        callMethod(klass, "process", argTypes, term59713, args);
        assertTrue(recursiveEquals(term59713, term61162));
        assertTrue(recursiveEquals(term59879, term61165));
    }

};


