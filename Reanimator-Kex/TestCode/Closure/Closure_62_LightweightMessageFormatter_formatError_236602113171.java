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

public class LightweightMessageFormatter_formatError_236602113171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138471;
     Object term138805;
     Object term139321;
     Object term139326;

    public LightweightMessageFormatter_formatError_236602113171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term139330 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term139329 = ((Class) term139330).getDeclaredField((String) "REGION");
        ((Field) term139329).setAccessible(true);
        Object enum156 = ((Field) term139329).get((Object) null);
        term138471 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term138551 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term138471, term138471.getClass(), "source", term138551);
        setField(term138471, term138471.getClass(), "excerpt", enum156);
        term138805 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term138805, term138805.getClass(), "sourceName", "");
        setIntField(term138805, term138805.getClass(), "lineNumber", -2113929216);
        Class<? extends Object> term139675 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term139674 = ((Class) term139675).getDeclaredField((String) "REGION");
        ((Field) term139674).setAccessible(true);
        Object enum157 = ((Field) term139674).get((Object) null);
        term139321 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term139325 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term139321, term139321.getClass(), "excerpt", enum157);
        setField(term139325, term139325.getClass(), "options", null);
        setField(term139325, term139325.getClass(), "passes", null);
        setField(term139325, term139325.getClass(), "externs", null);
        setField(term139325, term139325.getClass(), "modules", null);
        setField(term139325, term139325.getClass(), "moduleGraph", null);
        setField(term139325, term139325.getClass(), "inputs", null);
        setField(term139325, term139325.getClass(), "errorManager", null);
        setField(term139325, term139325.getClass(), "warningsGuard", null);
        setField(term139325, term139325.getClass(), "externsRoot", null);
        setField(term139325, term139325.getClass(), "jsRoot", null);
        setField(term139325, term139325.getClass(), "externAndJsRoot", null);
        setField(term139325, term139325.getClass(), "inputsByName", null);
        setField(term139325, term139325.getClass(), "sourceMap", null);
        setField(term139325, term139325.getClass(), "externExports", null);
        setIntField(term139325, term139325.getClass(), "uniqueNameId", 0);
        setBooleanField(term139325, term139325.getClass(), "useThreads", false);
        setBooleanField(term139325, term139325.getClass(), "hasRegExpGlobalReferences", false);
        setField(term139325, term139325.getClass(), "functionInformationMap", null);
        setField(term139325, term139325.getClass(), "debugLog", null);
        setField(term139325, term139325.getClass(), "defaultCodingConvention", null);
        setField(term139325, term139325.getClass(), "typeRegistry", null);
        setField(term139325, term139325.getClass(), "parserConfig", null);
        setField(term139325, term139325.getClass(), "abstractInterpreter", null);
        setField(term139325, term139325.getClass(), "typeValidator", null);
        setField(term139325, term139325.getClass(), "tracker", null);
        setField(term139325, term139325.getClass(), "oldErrorReporter", null);
        setField(term139325, term139325.getClass(), "defaultErrorReporter", null);
        setField(term139325, term139325.getClass(), "outStream", null);
        setField(term139325, term139325.getClass(), "globalRefMap", null);
        setField(term139325, term139325.getClass(), "sanityCheck", null);
        setField(term139325, term139325.getClass(), "currentTracer", null);
        setField(term139325, term139325.getClass(), "currentPassName", null);
        setField(term139325, term139325.getClass(), "recentChange", null);
        setField(term139325, term139325.getClass(), "codeChangeHandlers", null);
        setField(term139325, term139325.getClass(), "stage", null);
        setField(term139321, term139321.getClass(), "source", term139325);
        setBooleanField(term139321, term139321.getClass(), "colorize", false);
        term139326 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term139326, term139326.getClass(), "type", null);
        setField(term139326, term139326.getClass(), "description", null);
        setField(term139326, term139326.getClass(), "sourceName", "");
        setField(term139326, term139326.getClass(), "node", null);
        setIntField(term139326, term139326.getClass(), "lineNumber", -2113929216);
        setField(term139326, term139326.getClass(), "level", null);
        setIntField(term139326, term139326.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term138805;
        Object retValue = callMethod(klass, "formatError", argTypes, term138471, args);
        assertTrue(recursiveEquals(term138471, term139321));
        assertTrue(recursiveEquals(term138805, term139326));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


