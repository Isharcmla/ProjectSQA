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

public class ProcessCommonJSModules_process_62786604775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28517;
     Object term28667;
     Object term29388;
     Object term29390;

    public ProcessCommonJSModules_process_62786604775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28517 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term28597 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term28517, term28517.getClass(), "compiler", term28597);
        term28667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28667, term28667.getClass(), "type", 0);
        setField(term28667, term28667.getClass(), "parent", null);
        setField(term28737, term28737.getClass(), "next", term28807);
        setIntField(term28737, term28737.getClass(), "type", 0);
        setField(term28877, term28877.getClass(), "next", term28947);
        setIntField(term28877, term28877.getClass(), "type", 37);
        setField(term28877, term28877.getClass(), "first", null);
        setField(term28737, term28737.getClass(), "first", term28877);
        setField(term28667, term28667.getClass(), "first", term28737);
        term29388 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term29389 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29389, term29389.getClass(), "options", null);
        setField(term29389, term29389.getClass(), "passes", null);
        setField(term29389, term29389.getClass(), "externs", null);
        setField(term29389, term29389.getClass(), "modules", null);
        setField(term29389, term29389.getClass(), "moduleGraph", null);
        setField(term29389, term29389.getClass(), "inputs", null);
        setField(term29389, term29389.getClass(), "errorManager", null);
        setField(term29389, term29389.getClass(), "warningsGuard", null);
        setField(term29389, term29389.getClass(), "injectedLibraries", null);
        setField(term29389, term29389.getClass(), "externsRoot", null);
        setField(term29389, term29389.getClass(), "jsRoot", null);
        setField(term29389, term29389.getClass(), "externAndJsRoot", null);
        setField(term29389, term29389.getClass(), "inputsById", null);
        setField(term29389, term29389.getClass(), "sourceMap", null);
        setField(term29389, term29389.getClass(), "externExports", null);
        setIntField(term29389, term29389.getClass(), "uniqueNameId", 0);
        setBooleanField(term29389, term29389.getClass(), "hasRegExpGlobalReferences", false);
        setField(term29389, term29389.getClass(), "functionInformationMap", null);
        setField(term29389, term29389.getClass(), "debugLog", null);
        setField(term29389, term29389.getClass(), "defaultCodingConvention", null);
        setField(term29389, term29389.getClass(), "typeRegistry", null);
        setField(term29389, term29389.getClass(), "parserConfig", null);
        setField(term29389, term29389.getClass(), "abstractInterpreter", null);
        setField(term29389, term29389.getClass(), "typeValidator", null);
        setField(term29389, term29389.getClass(), "tracker", null);
        setField(term29389, term29389.getClass(), "oldErrorReporter", null);
        setField(term29389, term29389.getClass(), "defaultErrorReporter", null);
        setField(term29389, term29389.getClass(), "compilerThread", null);
        setBooleanField(term29389, term29389.getClass(), "useThreads", false);
        setField(term29389, term29389.getClass(), "outStream", null);
        setField(term29389, term29389.getClass(), "globalRefMap", null);
        setDoubleField(term29389, term29389.getClass(), "progress", 0.0);
        setField(term29389, term29389.getClass(), "lastPassName", null);
        setField(term29389, term29389.getClass(), "sanityCheck", null);
        setField(term29389, term29389.getClass(), "currentTracer", null);
        setField(term29389, term29389.getClass(), "currentPassName", null);
        setIntField(term29389, term29389.getClass(), "syntheticCodeId", 0);
        setField(term29389, term29389.getClass(), "recentChange", null);
        setField(term29389, term29389.getClass(), "codeChangeHandlers", null);
        setField(term29389, term29389.getClass(), "synthesizedExternsInput", null);
        setField(term29389, term29389.getClass(), "stage", null);
        setField(term29388, term29388.getClass(), "compiler", term29389);
        setField(term29388, term29388.getClass(), "filenamePrefix", null);
        setBooleanField(term29388, term29388.getClass(), "reportDependencies", false);
        setField(term29388, term29388.getClass(), "module", null);
        term29390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29390, term29390.getClass(), "type", 0);
        setField(term29390, term29390.getClass(), "next", null);
        setIntField(term29391, term29391.getClass(), "type", 0);
        setIntField(term29392, term29392.getClass(), "type", 0);
        setField(term29392, term29392.getClass(), "next", null);
        setField(term29392, term29392.getClass(), "first", null);
        setField(term29392, term29392.getClass(), "last", null);
        setField(term29392, term29392.getClass(), "propListHead", null);
        setIntField(term29392, term29392.getClass(), "sourcePosition", 0);
        setField(term29392, term29392.getClass(), "jsType", null);
        setField(term29392, term29392.getClass(), "parent", null);
        setField(term29391, term29391.getClass(), "next", term29392);
        setIntField(term29393, term29393.getClass(), "type", 37);
        setIntField(term29394, term29394.getClass(), "type", 0);
        setField(term29394, term29394.getClass(), "next", null);
        setField(term29394, term29394.getClass(), "first", null);
        setField(term29394, term29394.getClass(), "last", null);
        setField(term29394, term29394.getClass(), "propListHead", null);
        setIntField(term29394, term29394.getClass(), "sourcePosition", 0);
        setField(term29394, term29394.getClass(), "jsType", null);
        setField(term29394, term29394.getClass(), "parent", null);
        setField(term29393, term29393.getClass(), "next", term29394);
        setField(term29393, term29393.getClass(), "first", null);
        setField(term29393, term29393.getClass(), "last", null);
        setField(term29393, term29393.getClass(), "propListHead", null);
        setIntField(term29393, term29393.getClass(), "sourcePosition", 0);
        setField(term29393, term29393.getClass(), "jsType", null);
        setField(term29393, term29393.getClass(), "parent", null);
        setField(term29391, term29391.getClass(), "first", term29393);
        setField(term29391, term29391.getClass(), "last", null);
        setField(term29391, term29391.getClass(), "propListHead", null);
        setIntField(term29391, term29391.getClass(), "sourcePosition", 0);
        setField(term29391, term29391.getClass(), "jsType", null);
        setField(term29391, term29391.getClass(), "parent", null);
        setField(term29390, term29390.getClass(), "first", term29391);
        setField(term29390, term29390.getClass(), "last", null);
        setField(term29390, term29390.getClass(), "propListHead", null);
        setIntField(term29390, term29390.getClass(), "sourcePosition", 0);
        setField(term29390, term29390.getClass(), "jsType", null);
        setField(term29390, term29390.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28667;
        callMethod(klass, "process", argTypes, term28517, args);
        assertTrue(recursiveEquals(term28517, term29388));
        assertTrue(recursiveEquals(term28667, null));
    }

};


