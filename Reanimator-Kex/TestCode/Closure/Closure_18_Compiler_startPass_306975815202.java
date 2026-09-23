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

public class Compiler_startPass_306975815202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996922;

    public Compiler_startPass_306975815202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996922 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996922, term996922.getClass(), "options", null);
        setField(term996922, term996922.getClass(), "passes", null);
        setField(term996922, term996922.getClass(), "externs", null);
        setField(term996922, term996922.getClass(), "modules", null);
        setField(term996922, term996922.getClass(), "moduleGraph", null);
        setField(term996922, term996922.getClass(), "inputs", null);
        setField(term996922, term996922.getClass(), "errorManager", null);
        setField(term996922, term996922.getClass(), "warningsGuard", null);
        setField(term996922, term996922.getClass(), "injectedLibraries", null);
        setField(term996922, term996922.getClass(), "externsRoot", null);
        setField(term996922, term996922.getClass(), "jsRoot", null);
        setField(term996922, term996922.getClass(), "externAndJsRoot", null);
        setField(term996922, term996922.getClass(), "inputsById", null);
        setField(term996922, term996922.getClass(), "sourceMap", null);
        setField(term996922, term996922.getClass(), "externExports", null);
        setIntField(term996922, term996922.getClass(), "uniqueNameId", 0);
        setBooleanField(term996922, term996922.getClass(), "useThreads", false);
        setBooleanField(term996922, term996922.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996922, term996922.getClass(), "functionInformationMap", null);
        setField(term996922, term996922.getClass(), "debugLog", null);
        setField(term996922, term996922.getClass(), "defaultCodingConvention", null);
        setField(term996922, term996922.getClass(), "typeRegistry", null);
        setField(term996922, term996922.getClass(), "parserConfig", null);
        setField(term996922, term996922.getClass(), "abstractInterpreter", null);
        setField(term996922, term996922.getClass(), "typeValidator", null);
        setField(term996922, term996922.getClass(), "tracker", null);
        setField(term996922, term996922.getClass(), "oldErrorReporter", null);
        setField(term996922, term996922.getClass(), "defaultErrorReporter", null);
        setField(term996922, term996922.getClass(), "outStream", null);
        setField(term996922, term996922.getClass(), "globalRefMap", null);
        setDoubleField(term996922, term996922.getClass(), "progress", 0.0);
        setField(term996922, term996922.getClass(), "sanityCheck", null);
        setField(term996922, term996922.getClass(), "currentTracer", null);
        setField(term996922, term996922.getClass(), "currentPassName", null);
        setIntField(term996922, term996922.getClass(), "syntheticCodeId", 0);
        setField(term996922, term996922.getClass(), "recentChange", null);
        setField(term996922, term996922.getClass(), "codeChangeHandlers", null);
        setField(term996922, term996922.getClass(), "synthesizedExternsInput", null);
        setField(term996922, term996922.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "startPass", argTypes, term996922, args);
    }

};


