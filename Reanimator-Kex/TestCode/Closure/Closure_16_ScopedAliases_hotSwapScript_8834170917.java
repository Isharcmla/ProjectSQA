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

public class ScopedAliases_hotSwapScript_8834170917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10455;
     Object term10605;
     Object term11511;
     Object term11513;

    public ScopedAliases_hotSwapScript_8834170917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10455 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term10535 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10455, term10455.getClass(), "compiler", term10535);
        term10605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10605, term10605.getClass(), "type", 0);
        setField(term10605, term10605.getClass(), "parent", null);
        setField(term10745, term10745.getClass(), "next", null);
        setIntField(term10745, term10745.getClass(), "type", 0);
        setField(term10745, term10745.getClass(), "first", null);
        setField(term10675, term10675.getClass(), "next", term10745);
        setIntField(term10675, term10675.getClass(), "type", 0);
        setField(term10815, term10815.getClass(), "next", null);
        setIntField(term10815, term10815.getClass(), "type", 0);
        setField(term10815, term10815.getClass(), "first", null);
        setField(term10675, term10675.getClass(), "first", term10815);
        setField(term10605, term10605.getClass(), "first", term10675);
        term11511 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term11512 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11512, term11512.getClass(), "options", null);
        setField(term11512, term11512.getClass(), "passes", null);
        setField(term11512, term11512.getClass(), "externs", null);
        setField(term11512, term11512.getClass(), "modules", null);
        setField(term11512, term11512.getClass(), "moduleGraph", null);
        setField(term11512, term11512.getClass(), "inputs", null);
        setField(term11512, term11512.getClass(), "errorManager", null);
        setField(term11512, term11512.getClass(), "warningsGuard", null);
        setField(term11512, term11512.getClass(), "injectedLibraries", null);
        setField(term11512, term11512.getClass(), "externsRoot", null);
        setField(term11512, term11512.getClass(), "jsRoot", null);
        setField(term11512, term11512.getClass(), "externAndJsRoot", null);
        setField(term11512, term11512.getClass(), "inputsById", null);
        setField(term11512, term11512.getClass(), "sourceMap", null);
        setField(term11512, term11512.getClass(), "externExports", null);
        setIntField(term11512, term11512.getClass(), "uniqueNameId", 0);
        setBooleanField(term11512, term11512.getClass(), "useThreads", false);
        setBooleanField(term11512, term11512.getClass(), "hasRegExpGlobalReferences", false);
        setField(term11512, term11512.getClass(), "functionInformationMap", null);
        setField(term11512, term11512.getClass(), "debugLog", null);
        setField(term11512, term11512.getClass(), "defaultCodingConvention", null);
        setField(term11512, term11512.getClass(), "typeRegistry", null);
        setField(term11512, term11512.getClass(), "parserConfig", null);
        setField(term11512, term11512.getClass(), "abstractInterpreter", null);
        setField(term11512, term11512.getClass(), "typeValidator", null);
        setField(term11512, term11512.getClass(), "tracker", null);
        setField(term11512, term11512.getClass(), "oldErrorReporter", null);
        setField(term11512, term11512.getClass(), "defaultErrorReporter", null);
        setField(term11512, term11512.getClass(), "outStream", null);
        setField(term11512, term11512.getClass(), "globalRefMap", null);
        setDoubleField(term11512, term11512.getClass(), "progress", 0.0);
        setField(term11512, term11512.getClass(), "sanityCheck", null);
        setField(term11512, term11512.getClass(), "currentTracer", null);
        setField(term11512, term11512.getClass(), "currentPassName", null);
        setIntField(term11512, term11512.getClass(), "syntheticCodeId", 0);
        setField(term11512, term11512.getClass(), "recentChange", null);
        setField(term11512, term11512.getClass(), "codeChangeHandlers", null);
        setField(term11512, term11512.getClass(), "synthesizedExternsInput", null);
        setField(term11512, term11512.getClass(), "stage", null);
        setField(term11511, term11511.getClass(), "compiler", term11512);
        setField(term11511, term11511.getClass(), "preprocessorSymbolTable", null);
        setField(term11511, term11511.getClass(), "transformationHandler", null);
        term11513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11513, term11513.getClass(), "type", 0);
        setField(term11513, term11513.getClass(), "next", null);
        setIntField(term11514, term11514.getClass(), "type", 0);
        setIntField(term11515, term11515.getClass(), "type", 0);
        setField(term11515, term11515.getClass(), "next", null);
        setField(term11515, term11515.getClass(), "first", null);
        setField(term11515, term11515.getClass(), "last", null);
        setField(term11515, term11515.getClass(), "propListHead", null);
        setIntField(term11515, term11515.getClass(), "sourcePosition", 0);
        setField(term11515, term11515.getClass(), "jsType", null);
        setField(term11515, term11515.getClass(), "parent", null);
        setField(term11514, term11514.getClass(), "next", term11515);
        setIntField(term11516, term11516.getClass(), "type", 0);
        setField(term11516, term11516.getClass(), "next", null);
        setField(term11516, term11516.getClass(), "first", null);
        setField(term11516, term11516.getClass(), "last", null);
        setField(term11516, term11516.getClass(), "propListHead", null);
        setIntField(term11516, term11516.getClass(), "sourcePosition", 0);
        setField(term11516, term11516.getClass(), "jsType", null);
        setField(term11516, term11516.getClass(), "parent", null);
        setField(term11514, term11514.getClass(), "first", term11516);
        setField(term11514, term11514.getClass(), "last", null);
        setField(term11514, term11514.getClass(), "propListHead", null);
        setIntField(term11514, term11514.getClass(), "sourcePosition", 0);
        setField(term11514, term11514.getClass(), "jsType", null);
        setField(term11514, term11514.getClass(), "parent", null);
        setField(term11513, term11513.getClass(), "first", term11514);
        setField(term11513, term11513.getClass(), "last", null);
        setField(term11513, term11513.getClass(), "propListHead", null);
        setIntField(term11513, term11513.getClass(), "sourcePosition", 0);
        setField(term11513, term11513.getClass(), "jsType", null);
        setField(term11513, term11513.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10605;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term10455, args);
        assertTrue(recursiveEquals(term10455, term11511));
        assertTrue(recursiveEquals(term10605, term11513));
    }

};


