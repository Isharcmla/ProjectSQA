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

public class ProcessCommonJSModules_process_627866047336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175625;
     Object term175775;
     Object term177156;
     Object term177158;

    public ProcessCommonJSModules_process_627866047336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175625 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term175705 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term175625, term175625.getClass(), "compiler", term175705);
        term175775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term175775, term175775.getClass(), "type", 0);
        setField(term175775, term175775.getClass(), "parent", null);
        setField(term175867, term175867.getClass(), "next", null);
        setIntField(term175867, term175867.getClass(), "type", 37);
        setField(term175959, term175959.getClass(), "next", null);
        setIntField(term175959, term175959.getClass(), "type", 0);
        setField(term175959, term175959.getClass(), "first", null);
        setField(term175867, term175867.getClass(), "first", term175959);
        setField(term175775, term175775.getClass(), "first", term175867);
        term177156 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term177157 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term177157, term177157.getClass(), "options", null);
        setField(term177157, term177157.getClass(), "passes", null);
        setField(term177157, term177157.getClass(), "externs", null);
        setField(term177157, term177157.getClass(), "modules", null);
        setField(term177157, term177157.getClass(), "moduleGraph", null);
        setField(term177157, term177157.getClass(), "inputs", null);
        setField(term177157, term177157.getClass(), "errorManager", null);
        setField(term177157, term177157.getClass(), "warningsGuard", null);
        setField(term177157, term177157.getClass(), "injectedLibraries", null);
        setField(term177157, term177157.getClass(), "externsRoot", null);
        setField(term177157, term177157.getClass(), "jsRoot", null);
        setField(term177157, term177157.getClass(), "externAndJsRoot", null);
        setField(term177157, term177157.getClass(), "inputsById", null);
        setField(term177157, term177157.getClass(), "sourceMap", null);
        setField(term177157, term177157.getClass(), "externExports", null);
        setIntField(term177157, term177157.getClass(), "uniqueNameId", 0);
        setBooleanField(term177157, term177157.getClass(), "hasRegExpGlobalReferences", false);
        setField(term177157, term177157.getClass(), "functionInformationMap", null);
        setField(term177157, term177157.getClass(), "debugLog", null);
        setField(term177157, term177157.getClass(), "defaultCodingConvention", null);
        setField(term177157, term177157.getClass(), "typeRegistry", null);
        setField(term177157, term177157.getClass(), "parserConfig", null);
        setField(term177157, term177157.getClass(), "abstractInterpreter", null);
        setField(term177157, term177157.getClass(), "typeValidator", null);
        setField(term177157, term177157.getClass(), "tracker", null);
        setField(term177157, term177157.getClass(), "oldErrorReporter", null);
        setField(term177157, term177157.getClass(), "defaultErrorReporter", null);
        setField(term177157, term177157.getClass(), "compilerThread", null);
        setBooleanField(term177157, term177157.getClass(), "useThreads", false);
        setField(term177157, term177157.getClass(), "outStream", null);
        setField(term177157, term177157.getClass(), "globalRefMap", null);
        setDoubleField(term177157, term177157.getClass(), "progress", 0.0);
        setField(term177157, term177157.getClass(), "lastPassName", null);
        setField(term177157, term177157.getClass(), "sanityCheck", null);
        setField(term177157, term177157.getClass(), "currentTracer", null);
        setField(term177157, term177157.getClass(), "currentPassName", null);
        setIntField(term177157, term177157.getClass(), "syntheticCodeId", 0);
        setField(term177157, term177157.getClass(), "recentChange", null);
        setField(term177157, term177157.getClass(), "codeChangeHandlers", null);
        setField(term177157, term177157.getClass(), "synthesizedExternsInput", null);
        setField(term177157, term177157.getClass(), "stage", null);
        setField(term177156, term177156.getClass(), "compiler", term177157);
        setField(term177156, term177156.getClass(), "filenamePrefix", null);
        setBooleanField(term177156, term177156.getClass(), "reportDependencies", false);
        setField(term177156, term177156.getClass(), "module", null);
        term177158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177159 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177158, term177158.getClass(), "type", 0);
        setField(term177158, term177158.getClass(), "next", null);
        setDoubleField(term177159, term177159.getClass(), "number", 0.0);
        setIntField(term177159, term177159.getClass(), "type", 37);
        setField(term177159, term177159.getClass(), "next", null);
        setDoubleField(term177160, term177160.getClass(), "number", 0.0);
        setIntField(term177160, term177160.getClass(), "type", 0);
        setField(term177160, term177160.getClass(), "next", null);
        setField(term177160, term177160.getClass(), "first", null);
        setField(term177160, term177160.getClass(), "last", null);
        setField(term177160, term177160.getClass(), "propListHead", null);
        setIntField(term177160, term177160.getClass(), "sourcePosition", 0);
        setField(term177160, term177160.getClass(), "jsType", null);
        setField(term177160, term177160.getClass(), "parent", null);
        setField(term177159, term177159.getClass(), "first", term177160);
        setField(term177159, term177159.getClass(), "last", null);
        setField(term177159, term177159.getClass(), "propListHead", null);
        setIntField(term177159, term177159.getClass(), "sourcePosition", 0);
        setField(term177159, term177159.getClass(), "jsType", null);
        setField(term177159, term177159.getClass(), "parent", null);
        setField(term177158, term177158.getClass(), "first", term177159);
        setField(term177158, term177158.getClass(), "last", null);
        setField(term177158, term177158.getClass(), "propListHead", null);
        setIntField(term177158, term177158.getClass(), "sourcePosition", 0);
        setField(term177158, term177158.getClass(), "jsType", null);
        setField(term177158, term177158.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term175775;
        callMethod(klass, "process", argTypes, term175625, args);
        assertTrue(recursiveEquals(term175625, term177156));
        assertTrue(recursiveEquals(term175775, null));
    }

};


