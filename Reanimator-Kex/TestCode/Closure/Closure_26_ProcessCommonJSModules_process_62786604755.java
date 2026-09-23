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

public class ProcessCommonJSModules_process_62786604755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30531;
     Object term30703;
     Object term31140;
     Object term31142;

    public ProcessCommonJSModules_process_62786604755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30531 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term30611 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30531, term30531.getClass(), "compiler", term30611);
        term30703 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30795 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term30703, term30703.getClass(), "type", 0);
        setField(term30703, term30703.getClass(), "parent", null);
        setField(term30795, term30795.getClass(), "next", null);
        setIntField(term30795, term30795.getClass(), "type", 0);
        setField(term30887, term30887.getClass(), "next", null);
        setIntField(term30887, term30887.getClass(), "type", 0);
        setField(term30887, term30887.getClass(), "first", null);
        setField(term30795, term30795.getClass(), "first", term30887);
        setField(term30703, term30703.getClass(), "first", term30795);
        term31140 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term31141 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31141, term31141.getClass(), "options", null);
        setField(term31141, term31141.getClass(), "passes", null);
        setField(term31141, term31141.getClass(), "externs", null);
        setField(term31141, term31141.getClass(), "modules", null);
        setField(term31141, term31141.getClass(), "moduleGraph", null);
        setField(term31141, term31141.getClass(), "inputs", null);
        setField(term31141, term31141.getClass(), "errorManager", null);
        setField(term31141, term31141.getClass(), "warningsGuard", null);
        setField(term31141, term31141.getClass(), "injectedLibraries", null);
        setField(term31141, term31141.getClass(), "externsRoot", null);
        setField(term31141, term31141.getClass(), "jsRoot", null);
        setField(term31141, term31141.getClass(), "externAndJsRoot", null);
        setField(term31141, term31141.getClass(), "inputsById", null);
        setField(term31141, term31141.getClass(), "sourceMap", null);
        setField(term31141, term31141.getClass(), "externExports", null);
        setIntField(term31141, term31141.getClass(), "uniqueNameId", 0);
        setBooleanField(term31141, term31141.getClass(), "useThreads", false);
        setBooleanField(term31141, term31141.getClass(), "hasRegExpGlobalReferences", false);
        setField(term31141, term31141.getClass(), "functionInformationMap", null);
        setField(term31141, term31141.getClass(), "debugLog", null);
        setField(term31141, term31141.getClass(), "defaultCodingConvention", null);
        setField(term31141, term31141.getClass(), "typeRegistry", null);
        setField(term31141, term31141.getClass(), "parserConfig", null);
        setField(term31141, term31141.getClass(), "abstractInterpreter", null);
        setField(term31141, term31141.getClass(), "typeValidator", null);
        setField(term31141, term31141.getClass(), "tracker", null);
        setField(term31141, term31141.getClass(), "oldErrorReporter", null);
        setField(term31141, term31141.getClass(), "defaultErrorReporter", null);
        setField(term31141, term31141.getClass(), "outStream", null);
        setField(term31141, term31141.getClass(), "globalRefMap", null);
        setDoubleField(term31141, term31141.getClass(), "progress", 0.0);
        setField(term31141, term31141.getClass(), "sanityCheck", null);
        setField(term31141, term31141.getClass(), "currentTracer", null);
        setField(term31141, term31141.getClass(), "currentPassName", null);
        setIntField(term31141, term31141.getClass(), "syntheticCodeId", 0);
        setField(term31141, term31141.getClass(), "recentChange", null);
        setField(term31141, term31141.getClass(), "codeChangeHandlers", null);
        setField(term31141, term31141.getClass(), "synthesizedExternsInput", null);
        setField(term31141, term31141.getClass(), "stage", null);
        setField(term31140, term31140.getClass(), "compiler", term31141);
        setField(term31140, term31140.getClass(), "filenamePrefix", null);
        setBooleanField(term31140, term31140.getClass(), "reportDependencies", false);
        setField(term31140, term31140.getClass(), "module", null);
        term31142 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term31143 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term31144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term31142, term31142.getClass(), "number", 0.0);
        setIntField(term31142, term31142.getClass(), "type", 0);
        setField(term31142, term31142.getClass(), "next", null);
        setDoubleField(term31143, term31143.getClass(), "number", 0.0);
        setIntField(term31143, term31143.getClass(), "type", 0);
        setField(term31143, term31143.getClass(), "next", null);
        setDoubleField(term31144, term31144.getClass(), "number", 0.0);
        setIntField(term31144, term31144.getClass(), "type", 0);
        setField(term31144, term31144.getClass(), "next", null);
        setField(term31144, term31144.getClass(), "first", null);
        setField(term31144, term31144.getClass(), "last", null);
        setField(term31144, term31144.getClass(), "propListHead", null);
        setIntField(term31144, term31144.getClass(), "sourcePosition", 0);
        setField(term31144, term31144.getClass(), "jsType", null);
        setField(term31144, term31144.getClass(), "parent", null);
        setField(term31143, term31143.getClass(), "first", term31144);
        setField(term31143, term31143.getClass(), "last", null);
        setField(term31143, term31143.getClass(), "propListHead", null);
        setIntField(term31143, term31143.getClass(), "sourcePosition", 0);
        setField(term31143, term31143.getClass(), "jsType", null);
        setField(term31143, term31143.getClass(), "parent", null);
        setField(term31142, term31142.getClass(), "first", term31143);
        setField(term31142, term31142.getClass(), "last", null);
        setField(term31142, term31142.getClass(), "propListHead", null);
        setIntField(term31142, term31142.getClass(), "sourcePosition", 0);
        setField(term31142, term31142.getClass(), "jsType", null);
        setField(term31142, term31142.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30703;
        callMethod(klass, "process", argTypes, term30531, args);
        assertTrue(recursiveEquals(term30531, term31140));
        assertTrue(recursiveEquals(term30703, null));
    }

};


