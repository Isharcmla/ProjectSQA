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

public class ProcessCommonJSModules_process_627866047168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81286;
     Object term81436;
     Object term83143;
     Object term83145;

    public ProcessCommonJSModules_process_627866047168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81286 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term81366 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term81286, term81286.getClass(), "compiler", term81366);
        term81436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81528 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term81598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term81760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81436, term81436.getClass(), "type", 0);
        setField(term81436, term81436.getClass(), "parent", null);
        setField(term81528, term81528.getClass(), "next", term81598);
        setIntField(term81528, term81528.getClass(), "type", 37);
        setField(term81760, term81760.getClass(), "next", null);
        setIntField(term81760, term81760.getClass(), "type", 0);
        setField(term81760, term81760.getClass(), "first", null);
        setField(term81690, term81690.getClass(), "next", term81760);
        setIntField(term81690, term81690.getClass(), "type", 0);
        setField(term81690, term81690.getClass(), "first", null);
        setField(term81528, term81528.getClass(), "first", term81690);
        setField(term81436, term81436.getClass(), "first", term81528);
        term83143 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term83144 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term83144, term83144.getClass(), "options", null);
        setField(term83144, term83144.getClass(), "passes", null);
        setField(term83144, term83144.getClass(), "externs", null);
        setField(term83144, term83144.getClass(), "modules", null);
        setField(term83144, term83144.getClass(), "moduleGraph", null);
        setField(term83144, term83144.getClass(), "inputs", null);
        setField(term83144, term83144.getClass(), "errorManager", null);
        setField(term83144, term83144.getClass(), "warningsGuard", null);
        setField(term83144, term83144.getClass(), "injectedLibraries", null);
        setField(term83144, term83144.getClass(), "externsRoot", null);
        setField(term83144, term83144.getClass(), "jsRoot", null);
        setField(term83144, term83144.getClass(), "externAndJsRoot", null);
        setField(term83144, term83144.getClass(), "inputsById", null);
        setField(term83144, term83144.getClass(), "sourceMap", null);
        setField(term83144, term83144.getClass(), "externExports", null);
        setIntField(term83144, term83144.getClass(), "uniqueNameId", 0);
        setBooleanField(term83144, term83144.getClass(), "hasRegExpGlobalReferences", false);
        setField(term83144, term83144.getClass(), "functionInformationMap", null);
        setField(term83144, term83144.getClass(), "debugLog", null);
        setField(term83144, term83144.getClass(), "defaultCodingConvention", null);
        setField(term83144, term83144.getClass(), "typeRegistry", null);
        setField(term83144, term83144.getClass(), "parserConfig", null);
        setField(term83144, term83144.getClass(), "abstractInterpreter", null);
        setField(term83144, term83144.getClass(), "typeValidator", null);
        setField(term83144, term83144.getClass(), "tracker", null);
        setField(term83144, term83144.getClass(), "oldErrorReporter", null);
        setField(term83144, term83144.getClass(), "defaultErrorReporter", null);
        setField(term83144, term83144.getClass(), "compilerThread", null);
        setBooleanField(term83144, term83144.getClass(), "useThreads", false);
        setField(term83144, term83144.getClass(), "outStream", null);
        setField(term83144, term83144.getClass(), "globalRefMap", null);
        setDoubleField(term83144, term83144.getClass(), "progress", 0.0);
        setField(term83144, term83144.getClass(), "lastPassName", null);
        setField(term83144, term83144.getClass(), "sanityCheck", null);
        setField(term83144, term83144.getClass(), "currentTracer", null);
        setField(term83144, term83144.getClass(), "currentPassName", null);
        setIntField(term83144, term83144.getClass(), "syntheticCodeId", 0);
        setField(term83144, term83144.getClass(), "recentChange", null);
        setField(term83144, term83144.getClass(), "codeChangeHandlers", null);
        setField(term83144, term83144.getClass(), "synthesizedExternsInput", null);
        setField(term83144, term83144.getClass(), "stage", null);
        setField(term83143, term83143.getClass(), "compiler", term83144);
        setField(term83143, term83143.getClass(), "filenamePrefix", null);
        setBooleanField(term83143, term83143.getClass(), "reportDependencies", false);
        setField(term83143, term83143.getClass(), "module", null);
        term83145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83148 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83145, term83145.getClass(), "type", 0);
        setField(term83145, term83145.getClass(), "next", null);
        setDoubleField(term83146, term83146.getClass(), "number", 0.0);
        setIntField(term83146, term83146.getClass(), "type", 37);
        setIntField(term83147, term83147.getClass(), "type", 0);
        setField(term83147, term83147.getClass(), "next", null);
        setField(term83147, term83147.getClass(), "first", null);
        setField(term83147, term83147.getClass(), "last", null);
        setField(term83147, term83147.getClass(), "propListHead", null);
        setIntField(term83147, term83147.getClass(), "sourcePosition", 0);
        setField(term83147, term83147.getClass(), "jsType", null);
        setField(term83147, term83147.getClass(), "parent", null);
        setField(term83146, term83146.getClass(), "next", term83147);
        setDoubleField(term83148, term83148.getClass(), "number", 0.0);
        setIntField(term83148, term83148.getClass(), "type", 0);
        setIntField(term83149, term83149.getClass(), "type", 0);
        setField(term83149, term83149.getClass(), "next", null);
        setField(term83149, term83149.getClass(), "first", null);
        setField(term83149, term83149.getClass(), "last", null);
        setField(term83149, term83149.getClass(), "propListHead", null);
        setIntField(term83149, term83149.getClass(), "sourcePosition", 0);
        setField(term83149, term83149.getClass(), "jsType", null);
        setField(term83149, term83149.getClass(), "parent", null);
        setField(term83148, term83148.getClass(), "next", term83149);
        setField(term83148, term83148.getClass(), "first", null);
        setField(term83148, term83148.getClass(), "last", null);
        setField(term83148, term83148.getClass(), "propListHead", null);
        setIntField(term83148, term83148.getClass(), "sourcePosition", 0);
        setField(term83148, term83148.getClass(), "jsType", null);
        setField(term83148, term83148.getClass(), "parent", null);
        setField(term83146, term83146.getClass(), "first", term83148);
        setField(term83146, term83146.getClass(), "last", null);
        setField(term83146, term83146.getClass(), "propListHead", null);
        setIntField(term83146, term83146.getClass(), "sourcePosition", 0);
        setField(term83146, term83146.getClass(), "jsType", null);
        setField(term83146, term83146.getClass(), "parent", null);
        setField(term83145, term83145.getClass(), "first", term83146);
        setField(term83145, term83145.getClass(), "last", null);
        setField(term83145, term83145.getClass(), "propListHead", null);
        setIntField(term83145, term83145.getClass(), "sourcePosition", 0);
        setField(term83145, term83145.getClass(), "jsType", null);
        setField(term83145, term83145.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81436;
        callMethod(klass, "process", argTypes, term81286, args);
        assertTrue(recursiveEquals(term81286, term83143));
        assertTrue(recursiveEquals(term81436, null));
    }

};


