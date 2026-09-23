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

public class ProcessCommonJSModules_process_627866047369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197711;
     Object term197883;
     Object term199012;
     Object term199014;

    public ProcessCommonJSModules_process_627866047369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197711 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term197791 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term197711, term197711.getClass(), "compiler", term197791);
        term197883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term197975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198229 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term197883, term197883.getClass(), "type", 0);
        setField(term197883, term197883.getClass(), "parent", null);
        setField(term197975, term197975.getClass(), "next", term198045);
        setIntField(term197975, term197975.getClass(), "type", 0);
        setField(term198229, term198229.getClass(), "next", null);
        setIntField(term198229, term198229.getClass(), "type", 37);
        setField(term198229, term198229.getClass(), "first", null);
        setField(term198137, term198137.getClass(), "next", term198229);
        setIntField(term198137, term198137.getClass(), "type", 37);
        setField(term198137, term198137.getClass(), "first", null);
        setField(term197975, term197975.getClass(), "first", term198137);
        setField(term197883, term197883.getClass(), "first", term197975);
        term199012 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term199013 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term199013, term199013.getClass(), "options", null);
        setField(term199013, term199013.getClass(), "passes", null);
        setField(term199013, term199013.getClass(), "externs", null);
        setField(term199013, term199013.getClass(), "modules", null);
        setField(term199013, term199013.getClass(), "moduleGraph", null);
        setField(term199013, term199013.getClass(), "inputs", null);
        setField(term199013, term199013.getClass(), "errorManager", null);
        setField(term199013, term199013.getClass(), "warningsGuard", null);
        setField(term199013, term199013.getClass(), "injectedLibraries", null);
        setField(term199013, term199013.getClass(), "externsRoot", null);
        setField(term199013, term199013.getClass(), "jsRoot", null);
        setField(term199013, term199013.getClass(), "externAndJsRoot", null);
        setField(term199013, term199013.getClass(), "inputsById", null);
        setField(term199013, term199013.getClass(), "sourceMap", null);
        setField(term199013, term199013.getClass(), "externExports", null);
        setIntField(term199013, term199013.getClass(), "uniqueNameId", 0);
        setBooleanField(term199013, term199013.getClass(), "hasRegExpGlobalReferences", false);
        setField(term199013, term199013.getClass(), "functionInformationMap", null);
        setField(term199013, term199013.getClass(), "debugLog", null);
        setField(term199013, term199013.getClass(), "defaultCodingConvention", null);
        setField(term199013, term199013.getClass(), "typeRegistry", null);
        setField(term199013, term199013.getClass(), "parserConfig", null);
        setField(term199013, term199013.getClass(), "abstractInterpreter", null);
        setField(term199013, term199013.getClass(), "typeValidator", null);
        setField(term199013, term199013.getClass(), "tracker", null);
        setField(term199013, term199013.getClass(), "oldErrorReporter", null);
        setField(term199013, term199013.getClass(), "defaultErrorReporter", null);
        setField(term199013, term199013.getClass(), "compilerThread", null);
        setBooleanField(term199013, term199013.getClass(), "useThreads", false);
        setField(term199013, term199013.getClass(), "outStream", null);
        setField(term199013, term199013.getClass(), "globalRefMap", null);
        setDoubleField(term199013, term199013.getClass(), "progress", 0.0);
        setField(term199013, term199013.getClass(), "lastPassName", null);
        setField(term199013, term199013.getClass(), "sanityCheck", null);
        setField(term199013, term199013.getClass(), "currentTracer", null);
        setField(term199013, term199013.getClass(), "currentPassName", null);
        setIntField(term199013, term199013.getClass(), "syntheticCodeId", 0);
        setField(term199013, term199013.getClass(), "recentChange", null);
        setField(term199013, term199013.getClass(), "codeChangeHandlers", null);
        setField(term199013, term199013.getClass(), "synthesizedExternsInput", null);
        setField(term199013, term199013.getClass(), "stage", null);
        setField(term199012, term199012.getClass(), "compiler", term199013);
        setField(term199012, term199012.getClass(), "filenamePrefix", null);
        setBooleanField(term199012, term199012.getClass(), "reportDependencies", false);
        setField(term199012, term199012.getClass(), "module", null);
        term199014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term199015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term199016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term199018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term199014, term199014.getClass(), "number", 0.0);
        setIntField(term199014, term199014.getClass(), "type", 0);
        setField(term199014, term199014.getClass(), "next", null);
        setDoubleField(term199015, term199015.getClass(), "number", 0.0);
        setIntField(term199015, term199015.getClass(), "type", 0);
        setIntField(term199016, term199016.getClass(), "type", 0);
        setField(term199016, term199016.getClass(), "next", null);
        setField(term199016, term199016.getClass(), "first", null);
        setField(term199016, term199016.getClass(), "last", null);
        setField(term199016, term199016.getClass(), "propListHead", null);
        setIntField(term199016, term199016.getClass(), "sourcePosition", 0);
        setField(term199016, term199016.getClass(), "jsType", null);
        setField(term199016, term199016.getClass(), "parent", null);
        setField(term199015, term199015.getClass(), "next", term199016);
        setDoubleField(term199017, term199017.getClass(), "number", 0.0);
        setIntField(term199017, term199017.getClass(), "type", 37);
        setDoubleField(term199018, term199018.getClass(), "number", 0.0);
        setIntField(term199018, term199018.getClass(), "type", 37);
        setField(term199018, term199018.getClass(), "next", null);
        setField(term199018, term199018.getClass(), "first", null);
        setField(term199018, term199018.getClass(), "last", null);
        setField(term199018, term199018.getClass(), "propListHead", null);
        setIntField(term199018, term199018.getClass(), "sourcePosition", 0);
        setField(term199018, term199018.getClass(), "jsType", null);
        setField(term199018, term199018.getClass(), "parent", null);
        setField(term199017, term199017.getClass(), "next", term199018);
        setField(term199017, term199017.getClass(), "first", null);
        setField(term199017, term199017.getClass(), "last", null);
        setField(term199017, term199017.getClass(), "propListHead", null);
        setIntField(term199017, term199017.getClass(), "sourcePosition", 0);
        setField(term199017, term199017.getClass(), "jsType", null);
        setField(term199017, term199017.getClass(), "parent", null);
        setField(term199015, term199015.getClass(), "first", term199017);
        setField(term199015, term199015.getClass(), "last", null);
        setField(term199015, term199015.getClass(), "propListHead", null);
        setIntField(term199015, term199015.getClass(), "sourcePosition", 0);
        setField(term199015, term199015.getClass(), "jsType", null);
        setField(term199015, term199015.getClass(), "parent", null);
        setField(term199014, term199014.getClass(), "first", term199015);
        setField(term199014, term199014.getClass(), "last", null);
        setField(term199014, term199014.getClass(), "propListHead", null);
        setIntField(term199014, term199014.getClass(), "sourcePosition", 0);
        setField(term199014, term199014.getClass(), "jsType", null);
        setField(term199014, term199014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term197883;
        callMethod(klass, "process", argTypes, term197711, args);
        assertTrue(recursiveEquals(term197711, term199012));
        assertTrue(recursiveEquals(term197883, null));
    }

};


