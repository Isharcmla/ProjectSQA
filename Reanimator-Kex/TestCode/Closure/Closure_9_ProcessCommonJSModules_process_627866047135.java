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

public class ProcessCommonJSModules_process_627866047135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62703;
     Object term62853;
     Object term63539;
     Object term63541;

    public ProcessCommonJSModules_process_627866047135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62703 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term62783 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term62703, term62703.getClass(), "compiler", term62783);
        term62853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62945 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term62853, term62853.getClass(), "type", 37);
        setField(term62853, term62853.getClass(), "parent", null);
        setField(term63037, term63037.getClass(), "next", null);
        setIntField(term63037, term63037.getClass(), "type", 0);
        setField(term63037, term63037.getClass(), "first", null);
        setField(term62945, term62945.getClass(), "next", term63037);
        setIntField(term62945, term62945.getClass(), "type", 0);
        setField(term63129, term63129.getClass(), "next", null);
        setIntField(term63129, term63129.getClass(), "type", 37);
        setField(term63129, term63129.getClass(), "first", null);
        setField(term62945, term62945.getClass(), "first", term63129);
        setField(term62853, term62853.getClass(), "first", term62945);
        term63539 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term63540 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term63540, term63540.getClass(), "options", null);
        setField(term63540, term63540.getClass(), "passes", null);
        setField(term63540, term63540.getClass(), "externs", null);
        setField(term63540, term63540.getClass(), "modules", null);
        setField(term63540, term63540.getClass(), "moduleGraph", null);
        setField(term63540, term63540.getClass(), "inputs", null);
        setField(term63540, term63540.getClass(), "errorManager", null);
        setField(term63540, term63540.getClass(), "warningsGuard", null);
        setField(term63540, term63540.getClass(), "injectedLibraries", null);
        setField(term63540, term63540.getClass(), "externsRoot", null);
        setField(term63540, term63540.getClass(), "jsRoot", null);
        setField(term63540, term63540.getClass(), "externAndJsRoot", null);
        setField(term63540, term63540.getClass(), "inputsById", null);
        setField(term63540, term63540.getClass(), "sourceMap", null);
        setField(term63540, term63540.getClass(), "externExports", null);
        setIntField(term63540, term63540.getClass(), "uniqueNameId", 0);
        setBooleanField(term63540, term63540.getClass(), "hasRegExpGlobalReferences", false);
        setField(term63540, term63540.getClass(), "functionInformationMap", null);
        setField(term63540, term63540.getClass(), "debugLog", null);
        setField(term63540, term63540.getClass(), "defaultCodingConvention", null);
        setField(term63540, term63540.getClass(), "typeRegistry", null);
        setField(term63540, term63540.getClass(), "parserConfig", null);
        setField(term63540, term63540.getClass(), "abstractInterpreter", null);
        setField(term63540, term63540.getClass(), "typeValidator", null);
        setField(term63540, term63540.getClass(), "tracker", null);
        setField(term63540, term63540.getClass(), "oldErrorReporter", null);
        setField(term63540, term63540.getClass(), "defaultErrorReporter", null);
        setField(term63540, term63540.getClass(), "compilerThread", null);
        setBooleanField(term63540, term63540.getClass(), "useThreads", false);
        setField(term63540, term63540.getClass(), "outStream", null);
        setField(term63540, term63540.getClass(), "globalRefMap", null);
        setDoubleField(term63540, term63540.getClass(), "progress", 0.0);
        setField(term63540, term63540.getClass(), "lastPassName", null);
        setField(term63540, term63540.getClass(), "sanityCheck", null);
        setField(term63540, term63540.getClass(), "currentTracer", null);
        setField(term63540, term63540.getClass(), "currentPassName", null);
        setIntField(term63540, term63540.getClass(), "syntheticCodeId", 0);
        setField(term63540, term63540.getClass(), "recentChange", null);
        setField(term63540, term63540.getClass(), "codeChangeHandlers", null);
        setField(term63540, term63540.getClass(), "synthesizedExternsInput", null);
        setField(term63540, term63540.getClass(), "stage", null);
        setField(term63539, term63539.getClass(), "compiler", term63540);
        setField(term63539, term63539.getClass(), "filenamePrefix", null);
        setBooleanField(term63539, term63539.getClass(), "reportDependencies", false);
        setField(term63539, term63539.getClass(), "module", null);
        term63541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63542 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63543 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63544 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term63541, term63541.getClass(), "type", 37);
        setField(term63541, term63541.getClass(), "next", null);
        setDoubleField(term63542, term63542.getClass(), "number", 0.0);
        setIntField(term63542, term63542.getClass(), "type", 0);
        setDoubleField(term63543, term63543.getClass(), "number", 0.0);
        setIntField(term63543, term63543.getClass(), "type", 0);
        setField(term63543, term63543.getClass(), "next", null);
        setField(term63543, term63543.getClass(), "first", null);
        setField(term63543, term63543.getClass(), "last", null);
        setField(term63543, term63543.getClass(), "propListHead", null);
        setIntField(term63543, term63543.getClass(), "sourcePosition", 0);
        setField(term63543, term63543.getClass(), "jsType", null);
        setField(term63543, term63543.getClass(), "parent", null);
        setField(term63542, term63542.getClass(), "next", term63543);
        setDoubleField(term63544, term63544.getClass(), "number", 0.0);
        setIntField(term63544, term63544.getClass(), "type", 37);
        setField(term63544, term63544.getClass(), "next", null);
        setField(term63544, term63544.getClass(), "first", null);
        setField(term63544, term63544.getClass(), "last", null);
        setField(term63544, term63544.getClass(), "propListHead", null);
        setIntField(term63544, term63544.getClass(), "sourcePosition", 0);
        setField(term63544, term63544.getClass(), "jsType", null);
        setField(term63544, term63544.getClass(), "parent", null);
        setField(term63542, term63542.getClass(), "first", term63544);
        setField(term63542, term63542.getClass(), "last", null);
        setField(term63542, term63542.getClass(), "propListHead", null);
        setIntField(term63542, term63542.getClass(), "sourcePosition", 0);
        setField(term63542, term63542.getClass(), "jsType", null);
        setField(term63542, term63542.getClass(), "parent", null);
        setField(term63541, term63541.getClass(), "first", term63542);
        setField(term63541, term63541.getClass(), "last", null);
        setField(term63541, term63541.getClass(), "propListHead", null);
        setIntField(term63541, term63541.getClass(), "sourcePosition", 0);
        setField(term63541, term63541.getClass(), "jsType", null);
        setField(term63541, term63541.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term62853;
        callMethod(klass, "process", argTypes, term62703, args);
        assertTrue(recursiveEquals(term62703, term63539));
        assertTrue(recursiveEquals(term62853, null));
    }

};


