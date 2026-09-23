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

public class ProcessCommonJSModules_process_62786604788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35387;
     Object term35559;
     Object term36927;
     Object term36929;

    public ProcessCommonJSModules_process_62786604788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35387 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term35467 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term35387, term35387.getClass(), "compiler", term35467);
        term35559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35743 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35559, term35559.getClass(), "type", 0);
        setField(term35559, term35559.getClass(), "parent", null);
        setField(term35651, term35651.getClass(), "next", term35743);
        setIntField(term35651, term35651.getClass(), "type", 0);
        setField(term35835, term35835.getClass(), "next", null);
        setIntField(term35835, term35835.getClass(), "type", 0);
        setField(term35835, term35835.getClass(), "first", null);
        setField(term35651, term35651.getClass(), "first", term35835);
        setField(term35559, term35559.getClass(), "first", term35651);
        term36927 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term36928 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term36928, term36928.getClass(), "options", null);
        setField(term36928, term36928.getClass(), "passes", null);
        setField(term36928, term36928.getClass(), "externs", null);
        setField(term36928, term36928.getClass(), "modules", null);
        setField(term36928, term36928.getClass(), "moduleGraph", null);
        setField(term36928, term36928.getClass(), "inputs", null);
        setField(term36928, term36928.getClass(), "errorManager", null);
        setField(term36928, term36928.getClass(), "warningsGuard", null);
        setField(term36928, term36928.getClass(), "injectedLibraries", null);
        setField(term36928, term36928.getClass(), "externsRoot", null);
        setField(term36928, term36928.getClass(), "jsRoot", null);
        setField(term36928, term36928.getClass(), "externAndJsRoot", null);
        setField(term36928, term36928.getClass(), "inputsById", null);
        setField(term36928, term36928.getClass(), "sourceMap", null);
        setField(term36928, term36928.getClass(), "externExports", null);
        setIntField(term36928, term36928.getClass(), "uniqueNameId", 0);
        setBooleanField(term36928, term36928.getClass(), "hasRegExpGlobalReferences", false);
        setField(term36928, term36928.getClass(), "functionInformationMap", null);
        setField(term36928, term36928.getClass(), "debugLog", null);
        setField(term36928, term36928.getClass(), "defaultCodingConvention", null);
        setField(term36928, term36928.getClass(), "typeRegistry", null);
        setField(term36928, term36928.getClass(), "parserConfig", null);
        setField(term36928, term36928.getClass(), "abstractInterpreter", null);
        setField(term36928, term36928.getClass(), "typeValidator", null);
        setField(term36928, term36928.getClass(), "tracker", null);
        setField(term36928, term36928.getClass(), "oldErrorReporter", null);
        setField(term36928, term36928.getClass(), "defaultErrorReporter", null);
        setField(term36928, term36928.getClass(), "compilerThread", null);
        setBooleanField(term36928, term36928.getClass(), "useThreads", false);
        setField(term36928, term36928.getClass(), "outStream", null);
        setField(term36928, term36928.getClass(), "globalRefMap", null);
        setDoubleField(term36928, term36928.getClass(), "progress", 0.0);
        setField(term36928, term36928.getClass(), "lastPassName", null);
        setField(term36928, term36928.getClass(), "sanityCheck", null);
        setField(term36928, term36928.getClass(), "currentTracer", null);
        setField(term36928, term36928.getClass(), "currentPassName", null);
        setIntField(term36928, term36928.getClass(), "syntheticCodeId", 0);
        setField(term36928, term36928.getClass(), "recentChange", null);
        setField(term36928, term36928.getClass(), "codeChangeHandlers", null);
        setField(term36928, term36928.getClass(), "synthesizedExternsInput", null);
        setField(term36928, term36928.getClass(), "stage", null);
        setField(term36927, term36927.getClass(), "compiler", term36928);
        setField(term36927, term36927.getClass(), "filenamePrefix", null);
        setBooleanField(term36927, term36927.getClass(), "reportDependencies", false);
        setField(term36927, term36927.getClass(), "module", null);
        term36929 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term36929, term36929.getClass(), "number", 0.0);
        setIntField(term36929, term36929.getClass(), "type", 0);
        setField(term36929, term36929.getClass(), "next", null);
        setDoubleField(term36930, term36930.getClass(), "number", 0.0);
        setIntField(term36930, term36930.getClass(), "type", 0);
        setDoubleField(term36931, term36931.getClass(), "number", 0.0);
        setIntField(term36931, term36931.getClass(), "type", 0);
        setField(term36931, term36931.getClass(), "next", null);
        setField(term36931, term36931.getClass(), "first", null);
        setField(term36931, term36931.getClass(), "last", null);
        setField(term36931, term36931.getClass(), "propListHead", null);
        setIntField(term36931, term36931.getClass(), "sourcePosition", 0);
        setField(term36931, term36931.getClass(), "jsType", null);
        setField(term36931, term36931.getClass(), "parent", null);
        setField(term36930, term36930.getClass(), "next", term36931);
        setDoubleField(term36932, term36932.getClass(), "number", 0.0);
        setIntField(term36932, term36932.getClass(), "type", 0);
        setField(term36932, term36932.getClass(), "next", null);
        setField(term36932, term36932.getClass(), "first", null);
        setField(term36932, term36932.getClass(), "last", null);
        setField(term36932, term36932.getClass(), "propListHead", null);
        setIntField(term36932, term36932.getClass(), "sourcePosition", 0);
        setField(term36932, term36932.getClass(), "jsType", null);
        setField(term36932, term36932.getClass(), "parent", null);
        setField(term36930, term36930.getClass(), "first", term36932);
        setField(term36930, term36930.getClass(), "last", null);
        setField(term36930, term36930.getClass(), "propListHead", null);
        setIntField(term36930, term36930.getClass(), "sourcePosition", 0);
        setField(term36930, term36930.getClass(), "jsType", null);
        setField(term36930, term36930.getClass(), "parent", null);
        setField(term36929, term36929.getClass(), "first", term36930);
        setField(term36929, term36929.getClass(), "last", null);
        setField(term36929, term36929.getClass(), "propListHead", null);
        setIntField(term36929, term36929.getClass(), "sourcePosition", 0);
        setField(term36929, term36929.getClass(), "jsType", null);
        setField(term36929, term36929.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term35559;
        callMethod(klass, "process", argTypes, term35387, args);
        assertTrue(recursiveEquals(term35387, term36927));
        assertTrue(recursiveEquals(term35559, null));
    }

};


