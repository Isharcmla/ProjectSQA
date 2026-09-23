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

public class ScopedAliases_hotSwapScript_88341709114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66716;
     Object term66866;
     Object term68680;
     Object term68682;

    public ScopedAliases_hotSwapScript_88341709114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66716 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term66796 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term66716, term66716.getClass(), "compiler", term66796);
        term66866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66866, term66866.getClass(), "type", 0);
        setField(term66866, term66866.getClass(), "parent", null);
        setField(term67006, term67006.getClass(), "next", null);
        setIntField(term67006, term67006.getClass(), "type", 0);
        setField(term67006, term67006.getClass(), "first", null);
        setField(term66936, term66936.getClass(), "next", term67006);
        setIntField(term66936, term66936.getClass(), "type", 0);
        setField(term67146, term67146.getClass(), "next", null);
        setIntField(term67146, term67146.getClass(), "type", 0);
        setField(term67146, term67146.getClass(), "first", null);
        setField(term67076, term67076.getClass(), "next", term67146);
        setIntField(term67076, term67076.getClass(), "type", 0);
        setField(term67216, term67216.getClass(), "next", null);
        setIntField(term67216, term67216.getClass(), "type", 0);
        setField(term67216, term67216.getClass(), "first", null);
        setField(term67076, term67076.getClass(), "first", term67216);
        setField(term66936, term66936.getClass(), "first", term67076);
        setField(term66866, term66866.getClass(), "first", term66936);
        term68680 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term68681 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term68681, term68681.getClass(), "options", null);
        setField(term68681, term68681.getClass(), "passes", null);
        setField(term68681, term68681.getClass(), "externs", null);
        setField(term68681, term68681.getClass(), "modules", null);
        setField(term68681, term68681.getClass(), "moduleGraph", null);
        setField(term68681, term68681.getClass(), "inputs", null);
        setField(term68681, term68681.getClass(), "errorManager", null);
        setField(term68681, term68681.getClass(), "warningsGuard", null);
        setField(term68681, term68681.getClass(), "injectedLibraries", null);
        setField(term68681, term68681.getClass(), "externsRoot", null);
        setField(term68681, term68681.getClass(), "jsRoot", null);
        setField(term68681, term68681.getClass(), "externAndJsRoot", null);
        setField(term68681, term68681.getClass(), "inputsById", null);
        setField(term68681, term68681.getClass(), "sourceMap", null);
        setField(term68681, term68681.getClass(), "externExports", null);
        setIntField(term68681, term68681.getClass(), "uniqueNameId", 0);
        setBooleanField(term68681, term68681.getClass(), "useThreads", false);
        setBooleanField(term68681, term68681.getClass(), "hasRegExpGlobalReferences", false);
        setField(term68681, term68681.getClass(), "functionInformationMap", null);
        setField(term68681, term68681.getClass(), "debugLog", null);
        setField(term68681, term68681.getClass(), "defaultCodingConvention", null);
        setField(term68681, term68681.getClass(), "typeRegistry", null);
        setField(term68681, term68681.getClass(), "parserConfig", null);
        setField(term68681, term68681.getClass(), "abstractInterpreter", null);
        setField(term68681, term68681.getClass(), "typeValidator", null);
        setField(term68681, term68681.getClass(), "tracker", null);
        setField(term68681, term68681.getClass(), "oldErrorReporter", null);
        setField(term68681, term68681.getClass(), "defaultErrorReporter", null);
        setField(term68681, term68681.getClass(), "outStream", null);
        setField(term68681, term68681.getClass(), "globalRefMap", null);
        setDoubleField(term68681, term68681.getClass(), "progress", 0.0);
        setField(term68681, term68681.getClass(), "sanityCheck", null);
        setField(term68681, term68681.getClass(), "currentTracer", null);
        setField(term68681, term68681.getClass(), "currentPassName", null);
        setIntField(term68681, term68681.getClass(), "syntheticCodeId", 0);
        setField(term68681, term68681.getClass(), "recentChange", null);
        setField(term68681, term68681.getClass(), "codeChangeHandlers", null);
        setField(term68681, term68681.getClass(), "synthesizedExternsInput", null);
        setField(term68681, term68681.getClass(), "stage", null);
        setField(term68680, term68680.getClass(), "compiler", term68681);
        setField(term68680, term68680.getClass(), "preprocessorSymbolTable", null);
        setField(term68680, term68680.getClass(), "transformationHandler", null);
        term68682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68682, term68682.getClass(), "type", 0);
        setField(term68682, term68682.getClass(), "next", null);
        setIntField(term68683, term68683.getClass(), "type", 0);
        setIntField(term68684, term68684.getClass(), "type", 0);
        setField(term68684, term68684.getClass(), "next", null);
        setField(term68684, term68684.getClass(), "first", null);
        setField(term68684, term68684.getClass(), "last", null);
        setField(term68684, term68684.getClass(), "propListHead", null);
        setIntField(term68684, term68684.getClass(), "sourcePosition", 0);
        setField(term68684, term68684.getClass(), "jsType", null);
        setField(term68684, term68684.getClass(), "parent", null);
        setField(term68683, term68683.getClass(), "next", term68684);
        setIntField(term68685, term68685.getClass(), "type", 0);
        setIntField(term68686, term68686.getClass(), "type", 0);
        setField(term68686, term68686.getClass(), "next", null);
        setField(term68686, term68686.getClass(), "first", null);
        setField(term68686, term68686.getClass(), "last", null);
        setField(term68686, term68686.getClass(), "propListHead", null);
        setIntField(term68686, term68686.getClass(), "sourcePosition", 0);
        setField(term68686, term68686.getClass(), "jsType", null);
        setField(term68686, term68686.getClass(), "parent", null);
        setField(term68685, term68685.getClass(), "next", term68686);
        setIntField(term68687, term68687.getClass(), "type", 0);
        setField(term68687, term68687.getClass(), "next", null);
        setField(term68687, term68687.getClass(), "first", null);
        setField(term68687, term68687.getClass(), "last", null);
        setField(term68687, term68687.getClass(), "propListHead", null);
        setIntField(term68687, term68687.getClass(), "sourcePosition", 0);
        setField(term68687, term68687.getClass(), "jsType", null);
        setField(term68687, term68687.getClass(), "parent", null);
        setField(term68685, term68685.getClass(), "first", term68687);
        setField(term68685, term68685.getClass(), "last", null);
        setField(term68685, term68685.getClass(), "propListHead", null);
        setIntField(term68685, term68685.getClass(), "sourcePosition", 0);
        setField(term68685, term68685.getClass(), "jsType", null);
        setField(term68685, term68685.getClass(), "parent", null);
        setField(term68683, term68683.getClass(), "first", term68685);
        setField(term68683, term68683.getClass(), "last", null);
        setField(term68683, term68683.getClass(), "propListHead", null);
        setIntField(term68683, term68683.getClass(), "sourcePosition", 0);
        setField(term68683, term68683.getClass(), "jsType", null);
        setField(term68683, term68683.getClass(), "parent", null);
        setField(term68682, term68682.getClass(), "first", term68683);
        setField(term68682, term68682.getClass(), "last", null);
        setField(term68682, term68682.getClass(), "propListHead", null);
        setIntField(term68682, term68682.getClass(), "sourcePosition", 0);
        setField(term68682, term68682.getClass(), "jsType", null);
        setField(term68682, term68682.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term66866;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term66716, args);
        assertTrue(recursiveEquals(term66716, term68680));
        assertTrue(recursiveEquals(term66866, term68682));
    }

};


