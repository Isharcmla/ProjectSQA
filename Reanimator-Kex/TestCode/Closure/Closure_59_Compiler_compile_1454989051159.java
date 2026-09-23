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

public class Compiler_compile_1454989051159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854607;

    public Compiler_compile_1454989051159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854607 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854607, term854607.getClass(), "options", null);
        setField(term854607, term854607.getClass(), "passes", null);
        setField(term854607, term854607.getClass(), "externs", null);
        setField(term854607, term854607.getClass(), "modules", null);
        setField(term854607, term854607.getClass(), "moduleGraph", null);
        setField(term854607, term854607.getClass(), "inputs", null);
        setField(term854607, term854607.getClass(), "errorManager", null);
        setField(term854607, term854607.getClass(), "warningsGuard", null);
        setField(term854607, term854607.getClass(), "externsRoot", null);
        setField(term854607, term854607.getClass(), "jsRoot", null);
        setField(term854607, term854607.getClass(), "externAndJsRoot", null);
        setField(term854607, term854607.getClass(), "inputsByName", null);
        setField(term854607, term854607.getClass(), "sourceMap", null);
        setField(term854607, term854607.getClass(), "externExports", null);
        setIntField(term854607, term854607.getClass(), "uniqueNameId", 0);
        setBooleanField(term854607, term854607.getClass(), "useThreads", false);
        setBooleanField(term854607, term854607.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854607, term854607.getClass(), "functionInformationMap", null);
        setField(term854607, term854607.getClass(), "debugLog", null);
        setField(term854607, term854607.getClass(), "defaultCodingConvention", null);
        setField(term854607, term854607.getClass(), "typeRegistry", null);
        setField(term854607, term854607.getClass(), "parserConfig", null);
        setField(term854607, term854607.getClass(), "abstractInterpreter", null);
        setField(term854607, term854607.getClass(), "typeValidator", null);
        setField(term854607, term854607.getClass(), "tracker", null);
        setField(term854607, term854607.getClass(), "oldErrorReporter", null);
        setField(term854607, term854607.getClass(), "defaultErrorReporter", null);
        setField(term854607, term854607.getClass(), "outStream", null);
        setField(term854607, term854607.getClass(), "globalRefMap", null);
        setField(term854607, term854607.getClass(), "sanityCheck", null);
        setField(term854607, term854607.getClass(), "currentTracer", null);
        setField(term854607, term854607.getClass(), "currentPassName", null);
        setField(term854607, term854607.getClass(), "recentChange", null);
        setField(term854607, term854607.getClass(), "codeChangeHandlers", null);
        setField(term854607, term854607.getClass(), "stage", null);
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
        callMethod(klass, "compile", argTypes, term854607, args);
    }

};


