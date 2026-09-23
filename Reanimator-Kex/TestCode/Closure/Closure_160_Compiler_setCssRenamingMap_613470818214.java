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

public class Compiler_setCssRenamingMap_613470818214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896320;

    public Compiler_setCssRenamingMap_613470818214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896320 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896320, term896320.getClass(), "options", null);
        setField(term896320, term896320.getClass(), "passes", null);
        setField(term896320, term896320.getClass(), "externs", null);
        setField(term896320, term896320.getClass(), "modules", null);
        setField(term896320, term896320.getClass(), "moduleGraph", null);
        setField(term896320, term896320.getClass(), "inputs", null);
        setField(term896320, term896320.getClass(), "errorManager", null);
        setField(term896320, term896320.getClass(), "warningsGuard", null);
        setField(term896320, term896320.getClass(), "externsRoot", null);
        setField(term896320, term896320.getClass(), "jsRoot", null);
        setField(term896320, term896320.getClass(), "externAndJsRoot", null);
        setField(term896320, term896320.getClass(), "inputsByName", null);
        setField(term896320, term896320.getClass(), "sourceMap", null);
        setField(term896320, term896320.getClass(), "externExports", null);
        setIntField(term896320, term896320.getClass(), "uniqueNameId", 0);
        setBooleanField(term896320, term896320.getClass(), "useThreads", false);
        setBooleanField(term896320, term896320.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896320, term896320.getClass(), "functionInformationMap", null);
        setField(term896320, term896320.getClass(), "debugLog", null);
        setField(term896320, term896320.getClass(), "defaultCodingConvention", null);
        setField(term896320, term896320.getClass(), "typeRegistry", null);
        setField(term896320, term896320.getClass(), "parserConfig", null);
        setField(term896320, term896320.getClass(), "abstractInterpreter", null);
        setField(term896320, term896320.getClass(), "typeValidator", null);
        setField(term896320, term896320.getClass(), "tracker", null);
        setField(term896320, term896320.getClass(), "oldErrorReporter", null);
        setField(term896320, term896320.getClass(), "defaultErrorReporter", null);
        setField(term896320, term896320.getClass(), "outStream", null);
        setField(term896320, term896320.getClass(), "globalRefMap", null);
        setField(term896320, term896320.getClass(), "sanityCheck", null);
        setField(term896320, term896320.getClass(), "currentTracer", null);
        setField(term896320, term896320.getClass(), "currentPassName", null);
        setField(term896320, term896320.getClass(), "recentChange", null);
        setField(term896320, term896320.getClass(), "codeChangeHandlers", null);
        setField(term896320, term896320.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CssRenamingMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCssRenamingMap", argTypes, term896320, args);
    }

};


