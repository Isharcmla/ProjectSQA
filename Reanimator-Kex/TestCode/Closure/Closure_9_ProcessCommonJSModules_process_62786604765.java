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

public class ProcessCommonJSModules_process_62786604765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23741;
     Object term23891;
     Object term24316;
     Object term24318;

    public ProcessCommonJSModules_process_62786604765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23741 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term23821 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term23741, term23741.getClass(), "compiler", term23821);
        term23891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23891, term23891.getClass(), "type", 0);
        setField(term23891, term23891.getClass(), "parent", null);
        setField(term23961, term23961.getClass(), "next", null);
        setIntField(term23961, term23961.getClass(), "type", 0);
        setField(term24031, term24031.getClass(), "next", null);
        setIntField(term24031, term24031.getClass(), "type", 0);
        setField(term24031, term24031.getClass(), "first", null);
        setField(term23961, term23961.getClass(), "first", term24031);
        setField(term23891, term23891.getClass(), "first", term23961);
        term24316 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term24317 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term24317, term24317.getClass(), "options", null);
        setField(term24317, term24317.getClass(), "passes", null);
        setField(term24317, term24317.getClass(), "externs", null);
        setField(term24317, term24317.getClass(), "modules", null);
        setField(term24317, term24317.getClass(), "moduleGraph", null);
        setField(term24317, term24317.getClass(), "inputs", null);
        setField(term24317, term24317.getClass(), "errorManager", null);
        setField(term24317, term24317.getClass(), "warningsGuard", null);
        setField(term24317, term24317.getClass(), "injectedLibraries", null);
        setField(term24317, term24317.getClass(), "externsRoot", null);
        setField(term24317, term24317.getClass(), "jsRoot", null);
        setField(term24317, term24317.getClass(), "externAndJsRoot", null);
        setField(term24317, term24317.getClass(), "inputsById", null);
        setField(term24317, term24317.getClass(), "sourceMap", null);
        setField(term24317, term24317.getClass(), "externExports", null);
        setIntField(term24317, term24317.getClass(), "uniqueNameId", 0);
        setBooleanField(term24317, term24317.getClass(), "hasRegExpGlobalReferences", false);
        setField(term24317, term24317.getClass(), "functionInformationMap", null);
        setField(term24317, term24317.getClass(), "debugLog", null);
        setField(term24317, term24317.getClass(), "defaultCodingConvention", null);
        setField(term24317, term24317.getClass(), "typeRegistry", null);
        setField(term24317, term24317.getClass(), "parserConfig", null);
        setField(term24317, term24317.getClass(), "abstractInterpreter", null);
        setField(term24317, term24317.getClass(), "typeValidator", null);
        setField(term24317, term24317.getClass(), "tracker", null);
        setField(term24317, term24317.getClass(), "oldErrorReporter", null);
        setField(term24317, term24317.getClass(), "defaultErrorReporter", null);
        setField(term24317, term24317.getClass(), "compilerThread", null);
        setBooleanField(term24317, term24317.getClass(), "useThreads", false);
        setField(term24317, term24317.getClass(), "outStream", null);
        setField(term24317, term24317.getClass(), "globalRefMap", null);
        setDoubleField(term24317, term24317.getClass(), "progress", 0.0);
        setField(term24317, term24317.getClass(), "lastPassName", null);
        setField(term24317, term24317.getClass(), "sanityCheck", null);
        setField(term24317, term24317.getClass(), "currentTracer", null);
        setField(term24317, term24317.getClass(), "currentPassName", null);
        setIntField(term24317, term24317.getClass(), "syntheticCodeId", 0);
        setField(term24317, term24317.getClass(), "recentChange", null);
        setField(term24317, term24317.getClass(), "codeChangeHandlers", null);
        setField(term24317, term24317.getClass(), "synthesizedExternsInput", null);
        setField(term24317, term24317.getClass(), "stage", null);
        setField(term24316, term24316.getClass(), "compiler", term24317);
        setField(term24316, term24316.getClass(), "filenamePrefix", null);
        setBooleanField(term24316, term24316.getClass(), "reportDependencies", false);
        setField(term24316, term24316.getClass(), "module", null);
        term24318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24318, term24318.getClass(), "type", 0);
        setField(term24318, term24318.getClass(), "next", null);
        setIntField(term24319, term24319.getClass(), "type", 0);
        setField(term24319, term24319.getClass(), "next", null);
        setIntField(term24320, term24320.getClass(), "type", 0);
        setField(term24320, term24320.getClass(), "next", null);
        setField(term24320, term24320.getClass(), "first", null);
        setField(term24320, term24320.getClass(), "last", null);
        setField(term24320, term24320.getClass(), "propListHead", null);
        setIntField(term24320, term24320.getClass(), "sourcePosition", 0);
        setField(term24320, term24320.getClass(), "jsType", null);
        setField(term24320, term24320.getClass(), "parent", null);
        setField(term24319, term24319.getClass(), "first", term24320);
        setField(term24319, term24319.getClass(), "last", null);
        setField(term24319, term24319.getClass(), "propListHead", null);
        setIntField(term24319, term24319.getClass(), "sourcePosition", 0);
        setField(term24319, term24319.getClass(), "jsType", null);
        setField(term24319, term24319.getClass(), "parent", null);
        setField(term24318, term24318.getClass(), "first", term24319);
        setField(term24318, term24318.getClass(), "last", null);
        setField(term24318, term24318.getClass(), "propListHead", null);
        setIntField(term24318, term24318.getClass(), "sourcePosition", 0);
        setField(term24318, term24318.getClass(), "jsType", null);
        setField(term24318, term24318.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23891;
        callMethod(klass, "process", argTypes, term23741, args);
        assertTrue(recursiveEquals(term23741, term24316));
        assertTrue(recursiveEquals(term23891, null));
    }

};


