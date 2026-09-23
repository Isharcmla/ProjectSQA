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

public class ProcessCommonJSModules_process_62786604742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22591;
     Object term22741;
     Object term23972;
     Object term23974;

    public ProcessCommonJSModules_process_62786604742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22591 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term22671 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22591, term22591.getClass(), "compiler", term22671);
        term22741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22741, term22741.getClass(), "type", 0);
        setField(term22741, term22741.getClass(), "parent", null);
        setField(term22811, term22811.getClass(), "next", term22881);
        setIntField(term22811, term22811.getClass(), "type", 33);
        setField(term23021, term23021.getClass(), "next", null);
        setIntField(term23021, term23021.getClass(), "type", 0);
        setField(term23021, term23021.getClass(), "first", null);
        setField(term22951, term22951.getClass(), "next", term23021);
        setIntField(term22951, term22951.getClass(), "type", 0);
        setField(term22951, term22951.getClass(), "first", null);
        setField(term22811, term22811.getClass(), "first", term22951);
        setField(term22741, term22741.getClass(), "first", term22811);
        term23972 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term23973 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term23973, term23973.getClass(), "options", null);
        setField(term23973, term23973.getClass(), "passes", null);
        setField(term23973, term23973.getClass(), "externs", null);
        setField(term23973, term23973.getClass(), "modules", null);
        setField(term23973, term23973.getClass(), "moduleGraph", null);
        setField(term23973, term23973.getClass(), "inputs", null);
        setField(term23973, term23973.getClass(), "errorManager", null);
        setField(term23973, term23973.getClass(), "warningsGuard", null);
        setField(term23973, term23973.getClass(), "injectedLibraries", null);
        setField(term23973, term23973.getClass(), "externsRoot", null);
        setField(term23973, term23973.getClass(), "jsRoot", null);
        setField(term23973, term23973.getClass(), "externAndJsRoot", null);
        setField(term23973, term23973.getClass(), "inputsById", null);
        setField(term23973, term23973.getClass(), "sourceMap", null);
        setField(term23973, term23973.getClass(), "externExports", null);
        setIntField(term23973, term23973.getClass(), "uniqueNameId", 0);
        setBooleanField(term23973, term23973.getClass(), "useThreads", false);
        setBooleanField(term23973, term23973.getClass(), "hasRegExpGlobalReferences", false);
        setField(term23973, term23973.getClass(), "functionInformationMap", null);
        setField(term23973, term23973.getClass(), "debugLog", null);
        setField(term23973, term23973.getClass(), "defaultCodingConvention", null);
        setField(term23973, term23973.getClass(), "typeRegistry", null);
        setField(term23973, term23973.getClass(), "parserConfig", null);
        setField(term23973, term23973.getClass(), "abstractInterpreter", null);
        setField(term23973, term23973.getClass(), "typeValidator", null);
        setField(term23973, term23973.getClass(), "tracker", null);
        setField(term23973, term23973.getClass(), "oldErrorReporter", null);
        setField(term23973, term23973.getClass(), "defaultErrorReporter", null);
        setField(term23973, term23973.getClass(), "outStream", null);
        setField(term23973, term23973.getClass(), "globalRefMap", null);
        setDoubleField(term23973, term23973.getClass(), "progress", 0.0);
        setField(term23973, term23973.getClass(), "sanityCheck", null);
        setField(term23973, term23973.getClass(), "currentTracer", null);
        setField(term23973, term23973.getClass(), "currentPassName", null);
        setIntField(term23973, term23973.getClass(), "syntheticCodeId", 0);
        setField(term23973, term23973.getClass(), "recentChange", null);
        setField(term23973, term23973.getClass(), "codeChangeHandlers", null);
        setField(term23973, term23973.getClass(), "synthesizedExternsInput", null);
        setField(term23973, term23973.getClass(), "stage", null);
        setField(term23972, term23972.getClass(), "compiler", term23973);
        setField(term23972, term23972.getClass(), "filenamePrefix", null);
        setBooleanField(term23972, term23972.getClass(), "reportDependencies", false);
        setField(term23972, term23972.getClass(), "module", null);
        term23974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23974, term23974.getClass(), "type", 0);
        setField(term23974, term23974.getClass(), "next", null);
        setIntField(term23975, term23975.getClass(), "type", 33);
        setIntField(term23976, term23976.getClass(), "type", 0);
        setField(term23976, term23976.getClass(), "next", null);
        setField(term23976, term23976.getClass(), "first", null);
        setField(term23976, term23976.getClass(), "last", null);
        setField(term23976, term23976.getClass(), "propListHead", null);
        setIntField(term23976, term23976.getClass(), "sourcePosition", 0);
        setField(term23976, term23976.getClass(), "jsType", null);
        setField(term23976, term23976.getClass(), "parent", null);
        setField(term23975, term23975.getClass(), "next", term23976);
        setIntField(term23977, term23977.getClass(), "type", 0);
        setIntField(term23978, term23978.getClass(), "type", 0);
        setField(term23978, term23978.getClass(), "next", null);
        setField(term23978, term23978.getClass(), "first", null);
        setField(term23978, term23978.getClass(), "last", null);
        setField(term23978, term23978.getClass(), "propListHead", null);
        setIntField(term23978, term23978.getClass(), "sourcePosition", 0);
        setField(term23978, term23978.getClass(), "jsType", null);
        setField(term23978, term23978.getClass(), "parent", null);
        setField(term23977, term23977.getClass(), "next", term23978);
        setField(term23977, term23977.getClass(), "first", null);
        setField(term23977, term23977.getClass(), "last", null);
        setField(term23977, term23977.getClass(), "propListHead", null);
        setIntField(term23977, term23977.getClass(), "sourcePosition", 0);
        setField(term23977, term23977.getClass(), "jsType", null);
        setField(term23977, term23977.getClass(), "parent", null);
        setField(term23975, term23975.getClass(), "first", term23977);
        setField(term23975, term23975.getClass(), "last", null);
        setField(term23975, term23975.getClass(), "propListHead", null);
        setIntField(term23975, term23975.getClass(), "sourcePosition", 0);
        setField(term23975, term23975.getClass(), "jsType", null);
        setField(term23975, term23975.getClass(), "parent", null);
        setField(term23974, term23974.getClass(), "first", term23975);
        setField(term23974, term23974.getClass(), "last", null);
        setField(term23974, term23974.getClass(), "propListHead", null);
        setIntField(term23974, term23974.getClass(), "sourcePosition", 0);
        setField(term23974, term23974.getClass(), "jsType", null);
        setField(term23974, term23974.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22741;
        callMethod(klass, "process", argTypes, term22591, args);
        assertTrue(recursiveEquals(term22591, term23972));
        assertTrue(recursiveEquals(term22741, null));
    }

};


