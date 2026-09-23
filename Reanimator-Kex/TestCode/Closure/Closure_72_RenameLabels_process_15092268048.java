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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class RenameLabels_process_15092268048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22729;
     Object term22879;
     Object term23698;
     Object term23700;

    public RenameLabels_process_15092268048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22729 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term22809 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22729, term22729.getClass(), "compiler", term22809);
        term22879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22879, term22879.getClass(), "type", 117);
        setField(term22879, term22879.getClass(), "first", null);
        term23698 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term23699 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term23699, term23699.getClass(), "options", null);
        setField(term23699, term23699.getClass(), "passes", null);
        setField(term23699, term23699.getClass(), "externs", null);
        setField(term23699, term23699.getClass(), "modules", null);
        setField(term23699, term23699.getClass(), "moduleGraph", null);
        setField(term23699, term23699.getClass(), "inputs", null);
        setField(term23699, term23699.getClass(), "errorManager", null);
        setField(term23699, term23699.getClass(), "warningsGuard", null);
        setField(term23699, term23699.getClass(), "externsRoot", null);
        setField(term23699, term23699.getClass(), "jsRoot", null);
        setField(term23699, term23699.getClass(), "externAndJsRoot", null);
        setField(term23699, term23699.getClass(), "inputsByName", null);
        setField(term23699, term23699.getClass(), "sourceMap", null);
        setField(term23699, term23699.getClass(), "externExports", null);
        setIntField(term23699, term23699.getClass(), "uniqueNameId", 0);
        setBooleanField(term23699, term23699.getClass(), "useThreads", false);
        setBooleanField(term23699, term23699.getClass(), "hasRegExpGlobalReferences", false);
        setField(term23699, term23699.getClass(), "functionInformationMap", null);
        setField(term23699, term23699.getClass(), "debugLog", null);
        setField(term23699, term23699.getClass(), "defaultCodingConvention", null);
        setField(term23699, term23699.getClass(), "typeRegistry", null);
        setField(term23699, term23699.getClass(), "parserConfig", null);
        setField(term23699, term23699.getClass(), "abstractInterpreter", null);
        setField(term23699, term23699.getClass(), "typeValidator", null);
        setField(term23699, term23699.getClass(), "tracker", null);
        setField(term23699, term23699.getClass(), "oldErrorReporter", null);
        setField(term23699, term23699.getClass(), "defaultErrorReporter", null);
        setField(term23699, term23699.getClass(), "outStream", null);
        setField(term23699, term23699.getClass(), "sanityCheck", null);
        setField(term23699, term23699.getClass(), "currentTracer", null);
        setField(term23699, term23699.getClass(), "currentPassName", null);
        setField(term23699, term23699.getClass(), "recentChange", null);
        setField(term23699, term23699.getClass(), "codeChangeHandlers", null);
        setField(term23699, term23699.getClass(), "stage", null);
        setField(term23698, term23698.getClass(), "compiler", term23699);
        setField(term23698, term23698.getClass(), "nameSupplier", null);
        setBooleanField(term23698, term23698.getClass(), "removeUnused", false);
        term23700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23700, term23700.getClass(), "type", 117);
        setField(term23700, term23700.getClass(), "next", null);
        setField(term23700, term23700.getClass(), "first", null);
        setField(term23700, term23700.getClass(), "last", null);
        setField(term23700, term23700.getClass(), "propListHead", null);
        setIntField(term23700, term23700.getClass(), "sourcePosition", 0);
        setField(term23700, term23700.getClass(), "jsType", null);
        setField(term23700, term23700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22879;
        callMethod(klass, "process", argTypes, term22729, args);
        assertTrue(recursiveEquals(term22729, term23698));
        assertTrue(recursiveEquals(term22879, null));
    }

};


