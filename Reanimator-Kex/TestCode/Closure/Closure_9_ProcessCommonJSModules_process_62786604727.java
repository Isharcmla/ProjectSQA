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

public class ProcessCommonJSModules_process_62786604727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4309;
     Object term4459;
     Object term5089;
     Object term5091;

    public ProcessCommonJSModules_process_62786604727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4309 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term4389 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term4309, term4309.getClass(), "compiler", term4389);
        term4459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4621 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4713 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4459, term4459.getClass(), "type", 0);
        setField(term4459, term4459.getClass(), "parent", null);
        setField(term4529, term4529.getClass(), "next", term4621);
        setIntField(term4529, term4529.getClass(), "type", 0);
        setField(term4529, term4529.getClass(), "first", term4713);
        setField(term4459, term4459.getClass(), "first", term4529);
        term5089 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term5090 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term5090, term5090.getClass(), "options", null);
        setField(term5090, term5090.getClass(), "passes", null);
        setField(term5090, term5090.getClass(), "externs", null);
        setField(term5090, term5090.getClass(), "modules", null);
        setField(term5090, term5090.getClass(), "moduleGraph", null);
        setField(term5090, term5090.getClass(), "inputs", null);
        setField(term5090, term5090.getClass(), "errorManager", null);
        setField(term5090, term5090.getClass(), "warningsGuard", null);
        setField(term5090, term5090.getClass(), "injectedLibraries", null);
        setField(term5090, term5090.getClass(), "externsRoot", null);
        setField(term5090, term5090.getClass(), "jsRoot", null);
        setField(term5090, term5090.getClass(), "externAndJsRoot", null);
        setField(term5090, term5090.getClass(), "inputsById", null);
        setField(term5090, term5090.getClass(), "sourceMap", null);
        setField(term5090, term5090.getClass(), "externExports", null);
        setIntField(term5090, term5090.getClass(), "uniqueNameId", 0);
        setBooleanField(term5090, term5090.getClass(), "hasRegExpGlobalReferences", false);
        setField(term5090, term5090.getClass(), "functionInformationMap", null);
        setField(term5090, term5090.getClass(), "debugLog", null);
        setField(term5090, term5090.getClass(), "defaultCodingConvention", null);
        setField(term5090, term5090.getClass(), "typeRegistry", null);
        setField(term5090, term5090.getClass(), "parserConfig", null);
        setField(term5090, term5090.getClass(), "abstractInterpreter", null);
        setField(term5090, term5090.getClass(), "typeValidator", null);
        setField(term5090, term5090.getClass(), "tracker", null);
        setField(term5090, term5090.getClass(), "oldErrorReporter", null);
        setField(term5090, term5090.getClass(), "defaultErrorReporter", null);
        setField(term5090, term5090.getClass(), "compilerThread", null);
        setBooleanField(term5090, term5090.getClass(), "useThreads", false);
        setField(term5090, term5090.getClass(), "outStream", null);
        setField(term5090, term5090.getClass(), "globalRefMap", null);
        setDoubleField(term5090, term5090.getClass(), "progress", 0.0);
        setField(term5090, term5090.getClass(), "lastPassName", null);
        setField(term5090, term5090.getClass(), "sanityCheck", null);
        setField(term5090, term5090.getClass(), "currentTracer", null);
        setField(term5090, term5090.getClass(), "currentPassName", null);
        setIntField(term5090, term5090.getClass(), "syntheticCodeId", 0);
        setField(term5090, term5090.getClass(), "recentChange", null);
        setField(term5090, term5090.getClass(), "codeChangeHandlers", null);
        setField(term5090, term5090.getClass(), "synthesizedExternsInput", null);
        setField(term5090, term5090.getClass(), "stage", null);
        setField(term5089, term5089.getClass(), "compiler", term5090);
        setField(term5089, term5089.getClass(), "filenamePrefix", null);
        setBooleanField(term5089, term5089.getClass(), "reportDependencies", false);
        setField(term5089, term5089.getClass(), "module", null);
        term5091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5093 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term5091, term5091.getClass(), "type", 0);
        setField(term5091, term5091.getClass(), "next", null);
        setIntField(term5092, term5092.getClass(), "type", 0);
        setDoubleField(term5093, term5093.getClass(), "number", 0.0);
        setIntField(term5093, term5093.getClass(), "type", 0);
        setField(term5093, term5093.getClass(), "next", null);
        setField(term5093, term5093.getClass(), "first", null);
        setField(term5093, term5093.getClass(), "last", null);
        setField(term5093, term5093.getClass(), "propListHead", null);
        setIntField(term5093, term5093.getClass(), "sourcePosition", 0);
        setField(term5093, term5093.getClass(), "jsType", null);
        setField(term5093, term5093.getClass(), "parent", null);
        setField(term5092, term5092.getClass(), "next", term5093);
        setDoubleField(term5094, term5094.getClass(), "number", 0.0);
        setIntField(term5094, term5094.getClass(), "type", 0);
        setField(term5094, term5094.getClass(), "next", null);
        setField(term5094, term5094.getClass(), "first", null);
        setField(term5094, term5094.getClass(), "last", null);
        setField(term5094, term5094.getClass(), "propListHead", null);
        setIntField(term5094, term5094.getClass(), "sourcePosition", 0);
        setField(term5094, term5094.getClass(), "jsType", null);
        setField(term5094, term5094.getClass(), "parent", null);
        setField(term5092, term5092.getClass(), "first", term5094);
        setField(term5092, term5092.getClass(), "last", null);
        setField(term5092, term5092.getClass(), "propListHead", null);
        setIntField(term5092, term5092.getClass(), "sourcePosition", 0);
        setField(term5092, term5092.getClass(), "jsType", null);
        setField(term5092, term5092.getClass(), "parent", null);
        setField(term5091, term5091.getClass(), "first", term5092);
        setField(term5091, term5091.getClass(), "last", null);
        setField(term5091, term5091.getClass(), "propListHead", null);
        setIntField(term5091, term5091.getClass(), "sourcePosition", 0);
        setField(term5091, term5091.getClass(), "jsType", null);
        setField(term5091, term5091.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4459;
        callMethod(klass, "process", argTypes, term4309, args);
        assertTrue(recursiveEquals(term4309, term5089));
        assertTrue(recursiveEquals(term4459, null));
    }

};


