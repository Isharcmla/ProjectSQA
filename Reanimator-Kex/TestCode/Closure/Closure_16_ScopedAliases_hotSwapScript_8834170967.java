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

public class ScopedAliases_hotSwapScript_8834170967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38434;
     Object term38584;
     Object term39856;
     Object term39858;

    public ScopedAliases_hotSwapScript_8834170967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38434 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term38514 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38434, term38434.getClass(), "compiler", term38514);
        term38584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38584, term38584.getClass(), "type", 0);
        setField(term38584, term38584.getClass(), "parent", null);
        setField(term38654, term38654.getClass(), "next", term38724);
        setIntField(term38654, term38654.getClass(), "type", 0);
        setField(term38794, term38794.getClass(), "next", term38864);
        setIntField(term38794, term38794.getClass(), "type", 0);
        setField(term38794, term38794.getClass(), "first", term38934);
        setField(term38654, term38654.getClass(), "first", term38794);
        setField(term38584, term38584.getClass(), "first", term38654);
        term39856 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term39857 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term39857, term39857.getClass(), "options", null);
        setField(term39857, term39857.getClass(), "passes", null);
        setField(term39857, term39857.getClass(), "externs", null);
        setField(term39857, term39857.getClass(), "modules", null);
        setField(term39857, term39857.getClass(), "moduleGraph", null);
        setField(term39857, term39857.getClass(), "inputs", null);
        setField(term39857, term39857.getClass(), "errorManager", null);
        setField(term39857, term39857.getClass(), "warningsGuard", null);
        setField(term39857, term39857.getClass(), "injectedLibraries", null);
        setField(term39857, term39857.getClass(), "externsRoot", null);
        setField(term39857, term39857.getClass(), "jsRoot", null);
        setField(term39857, term39857.getClass(), "externAndJsRoot", null);
        setField(term39857, term39857.getClass(), "inputsById", null);
        setField(term39857, term39857.getClass(), "sourceMap", null);
        setField(term39857, term39857.getClass(), "externExports", null);
        setIntField(term39857, term39857.getClass(), "uniqueNameId", 0);
        setBooleanField(term39857, term39857.getClass(), "useThreads", false);
        setBooleanField(term39857, term39857.getClass(), "hasRegExpGlobalReferences", false);
        setField(term39857, term39857.getClass(), "functionInformationMap", null);
        setField(term39857, term39857.getClass(), "debugLog", null);
        setField(term39857, term39857.getClass(), "defaultCodingConvention", null);
        setField(term39857, term39857.getClass(), "typeRegistry", null);
        setField(term39857, term39857.getClass(), "parserConfig", null);
        setField(term39857, term39857.getClass(), "abstractInterpreter", null);
        setField(term39857, term39857.getClass(), "typeValidator", null);
        setField(term39857, term39857.getClass(), "tracker", null);
        setField(term39857, term39857.getClass(), "oldErrorReporter", null);
        setField(term39857, term39857.getClass(), "defaultErrorReporter", null);
        setField(term39857, term39857.getClass(), "outStream", null);
        setField(term39857, term39857.getClass(), "globalRefMap", null);
        setDoubleField(term39857, term39857.getClass(), "progress", 0.0);
        setField(term39857, term39857.getClass(), "sanityCheck", null);
        setField(term39857, term39857.getClass(), "currentTracer", null);
        setField(term39857, term39857.getClass(), "currentPassName", null);
        setIntField(term39857, term39857.getClass(), "syntheticCodeId", 0);
        setField(term39857, term39857.getClass(), "recentChange", null);
        setField(term39857, term39857.getClass(), "codeChangeHandlers", null);
        setField(term39857, term39857.getClass(), "synthesizedExternsInput", null);
        setField(term39857, term39857.getClass(), "stage", null);
        setField(term39856, term39856.getClass(), "compiler", term39857);
        setField(term39856, term39856.getClass(), "preprocessorSymbolTable", null);
        setField(term39856, term39856.getClass(), "transformationHandler", null);
        term39858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39858, term39858.getClass(), "type", 0);
        setField(term39858, term39858.getClass(), "next", null);
        setIntField(term39859, term39859.getClass(), "type", 0);
        setIntField(term39860, term39860.getClass(), "type", 0);
        setField(term39860, term39860.getClass(), "next", null);
        setField(term39860, term39860.getClass(), "first", null);
        setField(term39860, term39860.getClass(), "last", null);
        setField(term39860, term39860.getClass(), "propListHead", null);
        setIntField(term39860, term39860.getClass(), "sourcePosition", 0);
        setField(term39860, term39860.getClass(), "jsType", null);
        setField(term39860, term39860.getClass(), "parent", null);
        setField(term39859, term39859.getClass(), "next", term39860);
        setIntField(term39861, term39861.getClass(), "type", 0);
        setIntField(term39862, term39862.getClass(), "type", 0);
        setField(term39862, term39862.getClass(), "next", null);
        setField(term39862, term39862.getClass(), "first", null);
        setField(term39862, term39862.getClass(), "last", null);
        setField(term39862, term39862.getClass(), "propListHead", null);
        setIntField(term39862, term39862.getClass(), "sourcePosition", 0);
        setField(term39862, term39862.getClass(), "jsType", null);
        setField(term39862, term39862.getClass(), "parent", null);
        setField(term39861, term39861.getClass(), "next", term39862);
        setIntField(term39863, term39863.getClass(), "type", 0);
        setField(term39863, term39863.getClass(), "next", null);
        setField(term39863, term39863.getClass(), "first", null);
        setField(term39863, term39863.getClass(), "last", null);
        setField(term39863, term39863.getClass(), "propListHead", null);
        setIntField(term39863, term39863.getClass(), "sourcePosition", 0);
        setField(term39863, term39863.getClass(), "jsType", null);
        setField(term39863, term39863.getClass(), "parent", null);
        setField(term39861, term39861.getClass(), "first", term39863);
        setField(term39861, term39861.getClass(), "last", null);
        setField(term39861, term39861.getClass(), "propListHead", null);
        setIntField(term39861, term39861.getClass(), "sourcePosition", 0);
        setField(term39861, term39861.getClass(), "jsType", null);
        setField(term39861, term39861.getClass(), "parent", null);
        setField(term39859, term39859.getClass(), "first", term39861);
        setField(term39859, term39859.getClass(), "last", null);
        setField(term39859, term39859.getClass(), "propListHead", null);
        setIntField(term39859, term39859.getClass(), "sourcePosition", 0);
        setField(term39859, term39859.getClass(), "jsType", null);
        setField(term39859, term39859.getClass(), "parent", null);
        setField(term39858, term39858.getClass(), "first", term39859);
        setField(term39858, term39858.getClass(), "last", null);
        setField(term39858, term39858.getClass(), "propListHead", null);
        setIntField(term39858, term39858.getClass(), "sourcePosition", 0);
        setField(term39858, term39858.getClass(), "jsType", null);
        setField(term39858, term39858.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term38584;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term38434, args);
        assertTrue(recursiveEquals(term38434, term39856));
        assertTrue(recursiveEquals(term38584, term39858));
    }

};


