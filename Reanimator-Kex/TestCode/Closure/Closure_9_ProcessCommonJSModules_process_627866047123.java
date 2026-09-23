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

public class ProcessCommonJSModules_process_627866047123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56231;
     Object term56403;
     Object term57063;
     Object term57065;

    public ProcessCommonJSModules_process_627866047123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56231 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term56311 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term56231, term56231.getClass(), "compiler", term56311);
        term56403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term56403, term56403.getClass(), "type", 0);
        setField(term56403, term56403.getClass(), "parent", null);
        setField(term56587, term56587.getClass(), "next", null);
        setIntField(term56587, term56587.getClass(), "type", 0);
        setField(term56587, term56587.getClass(), "first", null);
        setField(term56495, term56495.getClass(), "next", term56587);
        setIntField(term56495, term56495.getClass(), "type", 0);
        setField(term56679, term56679.getClass(), "next", null);
        setIntField(term56679, term56679.getClass(), "type", 0);
        setField(term56679, term56679.getClass(), "first", null);
        setField(term56495, term56495.getClass(), "first", term56679);
        setField(term56403, term56403.getClass(), "first", term56495);
        term57063 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term57064 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term57064, term57064.getClass(), "options", null);
        setField(term57064, term57064.getClass(), "passes", null);
        setField(term57064, term57064.getClass(), "externs", null);
        setField(term57064, term57064.getClass(), "modules", null);
        setField(term57064, term57064.getClass(), "moduleGraph", null);
        setField(term57064, term57064.getClass(), "inputs", null);
        setField(term57064, term57064.getClass(), "errorManager", null);
        setField(term57064, term57064.getClass(), "warningsGuard", null);
        setField(term57064, term57064.getClass(), "injectedLibraries", null);
        setField(term57064, term57064.getClass(), "externsRoot", null);
        setField(term57064, term57064.getClass(), "jsRoot", null);
        setField(term57064, term57064.getClass(), "externAndJsRoot", null);
        setField(term57064, term57064.getClass(), "inputsById", null);
        setField(term57064, term57064.getClass(), "sourceMap", null);
        setField(term57064, term57064.getClass(), "externExports", null);
        setIntField(term57064, term57064.getClass(), "uniqueNameId", 0);
        setBooleanField(term57064, term57064.getClass(), "hasRegExpGlobalReferences", false);
        setField(term57064, term57064.getClass(), "functionInformationMap", null);
        setField(term57064, term57064.getClass(), "debugLog", null);
        setField(term57064, term57064.getClass(), "defaultCodingConvention", null);
        setField(term57064, term57064.getClass(), "typeRegistry", null);
        setField(term57064, term57064.getClass(), "parserConfig", null);
        setField(term57064, term57064.getClass(), "abstractInterpreter", null);
        setField(term57064, term57064.getClass(), "typeValidator", null);
        setField(term57064, term57064.getClass(), "tracker", null);
        setField(term57064, term57064.getClass(), "oldErrorReporter", null);
        setField(term57064, term57064.getClass(), "defaultErrorReporter", null);
        setField(term57064, term57064.getClass(), "compilerThread", null);
        setBooleanField(term57064, term57064.getClass(), "useThreads", false);
        setField(term57064, term57064.getClass(), "outStream", null);
        setField(term57064, term57064.getClass(), "globalRefMap", null);
        setDoubleField(term57064, term57064.getClass(), "progress", 0.0);
        setField(term57064, term57064.getClass(), "lastPassName", null);
        setField(term57064, term57064.getClass(), "sanityCheck", null);
        setField(term57064, term57064.getClass(), "currentTracer", null);
        setField(term57064, term57064.getClass(), "currentPassName", null);
        setIntField(term57064, term57064.getClass(), "syntheticCodeId", 0);
        setField(term57064, term57064.getClass(), "recentChange", null);
        setField(term57064, term57064.getClass(), "codeChangeHandlers", null);
        setField(term57064, term57064.getClass(), "synthesizedExternsInput", null);
        setField(term57064, term57064.getClass(), "stage", null);
        setField(term57063, term57063.getClass(), "compiler", term57064);
        setField(term57063, term57063.getClass(), "filenamePrefix", null);
        setBooleanField(term57063, term57063.getClass(), "reportDependencies", false);
        setField(term57063, term57063.getClass(), "module", null);
        term57065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57066 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57068 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57065, term57065.getClass(), "number", 0.0);
        setIntField(term57065, term57065.getClass(), "type", 0);
        setField(term57065, term57065.getClass(), "next", null);
        setDoubleField(term57066, term57066.getClass(), "number", 0.0);
        setIntField(term57066, term57066.getClass(), "type", 0);
        setDoubleField(term57067, term57067.getClass(), "number", 0.0);
        setIntField(term57067, term57067.getClass(), "type", 0);
        setField(term57067, term57067.getClass(), "next", null);
        setField(term57067, term57067.getClass(), "first", null);
        setField(term57067, term57067.getClass(), "last", null);
        setField(term57067, term57067.getClass(), "propListHead", null);
        setIntField(term57067, term57067.getClass(), "sourcePosition", 0);
        setField(term57067, term57067.getClass(), "jsType", null);
        setField(term57067, term57067.getClass(), "parent", null);
        setField(term57066, term57066.getClass(), "next", term57067);
        setDoubleField(term57068, term57068.getClass(), "number", 0.0);
        setIntField(term57068, term57068.getClass(), "type", 0);
        setField(term57068, term57068.getClass(), "next", null);
        setField(term57068, term57068.getClass(), "first", null);
        setField(term57068, term57068.getClass(), "last", null);
        setField(term57068, term57068.getClass(), "propListHead", null);
        setIntField(term57068, term57068.getClass(), "sourcePosition", 0);
        setField(term57068, term57068.getClass(), "jsType", null);
        setField(term57068, term57068.getClass(), "parent", null);
        setField(term57066, term57066.getClass(), "first", term57068);
        setField(term57066, term57066.getClass(), "last", null);
        setField(term57066, term57066.getClass(), "propListHead", null);
        setIntField(term57066, term57066.getClass(), "sourcePosition", 0);
        setField(term57066, term57066.getClass(), "jsType", null);
        setField(term57066, term57066.getClass(), "parent", null);
        setField(term57065, term57065.getClass(), "first", term57066);
        setField(term57065, term57065.getClass(), "last", null);
        setField(term57065, term57065.getClass(), "propListHead", null);
        setIntField(term57065, term57065.getClass(), "sourcePosition", 0);
        setField(term57065, term57065.getClass(), "jsType", null);
        setField(term57065, term57065.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term56403;
        callMethod(klass, "process", argTypes, term56231, args);
        assertTrue(recursiveEquals(term56231, term57063));
        assertTrue(recursiveEquals(term56403, null));
    }

};


