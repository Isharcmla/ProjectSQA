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

public class ProcessCommonJSModules_process_627866047231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118509;
     Object term118681;
     Object term119246;
     Object term119248;

    public ProcessCommonJSModules_process_627866047231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118509 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term118589 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term118509, term118509.getClass(), "compiler", term118589);
        term118681 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118865 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term118681, term118681.getClass(), "type", 0);
        setField(term118681, term118681.getClass(), "parent", null);
        setField(term118865, term118865.getClass(), "next", term118935);
        setIntField(term118865, term118865.getClass(), "type", 37);
        setField(term118865, term118865.getClass(), "first", null);
        setField(term118773, term118773.getClass(), "next", term118865);
        setIntField(term118773, term118773.getClass(), "type", 37);
        setField(term118773, term118773.getClass(), "first", null);
        setField(term118681, term118681.getClass(), "first", term118773);
        term119246 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term119247 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term119247, term119247.getClass(), "options", null);
        setField(term119247, term119247.getClass(), "passes", null);
        setField(term119247, term119247.getClass(), "externs", null);
        setField(term119247, term119247.getClass(), "modules", null);
        setField(term119247, term119247.getClass(), "moduleGraph", null);
        setField(term119247, term119247.getClass(), "inputs", null);
        setField(term119247, term119247.getClass(), "errorManager", null);
        setField(term119247, term119247.getClass(), "warningsGuard", null);
        setField(term119247, term119247.getClass(), "injectedLibraries", null);
        setField(term119247, term119247.getClass(), "externsRoot", null);
        setField(term119247, term119247.getClass(), "jsRoot", null);
        setField(term119247, term119247.getClass(), "externAndJsRoot", null);
        setField(term119247, term119247.getClass(), "inputsById", null);
        setField(term119247, term119247.getClass(), "sourceMap", null);
        setField(term119247, term119247.getClass(), "externExports", null);
        setIntField(term119247, term119247.getClass(), "uniqueNameId", 0);
        setBooleanField(term119247, term119247.getClass(), "hasRegExpGlobalReferences", false);
        setField(term119247, term119247.getClass(), "functionInformationMap", null);
        setField(term119247, term119247.getClass(), "debugLog", null);
        setField(term119247, term119247.getClass(), "defaultCodingConvention", null);
        setField(term119247, term119247.getClass(), "typeRegistry", null);
        setField(term119247, term119247.getClass(), "parserConfig", null);
        setField(term119247, term119247.getClass(), "abstractInterpreter", null);
        setField(term119247, term119247.getClass(), "typeValidator", null);
        setField(term119247, term119247.getClass(), "tracker", null);
        setField(term119247, term119247.getClass(), "oldErrorReporter", null);
        setField(term119247, term119247.getClass(), "defaultErrorReporter", null);
        setField(term119247, term119247.getClass(), "compilerThread", null);
        setBooleanField(term119247, term119247.getClass(), "useThreads", false);
        setField(term119247, term119247.getClass(), "outStream", null);
        setField(term119247, term119247.getClass(), "globalRefMap", null);
        setDoubleField(term119247, term119247.getClass(), "progress", 0.0);
        setField(term119247, term119247.getClass(), "lastPassName", null);
        setField(term119247, term119247.getClass(), "sanityCheck", null);
        setField(term119247, term119247.getClass(), "currentTracer", null);
        setField(term119247, term119247.getClass(), "currentPassName", null);
        setIntField(term119247, term119247.getClass(), "syntheticCodeId", 0);
        setField(term119247, term119247.getClass(), "recentChange", null);
        setField(term119247, term119247.getClass(), "codeChangeHandlers", null);
        setField(term119247, term119247.getClass(), "synthesizedExternsInput", null);
        setField(term119247, term119247.getClass(), "stage", null);
        setField(term119246, term119246.getClass(), "compiler", term119247);
        setField(term119246, term119246.getClass(), "filenamePrefix", null);
        setBooleanField(term119246, term119246.getClass(), "reportDependencies", false);
        setField(term119246, term119246.getClass(), "module", null);
        term119248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119250 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term119248, term119248.getClass(), "number", 0.0);
        setIntField(term119248, term119248.getClass(), "type", 0);
        setField(term119248, term119248.getClass(), "next", null);
        setDoubleField(term119249, term119249.getClass(), "number", 0.0);
        setIntField(term119249, term119249.getClass(), "type", 37);
        setDoubleField(term119250, term119250.getClass(), "number", 0.0);
        setIntField(term119250, term119250.getClass(), "type", 37);
        setIntField(term119251, term119251.getClass(), "type", 0);
        setField(term119251, term119251.getClass(), "next", null);
        setField(term119251, term119251.getClass(), "first", null);
        setField(term119251, term119251.getClass(), "last", null);
        setField(term119251, term119251.getClass(), "propListHead", null);
        setIntField(term119251, term119251.getClass(), "sourcePosition", 0);
        setField(term119251, term119251.getClass(), "jsType", null);
        setField(term119251, term119251.getClass(), "parent", null);
        setField(term119250, term119250.getClass(), "next", term119251);
        setField(term119250, term119250.getClass(), "first", null);
        setField(term119250, term119250.getClass(), "last", null);
        setField(term119250, term119250.getClass(), "propListHead", null);
        setIntField(term119250, term119250.getClass(), "sourcePosition", 0);
        setField(term119250, term119250.getClass(), "jsType", null);
        setField(term119250, term119250.getClass(), "parent", null);
        setField(term119249, term119249.getClass(), "next", term119250);
        setField(term119249, term119249.getClass(), "first", null);
        setField(term119249, term119249.getClass(), "last", null);
        setField(term119249, term119249.getClass(), "propListHead", null);
        setIntField(term119249, term119249.getClass(), "sourcePosition", 0);
        setField(term119249, term119249.getClass(), "jsType", null);
        setField(term119249, term119249.getClass(), "parent", null);
        setField(term119248, term119248.getClass(), "first", term119249);
        setField(term119248, term119248.getClass(), "last", null);
        setField(term119248, term119248.getClass(), "propListHead", null);
        setIntField(term119248, term119248.getClass(), "sourcePosition", 0);
        setField(term119248, term119248.getClass(), "jsType", null);
        setField(term119248, term119248.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term118681;
        callMethod(klass, "process", argTypes, term118509, args);
        assertTrue(recursiveEquals(term118509, term119246));
        assertTrue(recursiveEquals(term118681, null));
    }

};


