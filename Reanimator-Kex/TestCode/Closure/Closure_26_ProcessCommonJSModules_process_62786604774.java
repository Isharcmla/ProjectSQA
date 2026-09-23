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

public class ProcessCommonJSModules_process_62786604774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39494;
     Object term39666;
     Object term40548;
     Object term40550;

    public ProcessCommonJSModules_process_62786604774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39494 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term39574 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term39494, term39494.getClass(), "compiler", term39574);
        term39666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term39758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term39828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39666, term39666.getClass(), "type", 0);
        setField(term39666, term39666.getClass(), "parent", null);
        setField(term39758, term39758.getClass(), "next", term39828);
        setIntField(term39758, term39758.getClass(), "type", 0);
        setField(term39758, term39758.getClass(), "first", null);
        setField(term39666, term39666.getClass(), "first", term39758);
        term40548 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term40549 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term40549, term40549.getClass(), "options", null);
        setField(term40549, term40549.getClass(), "passes", null);
        setField(term40549, term40549.getClass(), "externs", null);
        setField(term40549, term40549.getClass(), "modules", null);
        setField(term40549, term40549.getClass(), "moduleGraph", null);
        setField(term40549, term40549.getClass(), "inputs", null);
        setField(term40549, term40549.getClass(), "errorManager", null);
        setField(term40549, term40549.getClass(), "warningsGuard", null);
        setField(term40549, term40549.getClass(), "injectedLibraries", null);
        setField(term40549, term40549.getClass(), "externsRoot", null);
        setField(term40549, term40549.getClass(), "jsRoot", null);
        setField(term40549, term40549.getClass(), "externAndJsRoot", null);
        setField(term40549, term40549.getClass(), "inputsById", null);
        setField(term40549, term40549.getClass(), "sourceMap", null);
        setField(term40549, term40549.getClass(), "externExports", null);
        setIntField(term40549, term40549.getClass(), "uniqueNameId", 0);
        setBooleanField(term40549, term40549.getClass(), "useThreads", false);
        setBooleanField(term40549, term40549.getClass(), "hasRegExpGlobalReferences", false);
        setField(term40549, term40549.getClass(), "functionInformationMap", null);
        setField(term40549, term40549.getClass(), "debugLog", null);
        setField(term40549, term40549.getClass(), "defaultCodingConvention", null);
        setField(term40549, term40549.getClass(), "typeRegistry", null);
        setField(term40549, term40549.getClass(), "parserConfig", null);
        setField(term40549, term40549.getClass(), "abstractInterpreter", null);
        setField(term40549, term40549.getClass(), "typeValidator", null);
        setField(term40549, term40549.getClass(), "tracker", null);
        setField(term40549, term40549.getClass(), "oldErrorReporter", null);
        setField(term40549, term40549.getClass(), "defaultErrorReporter", null);
        setField(term40549, term40549.getClass(), "outStream", null);
        setField(term40549, term40549.getClass(), "globalRefMap", null);
        setDoubleField(term40549, term40549.getClass(), "progress", 0.0);
        setField(term40549, term40549.getClass(), "sanityCheck", null);
        setField(term40549, term40549.getClass(), "currentTracer", null);
        setField(term40549, term40549.getClass(), "currentPassName", null);
        setIntField(term40549, term40549.getClass(), "syntheticCodeId", 0);
        setField(term40549, term40549.getClass(), "recentChange", null);
        setField(term40549, term40549.getClass(), "codeChangeHandlers", null);
        setField(term40549, term40549.getClass(), "synthesizedExternsInput", null);
        setField(term40549, term40549.getClass(), "stage", null);
        setField(term40548, term40548.getClass(), "compiler", term40549);
        setField(term40548, term40548.getClass(), "filenamePrefix", null);
        setBooleanField(term40548, term40548.getClass(), "reportDependencies", false);
        setField(term40548, term40548.getClass(), "module", null);
        term40550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term40551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term40552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40550, term40550.getClass(), "str", null);
        setIntField(term40550, term40550.getClass(), "type", 0);
        setField(term40550, term40550.getClass(), "next", null);
        setField(term40551, term40551.getClass(), "str", null);
        setIntField(term40551, term40551.getClass(), "type", 0);
        setIntField(term40552, term40552.getClass(), "type", 0);
        setField(term40552, term40552.getClass(), "next", null);
        setField(term40552, term40552.getClass(), "first", null);
        setField(term40552, term40552.getClass(), "last", null);
        setField(term40552, term40552.getClass(), "propListHead", null);
        setIntField(term40552, term40552.getClass(), "sourcePosition", 0);
        setField(term40552, term40552.getClass(), "jsType", null);
        setField(term40552, term40552.getClass(), "parent", null);
        setField(term40551, term40551.getClass(), "next", term40552);
        setField(term40551, term40551.getClass(), "first", null);
        setField(term40551, term40551.getClass(), "last", null);
        setField(term40551, term40551.getClass(), "propListHead", null);
        setIntField(term40551, term40551.getClass(), "sourcePosition", 0);
        setField(term40551, term40551.getClass(), "jsType", null);
        setField(term40551, term40551.getClass(), "parent", null);
        setField(term40550, term40550.getClass(), "first", term40551);
        setField(term40550, term40550.getClass(), "last", null);
        setField(term40550, term40550.getClass(), "propListHead", null);
        setIntField(term40550, term40550.getClass(), "sourcePosition", 0);
        setField(term40550, term40550.getClass(), "jsType", null);
        setField(term40550, term40550.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term39666;
        callMethod(klass, "process", argTypes, term39494, args);
        assertTrue(recursiveEquals(term39494, term40548));
        assertTrue(recursiveEquals(term39666, null));
    }

};


