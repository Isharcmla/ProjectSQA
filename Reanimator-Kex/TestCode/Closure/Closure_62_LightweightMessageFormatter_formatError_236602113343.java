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

public class LightweightMessageFormatter_formatError_236602113343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291765;
     Object term292251;
     Object term292737;
     Object term292743;

    public LightweightMessageFormatter_formatError_236602113343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term291893 = new HashMap();
        Class<? extends Object> term292745 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term292744 = ((Class) term292745).getDeclaredField((String) "REGION");
        ((Field) term292744).setAccessible(true);
        Object enum348 = ((Field) term292744).get((Object) null);
        term291765 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term291845 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term291845, term291845.getClass(), "inputsByName", term291893);
        setField(term291765, term291765.getClass(), "source", term291845);
        setField(term291765, term291765.getClass(), "excerpt", enum348);
        term292251 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term292251, term292251.getClass(), "sourceName", null);
        setIntField(term292251, term292251.getClass(), "lineNumber", 1);
        Class<? extends Object> term293090 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term293089 = ((Class) term293090).getDeclaredField((String) "REGION");
        ((Field) term293089).setAccessible(true);
        Object enum349 = ((Field) term293089).get((Object) null);
        HashMap term292742 = new HashMap();
        term292737 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term292741 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term292737, term292737.getClass(), "excerpt", enum349);
        setField(term292741, term292741.getClass(), "options", null);
        setField(term292741, term292741.getClass(), "passes", null);
        setField(term292741, term292741.getClass(), "externs", null);
        setField(term292741, term292741.getClass(), "modules", null);
        setField(term292741, term292741.getClass(), "moduleGraph", null);
        setField(term292741, term292741.getClass(), "inputs", null);
        setField(term292741, term292741.getClass(), "errorManager", null);
        setField(term292741, term292741.getClass(), "warningsGuard", null);
        setField(term292741, term292741.getClass(), "externsRoot", null);
        setField(term292741, term292741.getClass(), "jsRoot", null);
        setField(term292741, term292741.getClass(), "externAndJsRoot", null);
        setField(term292741, term292741.getClass(), "inputsByName", term292742);
        setField(term292741, term292741.getClass(), "sourceMap", null);
        setField(term292741, term292741.getClass(), "externExports", null);
        setIntField(term292741, term292741.getClass(), "uniqueNameId", 0);
        setBooleanField(term292741, term292741.getClass(), "useThreads", false);
        setBooleanField(term292741, term292741.getClass(), "hasRegExpGlobalReferences", false);
        setField(term292741, term292741.getClass(), "functionInformationMap", null);
        setField(term292741, term292741.getClass(), "debugLog", null);
        setField(term292741, term292741.getClass(), "defaultCodingConvention", null);
        setField(term292741, term292741.getClass(), "typeRegistry", null);
        setField(term292741, term292741.getClass(), "parserConfig", null);
        setField(term292741, term292741.getClass(), "abstractInterpreter", null);
        setField(term292741, term292741.getClass(), "typeValidator", null);
        setField(term292741, term292741.getClass(), "tracker", null);
        setField(term292741, term292741.getClass(), "oldErrorReporter", null);
        setField(term292741, term292741.getClass(), "defaultErrorReporter", null);
        setField(term292741, term292741.getClass(), "outStream", null);
        setField(term292741, term292741.getClass(), "globalRefMap", null);
        setField(term292741, term292741.getClass(), "sanityCheck", null);
        setField(term292741, term292741.getClass(), "currentTracer", null);
        setField(term292741, term292741.getClass(), "currentPassName", null);
        setField(term292741, term292741.getClass(), "recentChange", null);
        setField(term292741, term292741.getClass(), "codeChangeHandlers", null);
        setField(term292741, term292741.getClass(), "stage", null);
        setField(term292737, term292737.getClass(), "source", term292741);
        setBooleanField(term292737, term292737.getClass(), "colorize", false);
        term292743 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term292743, term292743.getClass(), "type", null);
        setField(term292743, term292743.getClass(), "description", null);
        setField(term292743, term292743.getClass(), "sourceName", null);
        setField(term292743, term292743.getClass(), "node", null);
        setIntField(term292743, term292743.getClass(), "lineNumber", 1);
        setField(term292743, term292743.getClass(), "level", null);
        setIntField(term292743, term292743.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term292251;
        Object retValue = callMethod(klass, "formatError", argTypes, term291765, args);
        assertTrue(recursiveEquals(term291765, term292737));
        assertTrue(recursiveEquals(term292251, term292743));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


