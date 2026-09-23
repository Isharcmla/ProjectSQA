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

public class Compiler_parse_1635810858189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996844;

    public Compiler_parse_1635810858189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996844 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996844, term996844.getClass(), "options", null);
        setField(term996844, term996844.getClass(), "passes", null);
        setField(term996844, term996844.getClass(), "externs", null);
        setField(term996844, term996844.getClass(), "modules", null);
        setField(term996844, term996844.getClass(), "moduleGraph", null);
        setField(term996844, term996844.getClass(), "inputs", null);
        setField(term996844, term996844.getClass(), "errorManager", null);
        setField(term996844, term996844.getClass(), "warningsGuard", null);
        setField(term996844, term996844.getClass(), "injectedLibraries", null);
        setField(term996844, term996844.getClass(), "externsRoot", null);
        setField(term996844, term996844.getClass(), "jsRoot", null);
        setField(term996844, term996844.getClass(), "externAndJsRoot", null);
        setField(term996844, term996844.getClass(), "inputsById", null);
        setField(term996844, term996844.getClass(), "sourceMap", null);
        setField(term996844, term996844.getClass(), "externExports", null);
        setIntField(term996844, term996844.getClass(), "uniqueNameId", 0);
        setBooleanField(term996844, term996844.getClass(), "useThreads", false);
        setBooleanField(term996844, term996844.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996844, term996844.getClass(), "functionInformationMap", null);
        setField(term996844, term996844.getClass(), "debugLog", null);
        setField(term996844, term996844.getClass(), "defaultCodingConvention", null);
        setField(term996844, term996844.getClass(), "typeRegistry", null);
        setField(term996844, term996844.getClass(), "parserConfig", null);
        setField(term996844, term996844.getClass(), "abstractInterpreter", null);
        setField(term996844, term996844.getClass(), "typeValidator", null);
        setField(term996844, term996844.getClass(), "tracker", null);
        setField(term996844, term996844.getClass(), "oldErrorReporter", null);
        setField(term996844, term996844.getClass(), "defaultErrorReporter", null);
        setField(term996844, term996844.getClass(), "outStream", null);
        setField(term996844, term996844.getClass(), "globalRefMap", null);
        setDoubleField(term996844, term996844.getClass(), "progress", 0.0);
        setField(term996844, term996844.getClass(), "sanityCheck", null);
        setField(term996844, term996844.getClass(), "currentTracer", null);
        setField(term996844, term996844.getClass(), "currentPassName", null);
        setIntField(term996844, term996844.getClass(), "syntheticCodeId", 0);
        setField(term996844, term996844.getClass(), "recentChange", null);
        setField(term996844, term996844.getClass(), "codeChangeHandlers", null);
        setField(term996844, term996844.getClass(), "synthesizedExternsInput", null);
        setField(term996844, term996844.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parse", argTypes, term996844, args);
    }

};


