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

public class ProcessCommonJSModules_process_627866047145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67855;
     Object term68005;
     Object term69047;
     Object term69049;

    public ProcessCommonJSModules_process_627866047145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67855 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term67935 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term67855, term67855.getClass(), "compiler", term67935);
        term68005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68005, term68005.getClass(), "type", 0);
        setField(term68005, term68005.getClass(), "parent", null);
        setField(term68145, term68145.getClass(), "next", term68215);
        setIntField(term68145, term68145.getClass(), "type", 37);
        setField(term68145, term68145.getClass(), "first", null);
        setField(term68075, term68075.getClass(), "next", term68145);
        setIntField(term68075, term68075.getClass(), "type", 37);
        setField(term68285, term68285.getClass(), "next", null);
        setIntField(term68285, term68285.getClass(), "type", 0);
        setField(term68285, term68285.getClass(), "first", null);
        setField(term68075, term68075.getClass(), "first", term68285);
        setField(term68005, term68005.getClass(), "first", term68075);
        term69047 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term69048 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term69048, term69048.getClass(), "options", null);
        setField(term69048, term69048.getClass(), "passes", null);
        setField(term69048, term69048.getClass(), "externs", null);
        setField(term69048, term69048.getClass(), "modules", null);
        setField(term69048, term69048.getClass(), "moduleGraph", null);
        setField(term69048, term69048.getClass(), "inputs", null);
        setField(term69048, term69048.getClass(), "errorManager", null);
        setField(term69048, term69048.getClass(), "warningsGuard", null);
        setField(term69048, term69048.getClass(), "injectedLibraries", null);
        setField(term69048, term69048.getClass(), "externsRoot", null);
        setField(term69048, term69048.getClass(), "jsRoot", null);
        setField(term69048, term69048.getClass(), "externAndJsRoot", null);
        setField(term69048, term69048.getClass(), "inputsById", null);
        setField(term69048, term69048.getClass(), "sourceMap", null);
        setField(term69048, term69048.getClass(), "externExports", null);
        setIntField(term69048, term69048.getClass(), "uniqueNameId", 0);
        setBooleanField(term69048, term69048.getClass(), "hasRegExpGlobalReferences", false);
        setField(term69048, term69048.getClass(), "functionInformationMap", null);
        setField(term69048, term69048.getClass(), "debugLog", null);
        setField(term69048, term69048.getClass(), "defaultCodingConvention", null);
        setField(term69048, term69048.getClass(), "typeRegistry", null);
        setField(term69048, term69048.getClass(), "parserConfig", null);
        setField(term69048, term69048.getClass(), "abstractInterpreter", null);
        setField(term69048, term69048.getClass(), "typeValidator", null);
        setField(term69048, term69048.getClass(), "tracker", null);
        setField(term69048, term69048.getClass(), "oldErrorReporter", null);
        setField(term69048, term69048.getClass(), "defaultErrorReporter", null);
        setField(term69048, term69048.getClass(), "compilerThread", null);
        setBooleanField(term69048, term69048.getClass(), "useThreads", false);
        setField(term69048, term69048.getClass(), "outStream", null);
        setField(term69048, term69048.getClass(), "globalRefMap", null);
        setDoubleField(term69048, term69048.getClass(), "progress", 0.0);
        setField(term69048, term69048.getClass(), "lastPassName", null);
        setField(term69048, term69048.getClass(), "sanityCheck", null);
        setField(term69048, term69048.getClass(), "currentTracer", null);
        setField(term69048, term69048.getClass(), "currentPassName", null);
        setIntField(term69048, term69048.getClass(), "syntheticCodeId", 0);
        setField(term69048, term69048.getClass(), "recentChange", null);
        setField(term69048, term69048.getClass(), "codeChangeHandlers", null);
        setField(term69048, term69048.getClass(), "synthesizedExternsInput", null);
        setField(term69048, term69048.getClass(), "stage", null);
        setField(term69047, term69047.getClass(), "compiler", term69048);
        setField(term69047, term69047.getClass(), "filenamePrefix", null);
        setBooleanField(term69047, term69047.getClass(), "reportDependencies", false);
        setField(term69047, term69047.getClass(), "module", null);
        term69049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69049, term69049.getClass(), "type", 0);
        setField(term69049, term69049.getClass(), "next", null);
        setIntField(term69050, term69050.getClass(), "type", 37);
        setIntField(term69051, term69051.getClass(), "type", 37);
        setIntField(term69052, term69052.getClass(), "type", 0);
        setField(term69052, term69052.getClass(), "next", null);
        setField(term69052, term69052.getClass(), "first", null);
        setField(term69052, term69052.getClass(), "last", null);
        setField(term69052, term69052.getClass(), "propListHead", null);
        setIntField(term69052, term69052.getClass(), "sourcePosition", 0);
        setField(term69052, term69052.getClass(), "jsType", null);
        setField(term69052, term69052.getClass(), "parent", null);
        setField(term69051, term69051.getClass(), "next", term69052);
        setField(term69051, term69051.getClass(), "first", null);
        setField(term69051, term69051.getClass(), "last", null);
        setField(term69051, term69051.getClass(), "propListHead", null);
        setIntField(term69051, term69051.getClass(), "sourcePosition", 0);
        setField(term69051, term69051.getClass(), "jsType", null);
        setField(term69051, term69051.getClass(), "parent", null);
        setField(term69050, term69050.getClass(), "next", term69051);
        setIntField(term69053, term69053.getClass(), "type", 0);
        setField(term69053, term69053.getClass(), "next", null);
        setField(term69053, term69053.getClass(), "first", null);
        setField(term69053, term69053.getClass(), "last", null);
        setField(term69053, term69053.getClass(), "propListHead", null);
        setIntField(term69053, term69053.getClass(), "sourcePosition", 0);
        setField(term69053, term69053.getClass(), "jsType", null);
        setField(term69053, term69053.getClass(), "parent", null);
        setField(term69050, term69050.getClass(), "first", term69053);
        setField(term69050, term69050.getClass(), "last", null);
        setField(term69050, term69050.getClass(), "propListHead", null);
        setIntField(term69050, term69050.getClass(), "sourcePosition", 0);
        setField(term69050, term69050.getClass(), "jsType", null);
        setField(term69050, term69050.getClass(), "parent", null);
        setField(term69049, term69049.getClass(), "first", term69050);
        setField(term69049, term69049.getClass(), "last", null);
        setField(term69049, term69049.getClass(), "propListHead", null);
        setIntField(term69049, term69049.getClass(), "sourcePosition", 0);
        setField(term69049, term69049.getClass(), "jsType", null);
        setField(term69049, term69049.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term68005;
        callMethod(klass, "process", argTypes, term67855, args);
        assertTrue(recursiveEquals(term67855, term69047));
        assertTrue(recursiveEquals(term68005, null));
    }

};


