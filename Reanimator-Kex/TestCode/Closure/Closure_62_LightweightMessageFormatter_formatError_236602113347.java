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

public class LightweightMessageFormatter_formatError_236602113347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296114;
     Object term296600;
     Object term297137;
     Object term297143;

    public LightweightMessageFormatter_formatError_236602113347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term296242 = new HashMap();
        Class<? extends Object> term297147 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term297146 = ((Class) term297147).getDeclaredField((String) "REGION");
        ((Field) term297146).setAccessible(true);
        Object enum354 = ((Field) term297146).get((Object) null);
        term296114 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term296194 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term296194, term296194.getClass(), "inputsByName", term296242);
        setField(term296114, term296114.getClass(), "source", term296194);
        setField(term296114, term296114.getClass(), "excerpt", enum354);
        term296600 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term296600, term296600.getClass(), "sourceName", "");
        setIntField(term296600, term296600.getClass(), "lineNumber", 1);
        Class<? extends Object> term297492 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term297491 = ((Class) term297492).getDeclaredField((String) "REGION");
        ((Field) term297491).setAccessible(true);
        Object enum355 = ((Field) term297491).get((Object) null);
        HashMap term297142 = new HashMap();
        term297137 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term297141 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term297137, term297137.getClass(), "excerpt", enum355);
        setField(term297141, term297141.getClass(), "options", null);
        setField(term297141, term297141.getClass(), "passes", null);
        setField(term297141, term297141.getClass(), "externs", null);
        setField(term297141, term297141.getClass(), "modules", null);
        setField(term297141, term297141.getClass(), "moduleGraph", null);
        setField(term297141, term297141.getClass(), "inputs", null);
        setField(term297141, term297141.getClass(), "errorManager", null);
        setField(term297141, term297141.getClass(), "warningsGuard", null);
        setField(term297141, term297141.getClass(), "externsRoot", null);
        setField(term297141, term297141.getClass(), "jsRoot", null);
        setField(term297141, term297141.getClass(), "externAndJsRoot", null);
        setField(term297141, term297141.getClass(), "inputsByName", term297142);
        setField(term297141, term297141.getClass(), "sourceMap", null);
        setField(term297141, term297141.getClass(), "externExports", null);
        setIntField(term297141, term297141.getClass(), "uniqueNameId", 0);
        setBooleanField(term297141, term297141.getClass(), "useThreads", false);
        setBooleanField(term297141, term297141.getClass(), "hasRegExpGlobalReferences", false);
        setField(term297141, term297141.getClass(), "functionInformationMap", null);
        setField(term297141, term297141.getClass(), "debugLog", null);
        setField(term297141, term297141.getClass(), "defaultCodingConvention", null);
        setField(term297141, term297141.getClass(), "typeRegistry", null);
        setField(term297141, term297141.getClass(), "parserConfig", null);
        setField(term297141, term297141.getClass(), "abstractInterpreter", null);
        setField(term297141, term297141.getClass(), "typeValidator", null);
        setField(term297141, term297141.getClass(), "tracker", null);
        setField(term297141, term297141.getClass(), "oldErrorReporter", null);
        setField(term297141, term297141.getClass(), "defaultErrorReporter", null);
        setField(term297141, term297141.getClass(), "outStream", null);
        setField(term297141, term297141.getClass(), "globalRefMap", null);
        setField(term297141, term297141.getClass(), "sanityCheck", null);
        setField(term297141, term297141.getClass(), "currentTracer", null);
        setField(term297141, term297141.getClass(), "currentPassName", null);
        setField(term297141, term297141.getClass(), "recentChange", null);
        setField(term297141, term297141.getClass(), "codeChangeHandlers", null);
        setField(term297141, term297141.getClass(), "stage", null);
        setField(term297137, term297137.getClass(), "source", term297141);
        setBooleanField(term297137, term297137.getClass(), "colorize", false);
        term297143 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term297143, term297143.getClass(), "type", null);
        setField(term297143, term297143.getClass(), "description", null);
        setField(term297143, term297143.getClass(), "sourceName", "");
        setField(term297143, term297143.getClass(), "node", null);
        setIntField(term297143, term297143.getClass(), "lineNumber", 1);
        setField(term297143, term297143.getClass(), "level", null);
        setIntField(term297143, term297143.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term296600;
        Object retValue = callMethod(klass, "formatError", argTypes, term296114, args);
        assertTrue(recursiveEquals(term296114, term297137));
        assertTrue(recursiveEquals(term296600, term297143));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


