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

public class ScopedAliases_process_840655313191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116292;
     Object term116464;
     Object term117605;
     Object term117607;

    public ScopedAliases_process_840655313191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116292 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term116372 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term116292, term116292.getClass(), "compiler", term116372);
        term116464 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116718 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116464, term116464.getClass(), "type", 0);
        setField(term116464, term116464.getClass(), "parent", null);
        setField(term116534, term116534.getClass(), "next", term116626);
        setIntField(term116534, term116534.getClass(), "type", 0);
        setField(term116718, term116718.getClass(), "next", term116788);
        setIntField(term116718, term116718.getClass(), "type", 105);
        setField(term116534, term116534.getClass(), "first", term116718);
        setField(term116464, term116464.getClass(), "first", term116534);
        term117605 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term117606 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term117606, term117606.getClass(), "options", null);
        setField(term117606, term117606.getClass(), "passes", null);
        setField(term117606, term117606.getClass(), "externs", null);
        setField(term117606, term117606.getClass(), "modules", null);
        setField(term117606, term117606.getClass(), "moduleGraph", null);
        setField(term117606, term117606.getClass(), "inputs", null);
        setField(term117606, term117606.getClass(), "errorManager", null);
        setField(term117606, term117606.getClass(), "warningsGuard", null);
        setField(term117606, term117606.getClass(), "injectedLibraries", null);
        setField(term117606, term117606.getClass(), "externsRoot", null);
        setField(term117606, term117606.getClass(), "jsRoot", null);
        setField(term117606, term117606.getClass(), "externAndJsRoot", null);
        setField(term117606, term117606.getClass(), "inputsById", null);
        setField(term117606, term117606.getClass(), "sourceMap", null);
        setField(term117606, term117606.getClass(), "externExports", null);
        setIntField(term117606, term117606.getClass(), "uniqueNameId", 0);
        setBooleanField(term117606, term117606.getClass(), "useThreads", false);
        setBooleanField(term117606, term117606.getClass(), "hasRegExpGlobalReferences", false);
        setField(term117606, term117606.getClass(), "functionInformationMap", null);
        setField(term117606, term117606.getClass(), "debugLog", null);
        setField(term117606, term117606.getClass(), "defaultCodingConvention", null);
        setField(term117606, term117606.getClass(), "typeRegistry", null);
        setField(term117606, term117606.getClass(), "parserConfig", null);
        setField(term117606, term117606.getClass(), "abstractInterpreter", null);
        setField(term117606, term117606.getClass(), "typeValidator", null);
        setField(term117606, term117606.getClass(), "tracker", null);
        setField(term117606, term117606.getClass(), "oldErrorReporter", null);
        setField(term117606, term117606.getClass(), "defaultErrorReporter", null);
        setField(term117606, term117606.getClass(), "outStream", null);
        setField(term117606, term117606.getClass(), "globalRefMap", null);
        setDoubleField(term117606, term117606.getClass(), "progress", 0.0);
        setField(term117606, term117606.getClass(), "sanityCheck", null);
        setField(term117606, term117606.getClass(), "currentTracer", null);
        setField(term117606, term117606.getClass(), "currentPassName", null);
        setIntField(term117606, term117606.getClass(), "syntheticCodeId", 0);
        setField(term117606, term117606.getClass(), "recentChange", null);
        setField(term117606, term117606.getClass(), "codeChangeHandlers", null);
        setField(term117606, term117606.getClass(), "synthesizedExternsInput", null);
        setField(term117606, term117606.getClass(), "stage", null);
        setField(term117605, term117605.getClass(), "compiler", term117606);
        setField(term117605, term117605.getClass(), "preprocessorSymbolTable", null);
        setField(term117605, term117605.getClass(), "transformationHandler", null);
        term117607 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term117608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term117610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term117611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term117607, term117607.getClass(), "number", 0.0);
        setIntField(term117607, term117607.getClass(), "type", 0);
        setField(term117607, term117607.getClass(), "next", null);
        setIntField(term117608, term117608.getClass(), "type", 0);
        setDoubleField(term117609, term117609.getClass(), "number", 0.0);
        setIntField(term117609, term117609.getClass(), "type", 0);
        setField(term117609, term117609.getClass(), "next", null);
        setField(term117609, term117609.getClass(), "first", null);
        setField(term117609, term117609.getClass(), "last", null);
        setField(term117609, term117609.getClass(), "propListHead", null);
        setIntField(term117609, term117609.getClass(), "sourcePosition", 0);
        setField(term117609, term117609.getClass(), "jsType", null);
        setField(term117609, term117609.getClass(), "parent", null);
        setField(term117608, term117608.getClass(), "next", term117609);
        setDoubleField(term117610, term117610.getClass(), "number", 0.0);
        setIntField(term117610, term117610.getClass(), "type", 105);
        setIntField(term117611, term117611.getClass(), "type", 0);
        setField(term117611, term117611.getClass(), "next", null);
        setField(term117611, term117611.getClass(), "first", null);
        setField(term117611, term117611.getClass(), "last", null);
        setField(term117611, term117611.getClass(), "propListHead", null);
        setIntField(term117611, term117611.getClass(), "sourcePosition", 0);
        setField(term117611, term117611.getClass(), "jsType", null);
        setField(term117611, term117611.getClass(), "parent", null);
        setField(term117610, term117610.getClass(), "next", term117611);
        setField(term117610, term117610.getClass(), "first", null);
        setField(term117610, term117610.getClass(), "last", null);
        setField(term117610, term117610.getClass(), "propListHead", null);
        setIntField(term117610, term117610.getClass(), "sourcePosition", 0);
        setField(term117610, term117610.getClass(), "jsType", null);
        setField(term117610, term117610.getClass(), "parent", null);
        setField(term117608, term117608.getClass(), "first", term117610);
        setField(term117608, term117608.getClass(), "last", null);
        setField(term117608, term117608.getClass(), "propListHead", null);
        setIntField(term117608, term117608.getClass(), "sourcePosition", 0);
        setField(term117608, term117608.getClass(), "jsType", null);
        setField(term117608, term117608.getClass(), "parent", null);
        setField(term117607, term117607.getClass(), "first", term117608);
        setField(term117607, term117607.getClass(), "last", null);
        setField(term117607, term117607.getClass(), "propListHead", null);
        setIntField(term117607, term117607.getClass(), "sourcePosition", 0);
        setField(term117607, term117607.getClass(), "jsType", null);
        setField(term117607, term117607.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term116464;
        callMethod(klass, "process", argTypes, term116292, args);
        assertTrue(recursiveEquals(term116292, term117605));
        assertTrue(recursiveEquals(term116464, null));
    }

};


