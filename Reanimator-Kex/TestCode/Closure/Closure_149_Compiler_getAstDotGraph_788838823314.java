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

public class Compiler_getAstDotGraph_788838823314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3022127;
     Object term3026020;

    public Compiler_getAstDotGraph_788838823314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3022127 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term3022197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3022127, term3022127.getClass(), "jsRoot", term3022197);
        term3026020 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term3026021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3026020, term3026020.getClass(), "options", null);
        setField(term3026020, term3026020.getClass(), "passes", null);
        setField(term3026020, term3026020.getClass(), "externs", null);
        setField(term3026020, term3026020.getClass(), "modules", null);
        setField(term3026020, term3026020.getClass(), "moduleGraph", null);
        setField(term3026020, term3026020.getClass(), "inputs", null);
        setField(term3026020, term3026020.getClass(), "errorManager", null);
        setField(term3026020, term3026020.getClass(), "externsRoot", null);
        setIntField(term3026021, term3026021.getClass(), "type", 0);
        setField(term3026021, term3026021.getClass(), "next", null);
        setField(term3026021, term3026021.getClass(), "first", null);
        setField(term3026021, term3026021.getClass(), "last", null);
        setField(term3026021, term3026021.getClass(), "propListHead", null);
        setIntField(term3026021, term3026021.getClass(), "sourcePosition", 0);
        setField(term3026021, term3026021.getClass(), "jsType", null);
        setField(term3026021, term3026021.getClass(), "parent", null);
        setField(term3026020, term3026020.getClass(), "jsRoot", term3026021);
        setField(term3026020, term3026020.getClass(), "externAndJsRoot", null);
        setField(term3026020, term3026020.getClass(), "inputsByName", null);
        setField(term3026020, term3026020.getClass(), "sourceMap", null);
        setField(term3026020, term3026020.getClass(), "externExports", null);
        setIntField(term3026020, term3026020.getClass(), "uniqueNameId", 0);
        setBooleanField(term3026020, term3026020.getClass(), "normalized", false);
        setBooleanField(term3026020, term3026020.getClass(), "useThreads", false);
        setBooleanField(term3026020, term3026020.getClass(), "hasRegExpGlobalReferences", false);
        setField(term3026020, term3026020.getClass(), "functionInformationMap", null);
        setField(term3026020, term3026020.getClass(), "debugLog", null);
        setField(term3026020, term3026020.getClass(), "defaultCodingConvention", null);
        setField(term3026020, term3026020.getClass(), "typeRegistry", null);
        setField(term3026020, term3026020.getClass(), "parserConfig", null);
        setField(term3026020, term3026020.getClass(), "abstractInterpreter", null);
        setField(term3026020, term3026020.getClass(), "typeValidator", null);
        setField(term3026020, term3026020.getClass(), "tracker", null);
        setField(term3026020, term3026020.getClass(), "oldErrorReporter", null);
        setField(term3026020, term3026020.getClass(), "defaultErrorReporter", null);
        setField(term3026020, term3026020.getClass(), "outStream", null);
        setField(term3026020, term3026020.getClass(), "sanityCheck", null);
        setField(term3026020, term3026020.getClass(), "currentTracer", null);
        setField(term3026020, term3026020.getClass(), "currentPassName", null);
        setField(term3026020, term3026020.getClass(), "recentChange", null);
        setField(term3026020, term3026020.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAstDotGraph", argTypes, term3022127, args);
        assertTrue(recursiveEquals(term3022127, term3026020));
        assertTrue(recursiveEquals(retValue, "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"EOF\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n"));
    }

};


