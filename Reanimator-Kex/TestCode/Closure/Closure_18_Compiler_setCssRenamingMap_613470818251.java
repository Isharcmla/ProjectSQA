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

public class Compiler_setCssRenamingMap_613470818251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997220;

    public Compiler_setCssRenamingMap_613470818251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997220 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997220, term997220.getClass(), "options", null);
        setField(term997220, term997220.getClass(), "passes", null);
        setField(term997220, term997220.getClass(), "externs", null);
        setField(term997220, term997220.getClass(), "modules", null);
        setField(term997220, term997220.getClass(), "moduleGraph", null);
        setField(term997220, term997220.getClass(), "inputs", null);
        setField(term997220, term997220.getClass(), "errorManager", null);
        setField(term997220, term997220.getClass(), "warningsGuard", null);
        setField(term997220, term997220.getClass(), "injectedLibraries", null);
        setField(term997220, term997220.getClass(), "externsRoot", null);
        setField(term997220, term997220.getClass(), "jsRoot", null);
        setField(term997220, term997220.getClass(), "externAndJsRoot", null);
        setField(term997220, term997220.getClass(), "inputsById", null);
        setField(term997220, term997220.getClass(), "sourceMap", null);
        setField(term997220, term997220.getClass(), "externExports", null);
        setIntField(term997220, term997220.getClass(), "uniqueNameId", 0);
        setBooleanField(term997220, term997220.getClass(), "useThreads", false);
        setBooleanField(term997220, term997220.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997220, term997220.getClass(), "functionInformationMap", null);
        setField(term997220, term997220.getClass(), "debugLog", null);
        setField(term997220, term997220.getClass(), "defaultCodingConvention", null);
        setField(term997220, term997220.getClass(), "typeRegistry", null);
        setField(term997220, term997220.getClass(), "parserConfig", null);
        setField(term997220, term997220.getClass(), "abstractInterpreter", null);
        setField(term997220, term997220.getClass(), "typeValidator", null);
        setField(term997220, term997220.getClass(), "tracker", null);
        setField(term997220, term997220.getClass(), "oldErrorReporter", null);
        setField(term997220, term997220.getClass(), "defaultErrorReporter", null);
        setField(term997220, term997220.getClass(), "outStream", null);
        setField(term997220, term997220.getClass(), "globalRefMap", null);
        setDoubleField(term997220, term997220.getClass(), "progress", 0.0);
        setField(term997220, term997220.getClass(), "sanityCheck", null);
        setField(term997220, term997220.getClass(), "currentTracer", null);
        setField(term997220, term997220.getClass(), "currentPassName", null);
        setIntField(term997220, term997220.getClass(), "syntheticCodeId", 0);
        setField(term997220, term997220.getClass(), "recentChange", null);
        setField(term997220, term997220.getClass(), "codeChangeHandlers", null);
        setField(term997220, term997220.getClass(), "synthesizedExternsInput", null);
        setField(term997220, term997220.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CssRenamingMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCssRenamingMap", argTypes, term997220, args);
    }

};


