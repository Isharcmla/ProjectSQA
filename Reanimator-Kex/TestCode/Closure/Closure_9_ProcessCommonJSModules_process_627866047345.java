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

public class ProcessCommonJSModules_process_627866047345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181557;
     Object term181707;
     Object term182289;
     Object term182291;

    public ProcessCommonJSModules_process_627866047345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181557 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term181637 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term181557, term181557.getClass(), "compiler", term181637);
        term181707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term181707, term181707.getClass(), "type", 0);
        setField(term181707, term181707.getClass(), "parent", null);
        setField(term181777, term181777.getClass(), "next", term181847);
        setIntField(term181777, term181777.getClass(), "type", 0);
        setField(term181917, term181917.getClass(), "next", null);
        setIntField(term181917, term181917.getClass(), "type", 37);
        setField(term181917, term181917.getClass(), "first", null);
        setField(term181777, term181777.getClass(), "first", term181917);
        setField(term181707, term181707.getClass(), "first", term181777);
        term182289 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term182290 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term182290, term182290.getClass(), "options", null);
        setField(term182290, term182290.getClass(), "passes", null);
        setField(term182290, term182290.getClass(), "externs", null);
        setField(term182290, term182290.getClass(), "modules", null);
        setField(term182290, term182290.getClass(), "moduleGraph", null);
        setField(term182290, term182290.getClass(), "inputs", null);
        setField(term182290, term182290.getClass(), "errorManager", null);
        setField(term182290, term182290.getClass(), "warningsGuard", null);
        setField(term182290, term182290.getClass(), "injectedLibraries", null);
        setField(term182290, term182290.getClass(), "externsRoot", null);
        setField(term182290, term182290.getClass(), "jsRoot", null);
        setField(term182290, term182290.getClass(), "externAndJsRoot", null);
        setField(term182290, term182290.getClass(), "inputsById", null);
        setField(term182290, term182290.getClass(), "sourceMap", null);
        setField(term182290, term182290.getClass(), "externExports", null);
        setIntField(term182290, term182290.getClass(), "uniqueNameId", 0);
        setBooleanField(term182290, term182290.getClass(), "hasRegExpGlobalReferences", false);
        setField(term182290, term182290.getClass(), "functionInformationMap", null);
        setField(term182290, term182290.getClass(), "debugLog", null);
        setField(term182290, term182290.getClass(), "defaultCodingConvention", null);
        setField(term182290, term182290.getClass(), "typeRegistry", null);
        setField(term182290, term182290.getClass(), "parserConfig", null);
        setField(term182290, term182290.getClass(), "abstractInterpreter", null);
        setField(term182290, term182290.getClass(), "typeValidator", null);
        setField(term182290, term182290.getClass(), "tracker", null);
        setField(term182290, term182290.getClass(), "oldErrorReporter", null);
        setField(term182290, term182290.getClass(), "defaultErrorReporter", null);
        setField(term182290, term182290.getClass(), "compilerThread", null);
        setBooleanField(term182290, term182290.getClass(), "useThreads", false);
        setField(term182290, term182290.getClass(), "outStream", null);
        setField(term182290, term182290.getClass(), "globalRefMap", null);
        setDoubleField(term182290, term182290.getClass(), "progress", 0.0);
        setField(term182290, term182290.getClass(), "lastPassName", null);
        setField(term182290, term182290.getClass(), "sanityCheck", null);
        setField(term182290, term182290.getClass(), "currentTracer", null);
        setField(term182290, term182290.getClass(), "currentPassName", null);
        setIntField(term182290, term182290.getClass(), "syntheticCodeId", 0);
        setField(term182290, term182290.getClass(), "recentChange", null);
        setField(term182290, term182290.getClass(), "codeChangeHandlers", null);
        setField(term182290, term182290.getClass(), "synthesizedExternsInput", null);
        setField(term182290, term182290.getClass(), "stage", null);
        setField(term182289, term182289.getClass(), "compiler", term182290);
        setField(term182289, term182289.getClass(), "filenamePrefix", null);
        setBooleanField(term182289, term182289.getClass(), "reportDependencies", false);
        setField(term182289, term182289.getClass(), "module", null);
        term182291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term182291, term182291.getClass(), "type", 0);
        setField(term182291, term182291.getClass(), "next", null);
        setIntField(term182292, term182292.getClass(), "type", 0);
        setIntField(term182293, term182293.getClass(), "type", 0);
        setField(term182293, term182293.getClass(), "next", null);
        setField(term182293, term182293.getClass(), "first", null);
        setField(term182293, term182293.getClass(), "last", null);
        setField(term182293, term182293.getClass(), "propListHead", null);
        setIntField(term182293, term182293.getClass(), "sourcePosition", 0);
        setField(term182293, term182293.getClass(), "jsType", null);
        setField(term182293, term182293.getClass(), "parent", null);
        setField(term182292, term182292.getClass(), "next", term182293);
        setIntField(term182294, term182294.getClass(), "type", 37);
        setField(term182294, term182294.getClass(), "next", null);
        setField(term182294, term182294.getClass(), "first", null);
        setField(term182294, term182294.getClass(), "last", null);
        setField(term182294, term182294.getClass(), "propListHead", null);
        setIntField(term182294, term182294.getClass(), "sourcePosition", 0);
        setField(term182294, term182294.getClass(), "jsType", null);
        setField(term182294, term182294.getClass(), "parent", null);
        setField(term182292, term182292.getClass(), "first", term182294);
        setField(term182292, term182292.getClass(), "last", null);
        setField(term182292, term182292.getClass(), "propListHead", null);
        setIntField(term182292, term182292.getClass(), "sourcePosition", 0);
        setField(term182292, term182292.getClass(), "jsType", null);
        setField(term182292, term182292.getClass(), "parent", null);
        setField(term182291, term182291.getClass(), "first", term182292);
        setField(term182291, term182291.getClass(), "last", null);
        setField(term182291, term182291.getClass(), "propListHead", null);
        setIntField(term182291, term182291.getClass(), "sourcePosition", 0);
        setField(term182291, term182291.getClass(), "jsType", null);
        setField(term182291, term182291.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term181707;
        callMethod(klass, "process", argTypes, term181557, args);
        assertTrue(recursiveEquals(term181557, term182289));
        assertTrue(recursiveEquals(term181707, null));
    }

};


