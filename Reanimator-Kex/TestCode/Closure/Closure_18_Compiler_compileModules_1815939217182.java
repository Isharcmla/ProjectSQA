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

public class Compiler_compileModules_1815939217182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996798;

    public Compiler_compileModules_1815939217182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996798 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996798, term996798.getClass(), "options", null);
        setField(term996798, term996798.getClass(), "passes", null);
        setField(term996798, term996798.getClass(), "externs", null);
        setField(term996798, term996798.getClass(), "modules", null);
        setField(term996798, term996798.getClass(), "moduleGraph", null);
        setField(term996798, term996798.getClass(), "inputs", null);
        setField(term996798, term996798.getClass(), "errorManager", null);
        setField(term996798, term996798.getClass(), "warningsGuard", null);
        setField(term996798, term996798.getClass(), "injectedLibraries", null);
        setField(term996798, term996798.getClass(), "externsRoot", null);
        setField(term996798, term996798.getClass(), "jsRoot", null);
        setField(term996798, term996798.getClass(), "externAndJsRoot", null);
        setField(term996798, term996798.getClass(), "inputsById", null);
        setField(term996798, term996798.getClass(), "sourceMap", null);
        setField(term996798, term996798.getClass(), "externExports", null);
        setIntField(term996798, term996798.getClass(), "uniqueNameId", 0);
        setBooleanField(term996798, term996798.getClass(), "useThreads", false);
        setBooleanField(term996798, term996798.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996798, term996798.getClass(), "functionInformationMap", null);
        setField(term996798, term996798.getClass(), "debugLog", null);
        setField(term996798, term996798.getClass(), "defaultCodingConvention", null);
        setField(term996798, term996798.getClass(), "typeRegistry", null);
        setField(term996798, term996798.getClass(), "parserConfig", null);
        setField(term996798, term996798.getClass(), "abstractInterpreter", null);
        setField(term996798, term996798.getClass(), "typeValidator", null);
        setField(term996798, term996798.getClass(), "tracker", null);
        setField(term996798, term996798.getClass(), "oldErrorReporter", null);
        setField(term996798, term996798.getClass(), "defaultErrorReporter", null);
        setField(term996798, term996798.getClass(), "outStream", null);
        setField(term996798, term996798.getClass(), "globalRefMap", null);
        setDoubleField(term996798, term996798.getClass(), "progress", 0.0);
        setField(term996798, term996798.getClass(), "sanityCheck", null);
        setField(term996798, term996798.getClass(), "currentTracer", null);
        setField(term996798, term996798.getClass(), "currentPassName", null);
        setIntField(term996798, term996798.getClass(), "syntheticCodeId", 0);
        setField(term996798, term996798.getClass(), "recentChange", null);
        setField(term996798, term996798.getClass(), "codeChangeHandlers", null);
        setField(term996798, term996798.getClass(), "synthesizedExternsInput", null);
        setField(term996798, term996798.getClass(), "stage", null);
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
        callMethod(klass, "compileModules", argTypes, term996798, args);
    }

};


