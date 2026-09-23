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

public class Compiler_compileModules_1815939217159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977700;

    public Compiler_compileModules_1815939217159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977700 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977700, term977700.getClass(), "options", null);
        setField(term977700, term977700.getClass(), "passes", null);
        setField(term977700, term977700.getClass(), "externs", null);
        setField(term977700, term977700.getClass(), "modules", null);
        setField(term977700, term977700.getClass(), "moduleGraph", null);
        setField(term977700, term977700.getClass(), "inputs", null);
        setField(term977700, term977700.getClass(), "errorManager", null);
        setField(term977700, term977700.getClass(), "warningsGuard", null);
        setField(term977700, term977700.getClass(), "externsRoot", null);
        setField(term977700, term977700.getClass(), "jsRoot", null);
        setField(term977700, term977700.getClass(), "externAndJsRoot", null);
        setField(term977700, term977700.getClass(), "inputsByName", null);
        setField(term977700, term977700.getClass(), "sourceMap", null);
        setField(term977700, term977700.getClass(), "externExports", null);
        setIntField(term977700, term977700.getClass(), "uniqueNameId", 0);
        setBooleanField(term977700, term977700.getClass(), "useThreads", false);
        setBooleanField(term977700, term977700.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977700, term977700.getClass(), "functionInformationMap", null);
        setField(term977700, term977700.getClass(), "debugLog", null);
        setField(term977700, term977700.getClass(), "defaultCodingConvention", null);
        setField(term977700, term977700.getClass(), "typeRegistry", null);
        setField(term977700, term977700.getClass(), "parserConfig", null);
        setField(term977700, term977700.getClass(), "abstractInterpreter", null);
        setField(term977700, term977700.getClass(), "typeValidator", null);
        setField(term977700, term977700.getClass(), "tracker", null);
        setField(term977700, term977700.getClass(), "oldErrorReporter", null);
        setField(term977700, term977700.getClass(), "defaultErrorReporter", null);
        setField(term977700, term977700.getClass(), "outStream", null);
        setField(term977700, term977700.getClass(), "globalRefMap", null);
        setField(term977700, term977700.getClass(), "sanityCheck", null);
        setField(term977700, term977700.getClass(), "currentTracer", null);
        setField(term977700, term977700.getClass(), "currentPassName", null);
        setField(term977700, term977700.getClass(), "recentChange", null);
        setField(term977700, term977700.getClass(), "codeChangeHandlers", null);
        setField(term977700, term977700.getClass(), "stage", null);
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
        callMethod(klass, "compileModules", argTypes, term977700, args);
    }

};


