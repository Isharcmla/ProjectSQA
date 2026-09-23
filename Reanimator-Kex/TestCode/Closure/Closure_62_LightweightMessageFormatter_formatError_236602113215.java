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
import java.util.HashMap;
import java.lang.String;

public class LightweightMessageFormatter_formatError_236602113215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184088;
     Object term184574;
     Object term185992;
     Object term185998;

    public LightweightMessageFormatter_formatError_236602113215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term184216 = new HashMap();
        Class<? extends Object> term186002 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term186001 = ((Class) term186002).getDeclaredField((String) "REGION");
        ((Field) term186001).setAccessible(true);
        Object enum219 = ((Field) term186001).get((Object) null);
        term184088 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term184168 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term184168, term184168.getClass(), "inputsByName", term184216);
        setField(term184088, term184088.getClass(), "source", term184168);
        setField(term184088, term184088.getClass(), "excerpt", enum219);
        term184574 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term184574, term184574.getClass(), "sourceName", "");
        setIntField(term184574, term184574.getClass(), "lineNumber", 1);
        Class<? extends Object> term186347 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term186346 = ((Class) term186347).getDeclaredField((String) "REGION");
        ((Field) term186346).setAccessible(true);
        Object enum220 = ((Field) term186346).get((Object) null);
        HashMap term185997 = new HashMap();
        term185992 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term185996 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term185992, term185992.getClass(), "excerpt", enum220);
        setField(term185996, term185996.getClass(), "options", null);
        setField(term185996, term185996.getClass(), "passes", null);
        setField(term185996, term185996.getClass(), "externs", null);
        setField(term185996, term185996.getClass(), "modules", null);
        setField(term185996, term185996.getClass(), "moduleGraph", null);
        setField(term185996, term185996.getClass(), "inputs", null);
        setField(term185996, term185996.getClass(), "errorManager", null);
        setField(term185996, term185996.getClass(), "warningsGuard", null);
        setField(term185996, term185996.getClass(), "externsRoot", null);
        setField(term185996, term185996.getClass(), "jsRoot", null);
        setField(term185996, term185996.getClass(), "externAndJsRoot", null);
        setField(term185996, term185996.getClass(), "inputsByName", term185997);
        setField(term185996, term185996.getClass(), "sourceMap", null);
        setField(term185996, term185996.getClass(), "externExports", null);
        setIntField(term185996, term185996.getClass(), "uniqueNameId", 0);
        setBooleanField(term185996, term185996.getClass(), "useThreads", false);
        setBooleanField(term185996, term185996.getClass(), "hasRegExpGlobalReferences", false);
        setField(term185996, term185996.getClass(), "functionInformationMap", null);
        setField(term185996, term185996.getClass(), "debugLog", null);
        setField(term185996, term185996.getClass(), "defaultCodingConvention", null);
        setField(term185996, term185996.getClass(), "typeRegistry", null);
        setField(term185996, term185996.getClass(), "parserConfig", null);
        setField(term185996, term185996.getClass(), "abstractInterpreter", null);
        setField(term185996, term185996.getClass(), "typeValidator", null);
        setField(term185996, term185996.getClass(), "tracker", null);
        setField(term185996, term185996.getClass(), "oldErrorReporter", null);
        setField(term185996, term185996.getClass(), "defaultErrorReporter", null);
        setField(term185996, term185996.getClass(), "outStream", null);
        setField(term185996, term185996.getClass(), "globalRefMap", null);
        setField(term185996, term185996.getClass(), "sanityCheck", null);
        setField(term185996, term185996.getClass(), "currentTracer", null);
        setField(term185996, term185996.getClass(), "currentPassName", null);
        setField(term185996, term185996.getClass(), "recentChange", null);
        setField(term185996, term185996.getClass(), "codeChangeHandlers", null);
        setField(term185996, term185996.getClass(), "stage", null);
        setField(term185992, term185992.getClass(), "source", term185996);
        setBooleanField(term185992, term185992.getClass(), "colorize", false);
        term185998 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term185998, term185998.getClass(), "type", null);
        setField(term185998, term185998.getClass(), "description", null);
        setField(term185998, term185998.getClass(), "sourceName", "");
        setField(term185998, term185998.getClass(), "node", null);
        setIntField(term185998, term185998.getClass(), "lineNumber", 1);
        setField(term185998, term185998.getClass(), "level", null);
        setIntField(term185998, term185998.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term184574;
        Object retValue = callMethod(klass, "formatError", argTypes, term184088, args);
        assertTrue(recursiveEquals(term184088, term185992));
        assertTrue(recursiveEquals(term184574, term185998));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


