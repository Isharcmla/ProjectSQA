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

public class ProcessCommonJSModules_process_62786604771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38540;
     Object term38690;
     Object term39233;
     Object term39235;

    public ProcessCommonJSModules_process_62786604771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38540 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term38620 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38540, term38540.getClass(), "compiler", term38620);
        term38690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38690, term38690.getClass(), "type", 0);
        setField(term38690, term38690.getClass(), "parent", null);
        setField(term38760, term38760.getClass(), "next", null);
        setIntField(term38760, term38760.getClass(), "type", 33);
        setField(term38900, term38900.getClass(), "next", null);
        setIntField(term38900, term38900.getClass(), "type", 0);
        setField(term38900, term38900.getClass(), "first", null);
        setField(term38830, term38830.getClass(), "next", term38900);
        setIntField(term38830, term38830.getClass(), "type", 0);
        setField(term38830, term38830.getClass(), "first", null);
        setField(term38760, term38760.getClass(), "first", term38830);
        setField(term38690, term38690.getClass(), "first", term38760);
        term39233 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term39234 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term39234, term39234.getClass(), "options", null);
        setField(term39234, term39234.getClass(), "passes", null);
        setField(term39234, term39234.getClass(), "externs", null);
        setField(term39234, term39234.getClass(), "modules", null);
        setField(term39234, term39234.getClass(), "moduleGraph", null);
        setField(term39234, term39234.getClass(), "inputs", null);
        setField(term39234, term39234.getClass(), "errorManager", null);
        setField(term39234, term39234.getClass(), "warningsGuard", null);
        setField(term39234, term39234.getClass(), "injectedLibraries", null);
        setField(term39234, term39234.getClass(), "externsRoot", null);
        setField(term39234, term39234.getClass(), "jsRoot", null);
        setField(term39234, term39234.getClass(), "externAndJsRoot", null);
        setField(term39234, term39234.getClass(), "inputsById", null);
        setField(term39234, term39234.getClass(), "sourceMap", null);
        setField(term39234, term39234.getClass(), "externExports", null);
        setIntField(term39234, term39234.getClass(), "uniqueNameId", 0);
        setBooleanField(term39234, term39234.getClass(), "useThreads", false);
        setBooleanField(term39234, term39234.getClass(), "hasRegExpGlobalReferences", false);
        setField(term39234, term39234.getClass(), "functionInformationMap", null);
        setField(term39234, term39234.getClass(), "debugLog", null);
        setField(term39234, term39234.getClass(), "defaultCodingConvention", null);
        setField(term39234, term39234.getClass(), "typeRegistry", null);
        setField(term39234, term39234.getClass(), "parserConfig", null);
        setField(term39234, term39234.getClass(), "abstractInterpreter", null);
        setField(term39234, term39234.getClass(), "typeValidator", null);
        setField(term39234, term39234.getClass(), "tracker", null);
        setField(term39234, term39234.getClass(), "oldErrorReporter", null);
        setField(term39234, term39234.getClass(), "defaultErrorReporter", null);
        setField(term39234, term39234.getClass(), "outStream", null);
        setField(term39234, term39234.getClass(), "globalRefMap", null);
        setDoubleField(term39234, term39234.getClass(), "progress", 0.0);
        setField(term39234, term39234.getClass(), "sanityCheck", null);
        setField(term39234, term39234.getClass(), "currentTracer", null);
        setField(term39234, term39234.getClass(), "currentPassName", null);
        setIntField(term39234, term39234.getClass(), "syntheticCodeId", 0);
        setField(term39234, term39234.getClass(), "recentChange", null);
        setField(term39234, term39234.getClass(), "codeChangeHandlers", null);
        setField(term39234, term39234.getClass(), "synthesizedExternsInput", null);
        setField(term39234, term39234.getClass(), "stage", null);
        setField(term39233, term39233.getClass(), "compiler", term39234);
        setField(term39233, term39233.getClass(), "filenamePrefix", null);
        setBooleanField(term39233, term39233.getClass(), "reportDependencies", false);
        setField(term39233, term39233.getClass(), "module", null);
        term39235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39235, term39235.getClass(), "type", 0);
        setField(term39235, term39235.getClass(), "next", null);
        setIntField(term39236, term39236.getClass(), "type", 33);
        setField(term39236, term39236.getClass(), "next", null);
        setIntField(term39237, term39237.getClass(), "type", 0);
        setIntField(term39238, term39238.getClass(), "type", 0);
        setField(term39238, term39238.getClass(), "next", null);
        setField(term39238, term39238.getClass(), "first", null);
        setField(term39238, term39238.getClass(), "last", null);
        setField(term39238, term39238.getClass(), "propListHead", null);
        setIntField(term39238, term39238.getClass(), "sourcePosition", 0);
        setField(term39238, term39238.getClass(), "jsType", null);
        setField(term39238, term39238.getClass(), "parent", null);
        setField(term39237, term39237.getClass(), "next", term39238);
        setField(term39237, term39237.getClass(), "first", null);
        setField(term39237, term39237.getClass(), "last", null);
        setField(term39237, term39237.getClass(), "propListHead", null);
        setIntField(term39237, term39237.getClass(), "sourcePosition", 0);
        setField(term39237, term39237.getClass(), "jsType", null);
        setField(term39237, term39237.getClass(), "parent", null);
        setField(term39236, term39236.getClass(), "first", term39237);
        setField(term39236, term39236.getClass(), "last", null);
        setField(term39236, term39236.getClass(), "propListHead", null);
        setIntField(term39236, term39236.getClass(), "sourcePosition", 0);
        setField(term39236, term39236.getClass(), "jsType", null);
        setField(term39236, term39236.getClass(), "parent", null);
        setField(term39235, term39235.getClass(), "first", term39236);
        setField(term39235, term39235.getClass(), "last", null);
        setField(term39235, term39235.getClass(), "propListHead", null);
        setIntField(term39235, term39235.getClass(), "sourcePosition", 0);
        setField(term39235, term39235.getClass(), "jsType", null);
        setField(term39235, term39235.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term38690;
        callMethod(klass, "process", argTypes, term38540, args);
        assertTrue(recursiveEquals(term38540, term39233));
        assertTrue(recursiveEquals(term38690, null));
    }

};


