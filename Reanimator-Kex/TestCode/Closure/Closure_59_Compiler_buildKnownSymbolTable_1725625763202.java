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

public class Compiler_buildKnownSymbolTable_1725625763202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854783;

    public Compiler_buildKnownSymbolTable_1725625763202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854783 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854783, term854783.getClass(), "options", null);
        setField(term854783, term854783.getClass(), "passes", null);
        setField(term854783, term854783.getClass(), "externs", null);
        setField(term854783, term854783.getClass(), "modules", null);
        setField(term854783, term854783.getClass(), "moduleGraph", null);
        setField(term854783, term854783.getClass(), "inputs", null);
        setField(term854783, term854783.getClass(), "errorManager", null);
        setField(term854783, term854783.getClass(), "warningsGuard", null);
        setField(term854783, term854783.getClass(), "externsRoot", null);
        setField(term854783, term854783.getClass(), "jsRoot", null);
        setField(term854783, term854783.getClass(), "externAndJsRoot", null);
        setField(term854783, term854783.getClass(), "inputsByName", null);
        setField(term854783, term854783.getClass(), "sourceMap", null);
        setField(term854783, term854783.getClass(), "externExports", null);
        setIntField(term854783, term854783.getClass(), "uniqueNameId", 0);
        setBooleanField(term854783, term854783.getClass(), "useThreads", false);
        setBooleanField(term854783, term854783.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854783, term854783.getClass(), "functionInformationMap", null);
        setField(term854783, term854783.getClass(), "debugLog", null);
        setField(term854783, term854783.getClass(), "defaultCodingConvention", null);
        setField(term854783, term854783.getClass(), "typeRegistry", null);
        setField(term854783, term854783.getClass(), "parserConfig", null);
        setField(term854783, term854783.getClass(), "abstractInterpreter", null);
        setField(term854783, term854783.getClass(), "typeValidator", null);
        setField(term854783, term854783.getClass(), "tracker", null);
        setField(term854783, term854783.getClass(), "oldErrorReporter", null);
        setField(term854783, term854783.getClass(), "defaultErrorReporter", null);
        setField(term854783, term854783.getClass(), "outStream", null);
        setField(term854783, term854783.getClass(), "globalRefMap", null);
        setField(term854783, term854783.getClass(), "sanityCheck", null);
        setField(term854783, term854783.getClass(), "currentTracer", null);
        setField(term854783, term854783.getClass(), "currentPassName", null);
        setField(term854783, term854783.getClass(), "recentChange", null);
        setField(term854783, term854783.getClass(), "codeChangeHandlers", null);
        setField(term854783, term854783.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildKnownSymbolTable", argTypes, term854783, args);
    }

};


