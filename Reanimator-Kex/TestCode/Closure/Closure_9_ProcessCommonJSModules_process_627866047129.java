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

public class ProcessCommonJSModules_process_627866047129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59708;
     Object term59880;
     Object term60514;
     Object term60516;

    public ProcessCommonJSModules_process_627866047129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59708 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term59788 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term59708, term59708.getClass(), "compiler", term59788);
        term59880 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60134 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59880, term59880.getClass(), "type", 0);
        setField(term59880, term59880.getClass(), "parent", null);
        setField(term59972, term59972.getClass(), "next", term60042);
        setIntField(term59972, term59972.getClass(), "type", 0);
        setField(term60134, term60134.getClass(), "next", null);
        setIntField(term60134, term60134.getClass(), "type", 37);
        setField(term60134, term60134.getClass(), "first", null);
        setField(term59972, term59972.getClass(), "first", term60134);
        setField(term59880, term59880.getClass(), "first", term59972);
        term60514 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term60515 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term60515, term60515.getClass(), "options", null);
        setField(term60515, term60515.getClass(), "passes", null);
        setField(term60515, term60515.getClass(), "externs", null);
        setField(term60515, term60515.getClass(), "modules", null);
        setField(term60515, term60515.getClass(), "moduleGraph", null);
        setField(term60515, term60515.getClass(), "inputs", null);
        setField(term60515, term60515.getClass(), "errorManager", null);
        setField(term60515, term60515.getClass(), "warningsGuard", null);
        setField(term60515, term60515.getClass(), "injectedLibraries", null);
        setField(term60515, term60515.getClass(), "externsRoot", null);
        setField(term60515, term60515.getClass(), "jsRoot", null);
        setField(term60515, term60515.getClass(), "externAndJsRoot", null);
        setField(term60515, term60515.getClass(), "inputsById", null);
        setField(term60515, term60515.getClass(), "sourceMap", null);
        setField(term60515, term60515.getClass(), "externExports", null);
        setIntField(term60515, term60515.getClass(), "uniqueNameId", 0);
        setBooleanField(term60515, term60515.getClass(), "hasRegExpGlobalReferences", false);
        setField(term60515, term60515.getClass(), "functionInformationMap", null);
        setField(term60515, term60515.getClass(), "debugLog", null);
        setField(term60515, term60515.getClass(), "defaultCodingConvention", null);
        setField(term60515, term60515.getClass(), "typeRegistry", null);
        setField(term60515, term60515.getClass(), "parserConfig", null);
        setField(term60515, term60515.getClass(), "abstractInterpreter", null);
        setField(term60515, term60515.getClass(), "typeValidator", null);
        setField(term60515, term60515.getClass(), "tracker", null);
        setField(term60515, term60515.getClass(), "oldErrorReporter", null);
        setField(term60515, term60515.getClass(), "defaultErrorReporter", null);
        setField(term60515, term60515.getClass(), "compilerThread", null);
        setBooleanField(term60515, term60515.getClass(), "useThreads", false);
        setField(term60515, term60515.getClass(), "outStream", null);
        setField(term60515, term60515.getClass(), "globalRefMap", null);
        setDoubleField(term60515, term60515.getClass(), "progress", 0.0);
        setField(term60515, term60515.getClass(), "lastPassName", null);
        setField(term60515, term60515.getClass(), "sanityCheck", null);
        setField(term60515, term60515.getClass(), "currentTracer", null);
        setField(term60515, term60515.getClass(), "currentPassName", null);
        setIntField(term60515, term60515.getClass(), "syntheticCodeId", 0);
        setField(term60515, term60515.getClass(), "recentChange", null);
        setField(term60515, term60515.getClass(), "codeChangeHandlers", null);
        setField(term60515, term60515.getClass(), "synthesizedExternsInput", null);
        setField(term60515, term60515.getClass(), "stage", null);
        setField(term60514, term60514.getClass(), "compiler", term60515);
        setField(term60514, term60514.getClass(), "filenamePrefix", null);
        setBooleanField(term60514, term60514.getClass(), "reportDependencies", false);
        setField(term60514, term60514.getClass(), "module", null);
        term60516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60516, term60516.getClass(), "number", 0.0);
        setIntField(term60516, term60516.getClass(), "type", 0);
        setField(term60516, term60516.getClass(), "next", null);
        setDoubleField(term60517, term60517.getClass(), "number", 0.0);
        setIntField(term60517, term60517.getClass(), "type", 0);
        setIntField(term60518, term60518.getClass(), "type", 0);
        setField(term60518, term60518.getClass(), "next", null);
        setField(term60518, term60518.getClass(), "first", null);
        setField(term60518, term60518.getClass(), "last", null);
        setField(term60518, term60518.getClass(), "propListHead", null);
        setIntField(term60518, term60518.getClass(), "sourcePosition", 0);
        setField(term60518, term60518.getClass(), "jsType", null);
        setField(term60518, term60518.getClass(), "parent", null);
        setField(term60517, term60517.getClass(), "next", term60518);
        setDoubleField(term60519, term60519.getClass(), "number", 0.0);
        setIntField(term60519, term60519.getClass(), "type", 37);
        setField(term60519, term60519.getClass(), "next", null);
        setField(term60519, term60519.getClass(), "first", null);
        setField(term60519, term60519.getClass(), "last", null);
        setField(term60519, term60519.getClass(), "propListHead", null);
        setIntField(term60519, term60519.getClass(), "sourcePosition", 0);
        setField(term60519, term60519.getClass(), "jsType", null);
        setField(term60519, term60519.getClass(), "parent", null);
        setField(term60517, term60517.getClass(), "first", term60519);
        setField(term60517, term60517.getClass(), "last", null);
        setField(term60517, term60517.getClass(), "propListHead", null);
        setIntField(term60517, term60517.getClass(), "sourcePosition", 0);
        setField(term60517, term60517.getClass(), "jsType", null);
        setField(term60517, term60517.getClass(), "parent", null);
        setField(term60516, term60516.getClass(), "first", term60517);
        setField(term60516, term60516.getClass(), "last", null);
        setField(term60516, term60516.getClass(), "propListHead", null);
        setIntField(term60516, term60516.getClass(), "sourcePosition", 0);
        setField(term60516, term60516.getClass(), "jsType", null);
        setField(term60516, term60516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term59880;
        callMethod(klass, "process", argTypes, term59708, args);
        assertTrue(recursiveEquals(term59708, term60514));
        assertTrue(recursiveEquals(term59880, null));
    }

};


