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

public class AbstractCommandLineRunner_writeOutput_1967611700179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154596;
     Object term154676;
     Object term155021;
     Object term155025;

    public AbstractCommandLineRunner_writeOutput_1967611700179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154596 = newInstance(Class.forName("java.io.PrintStream"));
        term154676 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term154758 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term154866 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(term154758, term154758.getClass(), "generator", term154866);
        setField(term154676, term154676.getClass(), "sourceMap", term154758);
        term155021 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term155022 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term155023 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        Object term155024 = newInstance(Class.forName("com.google.debugging.sourcemap.FilePosition"));
        setField(term155021, term155021.getClass(), "options", null);
        setField(term155021, term155021.getClass(), "passes", null);
        setField(term155021, term155021.getClass(), "externs", null);
        setField(term155021, term155021.getClass(), "modules", null);
        setField(term155021, term155021.getClass(), "moduleGraph", null);
        setField(term155021, term155021.getClass(), "inputs", null);
        setField(term155021, term155021.getClass(), "errorManager", null);
        setField(term155021, term155021.getClass(), "warningsGuard", null);
        setField(term155021, term155021.getClass(), "externsRoot", null);
        setField(term155021, term155021.getClass(), "jsRoot", null);
        setField(term155021, term155021.getClass(), "externAndJsRoot", null);
        setField(term155021, term155021.getClass(), "inputsByName", null);
        setField(term155023, term155023.getClass(), "mappings", null);
        setField(term155023, term155023.getClass(), "lastMapping", null);
        setField(term155023, term155023.getClass(), "offsetPosition", null);
        setIntField(term155024, term155024.getClass(), "line", 0);
        setIntField(term155024, term155024.getClass(), "column", 0);
        setField(term155023, term155023.getClass(), "prefixPosition", term155024);
        setField(term155022, term155022.getClass(), "generator", term155023);
        setField(term155021, term155021.getClass(), "sourceMap", term155022);
        setField(term155021, term155021.getClass(), "externExports", null);
        setIntField(term155021, term155021.getClass(), "uniqueNameId", 0);
        setBooleanField(term155021, term155021.getClass(), "useThreads", false);
        setBooleanField(term155021, term155021.getClass(), "hasRegExpGlobalReferences", false);
        setField(term155021, term155021.getClass(), "functionInformationMap", null);
        setField(term155021, term155021.getClass(), "debugLog", null);
        setField(term155021, term155021.getClass(), "defaultCodingConvention", null);
        setField(term155021, term155021.getClass(), "typeRegistry", null);
        setField(term155021, term155021.getClass(), "parserConfig", null);
        setField(term155021, term155021.getClass(), "abstractInterpreter", null);
        setField(term155021, term155021.getClass(), "typeValidator", null);
        setField(term155021, term155021.getClass(), "tracker", null);
        setField(term155021, term155021.getClass(), "oldErrorReporter", null);
        setField(term155021, term155021.getClass(), "defaultErrorReporter", null);
        setField(term155021, term155021.getClass(), "outStream", null);
        setField(term155021, term155021.getClass(), "sanityCheck", null);
        setField(term155021, term155021.getClass(), "currentTracer", null);
        setField(term155021, term155021.getClass(), "currentPassName", null);
        setField(term155021, term155021.getClass(), "recentChange", null);
        setField(term155021, term155021.getClass(), "codeChangeHandlers", null);
        setField(term155021, term155021.getClass(), "stage", null);
        term155025 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term155025, term155025.getClass(), "autoFlush", false);
        setBooleanField(term155025, term155025.getClass(), "trouble", true);
        setField(term155025, term155025.getClass(), "formatter", null);
        setField(term155025, term155025.getClass(), "textOut", null);
        setField(term155025, term155025.getClass(), "charOut", null);
        setBooleanField(term155025, term155025.getClass(), "closing", false);
        setField(term155025, term155025.getClass(), "out", null);
        setBooleanField(term155025, term155025.getClass(), "closed", false);
        setField(term155025, term155025.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term154596;
        args[1] = term154676;
        args[2] = null;
        args[3] = "\u0001                ";
        args[4] = "";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term154596, term155021));
        assertTrue(recursiveEquals(term154676, term155025));
    }

};


