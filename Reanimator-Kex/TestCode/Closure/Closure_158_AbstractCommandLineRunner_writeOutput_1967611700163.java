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
import java.lang.StringBuffer;
import java.lang.Object;

public class AbstractCommandLineRunner_writeOutput_1967611700163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136882;
     Object term136962;
     Object term138674;
     Object term138676;

    public AbstractCommandLineRunner_writeOutput_1967611700163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136882 = new StringBuffer();
        term136962 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term137044 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term137152 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(term137044, term137044.getClass(), "generator", term137152);
        setField(term136962, term136962.getClass(), "sourceMap", term137044);
        term138674 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term138675 = (byte[]) newByteArray(16);
        setField(term138674, term138674.getClass(), "toStringCache", null);
        setByteElement(term138675, 0, (byte) 110);
        setByteElement(term138675, 1, (byte) 117);
        setByteElement(term138675, 2, (byte) 108);
        setByteElement(term138675, 3, (byte) 108);
        setByteElement(term138675, 4, (byte) 10);
        setField(term138674, term138674.getClass(), "value", term138675);
        setByteField(term138674, term138674.getClass(), "coder", (byte) 0);
        setIntField(term138674, term138674.getClass(), "count", 5);
        term138676 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term138677 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term138678 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(term138676, term138676.getClass(), "options", null);
        setField(term138676, term138676.getClass(), "passes", null);
        setField(term138676, term138676.getClass(), "externs", null);
        setField(term138676, term138676.getClass(), "modules", null);
        setField(term138676, term138676.getClass(), "moduleGraph", null);
        setField(term138676, term138676.getClass(), "inputs", null);
        setField(term138676, term138676.getClass(), "errorManager", null);
        setField(term138676, term138676.getClass(), "warningsGuard", null);
        setField(term138676, term138676.getClass(), "externsRoot", null);
        setField(term138676, term138676.getClass(), "jsRoot", null);
        setField(term138676, term138676.getClass(), "externAndJsRoot", null);
        setField(term138676, term138676.getClass(), "inputsByName", null);
        setField(term138678, term138678.getClass(), "mappings", null);
        setField(term138678, term138678.getClass(), "lastMapping", null);
        setField(term138678, term138678.getClass(), "offsetPosition", null);
        setField(term138678, term138678.getClass(), "prefixPosition", null);
        setField(term138677, term138677.getClass(), "generator", term138678);
        setField(term138676, term138676.getClass(), "sourceMap", term138677);
        setField(term138676, term138676.getClass(), "externExports", null);
        setIntField(term138676, term138676.getClass(), "uniqueNameId", 0);
        setBooleanField(term138676, term138676.getClass(), "useThreads", false);
        setBooleanField(term138676, term138676.getClass(), "hasRegExpGlobalReferences", false);
        setField(term138676, term138676.getClass(), "functionInformationMap", null);
        setField(term138676, term138676.getClass(), "debugLog", null);
        setField(term138676, term138676.getClass(), "defaultCodingConvention", null);
        setField(term138676, term138676.getClass(), "typeRegistry", null);
        setField(term138676, term138676.getClass(), "parserConfig", null);
        setField(term138676, term138676.getClass(), "abstractInterpreter", null);
        setField(term138676, term138676.getClass(), "typeValidator", null);
        setField(term138676, term138676.getClass(), "tracker", null);
        setField(term138676, term138676.getClass(), "oldErrorReporter", null);
        setField(term138676, term138676.getClass(), "defaultErrorReporter", null);
        setField(term138676, term138676.getClass(), "outStream", null);
        setField(term138676, term138676.getClass(), "sanityCheck", null);
        setField(term138676, term138676.getClass(), "currentTracer", null);
        setField(term138676, term138676.getClass(), "currentPassName", null);
        setField(term138676, term138676.getClass(), "recentChange", null);
        setField(term138676, term138676.getClass(), "codeChangeHandlers", null);
        setField(term138676, term138676.getClass(), "stage", null);
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
        args[0] = term136882;
        args[1] = term136962;
        args[2] = null;
        args[3] = "                                                                 ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term136882, term138674));
        assertTrue(recursiveEquals(term136962, term138676));
    }

};


