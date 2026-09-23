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

public class Compiler_getFunctionalInformationMap_1101075313256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855050;

    public Compiler_getFunctionalInformationMap_1101075313256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855050 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855050, term855050.getClass(), "options", null);
        setField(term855050, term855050.getClass(), "passes", null);
        setField(term855050, term855050.getClass(), "externs", null);
        setField(term855050, term855050.getClass(), "modules", null);
        setField(term855050, term855050.getClass(), "moduleGraph", null);
        setField(term855050, term855050.getClass(), "inputs", null);
        setField(term855050, term855050.getClass(), "errorManager", null);
        setField(term855050, term855050.getClass(), "warningsGuard", null);
        setField(term855050, term855050.getClass(), "externsRoot", null);
        setField(term855050, term855050.getClass(), "jsRoot", null);
        setField(term855050, term855050.getClass(), "externAndJsRoot", null);
        setField(term855050, term855050.getClass(), "inputsByName", null);
        setField(term855050, term855050.getClass(), "sourceMap", null);
        setField(term855050, term855050.getClass(), "externExports", null);
        setIntField(term855050, term855050.getClass(), "uniqueNameId", 0);
        setBooleanField(term855050, term855050.getClass(), "useThreads", false);
        setBooleanField(term855050, term855050.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855050, term855050.getClass(), "functionInformationMap", null);
        setField(term855050, term855050.getClass(), "debugLog", null);
        setField(term855050, term855050.getClass(), "defaultCodingConvention", null);
        setField(term855050, term855050.getClass(), "typeRegistry", null);
        setField(term855050, term855050.getClass(), "parserConfig", null);
        setField(term855050, term855050.getClass(), "abstractInterpreter", null);
        setField(term855050, term855050.getClass(), "typeValidator", null);
        setField(term855050, term855050.getClass(), "tracker", null);
        setField(term855050, term855050.getClass(), "oldErrorReporter", null);
        setField(term855050, term855050.getClass(), "defaultErrorReporter", null);
        setField(term855050, term855050.getClass(), "outStream", null);
        setField(term855050, term855050.getClass(), "globalRefMap", null);
        setField(term855050, term855050.getClass(), "sanityCheck", null);
        setField(term855050, term855050.getClass(), "currentTracer", null);
        setField(term855050, term855050.getClass(), "currentPassName", null);
        setField(term855050, term855050.getClass(), "recentChange", null);
        setField(term855050, term855050.getClass(), "codeChangeHandlers", null);
        setField(term855050, term855050.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFunctionalInformationMap", argTypes, term855050, args);
    }

};


