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
import java.lang.StringBuilder;
import java.lang.Object;

public class AbstractCommandLineRunner_writeOutput_1967611700166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139961;
     Object term140041;
     Object term143722;
     Object term143724;

    public AbstractCommandLineRunner_writeOutput_1967611700166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139961 = new StringBuilder();
        term140041 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term140123 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term140231 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(term140123, term140123.getClass(), "generator", term140231);
        setField(term140041, term140041.getClass(), "sourceMap", term140123);
        term143722 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term143723 = (byte[]) newByteArray(16);
        setByteElement(term143723, 0, (byte) 110);
        setByteElement(term143723, 1, (byte) 117);
        setByteElement(term143723, 2, (byte) 108);
        setByteElement(term143723, 3, (byte) 108);
        setByteElement(term143723, 4, (byte) 10);
        setField(term143722, term143722.getClass(), "value", term143723);
        setByteField(term143722, term143722.getClass(), "coder", (byte) 0);
        setIntField(term143722, term143722.getClass(), "count", 5);
        term143724 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term143725 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term143726 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(term143724, term143724.getClass(), "options", null);
        setField(term143724, term143724.getClass(), "passes", null);
        setField(term143724, term143724.getClass(), "externs", null);
        setField(term143724, term143724.getClass(), "modules", null);
        setField(term143724, term143724.getClass(), "moduleGraph", null);
        setField(term143724, term143724.getClass(), "inputs", null);
        setField(term143724, term143724.getClass(), "errorManager", null);
        setField(term143724, term143724.getClass(), "warningsGuard", null);
        setField(term143724, term143724.getClass(), "externsRoot", null);
        setField(term143724, term143724.getClass(), "jsRoot", null);
        setField(term143724, term143724.getClass(), "externAndJsRoot", null);
        setField(term143724, term143724.getClass(), "inputsByName", null);
        setField(term143726, term143726.getClass(), "mappings", null);
        setField(term143726, term143726.getClass(), "lastMapping", null);
        setField(term143726, term143726.getClass(), "offsetPosition", null);
        setField(term143726, term143726.getClass(), "prefixPosition", null);
        setField(term143725, term143725.getClass(), "generator", term143726);
        setField(term143724, term143724.getClass(), "sourceMap", term143725);
        setField(term143724, term143724.getClass(), "externExports", null);
        setIntField(term143724, term143724.getClass(), "uniqueNameId", 0);
        setBooleanField(term143724, term143724.getClass(), "useThreads", false);
        setBooleanField(term143724, term143724.getClass(), "hasRegExpGlobalReferences", false);
        setField(term143724, term143724.getClass(), "functionInformationMap", null);
        setField(term143724, term143724.getClass(), "debugLog", null);
        setField(term143724, term143724.getClass(), "defaultCodingConvention", null);
        setField(term143724, term143724.getClass(), "typeRegistry", null);
        setField(term143724, term143724.getClass(), "parserConfig", null);
        setField(term143724, term143724.getClass(), "abstractInterpreter", null);
        setField(term143724, term143724.getClass(), "typeValidator", null);
        setField(term143724, term143724.getClass(), "tracker", null);
        setField(term143724, term143724.getClass(), "oldErrorReporter", null);
        setField(term143724, term143724.getClass(), "defaultErrorReporter", null);
        setField(term143724, term143724.getClass(), "outStream", null);
        setField(term143724, term143724.getClass(), "sanityCheck", null);
        setField(term143724, term143724.getClass(), "currentTracer", null);
        setField(term143724, term143724.getClass(), "currentPassName", null);
        setField(term143724, term143724.getClass(), "recentChange", null);
        setField(term143724, term143724.getClass(), "codeChangeHandlers", null);
        setField(term143724, term143724.getClass(), "stage", null);
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
        args[0] = term139961;
        args[1] = term140041;
        args[2] = null;
        args[3] = "                                                                 ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term139961, term143722));
        assertTrue(recursiveEquals(term140041, term143724));
    }

};


