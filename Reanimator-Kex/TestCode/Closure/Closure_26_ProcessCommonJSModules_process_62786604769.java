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

public class ProcessCommonJSModules_process_62786604769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37851;
     Object term38023;
     Object term38153;
     Object term38155;

    public ProcessCommonJSModules_process_62786604769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37851 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term37931 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37851, term37851.getClass(), "compiler", term37931);
        term38023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term38023, term38023.getClass(), "type", 0);
        setField(term38023, term38023.getClass(), "parent", null);
        setField(term38023, term38023.getClass(), "first", null);
        term38153 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term38154 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38154, term38154.getClass(), "options", null);
        setField(term38154, term38154.getClass(), "passes", null);
        setField(term38154, term38154.getClass(), "externs", null);
        setField(term38154, term38154.getClass(), "modules", null);
        setField(term38154, term38154.getClass(), "moduleGraph", null);
        setField(term38154, term38154.getClass(), "inputs", null);
        setField(term38154, term38154.getClass(), "errorManager", null);
        setField(term38154, term38154.getClass(), "warningsGuard", null);
        setField(term38154, term38154.getClass(), "injectedLibraries", null);
        setField(term38154, term38154.getClass(), "externsRoot", null);
        setField(term38154, term38154.getClass(), "jsRoot", null);
        setField(term38154, term38154.getClass(), "externAndJsRoot", null);
        setField(term38154, term38154.getClass(), "inputsById", null);
        setField(term38154, term38154.getClass(), "sourceMap", null);
        setField(term38154, term38154.getClass(), "externExports", null);
        setIntField(term38154, term38154.getClass(), "uniqueNameId", 0);
        setBooleanField(term38154, term38154.getClass(), "useThreads", false);
        setBooleanField(term38154, term38154.getClass(), "hasRegExpGlobalReferences", false);
        setField(term38154, term38154.getClass(), "functionInformationMap", null);
        setField(term38154, term38154.getClass(), "debugLog", null);
        setField(term38154, term38154.getClass(), "defaultCodingConvention", null);
        setField(term38154, term38154.getClass(), "typeRegistry", null);
        setField(term38154, term38154.getClass(), "parserConfig", null);
        setField(term38154, term38154.getClass(), "abstractInterpreter", null);
        setField(term38154, term38154.getClass(), "typeValidator", null);
        setField(term38154, term38154.getClass(), "tracker", null);
        setField(term38154, term38154.getClass(), "oldErrorReporter", null);
        setField(term38154, term38154.getClass(), "defaultErrorReporter", null);
        setField(term38154, term38154.getClass(), "outStream", null);
        setField(term38154, term38154.getClass(), "globalRefMap", null);
        setDoubleField(term38154, term38154.getClass(), "progress", 0.0);
        setField(term38154, term38154.getClass(), "sanityCheck", null);
        setField(term38154, term38154.getClass(), "currentTracer", null);
        setField(term38154, term38154.getClass(), "currentPassName", null);
        setIntField(term38154, term38154.getClass(), "syntheticCodeId", 0);
        setField(term38154, term38154.getClass(), "recentChange", null);
        setField(term38154, term38154.getClass(), "codeChangeHandlers", null);
        setField(term38154, term38154.getClass(), "synthesizedExternsInput", null);
        setField(term38154, term38154.getClass(), "stage", null);
        setField(term38153, term38153.getClass(), "compiler", term38154);
        setField(term38153, term38153.getClass(), "filenamePrefix", null);
        setBooleanField(term38153, term38153.getClass(), "reportDependencies", false);
        setField(term38153, term38153.getClass(), "module", null);
        term38155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38155, term38155.getClass(), "str", null);
        setIntField(term38155, term38155.getClass(), "type", 0);
        setField(term38155, term38155.getClass(), "next", null);
        setField(term38155, term38155.getClass(), "first", null);
        setField(term38155, term38155.getClass(), "last", null);
        setField(term38155, term38155.getClass(), "propListHead", null);
        setIntField(term38155, term38155.getClass(), "sourcePosition", 0);
        setField(term38155, term38155.getClass(), "jsType", null);
        setField(term38155, term38155.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term38023;
        callMethod(klass, "process", argTypes, term37851, args);
        assertTrue(recursiveEquals(term37851, term38153));
        assertTrue(recursiveEquals(term38023, null));
    }

};


