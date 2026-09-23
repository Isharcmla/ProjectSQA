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
import java.lang.String;

public class LightweightMessageFormatter_formatError_236602113167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132512;
     Object term132846;
     Object term134254;
     Object term134259;

    public LightweightMessageFormatter_formatError_236602113167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134261 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term134260 = ((Class) term134261).getDeclaredField((String) "REGION");
        ((Field) term134260).setAccessible(true);
        Object enum150 = ((Field) term134260).get((Object) null);
        term132512 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term132592 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term132512, term132512.getClass(), "source", term132592);
        setField(term132512, term132512.getClass(), "excerpt", enum150);
        term132846 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term132846, term132846.getClass(), "sourceName", null);
        setIntField(term132846, term132846.getClass(), "lineNumber", 0);
        Class<? extends Object> term134606 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term134605 = ((Class) term134606).getDeclaredField((String) "REGION");
        ((Field) term134605).setAccessible(true);
        Object enum151 = ((Field) term134605).get((Object) null);
        term134254 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term134258 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term134254, term134254.getClass(), "excerpt", enum151);
        setField(term134258, term134258.getClass(), "options", null);
        setField(term134258, term134258.getClass(), "passes", null);
        setField(term134258, term134258.getClass(), "externs", null);
        setField(term134258, term134258.getClass(), "modules", null);
        setField(term134258, term134258.getClass(), "moduleGraph", null);
        setField(term134258, term134258.getClass(), "inputs", null);
        setField(term134258, term134258.getClass(), "errorManager", null);
        setField(term134258, term134258.getClass(), "warningsGuard", null);
        setField(term134258, term134258.getClass(), "externsRoot", null);
        setField(term134258, term134258.getClass(), "jsRoot", null);
        setField(term134258, term134258.getClass(), "externAndJsRoot", null);
        setField(term134258, term134258.getClass(), "inputsByName", null);
        setField(term134258, term134258.getClass(), "sourceMap", null);
        setField(term134258, term134258.getClass(), "externExports", null);
        setIntField(term134258, term134258.getClass(), "uniqueNameId", 0);
        setBooleanField(term134258, term134258.getClass(), "useThreads", false);
        setBooleanField(term134258, term134258.getClass(), "hasRegExpGlobalReferences", false);
        setField(term134258, term134258.getClass(), "functionInformationMap", null);
        setField(term134258, term134258.getClass(), "debugLog", null);
        setField(term134258, term134258.getClass(), "defaultCodingConvention", null);
        setField(term134258, term134258.getClass(), "typeRegistry", null);
        setField(term134258, term134258.getClass(), "parserConfig", null);
        setField(term134258, term134258.getClass(), "abstractInterpreter", null);
        setField(term134258, term134258.getClass(), "typeValidator", null);
        setField(term134258, term134258.getClass(), "tracker", null);
        setField(term134258, term134258.getClass(), "oldErrorReporter", null);
        setField(term134258, term134258.getClass(), "defaultErrorReporter", null);
        setField(term134258, term134258.getClass(), "outStream", null);
        setField(term134258, term134258.getClass(), "globalRefMap", null);
        setField(term134258, term134258.getClass(), "sanityCheck", null);
        setField(term134258, term134258.getClass(), "currentTracer", null);
        setField(term134258, term134258.getClass(), "currentPassName", null);
        setField(term134258, term134258.getClass(), "recentChange", null);
        setField(term134258, term134258.getClass(), "codeChangeHandlers", null);
        setField(term134258, term134258.getClass(), "stage", null);
        setField(term134254, term134254.getClass(), "source", term134258);
        setBooleanField(term134254, term134254.getClass(), "colorize", false);
        term134259 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term134259, term134259.getClass(), "type", null);
        setField(term134259, term134259.getClass(), "description", null);
        setField(term134259, term134259.getClass(), "sourceName", null);
        setField(term134259, term134259.getClass(), "node", null);
        setIntField(term134259, term134259.getClass(), "lineNumber", 0);
        setField(term134259, term134259.getClass(), "level", null);
        setIntField(term134259, term134259.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term132846;
        Object retValue = callMethod(klass, "formatError", argTypes, term132512, args);
        assertTrue(recursiveEquals(term132512, term134254));
        assertTrue(recursiveEquals(term132846, term134259));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


