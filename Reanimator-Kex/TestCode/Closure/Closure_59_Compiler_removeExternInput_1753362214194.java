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

public class Compiler_removeExternInput_1753362214194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854751;

    public Compiler_removeExternInput_1753362214194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854751 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854751, term854751.getClass(), "options", null);
        setField(term854751, term854751.getClass(), "passes", null);
        setField(term854751, term854751.getClass(), "externs", null);
        setField(term854751, term854751.getClass(), "modules", null);
        setField(term854751, term854751.getClass(), "moduleGraph", null);
        setField(term854751, term854751.getClass(), "inputs", null);
        setField(term854751, term854751.getClass(), "errorManager", null);
        setField(term854751, term854751.getClass(), "warningsGuard", null);
        setField(term854751, term854751.getClass(), "externsRoot", null);
        setField(term854751, term854751.getClass(), "jsRoot", null);
        setField(term854751, term854751.getClass(), "externAndJsRoot", null);
        setField(term854751, term854751.getClass(), "inputsByName", null);
        setField(term854751, term854751.getClass(), "sourceMap", null);
        setField(term854751, term854751.getClass(), "externExports", null);
        setIntField(term854751, term854751.getClass(), "uniqueNameId", 0);
        setBooleanField(term854751, term854751.getClass(), "useThreads", false);
        setBooleanField(term854751, term854751.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854751, term854751.getClass(), "functionInformationMap", null);
        setField(term854751, term854751.getClass(), "debugLog", null);
        setField(term854751, term854751.getClass(), "defaultCodingConvention", null);
        setField(term854751, term854751.getClass(), "typeRegistry", null);
        setField(term854751, term854751.getClass(), "parserConfig", null);
        setField(term854751, term854751.getClass(), "abstractInterpreter", null);
        setField(term854751, term854751.getClass(), "typeValidator", null);
        setField(term854751, term854751.getClass(), "tracker", null);
        setField(term854751, term854751.getClass(), "oldErrorReporter", null);
        setField(term854751, term854751.getClass(), "defaultErrorReporter", null);
        setField(term854751, term854751.getClass(), "outStream", null);
        setField(term854751, term854751.getClass(), "globalRefMap", null);
        setField(term854751, term854751.getClass(), "sanityCheck", null);
        setField(term854751, term854751.getClass(), "currentTracer", null);
        setField(term854751, term854751.getClass(), "currentPassName", null);
        setField(term854751, term854751.getClass(), "recentChange", null);
        setField(term854751, term854751.getClass(), "codeChangeHandlers", null);
        setField(term854751, term854751.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeExternInput", argTypes, term854751, args);
    }

};


