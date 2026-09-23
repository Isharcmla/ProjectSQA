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

public class LightweightMessageFormatter_formatError_236602113317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267773;
     Object term268107;
     Object term268690;
     Object term268695;

    public LightweightMessageFormatter_formatError_236602113317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term268697 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term268696 = ((Class) term268697).getDeclaredField((String) "REGION");
        ((Field) term268696).setAccessible(true);
        Object enum321 = ((Field) term268696).get((Object) null);
        term267773 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term267853 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term267773, term267773.getClass(), "source", term267853);
        setField(term267773, term267773.getClass(), "excerpt", enum321);
        term268107 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term268107, term268107.getClass(), "sourceName", null);
        setIntField(term268107, term268107.getClass(), "lineNumber", 0);
        Class<? extends Object> term269042 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term269041 = ((Class) term269042).getDeclaredField((String) "REGION");
        ((Field) term269041).setAccessible(true);
        Object enum322 = ((Field) term269041).get((Object) null);
        term268690 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term268694 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term268690, term268690.getClass(), "excerpt", enum322);
        setField(term268694, term268694.getClass(), "options", null);
        setField(term268694, term268694.getClass(), "passes", null);
        setField(term268694, term268694.getClass(), "externs", null);
        setField(term268694, term268694.getClass(), "modules", null);
        setField(term268694, term268694.getClass(), "moduleGraph", null);
        setField(term268694, term268694.getClass(), "inputs", null);
        setField(term268694, term268694.getClass(), "errorManager", null);
        setField(term268694, term268694.getClass(), "warningsGuard", null);
        setField(term268694, term268694.getClass(), "externsRoot", null);
        setField(term268694, term268694.getClass(), "jsRoot", null);
        setField(term268694, term268694.getClass(), "externAndJsRoot", null);
        setField(term268694, term268694.getClass(), "inputsByName", null);
        setField(term268694, term268694.getClass(), "sourceMap", null);
        setField(term268694, term268694.getClass(), "externExports", null);
        setIntField(term268694, term268694.getClass(), "uniqueNameId", 0);
        setBooleanField(term268694, term268694.getClass(), "useThreads", false);
        setBooleanField(term268694, term268694.getClass(), "hasRegExpGlobalReferences", false);
        setField(term268694, term268694.getClass(), "functionInformationMap", null);
        setField(term268694, term268694.getClass(), "debugLog", null);
        setField(term268694, term268694.getClass(), "defaultCodingConvention", null);
        setField(term268694, term268694.getClass(), "typeRegistry", null);
        setField(term268694, term268694.getClass(), "parserConfig", null);
        setField(term268694, term268694.getClass(), "abstractInterpreter", null);
        setField(term268694, term268694.getClass(), "typeValidator", null);
        setField(term268694, term268694.getClass(), "tracker", null);
        setField(term268694, term268694.getClass(), "oldErrorReporter", null);
        setField(term268694, term268694.getClass(), "defaultErrorReporter", null);
        setField(term268694, term268694.getClass(), "outStream", null);
        setField(term268694, term268694.getClass(), "globalRefMap", null);
        setField(term268694, term268694.getClass(), "sanityCheck", null);
        setField(term268694, term268694.getClass(), "currentTracer", null);
        setField(term268694, term268694.getClass(), "currentPassName", null);
        setField(term268694, term268694.getClass(), "recentChange", null);
        setField(term268694, term268694.getClass(), "codeChangeHandlers", null);
        setField(term268694, term268694.getClass(), "stage", null);
        setField(term268690, term268690.getClass(), "source", term268694);
        setBooleanField(term268690, term268690.getClass(), "colorize", false);
        term268695 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term268695, term268695.getClass(), "type", null);
        setField(term268695, term268695.getClass(), "description", null);
        setField(term268695, term268695.getClass(), "sourceName", null);
        setField(term268695, term268695.getClass(), "node", null);
        setIntField(term268695, term268695.getClass(), "lineNumber", 0);
        setField(term268695, term268695.getClass(), "level", null);
        setIntField(term268695, term268695.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term268107;
        Object retValue = callMethod(klass, "formatError", argTypes, term267773, args);
        assertTrue(recursiveEquals(term267773, term268690));
        assertTrue(recursiveEquals(term268107, term268695));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


