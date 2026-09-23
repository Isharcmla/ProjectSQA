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

public class AbstractCommandLineRunner_writeOutput_1967611700175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150385;
     Object term150465;
     Object term151356;
     Object term151360;

    public AbstractCommandLineRunner_writeOutput_1967611700175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150385 = newInstance(Class.forName("java.io.PrintStream"));
        term150465 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term150547 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term150655 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(term150547, term150547.getClass(), "generator", term150655);
        setField(term150465, term150465.getClass(), "sourceMap", term150547);
        term151356 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term151357 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term151358 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        Object term151359 = newInstance(Class.forName("com.google.debugging.sourcemap.FilePosition"));
        setField(term151356, term151356.getClass(), "options", null);
        setField(term151356, term151356.getClass(), "passes", null);
        setField(term151356, term151356.getClass(), "externs", null);
        setField(term151356, term151356.getClass(), "modules", null);
        setField(term151356, term151356.getClass(), "moduleGraph", null);
        setField(term151356, term151356.getClass(), "inputs", null);
        setField(term151356, term151356.getClass(), "errorManager", null);
        setField(term151356, term151356.getClass(), "warningsGuard", null);
        setField(term151356, term151356.getClass(), "externsRoot", null);
        setField(term151356, term151356.getClass(), "jsRoot", null);
        setField(term151356, term151356.getClass(), "externAndJsRoot", null);
        setField(term151356, term151356.getClass(), "inputsByName", null);
        setBooleanField(term151358, term151358.getClass(), "validate", false);
        setField(term151358, term151358.getClass(), "mappings", null);
        setField(term151358, term151358.getClass(), "sourceFileMap", null);
        setField(term151358, term151358.getClass(), "lastSourceFile", null);
        setIntField(term151358, term151358.getClass(), "lastSourceFileIndex", 0);
        setField(term151358, term151358.getClass(), "lastMapping", null);
        setField(term151358, term151358.getClass(), "offsetPosition", null);
        setIntField(term151359, term151359.getClass(), "line", 0);
        setIntField(term151359, term151359.getClass(), "column", 0);
        setField(term151358, term151358.getClass(), "prefixPosition", term151359);
        setField(term151357, term151357.getClass(), "generator", term151358);
        setField(term151356, term151356.getClass(), "sourceMap", term151357);
        setField(term151356, term151356.getClass(), "externExports", null);
        setIntField(term151356, term151356.getClass(), "uniqueNameId", 0);
        setBooleanField(term151356, term151356.getClass(), "useThreads", false);
        setBooleanField(term151356, term151356.getClass(), "hasRegExpGlobalReferences", false);
        setField(term151356, term151356.getClass(), "functionInformationMap", null);
        setField(term151356, term151356.getClass(), "debugLog", null);
        setField(term151356, term151356.getClass(), "defaultCodingConvention", null);
        setField(term151356, term151356.getClass(), "typeRegistry", null);
        setField(term151356, term151356.getClass(), "parserConfig", null);
        setField(term151356, term151356.getClass(), "abstractInterpreter", null);
        setField(term151356, term151356.getClass(), "typeValidator", null);
        setField(term151356, term151356.getClass(), "tracker", null);
        setField(term151356, term151356.getClass(), "oldErrorReporter", null);
        setField(term151356, term151356.getClass(), "defaultErrorReporter", null);
        setField(term151356, term151356.getClass(), "outStream", null);
        setField(term151356, term151356.getClass(), "sanityCheck", null);
        setField(term151356, term151356.getClass(), "currentTracer", null);
        setField(term151356, term151356.getClass(), "currentPassName", null);
        setField(term151356, term151356.getClass(), "recentChange", null);
        setField(term151356, term151356.getClass(), "codeChangeHandlers", null);
        setField(term151356, term151356.getClass(), "stage", null);
        term151360 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term151360, term151360.getClass(), "autoFlush", false);
        setBooleanField(term151360, term151360.getClass(), "trouble", true);
        setField(term151360, term151360.getClass(), "formatter", null);
        setField(term151360, term151360.getClass(), "textOut", null);
        setField(term151360, term151360.getClass(), "charOut", null);
        setBooleanField(term151360, term151360.getClass(), "closing", false);
        setField(term151360, term151360.getClass(), "out", null);
        setBooleanField(term151360, term151360.getClass(), "closed", false);
        setField(term151360, term151360.getClass(), "closeLock", null);
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
        args[0] = term150385;
        args[1] = term150465;
        args[2] = null;
        args[3] = "            \u0001                                                                                                                                                                                                                                                                    ";
        args[4] = "            ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term150385, term151356));
        assertTrue(recursiveEquals(term150465, term151360));
    }

};


