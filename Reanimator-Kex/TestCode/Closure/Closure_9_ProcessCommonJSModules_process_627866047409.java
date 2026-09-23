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

public class ProcessCommonJSModules_process_627866047409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220319;
     Object term220491;
     Object term289765;
     Object term289767;

    public ProcessCommonJSModules_process_627866047409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220319 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term220399 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term220319, term220319.getClass(), "compiler", term220399);
        term220491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term220491, term220491.getClass(), "type", 0);
        setField(term220491, term220491.getClass(), "parent", null);
        setField(term220675, term220675.getClass(), "next", null);
        setIntField(term220675, term220675.getClass(), "type", 37);
        setField(term220675, term220675.getClass(), "first", null);
        setField(term220583, term220583.getClass(), "next", term220675);
        setIntField(term220583, term220583.getClass(), "type", 37);
        setField(term220767, term220767.getClass(), "next", null);
        setIntField(term220767, term220767.getClass(), "type", 0);
        setField(term220767, term220767.getClass(), "first", null);
        setField(term220583, term220583.getClass(), "first", term220767);
        setField(term220491, term220491.getClass(), "first", term220583);
        term289765 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term289766 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term289766, term289766.getClass(), "options", null);
        setField(term289766, term289766.getClass(), "passes", null);
        setField(term289766, term289766.getClass(), "externs", null);
        setField(term289766, term289766.getClass(), "modules", null);
        setField(term289766, term289766.getClass(), "moduleGraph", null);
        setField(term289766, term289766.getClass(), "inputs", null);
        setField(term289766, term289766.getClass(), "errorManager", null);
        setField(term289766, term289766.getClass(), "warningsGuard", null);
        setField(term289766, term289766.getClass(), "injectedLibraries", null);
        setField(term289766, term289766.getClass(), "externsRoot", null);
        setField(term289766, term289766.getClass(), "jsRoot", null);
        setField(term289766, term289766.getClass(), "externAndJsRoot", null);
        setField(term289766, term289766.getClass(), "inputsById", null);
        setField(term289766, term289766.getClass(), "sourceMap", null);
        setField(term289766, term289766.getClass(), "externExports", null);
        setIntField(term289766, term289766.getClass(), "uniqueNameId", 0);
        setBooleanField(term289766, term289766.getClass(), "hasRegExpGlobalReferences", false);
        setField(term289766, term289766.getClass(), "functionInformationMap", null);
        setField(term289766, term289766.getClass(), "debugLog", null);
        setField(term289766, term289766.getClass(), "defaultCodingConvention", null);
        setField(term289766, term289766.getClass(), "typeRegistry", null);
        setField(term289766, term289766.getClass(), "parserConfig", null);
        setField(term289766, term289766.getClass(), "abstractInterpreter", null);
        setField(term289766, term289766.getClass(), "typeValidator", null);
        setField(term289766, term289766.getClass(), "tracker", null);
        setField(term289766, term289766.getClass(), "oldErrorReporter", null);
        setField(term289766, term289766.getClass(), "defaultErrorReporter", null);
        setField(term289766, term289766.getClass(), "compilerThread", null);
        setBooleanField(term289766, term289766.getClass(), "useThreads", false);
        setField(term289766, term289766.getClass(), "outStream", null);
        setField(term289766, term289766.getClass(), "globalRefMap", null);
        setDoubleField(term289766, term289766.getClass(), "progress", 0.0);
        setField(term289766, term289766.getClass(), "lastPassName", null);
        setField(term289766, term289766.getClass(), "sanityCheck", null);
        setField(term289766, term289766.getClass(), "currentTracer", null);
        setField(term289766, term289766.getClass(), "currentPassName", null);
        setIntField(term289766, term289766.getClass(), "syntheticCodeId", 0);
        setField(term289766, term289766.getClass(), "recentChange", null);
        setField(term289766, term289766.getClass(), "codeChangeHandlers", null);
        setField(term289766, term289766.getClass(), "synthesizedExternsInput", null);
        setField(term289766, term289766.getClass(), "stage", null);
        setField(term289765, term289765.getClass(), "compiler", term289766);
        setField(term289765, term289765.getClass(), "filenamePrefix", null);
        setBooleanField(term289765, term289765.getClass(), "reportDependencies", false);
        setField(term289765, term289765.getClass(), "module", null);
        term289767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289768 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289769 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term289767, term289767.getClass(), "number", 0.0);
        setIntField(term289767, term289767.getClass(), "type", 0);
        setField(term289767, term289767.getClass(), "next", null);
        setDoubleField(term289768, term289768.getClass(), "number", 0.0);
        setIntField(term289768, term289768.getClass(), "type", 37);
        setDoubleField(term289769, term289769.getClass(), "number", 0.0);
        setIntField(term289769, term289769.getClass(), "type", 37);
        setField(term289769, term289769.getClass(), "next", null);
        setField(term289769, term289769.getClass(), "first", null);
        setField(term289769, term289769.getClass(), "last", null);
        setField(term289769, term289769.getClass(), "propListHead", null);
        setIntField(term289769, term289769.getClass(), "sourcePosition", 0);
        setField(term289769, term289769.getClass(), "jsType", null);
        setField(term289769, term289769.getClass(), "parent", null);
        setField(term289768, term289768.getClass(), "next", term289769);
        setDoubleField(term289770, term289770.getClass(), "number", 0.0);
        setIntField(term289770, term289770.getClass(), "type", 0);
        setField(term289770, term289770.getClass(), "next", null);
        setField(term289770, term289770.getClass(), "first", null);
        setField(term289770, term289770.getClass(), "last", null);
        setField(term289770, term289770.getClass(), "propListHead", null);
        setIntField(term289770, term289770.getClass(), "sourcePosition", 0);
        setField(term289770, term289770.getClass(), "jsType", null);
        setField(term289770, term289770.getClass(), "parent", null);
        setField(term289768, term289768.getClass(), "first", term289770);
        setField(term289768, term289768.getClass(), "last", null);
        setField(term289768, term289768.getClass(), "propListHead", null);
        setIntField(term289768, term289768.getClass(), "sourcePosition", 0);
        setField(term289768, term289768.getClass(), "jsType", null);
        setField(term289768, term289768.getClass(), "parent", null);
        setField(term289767, term289767.getClass(), "first", term289768);
        setField(term289767, term289767.getClass(), "last", null);
        setField(term289767, term289767.getClass(), "propListHead", null);
        setIntField(term289767, term289767.getClass(), "sourcePosition", 0);
        setField(term289767, term289767.getClass(), "jsType", null);
        setField(term289767, term289767.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term220491;
        callMethod(klass, "process", argTypes, term220319, args);
        assertTrue(recursiveEquals(term220319, term289765));
        assertTrue(recursiveEquals(term220491, null));
    }

};


