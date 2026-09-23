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

public class LightweightMessageFormatter_formatError_236602113273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237254;
     Object term237588;
     Object term238202;
     Object term238207;

    public LightweightMessageFormatter_formatError_236602113273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term238209 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term238208 = ((Class) term238209).getDeclaredField((String) "REGION");
        ((Field) term238208).setAccessible(true);
        Object enum285 = ((Field) term238208).get((Object) null);
        term237254 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term237334 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term237254, term237254.getClass(), "source", term237334);
        setField(term237254, term237254.getClass(), "excerpt", enum285);
        term237588 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term237588, term237588.getClass(), "sourceName", null);
        setIntField(term237588, term237588.getClass(), "lineNumber", 0);
        Class<? extends Object> term238554 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term238553 = ((Class) term238554).getDeclaredField((String) "REGION");
        ((Field) term238553).setAccessible(true);
        Object enum286 = ((Field) term238553).get((Object) null);
        term238202 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term238206 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term238202, term238202.getClass(), "excerpt", enum286);
        setField(term238206, term238206.getClass(), "options", null);
        setField(term238206, term238206.getClass(), "passes", null);
        setField(term238206, term238206.getClass(), "externs", null);
        setField(term238206, term238206.getClass(), "modules", null);
        setField(term238206, term238206.getClass(), "moduleGraph", null);
        setField(term238206, term238206.getClass(), "inputs", null);
        setField(term238206, term238206.getClass(), "errorManager", null);
        setField(term238206, term238206.getClass(), "warningsGuard", null);
        setField(term238206, term238206.getClass(), "externsRoot", null);
        setField(term238206, term238206.getClass(), "jsRoot", null);
        setField(term238206, term238206.getClass(), "externAndJsRoot", null);
        setField(term238206, term238206.getClass(), "inputsByName", null);
        setField(term238206, term238206.getClass(), "sourceMap", null);
        setField(term238206, term238206.getClass(), "externExports", null);
        setIntField(term238206, term238206.getClass(), "uniqueNameId", 0);
        setBooleanField(term238206, term238206.getClass(), "useThreads", false);
        setBooleanField(term238206, term238206.getClass(), "hasRegExpGlobalReferences", false);
        setField(term238206, term238206.getClass(), "functionInformationMap", null);
        setField(term238206, term238206.getClass(), "debugLog", null);
        setField(term238206, term238206.getClass(), "defaultCodingConvention", null);
        setField(term238206, term238206.getClass(), "typeRegistry", null);
        setField(term238206, term238206.getClass(), "parserConfig", null);
        setField(term238206, term238206.getClass(), "abstractInterpreter", null);
        setField(term238206, term238206.getClass(), "typeValidator", null);
        setField(term238206, term238206.getClass(), "tracker", null);
        setField(term238206, term238206.getClass(), "oldErrorReporter", null);
        setField(term238206, term238206.getClass(), "defaultErrorReporter", null);
        setField(term238206, term238206.getClass(), "outStream", null);
        setField(term238206, term238206.getClass(), "globalRefMap", null);
        setField(term238206, term238206.getClass(), "sanityCheck", null);
        setField(term238206, term238206.getClass(), "currentTracer", null);
        setField(term238206, term238206.getClass(), "currentPassName", null);
        setField(term238206, term238206.getClass(), "recentChange", null);
        setField(term238206, term238206.getClass(), "codeChangeHandlers", null);
        setField(term238206, term238206.getClass(), "stage", null);
        setField(term238202, term238202.getClass(), "source", term238206);
        setBooleanField(term238202, term238202.getClass(), "colorize", false);
        term238207 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term238207, term238207.getClass(), "type", null);
        setField(term238207, term238207.getClass(), "description", null);
        setField(term238207, term238207.getClass(), "sourceName", null);
        setField(term238207, term238207.getClass(), "node", null);
        setIntField(term238207, term238207.getClass(), "lineNumber", 0);
        setField(term238207, term238207.getClass(), "level", null);
        setIntField(term238207, term238207.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term237588;
        Object retValue = callMethod(klass, "formatError", argTypes, term237254, args);
        assertTrue(recursiveEquals(term237254, term238202));
        assertTrue(recursiveEquals(term237588, term238207));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


