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

public class ProcessCommonJSModules_process_627866047358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190011;
     Object term190183;
     Object term191775;
     Object term191777;

    public ProcessCommonJSModules_process_627866047358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190011 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term190091 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term190011, term190011.getClass(), "compiler", term190091);
        term190183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term190275 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term190345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term190529 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term190183, term190183.getClass(), "type", 0);
        setField(term190183, term190183.getClass(), "parent", null);
        setField(term190275, term190275.getClass(), "next", term190345);
        setIntField(term190275, term190275.getClass(), "type", 37);
        setField(term190529, term190529.getClass(), "next", null);
        setIntField(term190529, term190529.getClass(), "type", 0);
        setField(term190529, term190529.getClass(), "first", null);
        setField(term190437, term190437.getClass(), "next", term190529);
        setIntField(term190437, term190437.getClass(), "type", 37);
        setField(term190437, term190437.getClass(), "first", null);
        setField(term190275, term190275.getClass(), "first", term190437);
        setField(term190183, term190183.getClass(), "first", term190275);
        term191775 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term191776 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term191776, term191776.getClass(), "options", null);
        setField(term191776, term191776.getClass(), "passes", null);
        setField(term191776, term191776.getClass(), "externs", null);
        setField(term191776, term191776.getClass(), "modules", null);
        setField(term191776, term191776.getClass(), "moduleGraph", null);
        setField(term191776, term191776.getClass(), "inputs", null);
        setField(term191776, term191776.getClass(), "errorManager", null);
        setField(term191776, term191776.getClass(), "warningsGuard", null);
        setField(term191776, term191776.getClass(), "injectedLibraries", null);
        setField(term191776, term191776.getClass(), "externsRoot", null);
        setField(term191776, term191776.getClass(), "jsRoot", null);
        setField(term191776, term191776.getClass(), "externAndJsRoot", null);
        setField(term191776, term191776.getClass(), "inputsById", null);
        setField(term191776, term191776.getClass(), "sourceMap", null);
        setField(term191776, term191776.getClass(), "externExports", null);
        setIntField(term191776, term191776.getClass(), "uniqueNameId", 0);
        setBooleanField(term191776, term191776.getClass(), "hasRegExpGlobalReferences", false);
        setField(term191776, term191776.getClass(), "functionInformationMap", null);
        setField(term191776, term191776.getClass(), "debugLog", null);
        setField(term191776, term191776.getClass(), "defaultCodingConvention", null);
        setField(term191776, term191776.getClass(), "typeRegistry", null);
        setField(term191776, term191776.getClass(), "parserConfig", null);
        setField(term191776, term191776.getClass(), "abstractInterpreter", null);
        setField(term191776, term191776.getClass(), "typeValidator", null);
        setField(term191776, term191776.getClass(), "tracker", null);
        setField(term191776, term191776.getClass(), "oldErrorReporter", null);
        setField(term191776, term191776.getClass(), "defaultErrorReporter", null);
        setField(term191776, term191776.getClass(), "compilerThread", null);
        setBooleanField(term191776, term191776.getClass(), "useThreads", false);
        setField(term191776, term191776.getClass(), "outStream", null);
        setField(term191776, term191776.getClass(), "globalRefMap", null);
        setDoubleField(term191776, term191776.getClass(), "progress", 0.0);
        setField(term191776, term191776.getClass(), "lastPassName", null);
        setField(term191776, term191776.getClass(), "sanityCheck", null);
        setField(term191776, term191776.getClass(), "currentTracer", null);
        setField(term191776, term191776.getClass(), "currentPassName", null);
        setIntField(term191776, term191776.getClass(), "syntheticCodeId", 0);
        setField(term191776, term191776.getClass(), "recentChange", null);
        setField(term191776, term191776.getClass(), "codeChangeHandlers", null);
        setField(term191776, term191776.getClass(), "synthesizedExternsInput", null);
        setField(term191776, term191776.getClass(), "stage", null);
        setField(term191775, term191775.getClass(), "compiler", term191776);
        setField(term191775, term191775.getClass(), "filenamePrefix", null);
        setBooleanField(term191775, term191775.getClass(), "reportDependencies", false);
        setField(term191775, term191775.getClass(), "module", null);
        term191777 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191778 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191780 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191781 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term191777, term191777.getClass(), "number", 0.0);
        setIntField(term191777, term191777.getClass(), "type", 0);
        setField(term191777, term191777.getClass(), "next", null);
        setDoubleField(term191778, term191778.getClass(), "number", 0.0);
        setIntField(term191778, term191778.getClass(), "type", 37);
        setIntField(term191779, term191779.getClass(), "type", 0);
        setField(term191779, term191779.getClass(), "next", null);
        setField(term191779, term191779.getClass(), "first", null);
        setField(term191779, term191779.getClass(), "last", null);
        setField(term191779, term191779.getClass(), "propListHead", null);
        setIntField(term191779, term191779.getClass(), "sourcePosition", 0);
        setField(term191779, term191779.getClass(), "jsType", null);
        setField(term191779, term191779.getClass(), "parent", null);
        setField(term191778, term191778.getClass(), "next", term191779);
        setDoubleField(term191780, term191780.getClass(), "number", 0.0);
        setIntField(term191780, term191780.getClass(), "type", 37);
        setDoubleField(term191781, term191781.getClass(), "number", 0.0);
        setIntField(term191781, term191781.getClass(), "type", 0);
        setField(term191781, term191781.getClass(), "next", null);
        setField(term191781, term191781.getClass(), "first", null);
        setField(term191781, term191781.getClass(), "last", null);
        setField(term191781, term191781.getClass(), "propListHead", null);
        setIntField(term191781, term191781.getClass(), "sourcePosition", 0);
        setField(term191781, term191781.getClass(), "jsType", null);
        setField(term191781, term191781.getClass(), "parent", null);
        setField(term191780, term191780.getClass(), "next", term191781);
        setField(term191780, term191780.getClass(), "first", null);
        setField(term191780, term191780.getClass(), "last", null);
        setField(term191780, term191780.getClass(), "propListHead", null);
        setIntField(term191780, term191780.getClass(), "sourcePosition", 0);
        setField(term191780, term191780.getClass(), "jsType", null);
        setField(term191780, term191780.getClass(), "parent", null);
        setField(term191778, term191778.getClass(), "first", term191780);
        setField(term191778, term191778.getClass(), "last", null);
        setField(term191778, term191778.getClass(), "propListHead", null);
        setIntField(term191778, term191778.getClass(), "sourcePosition", 0);
        setField(term191778, term191778.getClass(), "jsType", null);
        setField(term191778, term191778.getClass(), "parent", null);
        setField(term191777, term191777.getClass(), "first", term191778);
        setField(term191777, term191777.getClass(), "last", null);
        setField(term191777, term191777.getClass(), "propListHead", null);
        setIntField(term191777, term191777.getClass(), "sourcePosition", 0);
        setField(term191777, term191777.getClass(), "jsType", null);
        setField(term191777, term191777.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term190183;
        callMethod(klass, "process", argTypes, term190011, args);
        assertTrue(recursiveEquals(term190011, term191775));
        assertTrue(recursiveEquals(term190183, null));
    }

};


