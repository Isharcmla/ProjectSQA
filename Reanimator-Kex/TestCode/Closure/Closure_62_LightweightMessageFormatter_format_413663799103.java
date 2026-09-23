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

public class LightweightMessageFormatter_format_413663799103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70142;
     Object term70476;
     Object term71203;
     Object term71208;

    public LightweightMessageFormatter_format_413663799103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71212 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term71211 = ((Class) term71212).getDeclaredField((String) "REGION");
        ((Field) term71211).setAccessible(true);
        Object enum84 = ((Field) term71211).get((Object) null);
        term70142 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term70222 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70142, term70142.getClass(), "source", term70222);
        setField(term70142, term70142.getClass(), "excerpt", enum84);
        setBooleanField(term70142, term70142.getClass(), "colorize", true);
        term70476 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term70476, term70476.getClass(), "sourceName", "");
        setIntField(term70476, term70476.getClass(), "lineNumber", -2147483646);
        Class<? extends Object> term71557 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term71556 = ((Class) term71557).getDeclaredField((String) "REGION");
        ((Field) term71556).setAccessible(true);
        Object enum85 = ((Field) term71556).get((Object) null);
        term71203 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term71207 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71203, term71203.getClass(), "excerpt", enum85);
        setField(term71207, term71207.getClass(), "options", null);
        setField(term71207, term71207.getClass(), "passes", null);
        setField(term71207, term71207.getClass(), "externs", null);
        setField(term71207, term71207.getClass(), "modules", null);
        setField(term71207, term71207.getClass(), "moduleGraph", null);
        setField(term71207, term71207.getClass(), "inputs", null);
        setField(term71207, term71207.getClass(), "errorManager", null);
        setField(term71207, term71207.getClass(), "warningsGuard", null);
        setField(term71207, term71207.getClass(), "externsRoot", null);
        setField(term71207, term71207.getClass(), "jsRoot", null);
        setField(term71207, term71207.getClass(), "externAndJsRoot", null);
        setField(term71207, term71207.getClass(), "inputsByName", null);
        setField(term71207, term71207.getClass(), "sourceMap", null);
        setField(term71207, term71207.getClass(), "externExports", null);
        setIntField(term71207, term71207.getClass(), "uniqueNameId", 0);
        setBooleanField(term71207, term71207.getClass(), "useThreads", false);
        setBooleanField(term71207, term71207.getClass(), "hasRegExpGlobalReferences", false);
        setField(term71207, term71207.getClass(), "functionInformationMap", null);
        setField(term71207, term71207.getClass(), "debugLog", null);
        setField(term71207, term71207.getClass(), "defaultCodingConvention", null);
        setField(term71207, term71207.getClass(), "typeRegistry", null);
        setField(term71207, term71207.getClass(), "parserConfig", null);
        setField(term71207, term71207.getClass(), "abstractInterpreter", null);
        setField(term71207, term71207.getClass(), "typeValidator", null);
        setField(term71207, term71207.getClass(), "tracker", null);
        setField(term71207, term71207.getClass(), "oldErrorReporter", null);
        setField(term71207, term71207.getClass(), "defaultErrorReporter", null);
        setField(term71207, term71207.getClass(), "outStream", null);
        setField(term71207, term71207.getClass(), "globalRefMap", null);
        setField(term71207, term71207.getClass(), "sanityCheck", null);
        setField(term71207, term71207.getClass(), "currentTracer", null);
        setField(term71207, term71207.getClass(), "currentPassName", null);
        setField(term71207, term71207.getClass(), "recentChange", null);
        setField(term71207, term71207.getClass(), "codeChangeHandlers", null);
        setField(term71207, term71207.getClass(), "stage", null);
        setField(term71203, term71203.getClass(), "source", term71207);
        setBooleanField(term71203, term71203.getClass(), "colorize", true);
        term71208 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term71208, term71208.getClass(), "type", null);
        setField(term71208, term71208.getClass(), "description", null);
        setField(term71208, term71208.getClass(), "sourceName", "");
        setField(term71208, term71208.getClass(), "node", null);
        setIntField(term71208, term71208.getClass(), "lineNumber", -2147483646);
        setField(term71208, term71208.getClass(), "level", null);
        setIntField(term71208, term71208.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term70476;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term70142, args);
        assertTrue(recursiveEquals(term70142, term71203));
        assertTrue(recursiveEquals(term70476, term71208));
        assertTrue(recursiveEquals(retValue, ": \u001B[31mERROR\u001B[39m - null\n"));
    }

};


