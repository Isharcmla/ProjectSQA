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

public class RenameLabels_process_15092268057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27462;
     Object term27628;
     Object term27842;
     Object term27844;

    public RenameLabels_process_15092268057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27462 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term27542 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27462, term27462.getClass(), "compiler", term27542);
        term27628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term27628, term27628.getClass(), "type", 0);
        setField(term27628, term27628.getClass(), "first", null);
        term27842 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term27843 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27843, term27843.getClass(), "options", null);
        setField(term27843, term27843.getClass(), "passes", null);
        setField(term27843, term27843.getClass(), "externs", null);
        setField(term27843, term27843.getClass(), "modules", null);
        setField(term27843, term27843.getClass(), "moduleGraph", null);
        setField(term27843, term27843.getClass(), "inputs", null);
        setField(term27843, term27843.getClass(), "errorManager", null);
        setField(term27843, term27843.getClass(), "warningsGuard", null);
        setField(term27843, term27843.getClass(), "externsRoot", null);
        setField(term27843, term27843.getClass(), "jsRoot", null);
        setField(term27843, term27843.getClass(), "externAndJsRoot", null);
        setField(term27843, term27843.getClass(), "inputsByName", null);
        setField(term27843, term27843.getClass(), "sourceMap", null);
        setField(term27843, term27843.getClass(), "externExports", null);
        setIntField(term27843, term27843.getClass(), "uniqueNameId", 0);
        setBooleanField(term27843, term27843.getClass(), "useThreads", false);
        setBooleanField(term27843, term27843.getClass(), "hasRegExpGlobalReferences", false);
        setField(term27843, term27843.getClass(), "functionInformationMap", null);
        setField(term27843, term27843.getClass(), "debugLog", null);
        setField(term27843, term27843.getClass(), "defaultCodingConvention", null);
        setField(term27843, term27843.getClass(), "typeRegistry", null);
        setField(term27843, term27843.getClass(), "parserConfig", null);
        setField(term27843, term27843.getClass(), "abstractInterpreter", null);
        setField(term27843, term27843.getClass(), "typeValidator", null);
        setField(term27843, term27843.getClass(), "tracker", null);
        setField(term27843, term27843.getClass(), "oldErrorReporter", null);
        setField(term27843, term27843.getClass(), "defaultErrorReporter", null);
        setField(term27843, term27843.getClass(), "outStream", null);
        setField(term27843, term27843.getClass(), "sanityCheck", null);
        setField(term27843, term27843.getClass(), "currentTracer", null);
        setField(term27843, term27843.getClass(), "currentPassName", null);
        setField(term27843, term27843.getClass(), "recentChange", null);
        setField(term27843, term27843.getClass(), "codeChangeHandlers", null);
        setField(term27843, term27843.getClass(), "stage", null);
        setField(term27842, term27842.getClass(), "compiler", term27843);
        setField(term27842, term27842.getClass(), "nameSupplier", null);
        setBooleanField(term27842, term27842.getClass(), "removeUnused", false);
        term27844 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term27844, term27844.getClass(), "functionName", null);
        setBooleanField(term27844, term27844.getClass(), "itsNeedsActivation", false);
        setIntField(term27844, term27844.getClass(), "itsFunctionType", 0);
        setBooleanField(term27844, term27844.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term27844, term27844.getClass(), "encodedSourceStart", 0);
        setIntField(term27844, term27844.getClass(), "encodedSourceEnd", 0);
        setField(term27844, term27844.getClass(), "sourceName", null);
        setIntField(term27844, term27844.getClass(), "baseLineno", 0);
        setIntField(term27844, term27844.getClass(), "endLineno", 0);
        setField(term27844, term27844.getClass(), "functions", null);
        setField(term27844, term27844.getClass(), "regexps", null);
        setField(term27844, term27844.getClass(), "itsVariables", null);
        setField(term27844, term27844.getClass(), "itsConst", null);
        setField(term27844, term27844.getClass(), "itsVariableNames", null);
        setIntField(term27844, term27844.getClass(), "varStart", 0);
        setField(term27844, term27844.getClass(), "compilerData", null);
        setIntField(term27844, term27844.getClass(), "type", 0);
        setField(term27844, term27844.getClass(), "next", null);
        setField(term27844, term27844.getClass(), "first", null);
        setField(term27844, term27844.getClass(), "last", null);
        setField(term27844, term27844.getClass(), "propListHead", null);
        setIntField(term27844, term27844.getClass(), "sourcePosition", 0);
        setField(term27844, term27844.getClass(), "jsType", null);
        setField(term27844, term27844.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term27628;
        callMethod(klass, "process", argTypes, term27462, args);
        assertTrue(recursiveEquals(term27462, term27842));
        assertTrue(recursiveEquals(term27628, null));
    }

};


