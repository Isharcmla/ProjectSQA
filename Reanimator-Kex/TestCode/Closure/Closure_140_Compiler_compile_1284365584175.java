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

public class Compiler_compile_1284365584175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55305;

    public Compiler_compile_1284365584175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55305 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term55305, term55305.getClass(), "options", null);
        setField(term55305, term55305.getClass(), "passes", null);
        setField(term55305, term55305.getClass(), "externs", null);
        setField(term55305, term55305.getClass(), "modules", null);
        setField(term55305, term55305.getClass(), "moduleGraph", null);
        setField(term55305, term55305.getClass(), "inputs", null);
        setField(term55305, term55305.getClass(), "errorManager", null);
        setField(term55305, term55305.getClass(), "symbolTable", null);
        setField(term55305, term55305.getClass(), "externsRoot", null);
        setField(term55305, term55305.getClass(), "jsRoot", null);
        setField(term55305, term55305.getClass(), "externAndJsRoot", null);
        setField(term55305, term55305.getClass(), "inputsByName", null);
        setField(term55305, term55305.getClass(), "sourceMap", null);
        setField(term55305, term55305.getClass(), "externExports", null);
        setIntField(term55305, term55305.getClass(), "uniqueNameId", 0);
        setBooleanField(term55305, term55305.getClass(), "normalized", false);
        setBooleanField(term55305, term55305.getClass(), "useThreads", false);
        setField(term55305, term55305.getClass(), "functionInformationMap", null);
        setField(term55305, term55305.getClass(), "debugLog", null);
        setField(term55305, term55305.getClass(), "defaultCodingConvention", null);
        setField(term55305, term55305.getClass(), "typeRegistry", null);
        setField(term55305, term55305.getClass(), "parserConfig", null);
        setField(term55305, term55305.getClass(), "abstractInterpreter", null);
        setField(term55305, term55305.getClass(), "typeValidator", null);
        setField(term55305, term55305.getClass(), "tracker", null);
        setField(term55305, term55305.getClass(), "oldErrorReporter", null);
        setField(term55305, term55305.getClass(), "defaultErrorReporter", null);
        setField(term55305, term55305.getClass(), "outStream", null);
        setField(term55305, term55305.getClass(), "sanityCheck", null);
        setField(term55305, term55305.getClass(), "currentTracer", null);
        setField(term55305, term55305.getClass(), "currentPassName", null);
        setField(term55305, term55305.getClass(), "recentChange", null);
        setField(term55305, term55305.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "compile", argTypes, term55305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


