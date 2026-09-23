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

public class ScopedAliases_process_840655313148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82116;
     Object term82266;
     Object term82659;
     Object term82661;

    public ScopedAliases_process_840655313148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82116 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term82196 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term82116, term82116.getClass(), "compiler", term82196);
        term82266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82266, term82266.getClass(), "type", 0);
        setIntField(term82336, term82336.getClass(), "type", 132);
        setField(term82336, term82336.getClass(), "propListHead", null);
        setField(term82266, term82266.getClass(), "parent", term82336);
        setField(term82266, term82266.getClass(), "first", null);
        term82659 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term82660 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term82660, term82660.getClass(), "options", null);
        setField(term82660, term82660.getClass(), "passes", null);
        setField(term82660, term82660.getClass(), "externs", null);
        setField(term82660, term82660.getClass(), "modules", null);
        setField(term82660, term82660.getClass(), "moduleGraph", null);
        setField(term82660, term82660.getClass(), "inputs", null);
        setField(term82660, term82660.getClass(), "errorManager", null);
        setField(term82660, term82660.getClass(), "warningsGuard", null);
        setField(term82660, term82660.getClass(), "externsRoot", null);
        setField(term82660, term82660.getClass(), "jsRoot", null);
        setField(term82660, term82660.getClass(), "externAndJsRoot", null);
        setField(term82660, term82660.getClass(), "inputsById", null);
        setField(term82660, term82660.getClass(), "sourceMap", null);
        setField(term82660, term82660.getClass(), "externExports", null);
        setIntField(term82660, term82660.getClass(), "uniqueNameId", 0);
        setBooleanField(term82660, term82660.getClass(), "useThreads", false);
        setBooleanField(term82660, term82660.getClass(), "hasRegExpGlobalReferences", false);
        setField(term82660, term82660.getClass(), "functionInformationMap", null);
        setField(term82660, term82660.getClass(), "debugLog", null);
        setField(term82660, term82660.getClass(), "defaultCodingConvention", null);
        setField(term82660, term82660.getClass(), "typeRegistry", null);
        setField(term82660, term82660.getClass(), "parserConfig", null);
        setField(term82660, term82660.getClass(), "abstractInterpreter", null);
        setField(term82660, term82660.getClass(), "typeValidator", null);
        setField(term82660, term82660.getClass(), "tracker", null);
        setField(term82660, term82660.getClass(), "oldErrorReporter", null);
        setField(term82660, term82660.getClass(), "defaultErrorReporter", null);
        setField(term82660, term82660.getClass(), "outStream", null);
        setField(term82660, term82660.getClass(), "globalRefMap", null);
        setField(term82660, term82660.getClass(), "sanityCheck", null);
        setField(term82660, term82660.getClass(), "currentTracer", null);
        setField(term82660, term82660.getClass(), "currentPassName", null);
        setIntField(term82660, term82660.getClass(), "syntheticCodeId", 0);
        setField(term82660, term82660.getClass(), "recentChange", null);
        setField(term82660, term82660.getClass(), "codeChangeHandlers", null);
        setField(term82660, term82660.getClass(), "stage", null);
        setField(term82659, term82659.getClass(), "compiler", term82660);
        setField(term82659, term82659.getClass(), "preprocessorSymbolTable", null);
        setField(term82659, term82659.getClass(), "transformationHandler", null);
        term82661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82661, term82661.getClass(), "type", 0);
        setField(term82661, term82661.getClass(), "next", null);
        setField(term82661, term82661.getClass(), "first", null);
        setField(term82661, term82661.getClass(), "last", null);
        setField(term82661, term82661.getClass(), "propListHead", null);
        setIntField(term82661, term82661.getClass(), "sourcePosition", 0);
        setField(term82661, term82661.getClass(), "jsType", null);
        setIntField(term82662, term82662.getClass(), "type", 132);
        setField(term82662, term82662.getClass(), "next", null);
        setField(term82662, term82662.getClass(), "first", null);
        setField(term82662, term82662.getClass(), "last", null);
        setField(term82662, term82662.getClass(), "propListHead", null);
        setIntField(term82662, term82662.getClass(), "sourcePosition", 0);
        setField(term82662, term82662.getClass(), "jsType", null);
        setField(term82662, term82662.getClass(), "parent", null);
        setField(term82661, term82661.getClass(), "parent", term82662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term82266;
        callMethod(klass, "process", argTypes, term82116, args);
        assertTrue(recursiveEquals(term82116, term82659));
        assertTrue(recursiveEquals(term82266, null));
    }

};


