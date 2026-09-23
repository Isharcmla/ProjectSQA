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

public class ProcessCommonJSModules_process_627866047407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218819;
     Object term218991;
     Object term289003;
     Object term289005;

    public ProcessCommonJSModules_process_627866047407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218819 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term218899 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term218819, term218819.getClass(), "compiler", term218899);
        term218991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term219083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term219175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term219267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term218991, term218991.getClass(), "type", 0);
        setField(term218991, term218991.getClass(), "parent", null);
        setField(term219083, term219083.getClass(), "next", term219175);
        setIntField(term219083, term219083.getClass(), "type", 33);
        setField(term219267, term219267.getClass(), "next", null);
        setIntField(term219267, term219267.getClass(), "type", 0);
        setField(term219267, term219267.getClass(), "first", null);
        setField(term219083, term219083.getClass(), "first", term219267);
        setField(term218991, term218991.getClass(), "first", term219083);
        term289003 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term289004 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term289004, term289004.getClass(), "options", null);
        setField(term289004, term289004.getClass(), "passes", null);
        setField(term289004, term289004.getClass(), "externs", null);
        setField(term289004, term289004.getClass(), "modules", null);
        setField(term289004, term289004.getClass(), "moduleGraph", null);
        setField(term289004, term289004.getClass(), "inputs", null);
        setField(term289004, term289004.getClass(), "errorManager", null);
        setField(term289004, term289004.getClass(), "warningsGuard", null);
        setField(term289004, term289004.getClass(), "injectedLibraries", null);
        setField(term289004, term289004.getClass(), "externsRoot", null);
        setField(term289004, term289004.getClass(), "jsRoot", null);
        setField(term289004, term289004.getClass(), "externAndJsRoot", null);
        setField(term289004, term289004.getClass(), "inputsById", null);
        setField(term289004, term289004.getClass(), "sourceMap", null);
        setField(term289004, term289004.getClass(), "externExports", null);
        setIntField(term289004, term289004.getClass(), "uniqueNameId", 0);
        setBooleanField(term289004, term289004.getClass(), "hasRegExpGlobalReferences", false);
        setField(term289004, term289004.getClass(), "functionInformationMap", null);
        setField(term289004, term289004.getClass(), "debugLog", null);
        setField(term289004, term289004.getClass(), "defaultCodingConvention", null);
        setField(term289004, term289004.getClass(), "typeRegistry", null);
        setField(term289004, term289004.getClass(), "parserConfig", null);
        setField(term289004, term289004.getClass(), "abstractInterpreter", null);
        setField(term289004, term289004.getClass(), "typeValidator", null);
        setField(term289004, term289004.getClass(), "tracker", null);
        setField(term289004, term289004.getClass(), "oldErrorReporter", null);
        setField(term289004, term289004.getClass(), "defaultErrorReporter", null);
        setField(term289004, term289004.getClass(), "compilerThread", null);
        setBooleanField(term289004, term289004.getClass(), "useThreads", false);
        setField(term289004, term289004.getClass(), "outStream", null);
        setField(term289004, term289004.getClass(), "globalRefMap", null);
        setDoubleField(term289004, term289004.getClass(), "progress", 0.0);
        setField(term289004, term289004.getClass(), "lastPassName", null);
        setField(term289004, term289004.getClass(), "sanityCheck", null);
        setField(term289004, term289004.getClass(), "currentTracer", null);
        setField(term289004, term289004.getClass(), "currentPassName", null);
        setIntField(term289004, term289004.getClass(), "syntheticCodeId", 0);
        setField(term289004, term289004.getClass(), "recentChange", null);
        setField(term289004, term289004.getClass(), "codeChangeHandlers", null);
        setField(term289004, term289004.getClass(), "synthesizedExternsInput", null);
        setField(term289004, term289004.getClass(), "stage", null);
        setField(term289003, term289003.getClass(), "compiler", term289004);
        setField(term289003, term289003.getClass(), "filenamePrefix", null);
        setBooleanField(term289003, term289003.getClass(), "reportDependencies", false);
        setField(term289003, term289003.getClass(), "module", null);
        term289005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289006 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289008 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term289005, term289005.getClass(), "number", 0.0);
        setIntField(term289005, term289005.getClass(), "type", 0);
        setField(term289005, term289005.getClass(), "next", null);
        setDoubleField(term289006, term289006.getClass(), "number", 0.0);
        setIntField(term289006, term289006.getClass(), "type", 33);
        setDoubleField(term289007, term289007.getClass(), "number", 0.0);
        setIntField(term289007, term289007.getClass(), "type", 0);
        setField(term289007, term289007.getClass(), "next", null);
        setField(term289007, term289007.getClass(), "first", null);
        setField(term289007, term289007.getClass(), "last", null);
        setField(term289007, term289007.getClass(), "propListHead", null);
        setIntField(term289007, term289007.getClass(), "sourcePosition", 0);
        setField(term289007, term289007.getClass(), "jsType", null);
        setField(term289007, term289007.getClass(), "parent", null);
        setField(term289006, term289006.getClass(), "next", term289007);
        setDoubleField(term289008, term289008.getClass(), "number", 0.0);
        setIntField(term289008, term289008.getClass(), "type", 0);
        setField(term289008, term289008.getClass(), "next", null);
        setField(term289008, term289008.getClass(), "first", null);
        setField(term289008, term289008.getClass(), "last", null);
        setField(term289008, term289008.getClass(), "propListHead", null);
        setIntField(term289008, term289008.getClass(), "sourcePosition", 0);
        setField(term289008, term289008.getClass(), "jsType", null);
        setField(term289008, term289008.getClass(), "parent", null);
        setField(term289006, term289006.getClass(), "first", term289008);
        setField(term289006, term289006.getClass(), "last", null);
        setField(term289006, term289006.getClass(), "propListHead", null);
        setIntField(term289006, term289006.getClass(), "sourcePosition", 0);
        setField(term289006, term289006.getClass(), "jsType", null);
        setField(term289006, term289006.getClass(), "parent", null);
        setField(term289005, term289005.getClass(), "first", term289006);
        setField(term289005, term289005.getClass(), "last", null);
        setField(term289005, term289005.getClass(), "propListHead", null);
        setIntField(term289005, term289005.getClass(), "sourcePosition", 0);
        setField(term289005, term289005.getClass(), "jsType", null);
        setField(term289005, term289005.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term218991;
        callMethod(klass, "process", argTypes, term218819, args);
        assertTrue(recursiveEquals(term218819, term289003));
        assertTrue(recursiveEquals(term218991, null));
    }

};


