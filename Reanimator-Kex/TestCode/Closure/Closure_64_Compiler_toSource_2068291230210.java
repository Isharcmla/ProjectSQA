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

public class Compiler_toSource_2068291230210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977908;

    public Compiler_toSource_2068291230210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977908 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977908, term977908.getClass(), "options", null);
        setField(term977908, term977908.getClass(), "passes", null);
        setField(term977908, term977908.getClass(), "externs", null);
        setField(term977908, term977908.getClass(), "modules", null);
        setField(term977908, term977908.getClass(), "moduleGraph", null);
        setField(term977908, term977908.getClass(), "inputs", null);
        setField(term977908, term977908.getClass(), "errorManager", null);
        setField(term977908, term977908.getClass(), "warningsGuard", null);
        setField(term977908, term977908.getClass(), "externsRoot", null);
        setField(term977908, term977908.getClass(), "jsRoot", null);
        setField(term977908, term977908.getClass(), "externAndJsRoot", null);
        setField(term977908, term977908.getClass(), "inputsByName", null);
        setField(term977908, term977908.getClass(), "sourceMap", null);
        setField(term977908, term977908.getClass(), "externExports", null);
        setIntField(term977908, term977908.getClass(), "uniqueNameId", 0);
        setBooleanField(term977908, term977908.getClass(), "useThreads", false);
        setBooleanField(term977908, term977908.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977908, term977908.getClass(), "functionInformationMap", null);
        setField(term977908, term977908.getClass(), "debugLog", null);
        setField(term977908, term977908.getClass(), "defaultCodingConvention", null);
        setField(term977908, term977908.getClass(), "typeRegistry", null);
        setField(term977908, term977908.getClass(), "parserConfig", null);
        setField(term977908, term977908.getClass(), "abstractInterpreter", null);
        setField(term977908, term977908.getClass(), "typeValidator", null);
        setField(term977908, term977908.getClass(), "tracker", null);
        setField(term977908, term977908.getClass(), "oldErrorReporter", null);
        setField(term977908, term977908.getClass(), "defaultErrorReporter", null);
        setField(term977908, term977908.getClass(), "outStream", null);
        setField(term977908, term977908.getClass(), "globalRefMap", null);
        setField(term977908, term977908.getClass(), "sanityCheck", null);
        setField(term977908, term977908.getClass(), "currentTracer", null);
        setField(term977908, term977908.getClass(), "currentPassName", null);
        setField(term977908, term977908.getClass(), "recentChange", null);
        setField(term977908, term977908.getClass(), "codeChangeHandlers", null);
        setField(term977908, term977908.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSource", argTypes, term977908, args);
    }

};


