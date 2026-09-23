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

public class LightweightMessageFormatter_format_413663799303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256785;
     Object term257119;
     Object term257573;
     Object term257578;

    public LightweightMessageFormatter_format_413663799303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term257580 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term257579 = ((Class) term257580).getDeclaredField((String) "REGION");
        ((Field) term257579).setAccessible(true);
        Object enum306 = ((Field) term257579).get((Object) null);
        term256785 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term256865 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term256785, term256785.getClass(), "source", term256865);
        setField(term256785, term256785.getClass(), "excerpt", enum306);
        term257119 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term257119, term257119.getClass(), "sourceName", null);
        setIntField(term257119, term257119.getClass(), "lineNumber", 0);
        Class<? extends Object> term257925 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term257924 = ((Class) term257925).getDeclaredField((String) "REGION");
        ((Field) term257924).setAccessible(true);
        Object enum307 = ((Field) term257924).get((Object) null);
        term257573 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term257577 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term257573, term257573.getClass(), "excerpt", enum307);
        setField(term257577, term257577.getClass(), "options", null);
        setField(term257577, term257577.getClass(), "passes", null);
        setField(term257577, term257577.getClass(), "externs", null);
        setField(term257577, term257577.getClass(), "modules", null);
        setField(term257577, term257577.getClass(), "moduleGraph", null);
        setField(term257577, term257577.getClass(), "inputs", null);
        setField(term257577, term257577.getClass(), "errorManager", null);
        setField(term257577, term257577.getClass(), "warningsGuard", null);
        setField(term257577, term257577.getClass(), "externsRoot", null);
        setField(term257577, term257577.getClass(), "jsRoot", null);
        setField(term257577, term257577.getClass(), "externAndJsRoot", null);
        setField(term257577, term257577.getClass(), "inputsByName", null);
        setField(term257577, term257577.getClass(), "sourceMap", null);
        setField(term257577, term257577.getClass(), "externExports", null);
        setIntField(term257577, term257577.getClass(), "uniqueNameId", 0);
        setBooleanField(term257577, term257577.getClass(), "useThreads", false);
        setBooleanField(term257577, term257577.getClass(), "hasRegExpGlobalReferences", false);
        setField(term257577, term257577.getClass(), "functionInformationMap", null);
        setField(term257577, term257577.getClass(), "debugLog", null);
        setField(term257577, term257577.getClass(), "defaultCodingConvention", null);
        setField(term257577, term257577.getClass(), "typeRegistry", null);
        setField(term257577, term257577.getClass(), "parserConfig", null);
        setField(term257577, term257577.getClass(), "abstractInterpreter", null);
        setField(term257577, term257577.getClass(), "typeValidator", null);
        setField(term257577, term257577.getClass(), "tracker", null);
        setField(term257577, term257577.getClass(), "oldErrorReporter", null);
        setField(term257577, term257577.getClass(), "defaultErrorReporter", null);
        setField(term257577, term257577.getClass(), "outStream", null);
        setField(term257577, term257577.getClass(), "globalRefMap", null);
        setField(term257577, term257577.getClass(), "sanityCheck", null);
        setField(term257577, term257577.getClass(), "currentTracer", null);
        setField(term257577, term257577.getClass(), "currentPassName", null);
        setField(term257577, term257577.getClass(), "recentChange", null);
        setField(term257577, term257577.getClass(), "codeChangeHandlers", null);
        setField(term257577, term257577.getClass(), "stage", null);
        setField(term257573, term257573.getClass(), "source", term257577);
        setBooleanField(term257573, term257573.getClass(), "colorize", false);
        term257578 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term257578, term257578.getClass(), "type", null);
        setField(term257578, term257578.getClass(), "description", null);
        setField(term257578, term257578.getClass(), "sourceName", null);
        setField(term257578, term257578.getClass(), "node", null);
        setIntField(term257578, term257578.getClass(), "lineNumber", 0);
        setField(term257578, term257578.getClass(), "level", null);
        setIntField(term257578, term257578.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term257119;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term256785, args);
        assertTrue(recursiveEquals(term256785, term257573));
        assertTrue(recursiveEquals(term257119, term257578));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


