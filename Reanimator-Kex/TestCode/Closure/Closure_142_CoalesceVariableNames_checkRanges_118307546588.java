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

public class CoalesceVariableNames_checkRanges_118307546588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33663;
     Object term33829;
     Object term100197;
     Object term100199;

    public CoalesceVariableNames_checkRanges_118307546588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33663 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term33743 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33663, term33663.getClass(), "compiler", term33743);
        term33829 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term33915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term33829, term33829.getClass(), "type", 0);
        setField(term33915, term33915.getClass(), "next", null);
        setIntField(term33915, term33915.getClass(), "type", 0);
        setField(term33915, term33915.getClass(), "parent", term33829);
        setField(term33915, term33915.getClass(), "first", null);
        setField(term33829, term33829.getClass(), "first", term33915);
        term100197 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term100198 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term100198, term100198.getClass(), "options", null);
        setField(term100198, term100198.getClass(), "passes", null);
        setField(term100198, term100198.getClass(), "externs", null);
        setField(term100198, term100198.getClass(), "modules", null);
        setField(term100198, term100198.getClass(), "moduleGraph", null);
        setField(term100198, term100198.getClass(), "inputs", null);
        setField(term100198, term100198.getClass(), "errorManager", null);
        setField(term100198, term100198.getClass(), "symbolTable", null);
        setField(term100198, term100198.getClass(), "externsRoot", null);
        setField(term100198, term100198.getClass(), "jsRoot", null);
        setField(term100198, term100198.getClass(), "externAndJsRoot", null);
        setField(term100198, term100198.getClass(), "inputsByName", null);
        setField(term100198, term100198.getClass(), "sourceMap", null);
        setField(term100198, term100198.getClass(), "externExports", null);
        setIntField(term100198, term100198.getClass(), "uniqueNameId", 0);
        setBooleanField(term100198, term100198.getClass(), "normalized", false);
        setBooleanField(term100198, term100198.getClass(), "useThreads", false);
        setField(term100198, term100198.getClass(), "functionInformationMap", null);
        setField(term100198, term100198.getClass(), "debugLog", null);
        setField(term100198, term100198.getClass(), "defaultCodingConvention", null);
        setField(term100198, term100198.getClass(), "typeRegistry", null);
        setField(term100198, term100198.getClass(), "parserConfig", null);
        setField(term100198, term100198.getClass(), "abstractInterpreter", null);
        setField(term100198, term100198.getClass(), "typeValidator", null);
        setField(term100198, term100198.getClass(), "tracker", null);
        setField(term100198, term100198.getClass(), "oldErrorReporter", null);
        setField(term100198, term100198.getClass(), "defaultErrorReporter", null);
        setField(term100198, term100198.getClass(), "outStream", null);
        setField(term100198, term100198.getClass(), "sanityCheck", null);
        setField(term100198, term100198.getClass(), "currentTracer", null);
        setField(term100198, term100198.getClass(), "currentPassName", null);
        setField(term100198, term100198.getClass(), "recentChange", null);
        setField(term100198, term100198.getClass(), "codeChangeHandlers", null);
        setField(term100197, term100197.getClass(), "compiler", term100198);
        setField(term100197, term100197.getClass(), "colorings", null);
        setBooleanField(term100197, term100197.getClass(), "usePseudoNames", false);
        term100199 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100200 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term100199, term100199.getClass(), "functionName", null);
        setBooleanField(term100199, term100199.getClass(), "itsNeedsActivation", false);
        setIntField(term100199, term100199.getClass(), "itsFunctionType", 0);
        setBooleanField(term100199, term100199.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100199, term100199.getClass(), "encodedSourceStart", 0);
        setIntField(term100199, term100199.getClass(), "encodedSourceEnd", 0);
        setField(term100199, term100199.getClass(), "sourceName", null);
        setIntField(term100199, term100199.getClass(), "baseLineno", 0);
        setIntField(term100199, term100199.getClass(), "endLineno", 0);
        setField(term100199, term100199.getClass(), "functions", null);
        setField(term100199, term100199.getClass(), "regexps", null);
        setField(term100199, term100199.getClass(), "itsVariables", null);
        setField(term100199, term100199.getClass(), "itsConst", null);
        setField(term100199, term100199.getClass(), "itsVariableNames", null);
        setIntField(term100199, term100199.getClass(), "varStart", 0);
        setField(term100199, term100199.getClass(), "compilerData", null);
        setIntField(term100199, term100199.getClass(), "type", 0);
        setField(term100199, term100199.getClass(), "next", null);
        setField(term100200, term100200.getClass(), "functionName", null);
        setBooleanField(term100200, term100200.getClass(), "itsNeedsActivation", false);
        setIntField(term100200, term100200.getClass(), "itsFunctionType", 0);
        setBooleanField(term100200, term100200.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100200, term100200.getClass(), "encodedSourceStart", 0);
        setIntField(term100200, term100200.getClass(), "encodedSourceEnd", 0);
        setField(term100200, term100200.getClass(), "sourceName", null);
        setIntField(term100200, term100200.getClass(), "baseLineno", 0);
        setIntField(term100200, term100200.getClass(), "endLineno", 0);
        setField(term100200, term100200.getClass(), "functions", null);
        setField(term100200, term100200.getClass(), "regexps", null);
        setField(term100200, term100200.getClass(), "itsVariables", null);
        setField(term100200, term100200.getClass(), "itsConst", null);
        setField(term100200, term100200.getClass(), "itsVariableNames", null);
        setIntField(term100200, term100200.getClass(), "varStart", 0);
        setField(term100200, term100200.getClass(), "compilerData", null);
        setIntField(term100200, term100200.getClass(), "type", 0);
        setField(term100200, term100200.getClass(), "next", null);
        setField(term100200, term100200.getClass(), "first", null);
        setField(term100200, term100200.getClass(), "last", null);
        setField(term100200, term100200.getClass(), "propListHead", null);
        setIntField(term100200, term100200.getClass(), "sourcePosition", 0);
        setField(term100200, term100200.getClass(), "jsType", null);
        setField(term100200, term100200.getClass(), "parent", term100199);
        setField(term100199, term100199.getClass(), "first", term100200);
        setField(term100199, term100199.getClass(), "last", null);
        setField(term100199, term100199.getClass(), "propListHead", null);
        setIntField(term100199, term100199.getClass(), "sourcePosition", 0);
        setField(term100199, term100199.getClass(), "jsType", null);
        setField(term100199, term100199.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33829;
        callMethod(klass, "checkRanges", argTypes, term33663, args);
        assertTrue(recursiveEquals(term33663, term100197));
        assertTrue(recursiveEquals(term33829, term100199));
    }

};


