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

public class ProcessCommonJSModules_process_627866047412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222527;
     Object term222677;
     Object term291185;
     Object term291187;

    public ProcessCommonJSModules_process_627866047412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222527 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term222607 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term222527, term222527.getClass(), "compiler", term222607);
        term222677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term222677, term222677.getClass(), "type", 0);
        setField(term222677, term222677.getClass(), "parent", null);
        setField(term222747, term222747.getClass(), "next", null);
        setIntField(term222747, term222747.getClass(), "type", 33);
        setField(term222817, term222817.getClass(), "next", null);
        setIntField(term222817, term222817.getClass(), "type", 0);
        setField(term222817, term222817.getClass(), "first", null);
        setField(term222747, term222747.getClass(), "first", term222817);
        setField(term222677, term222677.getClass(), "first", term222747);
        term291185 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term291186 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term291186, term291186.getClass(), "options", null);
        setField(term291186, term291186.getClass(), "passes", null);
        setField(term291186, term291186.getClass(), "externs", null);
        setField(term291186, term291186.getClass(), "modules", null);
        setField(term291186, term291186.getClass(), "moduleGraph", null);
        setField(term291186, term291186.getClass(), "inputs", null);
        setField(term291186, term291186.getClass(), "errorManager", null);
        setField(term291186, term291186.getClass(), "warningsGuard", null);
        setField(term291186, term291186.getClass(), "injectedLibraries", null);
        setField(term291186, term291186.getClass(), "externsRoot", null);
        setField(term291186, term291186.getClass(), "jsRoot", null);
        setField(term291186, term291186.getClass(), "externAndJsRoot", null);
        setField(term291186, term291186.getClass(), "inputsById", null);
        setField(term291186, term291186.getClass(), "sourceMap", null);
        setField(term291186, term291186.getClass(), "externExports", null);
        setIntField(term291186, term291186.getClass(), "uniqueNameId", 0);
        setBooleanField(term291186, term291186.getClass(), "hasRegExpGlobalReferences", false);
        setField(term291186, term291186.getClass(), "functionInformationMap", null);
        setField(term291186, term291186.getClass(), "debugLog", null);
        setField(term291186, term291186.getClass(), "defaultCodingConvention", null);
        setField(term291186, term291186.getClass(), "typeRegistry", null);
        setField(term291186, term291186.getClass(), "parserConfig", null);
        setField(term291186, term291186.getClass(), "abstractInterpreter", null);
        setField(term291186, term291186.getClass(), "typeValidator", null);
        setField(term291186, term291186.getClass(), "tracker", null);
        setField(term291186, term291186.getClass(), "oldErrorReporter", null);
        setField(term291186, term291186.getClass(), "defaultErrorReporter", null);
        setField(term291186, term291186.getClass(), "compilerThread", null);
        setBooleanField(term291186, term291186.getClass(), "useThreads", false);
        setField(term291186, term291186.getClass(), "outStream", null);
        setField(term291186, term291186.getClass(), "globalRefMap", null);
        setDoubleField(term291186, term291186.getClass(), "progress", 0.0);
        setField(term291186, term291186.getClass(), "lastPassName", null);
        setField(term291186, term291186.getClass(), "sanityCheck", null);
        setField(term291186, term291186.getClass(), "currentTracer", null);
        setField(term291186, term291186.getClass(), "currentPassName", null);
        setIntField(term291186, term291186.getClass(), "syntheticCodeId", 0);
        setField(term291186, term291186.getClass(), "recentChange", null);
        setField(term291186, term291186.getClass(), "codeChangeHandlers", null);
        setField(term291186, term291186.getClass(), "synthesizedExternsInput", null);
        setField(term291186, term291186.getClass(), "stage", null);
        setField(term291185, term291185.getClass(), "compiler", term291186);
        setField(term291185, term291185.getClass(), "filenamePrefix", null);
        setBooleanField(term291185, term291185.getClass(), "reportDependencies", false);
        setField(term291185, term291185.getClass(), "module", null);
        term291187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term291188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term291189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term291187, term291187.getClass(), "type", 0);
        setField(term291187, term291187.getClass(), "next", null);
        setIntField(term291188, term291188.getClass(), "type", 33);
        setField(term291188, term291188.getClass(), "next", null);
        setIntField(term291189, term291189.getClass(), "type", 0);
        setField(term291189, term291189.getClass(), "next", null);
        setField(term291189, term291189.getClass(), "first", null);
        setField(term291189, term291189.getClass(), "last", null);
        setField(term291189, term291189.getClass(), "propListHead", null);
        setIntField(term291189, term291189.getClass(), "sourcePosition", 0);
        setField(term291189, term291189.getClass(), "jsType", null);
        setField(term291189, term291189.getClass(), "parent", null);
        setField(term291188, term291188.getClass(), "first", term291189);
        setField(term291188, term291188.getClass(), "last", null);
        setField(term291188, term291188.getClass(), "propListHead", null);
        setIntField(term291188, term291188.getClass(), "sourcePosition", 0);
        setField(term291188, term291188.getClass(), "jsType", null);
        setField(term291188, term291188.getClass(), "parent", null);
        setField(term291187, term291187.getClass(), "first", term291188);
        setField(term291187, term291187.getClass(), "last", null);
        setField(term291187, term291187.getClass(), "propListHead", null);
        setIntField(term291187, term291187.getClass(), "sourcePosition", 0);
        setField(term291187, term291187.getClass(), "jsType", null);
        setField(term291187, term291187.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term222677;
        callMethod(klass, "process", argTypes, term222527, args);
        assertTrue(recursiveEquals(term222527, term291185));
        assertTrue(recursiveEquals(term222677, null));
    }

};


