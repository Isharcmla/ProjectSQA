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

public class ScopedAliases_hotSwapScript_8834170913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3698;
     Object term3848;
     Object term5583;
     Object term5585;

    public ScopedAliases_hotSwapScript_8834170913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3698 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term3778 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3698, term3698.getClass(), "compiler", term3778);
        term3848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3848, term3848.getClass(), "type", 132);
        term5583 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term5584 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term5584, term5584.getClass(), "options", null);
        setField(term5584, term5584.getClass(), "passes", null);
        setField(term5584, term5584.getClass(), "externs", null);
        setField(term5584, term5584.getClass(), "modules", null);
        setField(term5584, term5584.getClass(), "moduleGraph", null);
        setField(term5584, term5584.getClass(), "inputs", null);
        setField(term5584, term5584.getClass(), "errorManager", null);
        setField(term5584, term5584.getClass(), "warningsGuard", null);
        setField(term5584, term5584.getClass(), "injectedLibraries", null);
        setField(term5584, term5584.getClass(), "externsRoot", null);
        setField(term5584, term5584.getClass(), "jsRoot", null);
        setField(term5584, term5584.getClass(), "externAndJsRoot", null);
        setField(term5584, term5584.getClass(), "inputsById", null);
        setField(term5584, term5584.getClass(), "sourceMap", null);
        setField(term5584, term5584.getClass(), "externExports", null);
        setIntField(term5584, term5584.getClass(), "uniqueNameId", 0);
        setBooleanField(term5584, term5584.getClass(), "hasRegExpGlobalReferences", false);
        setField(term5584, term5584.getClass(), "functionInformationMap", null);
        setField(term5584, term5584.getClass(), "debugLog", null);
        setField(term5584, term5584.getClass(), "defaultCodingConvention", null);
        setField(term5584, term5584.getClass(), "typeRegistry", null);
        setField(term5584, term5584.getClass(), "parserConfig", null);
        setField(term5584, term5584.getClass(), "abstractInterpreter", null);
        setField(term5584, term5584.getClass(), "typeValidator", null);
        setField(term5584, term5584.getClass(), "phaseOptimizer", null);
        setField(term5584, term5584.getClass(), "tracker", null);
        setField(term5584, term5584.getClass(), "oldErrorReporter", null);
        setField(term5584, term5584.getClass(), "defaultErrorReporter", null);
        setField(term5584, term5584.getClass(), "compilerThread", null);
        setBooleanField(term5584, term5584.getClass(), "useThreads", false);
        setField(term5584, term5584.getClass(), "outStream", null);
        setField(term5584, term5584.getClass(), "globalRefMap", null);
        setDoubleField(term5584, term5584.getClass(), "progress", 0.0);
        setField(term5584, term5584.getClass(), "lastPassName", null);
        setField(term5584, term5584.getClass(), "sanityCheck", null);
        setField(term5584, term5584.getClass(), "currentTracer", null);
        setField(term5584, term5584.getClass(), "currentPassName", null);
        setIntField(term5584, term5584.getClass(), "syntheticCodeId", 0);
        setField(term5584, term5584.getClass(), "recentChange", null);
        setField(term5584, term5584.getClass(), "codeChangeHandlers", null);
        setField(term5584, term5584.getClass(), "synthesizedExternsInput", null);
        setField(term5584, term5584.getClass(), "stage", null);
        setBooleanField(term5584, term5584.getClass(), "analyzeChangedScopesOnly", false);
        setField(term5583, term5583.getClass(), "compiler", term5584);
        setField(term5583, term5583.getClass(), "preprocessorSymbolTable", null);
        setField(term5583, term5583.getClass(), "transformationHandler", null);
        setField(term5583, term5583.getClass(), "scopedAliasNames", null);
        term5585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5585, term5585.getClass(), "type", 132);
        setField(term5585, term5585.getClass(), "next", null);
        setField(term5585, term5585.getClass(), "first", null);
        setField(term5585, term5585.getClass(), "last", null);
        setField(term5585, term5585.getClass(), "propListHead", null);
        setIntField(term5585, term5585.getClass(), "sourcePosition", 0);
        setField(term5585, term5585.getClass(), "jsType", null);
        setField(term5585, term5585.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3848;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term3698, args);
        assertTrue(recursiveEquals(term3698, term5583));
        assertTrue(recursiveEquals(term3848, term5585));
    }

};


