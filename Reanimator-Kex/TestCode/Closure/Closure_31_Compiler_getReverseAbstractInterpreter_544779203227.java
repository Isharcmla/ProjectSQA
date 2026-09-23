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

public class Compiler_getReverseAbstractInterpreter_544779203227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890139;

    public Compiler_getReverseAbstractInterpreter_544779203227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890139 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890139, term890139.getClass(), "options", null);
        setField(term890139, term890139.getClass(), "passes", null);
        setField(term890139, term890139.getClass(), "externs", null);
        setField(term890139, term890139.getClass(), "modules", null);
        setField(term890139, term890139.getClass(), "moduleGraph", null);
        setField(term890139, term890139.getClass(), "inputs", null);
        setField(term890139, term890139.getClass(), "errorManager", null);
        setField(term890139, term890139.getClass(), "warningsGuard", null);
        setField(term890139, term890139.getClass(), "injectedLibraries", null);
        setField(term890139, term890139.getClass(), "externsRoot", null);
        setField(term890139, term890139.getClass(), "jsRoot", null);
        setField(term890139, term890139.getClass(), "externAndJsRoot", null);
        setField(term890139, term890139.getClass(), "inputsById", null);
        setField(term890139, term890139.getClass(), "sourceMap", null);
        setField(term890139, term890139.getClass(), "externExports", null);
        setIntField(term890139, term890139.getClass(), "uniqueNameId", 0);
        setBooleanField(term890139, term890139.getClass(), "useThreads", false);
        setBooleanField(term890139, term890139.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890139, term890139.getClass(), "functionInformationMap", null);
        setField(term890139, term890139.getClass(), "debugLog", null);
        setField(term890139, term890139.getClass(), "defaultCodingConvention", null);
        setField(term890139, term890139.getClass(), "typeRegistry", null);
        setField(term890139, term890139.getClass(), "parserConfig", null);
        setField(term890139, term890139.getClass(), "abstractInterpreter", null);
        setField(term890139, term890139.getClass(), "typeValidator", null);
        setField(term890139, term890139.getClass(), "tracker", null);
        setField(term890139, term890139.getClass(), "oldErrorReporter", null);
        setField(term890139, term890139.getClass(), "defaultErrorReporter", null);
        setField(term890139, term890139.getClass(), "outStream", null);
        setField(term890139, term890139.getClass(), "globalRefMap", null);
        setDoubleField(term890139, term890139.getClass(), "progress", 0.0);
        setField(term890139, term890139.getClass(), "sanityCheck", null);
        setField(term890139, term890139.getClass(), "currentTracer", null);
        setField(term890139, term890139.getClass(), "currentPassName", null);
        setIntField(term890139, term890139.getClass(), "syntheticCodeId", 0);
        setField(term890139, term890139.getClass(), "recentChange", null);
        setField(term890139, term890139.getClass(), "codeChangeHandlers", null);
        setField(term890139, term890139.getClass(), "synthesizedExternsInput", null);
        setField(term890139, term890139.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReverseAbstractInterpreter", argTypes, term890139, args);
    }

};


