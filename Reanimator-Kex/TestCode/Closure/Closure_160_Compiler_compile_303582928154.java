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

public class Compiler_compile_303582928154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896074;

    public Compiler_compile_303582928154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896074 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896074, term896074.getClass(), "options", null);
        setField(term896074, term896074.getClass(), "passes", null);
        setField(term896074, term896074.getClass(), "externs", null);
        setField(term896074, term896074.getClass(), "modules", null);
        setField(term896074, term896074.getClass(), "moduleGraph", null);
        setField(term896074, term896074.getClass(), "inputs", null);
        setField(term896074, term896074.getClass(), "errorManager", null);
        setField(term896074, term896074.getClass(), "warningsGuard", null);
        setField(term896074, term896074.getClass(), "externsRoot", null);
        setField(term896074, term896074.getClass(), "jsRoot", null);
        setField(term896074, term896074.getClass(), "externAndJsRoot", null);
        setField(term896074, term896074.getClass(), "inputsByName", null);
        setField(term896074, term896074.getClass(), "sourceMap", null);
        setField(term896074, term896074.getClass(), "externExports", null);
        setIntField(term896074, term896074.getClass(), "uniqueNameId", 0);
        setBooleanField(term896074, term896074.getClass(), "useThreads", false);
        setBooleanField(term896074, term896074.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896074, term896074.getClass(), "functionInformationMap", null);
        setField(term896074, term896074.getClass(), "debugLog", null);
        setField(term896074, term896074.getClass(), "defaultCodingConvention", null);
        setField(term896074, term896074.getClass(), "typeRegistry", null);
        setField(term896074, term896074.getClass(), "parserConfig", null);
        setField(term896074, term896074.getClass(), "abstractInterpreter", null);
        setField(term896074, term896074.getClass(), "typeValidator", null);
        setField(term896074, term896074.getClass(), "tracker", null);
        setField(term896074, term896074.getClass(), "oldErrorReporter", null);
        setField(term896074, term896074.getClass(), "defaultErrorReporter", null);
        setField(term896074, term896074.getClass(), "outStream", null);
        setField(term896074, term896074.getClass(), "globalRefMap", null);
        setField(term896074, term896074.getClass(), "sanityCheck", null);
        setField(term896074, term896074.getClass(), "currentTracer", null);
        setField(term896074, term896074.getClass(), "currentPassName", null);
        setField(term896074, term896074.getClass(), "recentChange", null);
        setField(term896074, term896074.getClass(), "codeChangeHandlers", null);
        setField(term896074, term896074.getClass(), "stage", null);
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
        callMethod(klass, "compile", argTypes, term896074, args);
    }

};


