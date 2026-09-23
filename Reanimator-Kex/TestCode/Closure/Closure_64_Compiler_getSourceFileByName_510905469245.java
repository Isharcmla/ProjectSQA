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

public class Compiler_getSourceFileByName_510905469245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978050;

    public Compiler_getSourceFileByName_510905469245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978050 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978050, term978050.getClass(), "options", null);
        setField(term978050, term978050.getClass(), "passes", null);
        setField(term978050, term978050.getClass(), "externs", null);
        setField(term978050, term978050.getClass(), "modules", null);
        setField(term978050, term978050.getClass(), "moduleGraph", null);
        setField(term978050, term978050.getClass(), "inputs", null);
        setField(term978050, term978050.getClass(), "errorManager", null);
        setField(term978050, term978050.getClass(), "warningsGuard", null);
        setField(term978050, term978050.getClass(), "externsRoot", null);
        setField(term978050, term978050.getClass(), "jsRoot", null);
        setField(term978050, term978050.getClass(), "externAndJsRoot", null);
        setField(term978050, term978050.getClass(), "inputsByName", null);
        setField(term978050, term978050.getClass(), "sourceMap", null);
        setField(term978050, term978050.getClass(), "externExports", null);
        setIntField(term978050, term978050.getClass(), "uniqueNameId", 0);
        setBooleanField(term978050, term978050.getClass(), "useThreads", false);
        setBooleanField(term978050, term978050.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978050, term978050.getClass(), "functionInformationMap", null);
        setField(term978050, term978050.getClass(), "debugLog", null);
        setField(term978050, term978050.getClass(), "defaultCodingConvention", null);
        setField(term978050, term978050.getClass(), "typeRegistry", null);
        setField(term978050, term978050.getClass(), "parserConfig", null);
        setField(term978050, term978050.getClass(), "abstractInterpreter", null);
        setField(term978050, term978050.getClass(), "typeValidator", null);
        setField(term978050, term978050.getClass(), "tracker", null);
        setField(term978050, term978050.getClass(), "oldErrorReporter", null);
        setField(term978050, term978050.getClass(), "defaultErrorReporter", null);
        setField(term978050, term978050.getClass(), "outStream", null);
        setField(term978050, term978050.getClass(), "globalRefMap", null);
        setField(term978050, term978050.getClass(), "sanityCheck", null);
        setField(term978050, term978050.getClass(), "currentTracer", null);
        setField(term978050, term978050.getClass(), "currentPassName", null);
        setField(term978050, term978050.getClass(), "recentChange", null);
        setField(term978050, term978050.getClass(), "codeChangeHandlers", null);
        setField(term978050, term978050.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSourceFileByName", argTypes, term978050, args);
    }

};


