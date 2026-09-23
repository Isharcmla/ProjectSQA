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

public class Compiler_compile_145498905124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85819;

    public Compiler_compile_145498905124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85819 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term85819, term85819.getClass(), "options", null);
        setField(term85819, term85819.getClass(), "passes", null);
        setField(term85819, term85819.getClass(), "externs", null);
        setField(term85819, term85819.getClass(), "modules", null);
        setField(term85819, term85819.getClass(), "moduleGraph", null);
        setField(term85819, term85819.getClass(), "inputs", null);
        setField(term85819, term85819.getClass(), "errorManager", null);
        setField(term85819, term85819.getClass(), "warningsGuard", null);
        setField(term85819, term85819.getClass(), "externsRoot", null);
        setField(term85819, term85819.getClass(), "jsRoot", null);
        setField(term85819, term85819.getClass(), "externAndJsRoot", null);
        setField(term85819, term85819.getClass(), "inputsByName", null);
        setField(term85819, term85819.getClass(), "sourceMap", null);
        setField(term85819, term85819.getClass(), "externExports", null);
        setIntField(term85819, term85819.getClass(), "uniqueNameId", 0);
        setBooleanField(term85819, term85819.getClass(), "useThreads", false);
        setBooleanField(term85819, term85819.getClass(), "hasRegExpGlobalReferences", false);
        setField(term85819, term85819.getClass(), "functionInformationMap", null);
        setField(term85819, term85819.getClass(), "debugLog", null);
        setField(term85819, term85819.getClass(), "defaultCodingConvention", null);
        setField(term85819, term85819.getClass(), "typeRegistry", null);
        setField(term85819, term85819.getClass(), "parserConfig", null);
        setField(term85819, term85819.getClass(), "abstractInterpreter", null);
        setField(term85819, term85819.getClass(), "typeValidator", null);
        setField(term85819, term85819.getClass(), "tracker", null);
        setField(term85819, term85819.getClass(), "oldErrorReporter", null);
        setField(term85819, term85819.getClass(), "defaultErrorReporter", null);
        setField(term85819, term85819.getClass(), "outStream", null);
        setField(term85819, term85819.getClass(), "globalRefMap", null);
        setField(term85819, term85819.getClass(), "sanityCheck", null);
        setField(term85819, term85819.getClass(), "currentTracer", null);
        setField(term85819, term85819.getClass(), "currentPassName", null);
        setField(term85819, term85819.getClass(), "recentChange", null);
        setField(term85819, term85819.getClass(), "codeChangeHandlers", null);
        setField(term85819, term85819.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "compile", argTypes, term85819, args);
    }

};


