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

public class ProcessCommonJSModules_process_627866047147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69405;
     Object term69555;
     Object term70227;
     Object term70229;

    public ProcessCommonJSModules_process_627866047147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69405 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term69485 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term69405, term69405.getClass(), "compiler", term69485);
        term69555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term69739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term69831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term69555, term69555.getClass(), "type", 37);
        setField(term69555, term69555.getClass(), "parent", null);
        setField(term69647, term69647.getClass(), "next", null);
        setIntField(term69647, term69647.getClass(), "type", 0);
        setField(term69831, term69831.getClass(), "next", null);
        setIntField(term69831, term69831.getClass(), "type", 0);
        setField(term69831, term69831.getClass(), "first", null);
        setField(term69739, term69739.getClass(), "next", term69831);
        setIntField(term69739, term69739.getClass(), "type", 37);
        setField(term69739, term69739.getClass(), "first", null);
        setField(term69647, term69647.getClass(), "first", term69739);
        setField(term69555, term69555.getClass(), "first", term69647);
        term70227 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term70228 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70228, term70228.getClass(), "options", null);
        setField(term70228, term70228.getClass(), "passes", null);
        setField(term70228, term70228.getClass(), "externs", null);
        setField(term70228, term70228.getClass(), "modules", null);
        setField(term70228, term70228.getClass(), "moduleGraph", null);
        setField(term70228, term70228.getClass(), "inputs", null);
        setField(term70228, term70228.getClass(), "errorManager", null);
        setField(term70228, term70228.getClass(), "warningsGuard", null);
        setField(term70228, term70228.getClass(), "injectedLibraries", null);
        setField(term70228, term70228.getClass(), "externsRoot", null);
        setField(term70228, term70228.getClass(), "jsRoot", null);
        setField(term70228, term70228.getClass(), "externAndJsRoot", null);
        setField(term70228, term70228.getClass(), "inputsById", null);
        setField(term70228, term70228.getClass(), "sourceMap", null);
        setField(term70228, term70228.getClass(), "externExports", null);
        setIntField(term70228, term70228.getClass(), "uniqueNameId", 0);
        setBooleanField(term70228, term70228.getClass(), "hasRegExpGlobalReferences", false);
        setField(term70228, term70228.getClass(), "functionInformationMap", null);
        setField(term70228, term70228.getClass(), "debugLog", null);
        setField(term70228, term70228.getClass(), "defaultCodingConvention", null);
        setField(term70228, term70228.getClass(), "typeRegistry", null);
        setField(term70228, term70228.getClass(), "parserConfig", null);
        setField(term70228, term70228.getClass(), "abstractInterpreter", null);
        setField(term70228, term70228.getClass(), "typeValidator", null);
        setField(term70228, term70228.getClass(), "tracker", null);
        setField(term70228, term70228.getClass(), "oldErrorReporter", null);
        setField(term70228, term70228.getClass(), "defaultErrorReporter", null);
        setField(term70228, term70228.getClass(), "compilerThread", null);
        setBooleanField(term70228, term70228.getClass(), "useThreads", false);
        setField(term70228, term70228.getClass(), "outStream", null);
        setField(term70228, term70228.getClass(), "globalRefMap", null);
        setDoubleField(term70228, term70228.getClass(), "progress", 0.0);
        setField(term70228, term70228.getClass(), "lastPassName", null);
        setField(term70228, term70228.getClass(), "sanityCheck", null);
        setField(term70228, term70228.getClass(), "currentTracer", null);
        setField(term70228, term70228.getClass(), "currentPassName", null);
        setIntField(term70228, term70228.getClass(), "syntheticCodeId", 0);
        setField(term70228, term70228.getClass(), "recentChange", null);
        setField(term70228, term70228.getClass(), "codeChangeHandlers", null);
        setField(term70228, term70228.getClass(), "synthesizedExternsInput", null);
        setField(term70228, term70228.getClass(), "stage", null);
        setField(term70227, term70227.getClass(), "compiler", term70228);
        setField(term70227, term70227.getClass(), "filenamePrefix", null);
        setBooleanField(term70227, term70227.getClass(), "reportDependencies", false);
        setField(term70227, term70227.getClass(), "module", null);
        term70229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term70229, term70229.getClass(), "type", 37);
        setField(term70229, term70229.getClass(), "next", null);
        setDoubleField(term70230, term70230.getClass(), "number", 0.0);
        setIntField(term70230, term70230.getClass(), "type", 0);
        setField(term70230, term70230.getClass(), "next", null);
        setDoubleField(term70231, term70231.getClass(), "number", 0.0);
        setIntField(term70231, term70231.getClass(), "type", 37);
        setDoubleField(term70232, term70232.getClass(), "number", 0.0);
        setIntField(term70232, term70232.getClass(), "type", 0);
        setField(term70232, term70232.getClass(), "next", null);
        setField(term70232, term70232.getClass(), "first", null);
        setField(term70232, term70232.getClass(), "last", null);
        setField(term70232, term70232.getClass(), "propListHead", null);
        setIntField(term70232, term70232.getClass(), "sourcePosition", 0);
        setField(term70232, term70232.getClass(), "jsType", null);
        setField(term70232, term70232.getClass(), "parent", null);
        setField(term70231, term70231.getClass(), "next", term70232);
        setField(term70231, term70231.getClass(), "first", null);
        setField(term70231, term70231.getClass(), "last", null);
        setField(term70231, term70231.getClass(), "propListHead", null);
        setIntField(term70231, term70231.getClass(), "sourcePosition", 0);
        setField(term70231, term70231.getClass(), "jsType", null);
        setField(term70231, term70231.getClass(), "parent", null);
        setField(term70230, term70230.getClass(), "first", term70231);
        setField(term70230, term70230.getClass(), "last", null);
        setField(term70230, term70230.getClass(), "propListHead", null);
        setIntField(term70230, term70230.getClass(), "sourcePosition", 0);
        setField(term70230, term70230.getClass(), "jsType", null);
        setField(term70230, term70230.getClass(), "parent", null);
        setField(term70229, term70229.getClass(), "first", term70230);
        setField(term70229, term70229.getClass(), "last", null);
        setField(term70229, term70229.getClass(), "propListHead", null);
        setIntField(term70229, term70229.getClass(), "sourcePosition", 0);
        setField(term70229, term70229.getClass(), "jsType", null);
        setField(term70229, term70229.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term69555;
        callMethod(klass, "process", argTypes, term69405, args);
        assertTrue(recursiveEquals(term69405, term70227));
        assertTrue(recursiveEquals(term69555, null));
    }

};


