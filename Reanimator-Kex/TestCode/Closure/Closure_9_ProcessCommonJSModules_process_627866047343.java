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

public class ProcessCommonJSModules_process_627866047343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180257;
     Object term180429;
     Object term181245;
     Object term181247;

    public ProcessCommonJSModules_process_627866047343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180257 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term180337 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term180257, term180257.getClass(), "compiler", term180337);
        term180429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term180683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180775 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term180429, term180429.getClass(), "type", 0);
        setField(term180429, term180429.getClass(), "parent", null);
        setField(term180683, term180683.getClass(), "next", null);
        setIntField(term180683, term180683.getClass(), "type", 37);
        setField(term180683, term180683.getClass(), "first", null);
        setField(term180613, term180613.getClass(), "next", term180683);
        setIntField(term180613, term180613.getClass(), "type", 37);
        setField(term180613, term180613.getClass(), "first", null);
        setField(term180521, term180521.getClass(), "next", term180613);
        setIntField(term180521, term180521.getClass(), "type", 37);
        setField(term180775, term180775.getClass(), "next", null);
        setIntField(term180775, term180775.getClass(), "type", 0);
        setField(term180775, term180775.getClass(), "first", null);
        setField(term180521, term180521.getClass(), "first", term180775);
        setField(term180429, term180429.getClass(), "first", term180521);
        term181245 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term181246 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term181246, term181246.getClass(), "options", null);
        setField(term181246, term181246.getClass(), "passes", null);
        setField(term181246, term181246.getClass(), "externs", null);
        setField(term181246, term181246.getClass(), "modules", null);
        setField(term181246, term181246.getClass(), "moduleGraph", null);
        setField(term181246, term181246.getClass(), "inputs", null);
        setField(term181246, term181246.getClass(), "errorManager", null);
        setField(term181246, term181246.getClass(), "warningsGuard", null);
        setField(term181246, term181246.getClass(), "injectedLibraries", null);
        setField(term181246, term181246.getClass(), "externsRoot", null);
        setField(term181246, term181246.getClass(), "jsRoot", null);
        setField(term181246, term181246.getClass(), "externAndJsRoot", null);
        setField(term181246, term181246.getClass(), "inputsById", null);
        setField(term181246, term181246.getClass(), "sourceMap", null);
        setField(term181246, term181246.getClass(), "externExports", null);
        setIntField(term181246, term181246.getClass(), "uniqueNameId", 0);
        setBooleanField(term181246, term181246.getClass(), "hasRegExpGlobalReferences", false);
        setField(term181246, term181246.getClass(), "functionInformationMap", null);
        setField(term181246, term181246.getClass(), "debugLog", null);
        setField(term181246, term181246.getClass(), "defaultCodingConvention", null);
        setField(term181246, term181246.getClass(), "typeRegistry", null);
        setField(term181246, term181246.getClass(), "parserConfig", null);
        setField(term181246, term181246.getClass(), "abstractInterpreter", null);
        setField(term181246, term181246.getClass(), "typeValidator", null);
        setField(term181246, term181246.getClass(), "tracker", null);
        setField(term181246, term181246.getClass(), "oldErrorReporter", null);
        setField(term181246, term181246.getClass(), "defaultErrorReporter", null);
        setField(term181246, term181246.getClass(), "compilerThread", null);
        setBooleanField(term181246, term181246.getClass(), "useThreads", false);
        setField(term181246, term181246.getClass(), "outStream", null);
        setField(term181246, term181246.getClass(), "globalRefMap", null);
        setDoubleField(term181246, term181246.getClass(), "progress", 0.0);
        setField(term181246, term181246.getClass(), "lastPassName", null);
        setField(term181246, term181246.getClass(), "sanityCheck", null);
        setField(term181246, term181246.getClass(), "currentTracer", null);
        setField(term181246, term181246.getClass(), "currentPassName", null);
        setIntField(term181246, term181246.getClass(), "syntheticCodeId", 0);
        setField(term181246, term181246.getClass(), "recentChange", null);
        setField(term181246, term181246.getClass(), "codeChangeHandlers", null);
        setField(term181246, term181246.getClass(), "synthesizedExternsInput", null);
        setField(term181246, term181246.getClass(), "stage", null);
        setField(term181245, term181245.getClass(), "compiler", term181246);
        setField(term181245, term181245.getClass(), "filenamePrefix", null);
        setBooleanField(term181245, term181245.getClass(), "reportDependencies", false);
        setField(term181245, term181245.getClass(), "module", null);
        term181247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term181247, term181247.getClass(), "number", 0.0);
        setIntField(term181247, term181247.getClass(), "type", 0);
        setField(term181247, term181247.getClass(), "next", null);
        setDoubleField(term181248, term181248.getClass(), "number", 0.0);
        setIntField(term181248, term181248.getClass(), "type", 37);
        setDoubleField(term181249, term181249.getClass(), "number", 0.0);
        setIntField(term181249, term181249.getClass(), "type", 37);
        setIntField(term181250, term181250.getClass(), "type", 37);
        setField(term181250, term181250.getClass(), "next", null);
        setField(term181250, term181250.getClass(), "first", null);
        setField(term181250, term181250.getClass(), "last", null);
        setField(term181250, term181250.getClass(), "propListHead", null);
        setIntField(term181250, term181250.getClass(), "sourcePosition", 0);
        setField(term181250, term181250.getClass(), "jsType", null);
        setField(term181250, term181250.getClass(), "parent", null);
        setField(term181249, term181249.getClass(), "next", term181250);
        setField(term181249, term181249.getClass(), "first", null);
        setField(term181249, term181249.getClass(), "last", null);
        setField(term181249, term181249.getClass(), "propListHead", null);
        setIntField(term181249, term181249.getClass(), "sourcePosition", 0);
        setField(term181249, term181249.getClass(), "jsType", null);
        setField(term181249, term181249.getClass(), "parent", null);
        setField(term181248, term181248.getClass(), "next", term181249);
        setDoubleField(term181251, term181251.getClass(), "number", 0.0);
        setIntField(term181251, term181251.getClass(), "type", 0);
        setField(term181251, term181251.getClass(), "next", null);
        setField(term181251, term181251.getClass(), "first", null);
        setField(term181251, term181251.getClass(), "last", null);
        setField(term181251, term181251.getClass(), "propListHead", null);
        setIntField(term181251, term181251.getClass(), "sourcePosition", 0);
        setField(term181251, term181251.getClass(), "jsType", null);
        setField(term181251, term181251.getClass(), "parent", null);
        setField(term181248, term181248.getClass(), "first", term181251);
        setField(term181248, term181248.getClass(), "last", null);
        setField(term181248, term181248.getClass(), "propListHead", null);
        setIntField(term181248, term181248.getClass(), "sourcePosition", 0);
        setField(term181248, term181248.getClass(), "jsType", null);
        setField(term181248, term181248.getClass(), "parent", null);
        setField(term181247, term181247.getClass(), "first", term181248);
        setField(term181247, term181247.getClass(), "last", null);
        setField(term181247, term181247.getClass(), "propListHead", null);
        setIntField(term181247, term181247.getClass(), "sourcePosition", 0);
        setField(term181247, term181247.getClass(), "jsType", null);
        setField(term181247, term181247.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term180429;
        callMethod(klass, "process", argTypes, term180257, args);
        assertTrue(recursiveEquals(term180257, term181245));
        assertTrue(recursiveEquals(term180429, null));
    }

};


