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

public class ScopedAliases_process_84065531323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12442;
     Object term12592;
     Object term13185;
     Object term13187;

    public ScopedAliases_process_84065531323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12442 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term12522 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12442, term12442.getClass(), "compiler", term12522);
        term12592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12694 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term12592, term12592.getClass(), "type", 132);
        setField(term12592, term12592.getClass(), "propListHead", term12694);
        term13185 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term13186 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13186, term13186.getClass(), "options", null);
        setField(term13186, term13186.getClass(), "passes", null);
        setField(term13186, term13186.getClass(), "externs", null);
        setField(term13186, term13186.getClass(), "modules", null);
        setField(term13186, term13186.getClass(), "moduleGraph", null);
        setField(term13186, term13186.getClass(), "inputs", null);
        setField(term13186, term13186.getClass(), "errorManager", null);
        setField(term13186, term13186.getClass(), "warningsGuard", null);
        setField(term13186, term13186.getClass(), "injectedLibraries", null);
        setField(term13186, term13186.getClass(), "externsRoot", null);
        setField(term13186, term13186.getClass(), "jsRoot", null);
        setField(term13186, term13186.getClass(), "externAndJsRoot", null);
        setField(term13186, term13186.getClass(), "inputsById", null);
        setField(term13186, term13186.getClass(), "sourceMap", null);
        setField(term13186, term13186.getClass(), "externExports", null);
        setIntField(term13186, term13186.getClass(), "uniqueNameId", 0);
        setBooleanField(term13186, term13186.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13186, term13186.getClass(), "functionInformationMap", null);
        setField(term13186, term13186.getClass(), "debugLog", null);
        setField(term13186, term13186.getClass(), "defaultCodingConvention", null);
        setField(term13186, term13186.getClass(), "typeRegistry", null);
        setField(term13186, term13186.getClass(), "parserConfig", null);
        setField(term13186, term13186.getClass(), "abstractInterpreter", null);
        setField(term13186, term13186.getClass(), "typeValidator", null);
        setField(term13186, term13186.getClass(), "phaseOptimizer", null);
        setField(term13186, term13186.getClass(), "tracker", null);
        setField(term13186, term13186.getClass(), "oldErrorReporter", null);
        setField(term13186, term13186.getClass(), "defaultErrorReporter", null);
        setField(term13186, term13186.getClass(), "compilerThread", null);
        setBooleanField(term13186, term13186.getClass(), "useThreads", false);
        setField(term13186, term13186.getClass(), "outStream", null);
        setField(term13186, term13186.getClass(), "globalRefMap", null);
        setDoubleField(term13186, term13186.getClass(), "progress", 0.0);
        setField(term13186, term13186.getClass(), "lastPassName", null);
        setField(term13186, term13186.getClass(), "sanityCheck", null);
        setField(term13186, term13186.getClass(), "currentTracer", null);
        setField(term13186, term13186.getClass(), "currentPassName", null);
        setIntField(term13186, term13186.getClass(), "syntheticCodeId", 0);
        setField(term13186, term13186.getClass(), "recentChange", null);
        setField(term13186, term13186.getClass(), "codeChangeHandlers", null);
        setField(term13186, term13186.getClass(), "synthesizedExternsInput", null);
        setField(term13186, term13186.getClass(), "stage", null);
        setBooleanField(term13186, term13186.getClass(), "analyzeChangedScopesOnly", false);
        setField(term13185, term13185.getClass(), "compiler", term13186);
        setField(term13185, term13185.getClass(), "preprocessorSymbolTable", null);
        setField(term13185, term13185.getClass(), "transformationHandler", null);
        setField(term13185, term13185.getClass(), "scopedAliasNames", null);
        term13187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13188 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term13187, term13187.getClass(), "type", 132);
        setField(term13187, term13187.getClass(), "next", null);
        setField(term13187, term13187.getClass(), "first", null);
        setField(term13187, term13187.getClass(), "last", null);
        setIntField(term13188, term13188.getClass(), "intValue", 0);
        setField(term13188, term13188.getClass(), "next", null);
        setIntField(term13188, term13188.getClass(), "propType", 0);
        setField(term13187, term13187.getClass(), "propListHead", term13188);
        setIntField(term13187, term13187.getClass(), "sourcePosition", 0);
        setField(term13187, term13187.getClass(), "jsType", null);
        setField(term13187, term13187.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12592;
        callMethod(klass, "process", argTypes, term12442, args);
        assertTrue(recursiveEquals(term12442, term13185));
        assertTrue(recursiveEquals(term12592, null));
    }

};


