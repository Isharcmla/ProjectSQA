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

public class ScopedAliases_hotSwapScript_8834170957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33269;
     Object term33419;
     Object term33736;
     Object term33738;

    public ScopedAliases_hotSwapScript_8834170957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33269 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term33349 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33269, term33269.getClass(), "compiler", term33349);
        term33419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33419, term33419.getClass(), "type", 105);
        setField(term33419, term33419.getClass(), "parent", null);
        term33736 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term33737 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33737, term33737.getClass(), "options", null);
        setField(term33737, term33737.getClass(), "passes", null);
        setField(term33737, term33737.getClass(), "externs", null);
        setField(term33737, term33737.getClass(), "modules", null);
        setField(term33737, term33737.getClass(), "moduleGraph", null);
        setField(term33737, term33737.getClass(), "inputs", null);
        setField(term33737, term33737.getClass(), "errorManager", null);
        setField(term33737, term33737.getClass(), "warningsGuard", null);
        setField(term33737, term33737.getClass(), "injectedLibraries", null);
        setField(term33737, term33737.getClass(), "externsRoot", null);
        setField(term33737, term33737.getClass(), "jsRoot", null);
        setField(term33737, term33737.getClass(), "externAndJsRoot", null);
        setField(term33737, term33737.getClass(), "inputsById", null);
        setField(term33737, term33737.getClass(), "sourceMap", null);
        setField(term33737, term33737.getClass(), "externExports", null);
        setIntField(term33737, term33737.getClass(), "uniqueNameId", 0);
        setBooleanField(term33737, term33737.getClass(), "useThreads", false);
        setBooleanField(term33737, term33737.getClass(), "hasRegExpGlobalReferences", false);
        setField(term33737, term33737.getClass(), "functionInformationMap", null);
        setField(term33737, term33737.getClass(), "debugLog", null);
        setField(term33737, term33737.getClass(), "defaultCodingConvention", null);
        setField(term33737, term33737.getClass(), "typeRegistry", null);
        setField(term33737, term33737.getClass(), "parserConfig", null);
        setField(term33737, term33737.getClass(), "abstractInterpreter", null);
        setField(term33737, term33737.getClass(), "typeValidator", null);
        setField(term33737, term33737.getClass(), "tracker", null);
        setField(term33737, term33737.getClass(), "oldErrorReporter", null);
        setField(term33737, term33737.getClass(), "defaultErrorReporter", null);
        setField(term33737, term33737.getClass(), "outStream", null);
        setField(term33737, term33737.getClass(), "globalRefMap", null);
        setDoubleField(term33737, term33737.getClass(), "progress", 0.0);
        setField(term33737, term33737.getClass(), "sanityCheck", null);
        setField(term33737, term33737.getClass(), "currentTracer", null);
        setField(term33737, term33737.getClass(), "currentPassName", null);
        setIntField(term33737, term33737.getClass(), "syntheticCodeId", 0);
        setField(term33737, term33737.getClass(), "recentChange", null);
        setField(term33737, term33737.getClass(), "codeChangeHandlers", null);
        setField(term33737, term33737.getClass(), "synthesizedExternsInput", null);
        setField(term33737, term33737.getClass(), "stage", null);
        setField(term33736, term33736.getClass(), "compiler", term33737);
        setField(term33736, term33736.getClass(), "preprocessorSymbolTable", null);
        setField(term33736, term33736.getClass(), "transformationHandler", null);
        term33738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33738, term33738.getClass(), "type", 105);
        setField(term33738, term33738.getClass(), "next", null);
        setField(term33738, term33738.getClass(), "first", null);
        setField(term33738, term33738.getClass(), "last", null);
        setField(term33738, term33738.getClass(), "propListHead", null);
        setIntField(term33738, term33738.getClass(), "sourcePosition", 0);
        setField(term33738, term33738.getClass(), "jsType", null);
        setField(term33738, term33738.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term33419;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term33269, args);
        assertTrue(recursiveEquals(term33269, term33736));
        assertTrue(recursiveEquals(term33419, term33738));
    }

};


