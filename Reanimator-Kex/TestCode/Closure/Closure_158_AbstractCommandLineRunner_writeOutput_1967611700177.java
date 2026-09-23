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

public class AbstractCommandLineRunner_writeOutput_1967611700177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152428;
     Object term152508;
     Object term153885;
     Object term153886;

    public AbstractCommandLineRunner_writeOutput_1967611700177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152428 = newInstance(Class.forName("java.io.PrintStream"));
        term152508 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term152590 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term152698 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(term152590, term152590.getClass(), "generator", term152698);
        setField(term152508, term152508.getClass(), "sourceMap", term152590);
        term153885 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term153885, term153885.getClass(), "autoFlush", false);
        setBooleanField(term153885, term153885.getClass(), "trouble", true);
        setField(term153885, term153885.getClass(), "formatter", null);
        setField(term153885, term153885.getClass(), "textOut", null);
        setField(term153885, term153885.getClass(), "charOut", null);
        setBooleanField(term153885, term153885.getClass(), "closing", false);
        setField(term153885, term153885.getClass(), "out", null);
        setBooleanField(term153885, term153885.getClass(), "closed", false);
        setField(term153885, term153885.getClass(), "closeLock", null);
        term153886 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term153887 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term153888 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV2"));
        setField(term153886, term153886.getClass(), "options", null);
        setField(term153886, term153886.getClass(), "passes", null);
        setField(term153886, term153886.getClass(), "externs", null);
        setField(term153886, term153886.getClass(), "modules", null);
        setField(term153886, term153886.getClass(), "moduleGraph", null);
        setField(term153886, term153886.getClass(), "inputs", null);
        setField(term153886, term153886.getClass(), "errorManager", null);
        setField(term153886, term153886.getClass(), "warningsGuard", null);
        setField(term153886, term153886.getClass(), "externsRoot", null);
        setField(term153886, term153886.getClass(), "jsRoot", null);
        setField(term153886, term153886.getClass(), "externAndJsRoot", null);
        setField(term153886, term153886.getClass(), "inputsByName", null);
        setBooleanField(term153888, term153888.getClass(), "validate", false);
        setField(term153888, term153888.getClass(), "mappings", null);
        setField(term153888, term153888.getClass(), "sourceFileMap", null);
        setField(term153888, term153888.getClass(), "lastSourceFile", null);
        setIntField(term153888, term153888.getClass(), "lastSourceFileIndex", 0);
        setField(term153888, term153888.getClass(), "lastMapping", null);
        setField(term153888, term153888.getClass(), "offsetPosition", null);
        setField(term153888, term153888.getClass(), "prefixPosition", null);
        setField(term153887, term153887.getClass(), "generator", term153888);
        setField(term153886, term153886.getClass(), "sourceMap", term153887);
        setField(term153886, term153886.getClass(), "externExports", null);
        setIntField(term153886, term153886.getClass(), "uniqueNameId", 0);
        setBooleanField(term153886, term153886.getClass(), "useThreads", false);
        setBooleanField(term153886, term153886.getClass(), "hasRegExpGlobalReferences", false);
        setField(term153886, term153886.getClass(), "functionInformationMap", null);
        setField(term153886, term153886.getClass(), "debugLog", null);
        setField(term153886, term153886.getClass(), "defaultCodingConvention", null);
        setField(term153886, term153886.getClass(), "typeRegistry", null);
        setField(term153886, term153886.getClass(), "parserConfig", null);
        setField(term153886, term153886.getClass(), "abstractInterpreter", null);
        setField(term153886, term153886.getClass(), "typeValidator", null);
        setField(term153886, term153886.getClass(), "tracker", null);
        setField(term153886, term153886.getClass(), "oldErrorReporter", null);
        setField(term153886, term153886.getClass(), "defaultErrorReporter", null);
        setField(term153886, term153886.getClass(), "outStream", null);
        setField(term153886, term153886.getClass(), "sanityCheck", null);
        setField(term153886, term153886.getClass(), "currentTracer", null);
        setField(term153886, term153886.getClass(), "currentPassName", null);
        setField(term153886, term153886.getClass(), "recentChange", null);
        setField(term153886, term153886.getClass(), "codeChangeHandlers", null);
        setField(term153886, term153886.getClass(), "stage", null);
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
        args[0] = term152428;
        args[1] = term152508;
        args[2] = null;
        args[3] = "                               \u0001                  ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term152428, term153885));
        assertTrue(recursiveEquals(term152508, term153886));
    }

};


