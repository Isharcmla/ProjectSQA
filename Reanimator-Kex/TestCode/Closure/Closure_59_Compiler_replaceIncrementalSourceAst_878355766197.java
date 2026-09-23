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

public class Compiler_replaceIncrementalSourceAst_878355766197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854763;

    public Compiler_replaceIncrementalSourceAst_878355766197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854763 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854763, term854763.getClass(), "options", null);
        setField(term854763, term854763.getClass(), "passes", null);
        setField(term854763, term854763.getClass(), "externs", null);
        setField(term854763, term854763.getClass(), "modules", null);
        setField(term854763, term854763.getClass(), "moduleGraph", null);
        setField(term854763, term854763.getClass(), "inputs", null);
        setField(term854763, term854763.getClass(), "errorManager", null);
        setField(term854763, term854763.getClass(), "warningsGuard", null);
        setField(term854763, term854763.getClass(), "externsRoot", null);
        setField(term854763, term854763.getClass(), "jsRoot", null);
        setField(term854763, term854763.getClass(), "externAndJsRoot", null);
        setField(term854763, term854763.getClass(), "inputsByName", null);
        setField(term854763, term854763.getClass(), "sourceMap", null);
        setField(term854763, term854763.getClass(), "externExports", null);
        setIntField(term854763, term854763.getClass(), "uniqueNameId", 0);
        setBooleanField(term854763, term854763.getClass(), "useThreads", false);
        setBooleanField(term854763, term854763.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854763, term854763.getClass(), "functionInformationMap", null);
        setField(term854763, term854763.getClass(), "debugLog", null);
        setField(term854763, term854763.getClass(), "defaultCodingConvention", null);
        setField(term854763, term854763.getClass(), "typeRegistry", null);
        setField(term854763, term854763.getClass(), "parserConfig", null);
        setField(term854763, term854763.getClass(), "abstractInterpreter", null);
        setField(term854763, term854763.getClass(), "typeValidator", null);
        setField(term854763, term854763.getClass(), "tracker", null);
        setField(term854763, term854763.getClass(), "oldErrorReporter", null);
        setField(term854763, term854763.getClass(), "defaultErrorReporter", null);
        setField(term854763, term854763.getClass(), "outStream", null);
        setField(term854763, term854763.getClass(), "globalRefMap", null);
        setField(term854763, term854763.getClass(), "sanityCheck", null);
        setField(term854763, term854763.getClass(), "currentTracer", null);
        setField(term854763, term854763.getClass(), "currentPassName", null);
        setField(term854763, term854763.getClass(), "recentChange", null);
        setField(term854763, term854763.getClass(), "codeChangeHandlers", null);
        setField(term854763, term854763.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "replaceIncrementalSourceAst", argTypes, term854763, args);
    }

};


