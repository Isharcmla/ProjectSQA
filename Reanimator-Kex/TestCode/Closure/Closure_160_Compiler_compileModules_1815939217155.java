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

public class Compiler_compileModules_1815939217155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896078;

    public Compiler_compileModules_1815939217155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896078 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896078, term896078.getClass(), "options", null);
        setField(term896078, term896078.getClass(), "passes", null);
        setField(term896078, term896078.getClass(), "externs", null);
        setField(term896078, term896078.getClass(), "modules", null);
        setField(term896078, term896078.getClass(), "moduleGraph", null);
        setField(term896078, term896078.getClass(), "inputs", null);
        setField(term896078, term896078.getClass(), "errorManager", null);
        setField(term896078, term896078.getClass(), "warningsGuard", null);
        setField(term896078, term896078.getClass(), "externsRoot", null);
        setField(term896078, term896078.getClass(), "jsRoot", null);
        setField(term896078, term896078.getClass(), "externAndJsRoot", null);
        setField(term896078, term896078.getClass(), "inputsByName", null);
        setField(term896078, term896078.getClass(), "sourceMap", null);
        setField(term896078, term896078.getClass(), "externExports", null);
        setIntField(term896078, term896078.getClass(), "uniqueNameId", 0);
        setBooleanField(term896078, term896078.getClass(), "useThreads", false);
        setBooleanField(term896078, term896078.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896078, term896078.getClass(), "functionInformationMap", null);
        setField(term896078, term896078.getClass(), "debugLog", null);
        setField(term896078, term896078.getClass(), "defaultCodingConvention", null);
        setField(term896078, term896078.getClass(), "typeRegistry", null);
        setField(term896078, term896078.getClass(), "parserConfig", null);
        setField(term896078, term896078.getClass(), "abstractInterpreter", null);
        setField(term896078, term896078.getClass(), "typeValidator", null);
        setField(term896078, term896078.getClass(), "tracker", null);
        setField(term896078, term896078.getClass(), "oldErrorReporter", null);
        setField(term896078, term896078.getClass(), "defaultErrorReporter", null);
        setField(term896078, term896078.getClass(), "outStream", null);
        setField(term896078, term896078.getClass(), "globalRefMap", null);
        setField(term896078, term896078.getClass(), "sanityCheck", null);
        setField(term896078, term896078.getClass(), "currentTracer", null);
        setField(term896078, term896078.getClass(), "currentPassName", null);
        setField(term896078, term896078.getClass(), "recentChange", null);
        setField(term896078, term896078.getClass(), "codeChangeHandlers", null);
        setField(term896078, term896078.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "compileModules", argTypes, term896078, args);
    }

};


