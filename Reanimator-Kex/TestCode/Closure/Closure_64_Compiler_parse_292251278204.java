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

public class Compiler_parse_292251278204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977884;

    public Compiler_parse_292251278204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977884 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977884, term977884.getClass(), "options", null);
        setField(term977884, term977884.getClass(), "passes", null);
        setField(term977884, term977884.getClass(), "externs", null);
        setField(term977884, term977884.getClass(), "modules", null);
        setField(term977884, term977884.getClass(), "moduleGraph", null);
        setField(term977884, term977884.getClass(), "inputs", null);
        setField(term977884, term977884.getClass(), "errorManager", null);
        setField(term977884, term977884.getClass(), "warningsGuard", null);
        setField(term977884, term977884.getClass(), "externsRoot", null);
        setField(term977884, term977884.getClass(), "jsRoot", null);
        setField(term977884, term977884.getClass(), "externAndJsRoot", null);
        setField(term977884, term977884.getClass(), "inputsByName", null);
        setField(term977884, term977884.getClass(), "sourceMap", null);
        setField(term977884, term977884.getClass(), "externExports", null);
        setIntField(term977884, term977884.getClass(), "uniqueNameId", 0);
        setBooleanField(term977884, term977884.getClass(), "useThreads", false);
        setBooleanField(term977884, term977884.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977884, term977884.getClass(), "functionInformationMap", null);
        setField(term977884, term977884.getClass(), "debugLog", null);
        setField(term977884, term977884.getClass(), "defaultCodingConvention", null);
        setField(term977884, term977884.getClass(), "typeRegistry", null);
        setField(term977884, term977884.getClass(), "parserConfig", null);
        setField(term977884, term977884.getClass(), "abstractInterpreter", null);
        setField(term977884, term977884.getClass(), "typeValidator", null);
        setField(term977884, term977884.getClass(), "tracker", null);
        setField(term977884, term977884.getClass(), "oldErrorReporter", null);
        setField(term977884, term977884.getClass(), "defaultErrorReporter", null);
        setField(term977884, term977884.getClass(), "outStream", null);
        setField(term977884, term977884.getClass(), "globalRefMap", null);
        setField(term977884, term977884.getClass(), "sanityCheck", null);
        setField(term977884, term977884.getClass(), "currentTracer", null);
        setField(term977884, term977884.getClass(), "currentPassName", null);
        setField(term977884, term977884.getClass(), "recentChange", null);
        setField(term977884, term977884.getClass(), "codeChangeHandlers", null);
        setField(term977884, term977884.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parse", argTypes, term977884, args);
    }

};


