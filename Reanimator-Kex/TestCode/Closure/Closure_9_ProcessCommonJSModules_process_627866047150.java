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

public class ProcessCommonJSModules_process_627866047150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70638;
     Object term70788;
     Object term72602;
     Object term72604;

    public ProcessCommonJSModules_process_627866047150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70638 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term70718 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70638, term70638.getClass(), "compiler", term70718);
        term70788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70880 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71134 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term70788, term70788.getClass(), "type", 0);
        setField(term70788, term70788.getClass(), "parent", null);
        setField(term70972, term70972.getClass(), "next", term71042);
        setIntField(term70972, term70972.getClass(), "type", 37);
        setField(term70972, term70972.getClass(), "first", null);
        setField(term70880, term70880.getClass(), "next", term70972);
        setIntField(term70880, term70880.getClass(), "type", 0);
        setField(term71226, term71226.getClass(), "next", null);
        setIntField(term71226, term71226.getClass(), "type", 0);
        setField(term71226, term71226.getClass(), "first", null);
        setField(term71134, term71134.getClass(), "next", term71226);
        setIntField(term71134, term71134.getClass(), "type", 0);
        setField(term71134, term71134.getClass(), "first", null);
        setField(term70880, term70880.getClass(), "first", term71134);
        setField(term70788, term70788.getClass(), "first", term70880);
        term72602 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term72603 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term72603, term72603.getClass(), "options", null);
        setField(term72603, term72603.getClass(), "passes", null);
        setField(term72603, term72603.getClass(), "externs", null);
        setField(term72603, term72603.getClass(), "modules", null);
        setField(term72603, term72603.getClass(), "moduleGraph", null);
        setField(term72603, term72603.getClass(), "inputs", null);
        setField(term72603, term72603.getClass(), "errorManager", null);
        setField(term72603, term72603.getClass(), "warningsGuard", null);
        setField(term72603, term72603.getClass(), "injectedLibraries", null);
        setField(term72603, term72603.getClass(), "externsRoot", null);
        setField(term72603, term72603.getClass(), "jsRoot", null);
        setField(term72603, term72603.getClass(), "externAndJsRoot", null);
        setField(term72603, term72603.getClass(), "inputsById", null);
        setField(term72603, term72603.getClass(), "sourceMap", null);
        setField(term72603, term72603.getClass(), "externExports", null);
        setIntField(term72603, term72603.getClass(), "uniqueNameId", 0);
        setBooleanField(term72603, term72603.getClass(), "hasRegExpGlobalReferences", false);
        setField(term72603, term72603.getClass(), "functionInformationMap", null);
        setField(term72603, term72603.getClass(), "debugLog", null);
        setField(term72603, term72603.getClass(), "defaultCodingConvention", null);
        setField(term72603, term72603.getClass(), "typeRegistry", null);
        setField(term72603, term72603.getClass(), "parserConfig", null);
        setField(term72603, term72603.getClass(), "abstractInterpreter", null);
        setField(term72603, term72603.getClass(), "typeValidator", null);
        setField(term72603, term72603.getClass(), "tracker", null);
        setField(term72603, term72603.getClass(), "oldErrorReporter", null);
        setField(term72603, term72603.getClass(), "defaultErrorReporter", null);
        setField(term72603, term72603.getClass(), "compilerThread", null);
        setBooleanField(term72603, term72603.getClass(), "useThreads", false);
        setField(term72603, term72603.getClass(), "outStream", null);
        setField(term72603, term72603.getClass(), "globalRefMap", null);
        setDoubleField(term72603, term72603.getClass(), "progress", 0.0);
        setField(term72603, term72603.getClass(), "lastPassName", null);
        setField(term72603, term72603.getClass(), "sanityCheck", null);
        setField(term72603, term72603.getClass(), "currentTracer", null);
        setField(term72603, term72603.getClass(), "currentPassName", null);
        setIntField(term72603, term72603.getClass(), "syntheticCodeId", 0);
        setField(term72603, term72603.getClass(), "recentChange", null);
        setField(term72603, term72603.getClass(), "codeChangeHandlers", null);
        setField(term72603, term72603.getClass(), "synthesizedExternsInput", null);
        setField(term72603, term72603.getClass(), "stage", null);
        setField(term72602, term72602.getClass(), "compiler", term72603);
        setField(term72602, term72602.getClass(), "filenamePrefix", null);
        setBooleanField(term72602, term72602.getClass(), "reportDependencies", false);
        setField(term72602, term72602.getClass(), "module", null);
        term72604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72605 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term72606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term72607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term72609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term72604, term72604.getClass(), "type", 0);
        setField(term72604, term72604.getClass(), "next", null);
        setDoubleField(term72605, term72605.getClass(), "number", 0.0);
        setIntField(term72605, term72605.getClass(), "type", 0);
        setDoubleField(term72606, term72606.getClass(), "number", 0.0);
        setIntField(term72606, term72606.getClass(), "type", 37);
        setIntField(term72607, term72607.getClass(), "type", 0);
        setField(term72607, term72607.getClass(), "next", null);
        setField(term72607, term72607.getClass(), "first", null);
        setField(term72607, term72607.getClass(), "last", null);
        setField(term72607, term72607.getClass(), "propListHead", null);
        setIntField(term72607, term72607.getClass(), "sourcePosition", 0);
        setField(term72607, term72607.getClass(), "jsType", null);
        setField(term72607, term72607.getClass(), "parent", null);
        setField(term72606, term72606.getClass(), "next", term72607);
        setField(term72606, term72606.getClass(), "first", null);
        setField(term72606, term72606.getClass(), "last", null);
        setField(term72606, term72606.getClass(), "propListHead", null);
        setIntField(term72606, term72606.getClass(), "sourcePosition", 0);
        setField(term72606, term72606.getClass(), "jsType", null);
        setField(term72606, term72606.getClass(), "parent", null);
        setField(term72605, term72605.getClass(), "next", term72606);
        setDoubleField(term72608, term72608.getClass(), "number", 0.0);
        setIntField(term72608, term72608.getClass(), "type", 0);
        setDoubleField(term72609, term72609.getClass(), "number", 0.0);
        setIntField(term72609, term72609.getClass(), "type", 0);
        setField(term72609, term72609.getClass(), "next", null);
        setField(term72609, term72609.getClass(), "first", null);
        setField(term72609, term72609.getClass(), "last", null);
        setField(term72609, term72609.getClass(), "propListHead", null);
        setIntField(term72609, term72609.getClass(), "sourcePosition", 0);
        setField(term72609, term72609.getClass(), "jsType", null);
        setField(term72609, term72609.getClass(), "parent", null);
        setField(term72608, term72608.getClass(), "next", term72609);
        setField(term72608, term72608.getClass(), "first", null);
        setField(term72608, term72608.getClass(), "last", null);
        setField(term72608, term72608.getClass(), "propListHead", null);
        setIntField(term72608, term72608.getClass(), "sourcePosition", 0);
        setField(term72608, term72608.getClass(), "jsType", null);
        setField(term72608, term72608.getClass(), "parent", null);
        setField(term72605, term72605.getClass(), "first", term72608);
        setField(term72605, term72605.getClass(), "last", null);
        setField(term72605, term72605.getClass(), "propListHead", null);
        setIntField(term72605, term72605.getClass(), "sourcePosition", 0);
        setField(term72605, term72605.getClass(), "jsType", null);
        setField(term72605, term72605.getClass(), "parent", null);
        setField(term72604, term72604.getClass(), "first", term72605);
        setField(term72604, term72604.getClass(), "last", null);
        setField(term72604, term72604.getClass(), "propListHead", null);
        setIntField(term72604, term72604.getClass(), "sourcePosition", 0);
        setField(term72604, term72604.getClass(), "jsType", null);
        setField(term72604, term72604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term70788;
        callMethod(klass, "process", argTypes, term70638, args);
        assertTrue(recursiveEquals(term70638, term72602));
        assertTrue(recursiveEquals(term70788, null));
    }

};


