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

public class Compiler_compile_1284365584172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43899;

    public Compiler_compile_1284365584172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43899 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term43899, term43899.getClass(), "options", null);
        setField(term43899, term43899.getClass(), "passes", null);
        setField(term43899, term43899.getClass(), "externs", null);
        setField(term43899, term43899.getClass(), "modules", null);
        setField(term43899, term43899.getClass(), "moduleGraph", null);
        setField(term43899, term43899.getClass(), "inputs", null);
        setField(term43899, term43899.getClass(), "errorManager", null);
        setField(term43899, term43899.getClass(), "symbolTable", null);
        setField(term43899, term43899.getClass(), "externsRoot", null);
        setField(term43899, term43899.getClass(), "jsRoot", null);
        setField(term43899, term43899.getClass(), "externAndJsRoot", null);
        setField(term43899, term43899.getClass(), "inputsByName", null);
        setField(term43899, term43899.getClass(), "sourceMap", null);
        setField(term43899, term43899.getClass(), "externExports", null);
        setIntField(term43899, term43899.getClass(), "uniqueNameId", 0);
        setBooleanField(term43899, term43899.getClass(), "normalized", false);
        setBooleanField(term43899, term43899.getClass(), "useThreads", false);
        setField(term43899, term43899.getClass(), "functionInformationMap", null);
        setField(term43899, term43899.getClass(), "debugLog", null);
        setField(term43899, term43899.getClass(), "defaultCodingConvention", null);
        setField(term43899, term43899.getClass(), "typeRegistry", null);
        setField(term43899, term43899.getClass(), "parserConfig", null);
        setField(term43899, term43899.getClass(), "abstractInterpreter", null);
        setField(term43899, term43899.getClass(), "typeValidator", null);
        setField(term43899, term43899.getClass(), "tracker", null);
        setField(term43899, term43899.getClass(), "oldErrorReporter", null);
        setField(term43899, term43899.getClass(), "defaultErrorReporter", null);
        setField(term43899, term43899.getClass(), "outStream", null);
        setField(term43899, term43899.getClass(), "sanityCheck", null);
        setField(term43899, term43899.getClass(), "currentTracer", null);
        setField(term43899, term43899.getClass(), "currentPassName", null);
        setField(term43899, term43899.getClass(), "recentChange", null);
        setField(term43899, term43899.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "compile", argTypes, term43899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


