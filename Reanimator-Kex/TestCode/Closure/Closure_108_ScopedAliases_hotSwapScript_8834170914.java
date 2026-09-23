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

public class ScopedAliases_hotSwapScript_8834170914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4366;
     Object term4516;
     Object term5777;
     Object term5779;

    public ScopedAliases_hotSwapScript_8834170914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4366 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term4446 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term4366, term4366.getClass(), "compiler", term4446);
        term4516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4516, term4516.getClass(), "type", -133);
        setField(term4516, term4516.getClass(), "parent", null);
        term5777 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term5778 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term5778, term5778.getClass(), "options", null);
        setField(term5778, term5778.getClass(), "passes", null);
        setField(term5778, term5778.getClass(), "externs", null);
        setField(term5778, term5778.getClass(), "modules", null);
        setField(term5778, term5778.getClass(), "moduleGraph", null);
        setField(term5778, term5778.getClass(), "inputs", null);
        setField(term5778, term5778.getClass(), "errorManager", null);
        setField(term5778, term5778.getClass(), "warningsGuard", null);
        setField(term5778, term5778.getClass(), "injectedLibraries", null);
        setField(term5778, term5778.getClass(), "externsRoot", null);
        setField(term5778, term5778.getClass(), "jsRoot", null);
        setField(term5778, term5778.getClass(), "externAndJsRoot", null);
        setField(term5778, term5778.getClass(), "inputsById", null);
        setField(term5778, term5778.getClass(), "sourceMap", null);
        setField(term5778, term5778.getClass(), "externExports", null);
        setIntField(term5778, term5778.getClass(), "uniqueNameId", 0);
        setIntField(term5778, term5778.getClass(), "timeout", 0);
        setBooleanField(term5778, term5778.getClass(), "hasRegExpGlobalReferences", false);
        setField(term5778, term5778.getClass(), "functionInformationMap", null);
        setField(term5778, term5778.getClass(), "debugLog", null);
        setField(term5778, term5778.getClass(), "defaultCodingConvention", null);
        setField(term5778, term5778.getClass(), "typeRegistry", null);
        setField(term5778, term5778.getClass(), "parserConfig", null);
        setField(term5778, term5778.getClass(), "abstractInterpreter", null);
        setField(term5778, term5778.getClass(), "typeValidator", null);
        setField(term5778, term5778.getClass(), "phaseOptimizer", null);
        setField(term5778, term5778.getClass(), "tracker", null);
        setField(term5778, term5778.getClass(), "oldErrorReporter", null);
        setField(term5778, term5778.getClass(), "defaultErrorReporter", null);
        setField(term5778, term5778.getClass(), "compilerThread", null);
        setBooleanField(term5778, term5778.getClass(), "useThreads", false);
        setField(term5778, term5778.getClass(), "outStream", null);
        setField(term5778, term5778.getClass(), "globalRefMap", null);
        setDoubleField(term5778, term5778.getClass(), "progress", 0.0);
        setField(term5778, term5778.getClass(), "lastPassName", null);
        setField(term5778, term5778.getClass(), "sanityCheck", null);
        setField(term5778, term5778.getClass(), "currentTracer", null);
        setField(term5778, term5778.getClass(), "currentPassName", null);
        setIntField(term5778, term5778.getClass(), "syntheticCodeId", 0);
        setField(term5778, term5778.getClass(), "recentChange", null);
        setField(term5778, term5778.getClass(), "codeChangeHandlers", null);
        setField(term5778, term5778.getClass(), "synthesizedExternsInput", null);
        setField(term5778, term5778.getClass(), "stage", null);
        setBooleanField(term5778, term5778.getClass(), "analyzeChangedScopesOnly", false);
        setField(term5777, term5777.getClass(), "compiler", term5778);
        setField(term5777, term5777.getClass(), "preprocessorSymbolTable", null);
        setField(term5777, term5777.getClass(), "transformationHandler", null);
        setField(term5777, term5777.getClass(), "scopedAliasNames", null);
        term5779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5779, term5779.getClass(), "type", -133);
        setField(term5779, term5779.getClass(), "next", null);
        setField(term5779, term5779.getClass(), "first", null);
        setField(term5779, term5779.getClass(), "last", null);
        setField(term5779, term5779.getClass(), "propListHead", null);
        setIntField(term5779, term5779.getClass(), "sourcePosition", 0);
        setField(term5779, term5779.getClass(), "jsType", null);
        setField(term5779, term5779.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term4516;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term4366, args);
        assertTrue(recursiveEquals(term4366, term5777));
        assertTrue(recursiveEquals(term4516, term5779));
    }

};


