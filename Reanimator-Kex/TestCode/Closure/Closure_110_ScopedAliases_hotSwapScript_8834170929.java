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

public class ScopedAliases_hotSwapScript_8834170929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17428;
     Object term17578;
     Object term18293;
     Object term18295;

    public ScopedAliases_hotSwapScript_8834170929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17428 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term17508 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17428, term17428.getClass(), "compiler", term17508);
        term17578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17686 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term17578, term17578.getClass(), "type", 132);
        setField(term17578, term17578.getClass(), "propListHead", term17686);
        term18293 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term18294 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18294, term18294.getClass(), "options", null);
        setField(term18294, term18294.getClass(), "passes", null);
        setField(term18294, term18294.getClass(), "externs", null);
        setField(term18294, term18294.getClass(), "modules", null);
        setField(term18294, term18294.getClass(), "moduleGraph", null);
        setField(term18294, term18294.getClass(), "inputs", null);
        setField(term18294, term18294.getClass(), "errorManager", null);
        setField(term18294, term18294.getClass(), "warningsGuard", null);
        setField(term18294, term18294.getClass(), "injectedLibraries", null);
        setField(term18294, term18294.getClass(), "externsRoot", null);
        setField(term18294, term18294.getClass(), "jsRoot", null);
        setField(term18294, term18294.getClass(), "externAndJsRoot", null);
        setField(term18294, term18294.getClass(), "inputsById", null);
        setField(term18294, term18294.getClass(), "sourceMap", null);
        setField(term18294, term18294.getClass(), "externExports", null);
        setIntField(term18294, term18294.getClass(), "uniqueNameId", 0);
        setBooleanField(term18294, term18294.getClass(), "hasRegExpGlobalReferences", false);
        setField(term18294, term18294.getClass(), "functionInformationMap", null);
        setField(term18294, term18294.getClass(), "debugLog", null);
        setField(term18294, term18294.getClass(), "defaultCodingConvention", null);
        setField(term18294, term18294.getClass(), "typeRegistry", null);
        setField(term18294, term18294.getClass(), "parserConfig", null);
        setField(term18294, term18294.getClass(), "abstractInterpreter", null);
        setField(term18294, term18294.getClass(), "typeValidator", null);
        setField(term18294, term18294.getClass(), "phaseOptimizer", null);
        setField(term18294, term18294.getClass(), "tracker", null);
        setField(term18294, term18294.getClass(), "oldErrorReporter", null);
        setField(term18294, term18294.getClass(), "defaultErrorReporter", null);
        setField(term18294, term18294.getClass(), "compilerThread", null);
        setBooleanField(term18294, term18294.getClass(), "useThreads", false);
        setField(term18294, term18294.getClass(), "outStream", null);
        setField(term18294, term18294.getClass(), "globalRefMap", null);
        setDoubleField(term18294, term18294.getClass(), "progress", 0.0);
        setField(term18294, term18294.getClass(), "lastPassName", null);
        setField(term18294, term18294.getClass(), "sanityCheck", null);
        setField(term18294, term18294.getClass(), "currentTracer", null);
        setField(term18294, term18294.getClass(), "currentPassName", null);
        setIntField(term18294, term18294.getClass(), "syntheticCodeId", 0);
        setField(term18294, term18294.getClass(), "recentChange", null);
        setField(term18294, term18294.getClass(), "codeChangeHandlers", null);
        setField(term18294, term18294.getClass(), "synthesizedExternsInput", null);
        setField(term18294, term18294.getClass(), "stage", null);
        setBooleanField(term18294, term18294.getClass(), "analyzeChangedScopesOnly", false);
        setField(term18293, term18293.getClass(), "compiler", term18294);
        setField(term18293, term18293.getClass(), "preprocessorSymbolTable", null);
        setField(term18293, term18293.getClass(), "transformationHandler", null);
        setField(term18293, term18293.getClass(), "scopedAliasNames", null);
        term18295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18296 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term18295, term18295.getClass(), "type", 132);
        setField(term18295, term18295.getClass(), "next", null);
        setField(term18295, term18295.getClass(), "first", null);
        setField(term18295, term18295.getClass(), "last", null);
        setField(term18296, term18296.getClass(), "objectValue", null);
        setField(term18296, term18296.getClass(), "next", null);
        setIntField(term18296, term18296.getClass(), "propType", 0);
        setField(term18295, term18295.getClass(), "propListHead", term18296);
        setIntField(term18295, term18295.getClass(), "sourcePosition", 0);
        setField(term18295, term18295.getClass(), "jsType", null);
        setField(term18295, term18295.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term17578;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term17428, args);
        assertTrue(recursiveEquals(term17428, term18293));
        assertTrue(recursiveEquals(term17578, term18295));
    }

};


