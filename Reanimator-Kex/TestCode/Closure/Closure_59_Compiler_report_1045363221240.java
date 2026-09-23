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

public class Compiler_report_1045363221240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854982;

    public Compiler_report_1045363221240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854982 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854982, term854982.getClass(), "options", null);
        setField(term854982, term854982.getClass(), "passes", null);
        setField(term854982, term854982.getClass(), "externs", null);
        setField(term854982, term854982.getClass(), "modules", null);
        setField(term854982, term854982.getClass(), "moduleGraph", null);
        setField(term854982, term854982.getClass(), "inputs", null);
        setField(term854982, term854982.getClass(), "errorManager", null);
        setField(term854982, term854982.getClass(), "warningsGuard", null);
        setField(term854982, term854982.getClass(), "externsRoot", null);
        setField(term854982, term854982.getClass(), "jsRoot", null);
        setField(term854982, term854982.getClass(), "externAndJsRoot", null);
        setField(term854982, term854982.getClass(), "inputsByName", null);
        setField(term854982, term854982.getClass(), "sourceMap", null);
        setField(term854982, term854982.getClass(), "externExports", null);
        setIntField(term854982, term854982.getClass(), "uniqueNameId", 0);
        setBooleanField(term854982, term854982.getClass(), "useThreads", false);
        setBooleanField(term854982, term854982.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854982, term854982.getClass(), "functionInformationMap", null);
        setField(term854982, term854982.getClass(), "debugLog", null);
        setField(term854982, term854982.getClass(), "defaultCodingConvention", null);
        setField(term854982, term854982.getClass(), "typeRegistry", null);
        setField(term854982, term854982.getClass(), "parserConfig", null);
        setField(term854982, term854982.getClass(), "abstractInterpreter", null);
        setField(term854982, term854982.getClass(), "typeValidator", null);
        setField(term854982, term854982.getClass(), "tracker", null);
        setField(term854982, term854982.getClass(), "oldErrorReporter", null);
        setField(term854982, term854982.getClass(), "defaultErrorReporter", null);
        setField(term854982, term854982.getClass(), "outStream", null);
        setField(term854982, term854982.getClass(), "globalRefMap", null);
        setField(term854982, term854982.getClass(), "sanityCheck", null);
        setField(term854982, term854982.getClass(), "currentTracer", null);
        setField(term854982, term854982.getClass(), "currentPassName", null);
        setField(term854982, term854982.getClass(), "recentChange", null);
        setField(term854982, term854982.getClass(), "codeChangeHandlers", null);
        setField(term854982, term854982.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "report", argTypes, term854982, args);
    }

};


