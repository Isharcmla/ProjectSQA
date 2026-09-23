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

public class Compiler_toSource_899486569218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854849;

    public Compiler_toSource_899486569218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854849 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854849, term854849.getClass(), "options", null);
        setField(term854849, term854849.getClass(), "passes", null);
        setField(term854849, term854849.getClass(), "externs", null);
        setField(term854849, term854849.getClass(), "modules", null);
        setField(term854849, term854849.getClass(), "moduleGraph", null);
        setField(term854849, term854849.getClass(), "inputs", null);
        setField(term854849, term854849.getClass(), "errorManager", null);
        setField(term854849, term854849.getClass(), "warningsGuard", null);
        setField(term854849, term854849.getClass(), "externsRoot", null);
        setField(term854849, term854849.getClass(), "jsRoot", null);
        setField(term854849, term854849.getClass(), "externAndJsRoot", null);
        setField(term854849, term854849.getClass(), "inputsByName", null);
        setField(term854849, term854849.getClass(), "sourceMap", null);
        setField(term854849, term854849.getClass(), "externExports", null);
        setIntField(term854849, term854849.getClass(), "uniqueNameId", 0);
        setBooleanField(term854849, term854849.getClass(), "useThreads", false);
        setBooleanField(term854849, term854849.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854849, term854849.getClass(), "functionInformationMap", null);
        setField(term854849, term854849.getClass(), "debugLog", null);
        setField(term854849, term854849.getClass(), "defaultCodingConvention", null);
        setField(term854849, term854849.getClass(), "typeRegistry", null);
        setField(term854849, term854849.getClass(), "parserConfig", null);
        setField(term854849, term854849.getClass(), "abstractInterpreter", null);
        setField(term854849, term854849.getClass(), "typeValidator", null);
        setField(term854849, term854849.getClass(), "tracker", null);
        setField(term854849, term854849.getClass(), "oldErrorReporter", null);
        setField(term854849, term854849.getClass(), "defaultErrorReporter", null);
        setField(term854849, term854849.getClass(), "outStream", null);
        setField(term854849, term854849.getClass(), "globalRefMap", null);
        setField(term854849, term854849.getClass(), "sanityCheck", null);
        setField(term854849, term854849.getClass(), "currentTracer", null);
        setField(term854849, term854849.getClass(), "currentPassName", null);
        setField(term854849, term854849.getClass(), "recentChange", null);
        setField(term854849, term854849.getClass(), "codeChangeHandlers", null);
        setField(term854849, term854849.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSource", argTypes, term854849, args);
    }

};


