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

public class Compiler_setCssRenamingMap_613470818246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890257;

    public Compiler_setCssRenamingMap_613470818246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890257 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890257, term890257.getClass(), "options", null);
        setField(term890257, term890257.getClass(), "passes", null);
        setField(term890257, term890257.getClass(), "externs", null);
        setField(term890257, term890257.getClass(), "modules", null);
        setField(term890257, term890257.getClass(), "moduleGraph", null);
        setField(term890257, term890257.getClass(), "inputs", null);
        setField(term890257, term890257.getClass(), "errorManager", null);
        setField(term890257, term890257.getClass(), "warningsGuard", null);
        setField(term890257, term890257.getClass(), "injectedLibraries", null);
        setField(term890257, term890257.getClass(), "externsRoot", null);
        setField(term890257, term890257.getClass(), "jsRoot", null);
        setField(term890257, term890257.getClass(), "externAndJsRoot", null);
        setField(term890257, term890257.getClass(), "inputsById", null);
        setField(term890257, term890257.getClass(), "sourceMap", null);
        setField(term890257, term890257.getClass(), "externExports", null);
        setIntField(term890257, term890257.getClass(), "uniqueNameId", 0);
        setBooleanField(term890257, term890257.getClass(), "useThreads", false);
        setBooleanField(term890257, term890257.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890257, term890257.getClass(), "functionInformationMap", null);
        setField(term890257, term890257.getClass(), "debugLog", null);
        setField(term890257, term890257.getClass(), "defaultCodingConvention", null);
        setField(term890257, term890257.getClass(), "typeRegistry", null);
        setField(term890257, term890257.getClass(), "parserConfig", null);
        setField(term890257, term890257.getClass(), "abstractInterpreter", null);
        setField(term890257, term890257.getClass(), "typeValidator", null);
        setField(term890257, term890257.getClass(), "tracker", null);
        setField(term890257, term890257.getClass(), "oldErrorReporter", null);
        setField(term890257, term890257.getClass(), "defaultErrorReporter", null);
        setField(term890257, term890257.getClass(), "outStream", null);
        setField(term890257, term890257.getClass(), "globalRefMap", null);
        setDoubleField(term890257, term890257.getClass(), "progress", 0.0);
        setField(term890257, term890257.getClass(), "sanityCheck", null);
        setField(term890257, term890257.getClass(), "currentTracer", null);
        setField(term890257, term890257.getClass(), "currentPassName", null);
        setIntField(term890257, term890257.getClass(), "syntheticCodeId", 0);
        setField(term890257, term890257.getClass(), "recentChange", null);
        setField(term890257, term890257.getClass(), "codeChangeHandlers", null);
        setField(term890257, term890257.getClass(), "synthesizedExternsInput", null);
        setField(term890257, term890257.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CssRenamingMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCssRenamingMap", argTypes, term890257, args);
    }

};


