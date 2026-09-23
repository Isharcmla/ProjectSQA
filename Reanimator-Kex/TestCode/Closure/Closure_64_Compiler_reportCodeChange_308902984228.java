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

public class Compiler_reportCodeChange_308902984228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977982;

    public Compiler_reportCodeChange_308902984228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977982 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977982, term977982.getClass(), "options", null);
        setField(term977982, term977982.getClass(), "passes", null);
        setField(term977982, term977982.getClass(), "externs", null);
        setField(term977982, term977982.getClass(), "modules", null);
        setField(term977982, term977982.getClass(), "moduleGraph", null);
        setField(term977982, term977982.getClass(), "inputs", null);
        setField(term977982, term977982.getClass(), "errorManager", null);
        setField(term977982, term977982.getClass(), "warningsGuard", null);
        setField(term977982, term977982.getClass(), "externsRoot", null);
        setField(term977982, term977982.getClass(), "jsRoot", null);
        setField(term977982, term977982.getClass(), "externAndJsRoot", null);
        setField(term977982, term977982.getClass(), "inputsByName", null);
        setField(term977982, term977982.getClass(), "sourceMap", null);
        setField(term977982, term977982.getClass(), "externExports", null);
        setIntField(term977982, term977982.getClass(), "uniqueNameId", 0);
        setBooleanField(term977982, term977982.getClass(), "useThreads", false);
        setBooleanField(term977982, term977982.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977982, term977982.getClass(), "functionInformationMap", null);
        setField(term977982, term977982.getClass(), "debugLog", null);
        setField(term977982, term977982.getClass(), "defaultCodingConvention", null);
        setField(term977982, term977982.getClass(), "typeRegistry", null);
        setField(term977982, term977982.getClass(), "parserConfig", null);
        setField(term977982, term977982.getClass(), "abstractInterpreter", null);
        setField(term977982, term977982.getClass(), "typeValidator", null);
        setField(term977982, term977982.getClass(), "tracker", null);
        setField(term977982, term977982.getClass(), "oldErrorReporter", null);
        setField(term977982, term977982.getClass(), "defaultErrorReporter", null);
        setField(term977982, term977982.getClass(), "outStream", null);
        setField(term977982, term977982.getClass(), "globalRefMap", null);
        setField(term977982, term977982.getClass(), "sanityCheck", null);
        setField(term977982, term977982.getClass(), "currentTracer", null);
        setField(term977982, term977982.getClass(), "currentPassName", null);
        setField(term977982, term977982.getClass(), "recentChange", null);
        setField(term977982, term977982.getClass(), "codeChangeHandlers", null);
        setField(term977982, term977982.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportCodeChange", argTypes, term977982, args);
    }

};


