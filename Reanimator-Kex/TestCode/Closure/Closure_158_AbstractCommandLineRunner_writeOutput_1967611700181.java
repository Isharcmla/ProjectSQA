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

public class AbstractCommandLineRunner_writeOutput_1967611700181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157636;
     Object term157716;
     Object term160431;
     Object term160432;

    public AbstractCommandLineRunner_writeOutput_1967611700181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157636 = newInstance(Class.forName("java.io.PrintStream"));
        term157716 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term157798 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term157906 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(term157798, term157798.getClass(), "generator", term157906);
        setField(term157716, term157716.getClass(), "sourceMap", term157798);
        term160431 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term160431, term160431.getClass(), "autoFlush", false);
        setBooleanField(term160431, term160431.getClass(), "trouble", true);
        setField(term160431, term160431.getClass(), "formatter", null);
        setField(term160431, term160431.getClass(), "textOut", null);
        setField(term160431, term160431.getClass(), "charOut", null);
        setBooleanField(term160431, term160431.getClass(), "closing", false);
        setField(term160431, term160431.getClass(), "out", null);
        setBooleanField(term160431, term160431.getClass(), "closed", false);
        setField(term160431, term160431.getClass(), "closeLock", null);
        term160432 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term160433 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term160434 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(term160432, term160432.getClass(), "options", null);
        setField(term160432, term160432.getClass(), "passes", null);
        setField(term160432, term160432.getClass(), "externs", null);
        setField(term160432, term160432.getClass(), "modules", null);
        setField(term160432, term160432.getClass(), "moduleGraph", null);
        setField(term160432, term160432.getClass(), "inputs", null);
        setField(term160432, term160432.getClass(), "errorManager", null);
        setField(term160432, term160432.getClass(), "warningsGuard", null);
        setField(term160432, term160432.getClass(), "externsRoot", null);
        setField(term160432, term160432.getClass(), "jsRoot", null);
        setField(term160432, term160432.getClass(), "externAndJsRoot", null);
        setField(term160432, term160432.getClass(), "inputsByName", null);
        setField(term160434, term160434.getClass(), "mappings", null);
        setField(term160434, term160434.getClass(), "lastMapping", null);
        setField(term160434, term160434.getClass(), "offsetPosition", null);
        setField(term160434, term160434.getClass(), "prefixPosition", null);
        setField(term160433, term160433.getClass(), "generator", term160434);
        setField(term160432, term160432.getClass(), "sourceMap", term160433);
        setField(term160432, term160432.getClass(), "externExports", null);
        setIntField(term160432, term160432.getClass(), "uniqueNameId", 0);
        setBooleanField(term160432, term160432.getClass(), "useThreads", false);
        setBooleanField(term160432, term160432.getClass(), "hasRegExpGlobalReferences", false);
        setField(term160432, term160432.getClass(), "functionInformationMap", null);
        setField(term160432, term160432.getClass(), "debugLog", null);
        setField(term160432, term160432.getClass(), "defaultCodingConvention", null);
        setField(term160432, term160432.getClass(), "typeRegistry", null);
        setField(term160432, term160432.getClass(), "parserConfig", null);
        setField(term160432, term160432.getClass(), "abstractInterpreter", null);
        setField(term160432, term160432.getClass(), "typeValidator", null);
        setField(term160432, term160432.getClass(), "tracker", null);
        setField(term160432, term160432.getClass(), "oldErrorReporter", null);
        setField(term160432, term160432.getClass(), "defaultErrorReporter", null);
        setField(term160432, term160432.getClass(), "outStream", null);
        setField(term160432, term160432.getClass(), "sanityCheck", null);
        setField(term160432, term160432.getClass(), "currentTracer", null);
        setField(term160432, term160432.getClass(), "currentPassName", null);
        setField(term160432, term160432.getClass(), "recentChange", null);
        setField(term160432, term160432.getClass(), "codeChangeHandlers", null);
        setField(term160432, term160432.getClass(), "stage", null);
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
        args[0] = term157636;
        args[1] = term157716;
        args[2] = null;
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                         \u0001                                                                                                                                                                                                                                                                              ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term157636, term160431));
        assertTrue(recursiveEquals(term157716, term160432));
    }

};


