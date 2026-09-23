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

public class ScopedAliases_process_84065531331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16144;
     Object term16294;
     Object term17599;
     Object term17601;

    public ScopedAliases_process_84065531331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16144 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term16224 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16144, term16144.getClass(), "compiler", term16224);
        term16294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16294, term16294.getClass(), "type", 0);
        setField(term16294, term16294.getClass(), "parent", null);
        setField(term16364, term16364.getClass(), "next", null);
        setIntField(term16364, term16364.getClass(), "type", 0);
        setField(term16504, term16504.getClass(), "next", null);
        setIntField(term16504, term16504.getClass(), "type", 0);
        setField(term16504, term16504.getClass(), "first", null);
        setField(term16434, term16434.getClass(), "next", term16504);
        setIntField(term16434, term16434.getClass(), "type", 105);
        setField(term16364, term16364.getClass(), "first", term16434);
        setField(term16294, term16294.getClass(), "first", term16364);
        term17599 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term17600 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17600, term17600.getClass(), "options", null);
        setField(term17600, term17600.getClass(), "passes", null);
        setField(term17600, term17600.getClass(), "externs", null);
        setField(term17600, term17600.getClass(), "modules", null);
        setField(term17600, term17600.getClass(), "moduleGraph", null);
        setField(term17600, term17600.getClass(), "inputs", null);
        setField(term17600, term17600.getClass(), "errorManager", null);
        setField(term17600, term17600.getClass(), "warningsGuard", null);
        setField(term17600, term17600.getClass(), "injectedLibraries", null);
        setField(term17600, term17600.getClass(), "externsRoot", null);
        setField(term17600, term17600.getClass(), "jsRoot", null);
        setField(term17600, term17600.getClass(), "externAndJsRoot", null);
        setField(term17600, term17600.getClass(), "inputsById", null);
        setField(term17600, term17600.getClass(), "sourceMap", null);
        setField(term17600, term17600.getClass(), "externExports", null);
        setIntField(term17600, term17600.getClass(), "uniqueNameId", 0);
        setBooleanField(term17600, term17600.getClass(), "useThreads", false);
        setBooleanField(term17600, term17600.getClass(), "hasRegExpGlobalReferences", false);
        setField(term17600, term17600.getClass(), "functionInformationMap", null);
        setField(term17600, term17600.getClass(), "debugLog", null);
        setField(term17600, term17600.getClass(), "defaultCodingConvention", null);
        setField(term17600, term17600.getClass(), "typeRegistry", null);
        setField(term17600, term17600.getClass(), "parserConfig", null);
        setField(term17600, term17600.getClass(), "abstractInterpreter", null);
        setField(term17600, term17600.getClass(), "typeValidator", null);
        setField(term17600, term17600.getClass(), "tracker", null);
        setField(term17600, term17600.getClass(), "oldErrorReporter", null);
        setField(term17600, term17600.getClass(), "defaultErrorReporter", null);
        setField(term17600, term17600.getClass(), "outStream", null);
        setField(term17600, term17600.getClass(), "globalRefMap", null);
        setDoubleField(term17600, term17600.getClass(), "progress", 0.0);
        setField(term17600, term17600.getClass(), "sanityCheck", null);
        setField(term17600, term17600.getClass(), "currentTracer", null);
        setField(term17600, term17600.getClass(), "currentPassName", null);
        setIntField(term17600, term17600.getClass(), "syntheticCodeId", 0);
        setField(term17600, term17600.getClass(), "recentChange", null);
        setField(term17600, term17600.getClass(), "codeChangeHandlers", null);
        setField(term17600, term17600.getClass(), "synthesizedExternsInput", null);
        setField(term17600, term17600.getClass(), "stage", null);
        setField(term17599, term17599.getClass(), "compiler", term17600);
        setField(term17599, term17599.getClass(), "preprocessorSymbolTable", null);
        setField(term17599, term17599.getClass(), "transformationHandler", null);
        term17601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17601, term17601.getClass(), "type", 0);
        setField(term17601, term17601.getClass(), "next", null);
        setIntField(term17602, term17602.getClass(), "type", 0);
        setField(term17602, term17602.getClass(), "next", null);
        setIntField(term17603, term17603.getClass(), "type", 105);
        setIntField(term17604, term17604.getClass(), "type", 0);
        setField(term17604, term17604.getClass(), "next", null);
        setField(term17604, term17604.getClass(), "first", null);
        setField(term17604, term17604.getClass(), "last", null);
        setField(term17604, term17604.getClass(), "propListHead", null);
        setIntField(term17604, term17604.getClass(), "sourcePosition", 0);
        setField(term17604, term17604.getClass(), "jsType", null);
        setField(term17604, term17604.getClass(), "parent", null);
        setField(term17603, term17603.getClass(), "next", term17604);
        setField(term17603, term17603.getClass(), "first", null);
        setField(term17603, term17603.getClass(), "last", null);
        setField(term17603, term17603.getClass(), "propListHead", null);
        setIntField(term17603, term17603.getClass(), "sourcePosition", 0);
        setField(term17603, term17603.getClass(), "jsType", null);
        setField(term17603, term17603.getClass(), "parent", null);
        setField(term17602, term17602.getClass(), "first", term17603);
        setField(term17602, term17602.getClass(), "last", null);
        setField(term17602, term17602.getClass(), "propListHead", null);
        setIntField(term17602, term17602.getClass(), "sourcePosition", 0);
        setField(term17602, term17602.getClass(), "jsType", null);
        setField(term17602, term17602.getClass(), "parent", null);
        setField(term17601, term17601.getClass(), "first", term17602);
        setField(term17601, term17601.getClass(), "last", null);
        setField(term17601, term17601.getClass(), "propListHead", null);
        setIntField(term17601, term17601.getClass(), "sourcePosition", 0);
        setField(term17601, term17601.getClass(), "jsType", null);
        setField(term17601, term17601.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16294;
        callMethod(klass, "process", argTypes, term16144, args);
        assertTrue(recursiveEquals(term16144, term17599));
        assertTrue(recursiveEquals(term16294, null));
    }

};


