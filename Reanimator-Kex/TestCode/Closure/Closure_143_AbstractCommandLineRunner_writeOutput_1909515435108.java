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

public class AbstractCommandLineRunner_writeOutput_1909515435108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171475;
     Object term171555;
     Object term175772;
     Object term175773;

    public AbstractCommandLineRunner_writeOutput_1909515435108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171475 = newInstance(Class.forName("java.io.PrintStream"));
        term171555 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term171637 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term171555, term171555.getClass(), "sourceMap", term171637);
        term175772 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term175772, term175772.getClass(), "autoFlush", false);
        setBooleanField(term175772, term175772.getClass(), "trouble", true);
        setField(term175772, term175772.getClass(), "formatter", null);
        setField(term175772, term175772.getClass(), "textOut", null);
        setField(term175772, term175772.getClass(), "charOut", null);
        setBooleanField(term175772, term175772.getClass(), "closing", false);
        setField(term175772, term175772.getClass(), "out", null);
        setBooleanField(term175772, term175772.getClass(), "closed", false);
        setField(term175772, term175772.getClass(), "closeLock", null);
        term175773 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term175774 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term175773, term175773.getClass(), "options", null);
        setField(term175773, term175773.getClass(), "passes", null);
        setField(term175773, term175773.getClass(), "externs", null);
        setField(term175773, term175773.getClass(), "modules", null);
        setField(term175773, term175773.getClass(), "moduleGraph", null);
        setField(term175773, term175773.getClass(), "inputs", null);
        setField(term175773, term175773.getClass(), "errorManager", null);
        setField(term175773, term175773.getClass(), "symbolTable", null);
        setField(term175773, term175773.getClass(), "externsRoot", null);
        setField(term175773, term175773.getClass(), "jsRoot", null);
        setField(term175773, term175773.getClass(), "externAndJsRoot", null);
        setField(term175773, term175773.getClass(), "inputsByName", null);
        setField(term175774, term175774.getClass(), "mappings", null);
        setField(term175774, term175774.getClass(), "offsetPosition", null);
        setField(term175774, term175774.getClass(), "prefixPosition", null);
        setField(term175773, term175773.getClass(), "sourceMap", term175774);
        setField(term175773, term175773.getClass(), "externExports", null);
        setIntField(term175773, term175773.getClass(), "uniqueNameId", 0);
        setBooleanField(term175773, term175773.getClass(), "normalized", false);
        setBooleanField(term175773, term175773.getClass(), "useThreads", false);
        setField(term175773, term175773.getClass(), "functionInformationMap", null);
        setField(term175773, term175773.getClass(), "debugLog", null);
        setField(term175773, term175773.getClass(), "defaultCodingConvention", null);
        setField(term175773, term175773.getClass(), "typeRegistry", null);
        setField(term175773, term175773.getClass(), "parserConfig", null);
        setField(term175773, term175773.getClass(), "abstractInterpreter", null);
        setField(term175773, term175773.getClass(), "typeValidator", null);
        setField(term175773, term175773.getClass(), "tracker", null);
        setField(term175773, term175773.getClass(), "oldErrorReporter", null);
        setField(term175773, term175773.getClass(), "defaultErrorReporter", null);
        setField(term175773, term175773.getClass(), "outStream", null);
        setField(term175773, term175773.getClass(), "sanityCheck", null);
        setField(term175773, term175773.getClass(), "currentTracer", null);
        setField(term175773, term175773.getClass(), "currentPassName", null);
        setField(term175773, term175773.getClass(), "recentChange", null);
        setField(term175773, term175773.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.io.PrintStream");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term171475;
        args[1] = term171555;
        args[2] = null;
        args[3] = "                                         ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term171475, term175772));
        assertTrue(recursiveEquals(term171555, term175773));
    }

};


