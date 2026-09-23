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

public class Compiler_setCssRenamingMap_613470818221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854906;

    public Compiler_setCssRenamingMap_613470818221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854906 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854906, term854906.getClass(), "options", null);
        setField(term854906, term854906.getClass(), "passes", null);
        setField(term854906, term854906.getClass(), "externs", null);
        setField(term854906, term854906.getClass(), "modules", null);
        setField(term854906, term854906.getClass(), "moduleGraph", null);
        setField(term854906, term854906.getClass(), "inputs", null);
        setField(term854906, term854906.getClass(), "errorManager", null);
        setField(term854906, term854906.getClass(), "warningsGuard", null);
        setField(term854906, term854906.getClass(), "externsRoot", null);
        setField(term854906, term854906.getClass(), "jsRoot", null);
        setField(term854906, term854906.getClass(), "externAndJsRoot", null);
        setField(term854906, term854906.getClass(), "inputsByName", null);
        setField(term854906, term854906.getClass(), "sourceMap", null);
        setField(term854906, term854906.getClass(), "externExports", null);
        setIntField(term854906, term854906.getClass(), "uniqueNameId", 0);
        setBooleanField(term854906, term854906.getClass(), "useThreads", false);
        setBooleanField(term854906, term854906.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854906, term854906.getClass(), "functionInformationMap", null);
        setField(term854906, term854906.getClass(), "debugLog", null);
        setField(term854906, term854906.getClass(), "defaultCodingConvention", null);
        setField(term854906, term854906.getClass(), "typeRegistry", null);
        setField(term854906, term854906.getClass(), "parserConfig", null);
        setField(term854906, term854906.getClass(), "abstractInterpreter", null);
        setField(term854906, term854906.getClass(), "typeValidator", null);
        setField(term854906, term854906.getClass(), "tracker", null);
        setField(term854906, term854906.getClass(), "oldErrorReporter", null);
        setField(term854906, term854906.getClass(), "defaultErrorReporter", null);
        setField(term854906, term854906.getClass(), "outStream", null);
        setField(term854906, term854906.getClass(), "globalRefMap", null);
        setField(term854906, term854906.getClass(), "sanityCheck", null);
        setField(term854906, term854906.getClass(), "currentTracer", null);
        setField(term854906, term854906.getClass(), "currentPassName", null);
        setField(term854906, term854906.getClass(), "recentChange", null);
        setField(term854906, term854906.getClass(), "codeChangeHandlers", null);
        setField(term854906, term854906.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CssRenamingMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCssRenamingMap", argTypes, term854906, args);
    }

};


