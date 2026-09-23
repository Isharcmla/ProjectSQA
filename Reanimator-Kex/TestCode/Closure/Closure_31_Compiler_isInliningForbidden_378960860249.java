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

public class Compiler_isInliningForbidden_378960860249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890275;

    public Compiler_isInliningForbidden_378960860249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890275 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890275, term890275.getClass(), "options", null);
        setField(term890275, term890275.getClass(), "passes", null);
        setField(term890275, term890275.getClass(), "externs", null);
        setField(term890275, term890275.getClass(), "modules", null);
        setField(term890275, term890275.getClass(), "moduleGraph", null);
        setField(term890275, term890275.getClass(), "inputs", null);
        setField(term890275, term890275.getClass(), "errorManager", null);
        setField(term890275, term890275.getClass(), "warningsGuard", null);
        setField(term890275, term890275.getClass(), "injectedLibraries", null);
        setField(term890275, term890275.getClass(), "externsRoot", null);
        setField(term890275, term890275.getClass(), "jsRoot", null);
        setField(term890275, term890275.getClass(), "externAndJsRoot", null);
        setField(term890275, term890275.getClass(), "inputsById", null);
        setField(term890275, term890275.getClass(), "sourceMap", null);
        setField(term890275, term890275.getClass(), "externExports", null);
        setIntField(term890275, term890275.getClass(), "uniqueNameId", 0);
        setBooleanField(term890275, term890275.getClass(), "useThreads", false);
        setBooleanField(term890275, term890275.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890275, term890275.getClass(), "functionInformationMap", null);
        setField(term890275, term890275.getClass(), "debugLog", null);
        setField(term890275, term890275.getClass(), "defaultCodingConvention", null);
        setField(term890275, term890275.getClass(), "typeRegistry", null);
        setField(term890275, term890275.getClass(), "parserConfig", null);
        setField(term890275, term890275.getClass(), "abstractInterpreter", null);
        setField(term890275, term890275.getClass(), "typeValidator", null);
        setField(term890275, term890275.getClass(), "tracker", null);
        setField(term890275, term890275.getClass(), "oldErrorReporter", null);
        setField(term890275, term890275.getClass(), "defaultErrorReporter", null);
        setField(term890275, term890275.getClass(), "outStream", null);
        setField(term890275, term890275.getClass(), "globalRefMap", null);
        setDoubleField(term890275, term890275.getClass(), "progress", 0.0);
        setField(term890275, term890275.getClass(), "sanityCheck", null);
        setField(term890275, term890275.getClass(), "currentTracer", null);
        setField(term890275, term890275.getClass(), "currentPassName", null);
        setIntField(term890275, term890275.getClass(), "syntheticCodeId", 0);
        setField(term890275, term890275.getClass(), "recentChange", null);
        setField(term890275, term890275.getClass(), "codeChangeHandlers", null);
        setField(term890275, term890275.getClass(), "synthesizedExternsInput", null);
        setField(term890275, term890275.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInliningForbidden", argTypes, term890275, args);
    }

};


