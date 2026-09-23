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

public class Compiler_compile_303582928158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854603;

    public Compiler_compile_303582928158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854603 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854603, term854603.getClass(), "options", null);
        setField(term854603, term854603.getClass(), "passes", null);
        setField(term854603, term854603.getClass(), "externs", null);
        setField(term854603, term854603.getClass(), "modules", null);
        setField(term854603, term854603.getClass(), "moduleGraph", null);
        setField(term854603, term854603.getClass(), "inputs", null);
        setField(term854603, term854603.getClass(), "errorManager", null);
        setField(term854603, term854603.getClass(), "warningsGuard", null);
        setField(term854603, term854603.getClass(), "externsRoot", null);
        setField(term854603, term854603.getClass(), "jsRoot", null);
        setField(term854603, term854603.getClass(), "externAndJsRoot", null);
        setField(term854603, term854603.getClass(), "inputsByName", null);
        setField(term854603, term854603.getClass(), "sourceMap", null);
        setField(term854603, term854603.getClass(), "externExports", null);
        setIntField(term854603, term854603.getClass(), "uniqueNameId", 0);
        setBooleanField(term854603, term854603.getClass(), "useThreads", false);
        setBooleanField(term854603, term854603.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854603, term854603.getClass(), "functionInformationMap", null);
        setField(term854603, term854603.getClass(), "debugLog", null);
        setField(term854603, term854603.getClass(), "defaultCodingConvention", null);
        setField(term854603, term854603.getClass(), "typeRegistry", null);
        setField(term854603, term854603.getClass(), "parserConfig", null);
        setField(term854603, term854603.getClass(), "abstractInterpreter", null);
        setField(term854603, term854603.getClass(), "typeValidator", null);
        setField(term854603, term854603.getClass(), "tracker", null);
        setField(term854603, term854603.getClass(), "oldErrorReporter", null);
        setField(term854603, term854603.getClass(), "defaultErrorReporter", null);
        setField(term854603, term854603.getClass(), "outStream", null);
        setField(term854603, term854603.getClass(), "globalRefMap", null);
        setField(term854603, term854603.getClass(), "sanityCheck", null);
        setField(term854603, term854603.getClass(), "currentTracer", null);
        setField(term854603, term854603.getClass(), "currentPassName", null);
        setField(term854603, term854603.getClass(), "recentChange", null);
        setField(term854603, term854603.getClass(), "codeChangeHandlers", null);
        setField(term854603, term854603.getClass(), "stage", null);
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
        callMethod(klass, "compile", argTypes, term854603, args);
    }

};


