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

public class ProcessCommonJSModules_process_627866047157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75925;
     Object term76075;
     Object term76945;
     Object term76947;

    public ProcessCommonJSModules_process_627866047157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75925 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term76005 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term75925, term75925.getClass(), "compiler", term76005);
        term76075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76075, term76075.getClass(), "type", 0);
        setField(term76075, term76075.getClass(), "parent", null);
        setField(term76215, term76215.getClass(), "next", term76285);
        setIntField(term76215, term76215.getClass(), "type", 37);
        setField(term76215, term76215.getClass(), "first", null);
        setField(term76145, term76145.getClass(), "next", term76215);
        setIntField(term76145, term76145.getClass(), "type", 0);
        setField(term76425, term76425.getClass(), "next", null);
        setIntField(term76425, term76425.getClass(), "type", 0);
        setField(term76425, term76425.getClass(), "first", null);
        setField(term76355, term76355.getClass(), "next", term76425);
        setIntField(term76355, term76355.getClass(), "type", 37);
        setField(term76355, term76355.getClass(), "first", null);
        setField(term76145, term76145.getClass(), "first", term76355);
        setField(term76075, term76075.getClass(), "first", term76145);
        term76945 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term76946 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76946, term76946.getClass(), "options", null);
        setField(term76946, term76946.getClass(), "passes", null);
        setField(term76946, term76946.getClass(), "externs", null);
        setField(term76946, term76946.getClass(), "modules", null);
        setField(term76946, term76946.getClass(), "moduleGraph", null);
        setField(term76946, term76946.getClass(), "inputs", null);
        setField(term76946, term76946.getClass(), "errorManager", null);
        setField(term76946, term76946.getClass(), "warningsGuard", null);
        setField(term76946, term76946.getClass(), "injectedLibraries", null);
        setField(term76946, term76946.getClass(), "externsRoot", null);
        setField(term76946, term76946.getClass(), "jsRoot", null);
        setField(term76946, term76946.getClass(), "externAndJsRoot", null);
        setField(term76946, term76946.getClass(), "inputsById", null);
        setField(term76946, term76946.getClass(), "sourceMap", null);
        setField(term76946, term76946.getClass(), "externExports", null);
        setIntField(term76946, term76946.getClass(), "uniqueNameId", 0);
        setBooleanField(term76946, term76946.getClass(), "hasRegExpGlobalReferences", false);
        setField(term76946, term76946.getClass(), "functionInformationMap", null);
        setField(term76946, term76946.getClass(), "debugLog", null);
        setField(term76946, term76946.getClass(), "defaultCodingConvention", null);
        setField(term76946, term76946.getClass(), "typeRegistry", null);
        setField(term76946, term76946.getClass(), "parserConfig", null);
        setField(term76946, term76946.getClass(), "abstractInterpreter", null);
        setField(term76946, term76946.getClass(), "typeValidator", null);
        setField(term76946, term76946.getClass(), "tracker", null);
        setField(term76946, term76946.getClass(), "oldErrorReporter", null);
        setField(term76946, term76946.getClass(), "defaultErrorReporter", null);
        setField(term76946, term76946.getClass(), "compilerThread", null);
        setBooleanField(term76946, term76946.getClass(), "useThreads", false);
        setField(term76946, term76946.getClass(), "outStream", null);
        setField(term76946, term76946.getClass(), "globalRefMap", null);
        setDoubleField(term76946, term76946.getClass(), "progress", 0.0);
        setField(term76946, term76946.getClass(), "lastPassName", null);
        setField(term76946, term76946.getClass(), "sanityCheck", null);
        setField(term76946, term76946.getClass(), "currentTracer", null);
        setField(term76946, term76946.getClass(), "currentPassName", null);
        setIntField(term76946, term76946.getClass(), "syntheticCodeId", 0);
        setField(term76946, term76946.getClass(), "recentChange", null);
        setField(term76946, term76946.getClass(), "codeChangeHandlers", null);
        setField(term76946, term76946.getClass(), "synthesizedExternsInput", null);
        setField(term76946, term76946.getClass(), "stage", null);
        setField(term76945, term76945.getClass(), "compiler", term76946);
        setField(term76945, term76945.getClass(), "filenamePrefix", null);
        setBooleanField(term76945, term76945.getClass(), "reportDependencies", false);
        setField(term76945, term76945.getClass(), "module", null);
        term76947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76947, term76947.getClass(), "type", 0);
        setField(term76947, term76947.getClass(), "next", null);
        setIntField(term76948, term76948.getClass(), "type", 0);
        setIntField(term76949, term76949.getClass(), "type", 37);
        setIntField(term76950, term76950.getClass(), "type", 0);
        setField(term76950, term76950.getClass(), "next", null);
        setField(term76950, term76950.getClass(), "first", null);
        setField(term76950, term76950.getClass(), "last", null);
        setField(term76950, term76950.getClass(), "propListHead", null);
        setIntField(term76950, term76950.getClass(), "sourcePosition", 0);
        setField(term76950, term76950.getClass(), "jsType", null);
        setField(term76950, term76950.getClass(), "parent", null);
        setField(term76949, term76949.getClass(), "next", term76950);
        setField(term76949, term76949.getClass(), "first", null);
        setField(term76949, term76949.getClass(), "last", null);
        setField(term76949, term76949.getClass(), "propListHead", null);
        setIntField(term76949, term76949.getClass(), "sourcePosition", 0);
        setField(term76949, term76949.getClass(), "jsType", null);
        setField(term76949, term76949.getClass(), "parent", null);
        setField(term76948, term76948.getClass(), "next", term76949);
        setIntField(term76951, term76951.getClass(), "type", 37);
        setIntField(term76952, term76952.getClass(), "type", 0);
        setField(term76952, term76952.getClass(), "next", null);
        setField(term76952, term76952.getClass(), "first", null);
        setField(term76952, term76952.getClass(), "last", null);
        setField(term76952, term76952.getClass(), "propListHead", null);
        setIntField(term76952, term76952.getClass(), "sourcePosition", 0);
        setField(term76952, term76952.getClass(), "jsType", null);
        setField(term76952, term76952.getClass(), "parent", null);
        setField(term76951, term76951.getClass(), "next", term76952);
        setField(term76951, term76951.getClass(), "first", null);
        setField(term76951, term76951.getClass(), "last", null);
        setField(term76951, term76951.getClass(), "propListHead", null);
        setIntField(term76951, term76951.getClass(), "sourcePosition", 0);
        setField(term76951, term76951.getClass(), "jsType", null);
        setField(term76951, term76951.getClass(), "parent", null);
        setField(term76948, term76948.getClass(), "first", term76951);
        setField(term76948, term76948.getClass(), "last", null);
        setField(term76948, term76948.getClass(), "propListHead", null);
        setIntField(term76948, term76948.getClass(), "sourcePosition", 0);
        setField(term76948, term76948.getClass(), "jsType", null);
        setField(term76948, term76948.getClass(), "parent", null);
        setField(term76947, term76947.getClass(), "first", term76948);
        setField(term76947, term76947.getClass(), "last", null);
        setField(term76947, term76947.getClass(), "propListHead", null);
        setIntField(term76947, term76947.getClass(), "sourcePosition", 0);
        setField(term76947, term76947.getClass(), "jsType", null);
        setField(term76947, term76947.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term76075;
        callMethod(klass, "process", argTypes, term75925, args);
        assertTrue(recursiveEquals(term75925, term76945));
        assertTrue(recursiveEquals(term76075, null));
    }

};


