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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Compiler_compile_1454989051146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62626;

    public Compiler_compile_1454989051146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62626 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term62626, term62626.getClass(), "options", null);
        setField(term62626, term62626.getClass(), "passes", null);
        setField(term62626, term62626.getClass(), "externs", null);
        setField(term62626, term62626.getClass(), "modules", null);
        setField(term62626, term62626.getClass(), "moduleGraph", null);
        setField(term62626, term62626.getClass(), "inputs", null);
        setField(term62626, term62626.getClass(), "errorManager", null);
        setField(term62626, term62626.getClass(), "externsRoot", null);
        setField(term62626, term62626.getClass(), "jsRoot", null);
        setField(term62626, term62626.getClass(), "externAndJsRoot", null);
        setField(term62626, term62626.getClass(), "inputsByName", null);
        setField(term62626, term62626.getClass(), "sourceMap", null);
        setField(term62626, term62626.getClass(), "externExports", null);
        setIntField(term62626, term62626.getClass(), "uniqueNameId", 0);
        setBooleanField(term62626, term62626.getClass(), "normalized", false);
        setBooleanField(term62626, term62626.getClass(), "useThreads", false);
        setBooleanField(term62626, term62626.getClass(), "hasRegExpGlobalReferences", false);
        setField(term62626, term62626.getClass(), "functionInformationMap", null);
        setField(term62626, term62626.getClass(), "debugLog", null);
        setField(term62626, term62626.getClass(), "defaultCodingConvention", null);
        setField(term62626, term62626.getClass(), "typeRegistry", null);
        setField(term62626, term62626.getClass(), "parserConfig", null);
        setField(term62626, term62626.getClass(), "abstractInterpreter", null);
        setField(term62626, term62626.getClass(), "typeValidator", null);
        setField(term62626, term62626.getClass(), "tracker", null);
        setField(term62626, term62626.getClass(), "oldErrorReporter", null);
        setField(term62626, term62626.getClass(), "defaultErrorReporter", null);
        setField(term62626, term62626.getClass(), "outStream", null);
        setField(term62626, term62626.getClass(), "sanityCheck", null);
        setField(term62626, term62626.getClass(), "currentTracer", null);
        setField(term62626, term62626.getClass(), "currentPassName", null);
        setField(term62626, term62626.getClass(), "recentChange", null);
        setField(term62626, term62626.getClass(), "codeChangeHandlers", null);
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
        try {
            callMethod(klass, "compile", argTypes, term62626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


