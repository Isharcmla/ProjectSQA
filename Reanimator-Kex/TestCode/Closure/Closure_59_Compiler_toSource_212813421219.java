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
import java.lang.Boolean;

public class Compiler_toSource_212813421219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854896;
     Object term854900;

    public Compiler_toSource_212813421219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854896 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854896, term854896.getClass(), "options", null);
        setField(term854896, term854896.getClass(), "passes", null);
        setField(term854896, term854896.getClass(), "externs", null);
        setField(term854896, term854896.getClass(), "modules", null);
        setField(term854896, term854896.getClass(), "moduleGraph", null);
        setField(term854896, term854896.getClass(), "inputs", null);
        setField(term854896, term854896.getClass(), "errorManager", null);
        setField(term854896, term854896.getClass(), "warningsGuard", null);
        setField(term854896, term854896.getClass(), "externsRoot", null);
        setField(term854896, term854896.getClass(), "jsRoot", null);
        setField(term854896, term854896.getClass(), "externAndJsRoot", null);
        setField(term854896, term854896.getClass(), "inputsByName", null);
        setField(term854896, term854896.getClass(), "sourceMap", null);
        setField(term854896, term854896.getClass(), "externExports", null);
        setIntField(term854896, term854896.getClass(), "uniqueNameId", 0);
        setBooleanField(term854896, term854896.getClass(), "useThreads", false);
        setBooleanField(term854896, term854896.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854896, term854896.getClass(), "functionInformationMap", null);
        setField(term854896, term854896.getClass(), "debugLog", null);
        setField(term854896, term854896.getClass(), "defaultCodingConvention", null);
        setField(term854896, term854896.getClass(), "typeRegistry", null);
        setField(term854896, term854896.getClass(), "parserConfig", null);
        setField(term854896, term854896.getClass(), "abstractInterpreter", null);
        setField(term854896, term854896.getClass(), "typeValidator", null);
        setField(term854896, term854896.getClass(), "tracker", null);
        setField(term854896, term854896.getClass(), "oldErrorReporter", null);
        setField(term854896, term854896.getClass(), "defaultErrorReporter", null);
        setField(term854896, term854896.getClass(), "outStream", null);
        setField(term854896, term854896.getClass(), "globalRefMap", null);
        setField(term854896, term854896.getClass(), "sanityCheck", null);
        setField(term854896, term854896.getClass(), "currentTracer", null);
        setField(term854896, term854896.getClass(), "currentPassName", null);
        setField(term854896, term854896.getClass(), "recentChange", null);
        setField(term854896, term854896.getClass(), "codeChangeHandlers", null);
        setField(term854896, term854896.getClass(), "stage", null);
        term854900 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.SourceMap");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term854900;
        callMethod(klass, "toSource", argTypes, term854896, args);
    }

};


