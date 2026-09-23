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

public class LightweightMessageFormatter_format_413663799254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219691;
     Object term220025;
     Object term221895;
     Object term221900;

    public LightweightMessageFormatter_format_413663799254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221902 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term221901 = ((Class) term221902).getDeclaredField((String) "REGION");
        ((Field) term221901).setAccessible(true);
        Object enum262 = ((Field) term221901).get((Object) null);
        term219691 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term219771 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term219691, term219691.getClass(), "source", term219771);
        setField(term219691, term219691.getClass(), "excerpt", enum262);
        term220025 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term220025, term220025.getClass(), "sourceName", null);
        setIntField(term220025, term220025.getClass(), "lineNumber", 0);
        Class<? extends Object> term222247 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term222246 = ((Class) term222247).getDeclaredField((String) "REGION");
        ((Field) term222246).setAccessible(true);
        Object enum263 = ((Field) term222246).get((Object) null);
        term221895 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term221899 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term221895, term221895.getClass(), "excerpt", enum263);
        setField(term221899, term221899.getClass(), "options", null);
        setField(term221899, term221899.getClass(), "passes", null);
        setField(term221899, term221899.getClass(), "externs", null);
        setField(term221899, term221899.getClass(), "modules", null);
        setField(term221899, term221899.getClass(), "moduleGraph", null);
        setField(term221899, term221899.getClass(), "inputs", null);
        setField(term221899, term221899.getClass(), "errorManager", null);
        setField(term221899, term221899.getClass(), "warningsGuard", null);
        setField(term221899, term221899.getClass(), "externsRoot", null);
        setField(term221899, term221899.getClass(), "jsRoot", null);
        setField(term221899, term221899.getClass(), "externAndJsRoot", null);
        setField(term221899, term221899.getClass(), "inputsByName", null);
        setField(term221899, term221899.getClass(), "sourceMap", null);
        setField(term221899, term221899.getClass(), "externExports", null);
        setIntField(term221899, term221899.getClass(), "uniqueNameId", 0);
        setBooleanField(term221899, term221899.getClass(), "useThreads", false);
        setBooleanField(term221899, term221899.getClass(), "hasRegExpGlobalReferences", false);
        setField(term221899, term221899.getClass(), "functionInformationMap", null);
        setField(term221899, term221899.getClass(), "debugLog", null);
        setField(term221899, term221899.getClass(), "defaultCodingConvention", null);
        setField(term221899, term221899.getClass(), "typeRegistry", null);
        setField(term221899, term221899.getClass(), "parserConfig", null);
        setField(term221899, term221899.getClass(), "abstractInterpreter", null);
        setField(term221899, term221899.getClass(), "typeValidator", null);
        setField(term221899, term221899.getClass(), "tracker", null);
        setField(term221899, term221899.getClass(), "oldErrorReporter", null);
        setField(term221899, term221899.getClass(), "defaultErrorReporter", null);
        setField(term221899, term221899.getClass(), "outStream", null);
        setField(term221899, term221899.getClass(), "globalRefMap", null);
        setField(term221899, term221899.getClass(), "sanityCheck", null);
        setField(term221899, term221899.getClass(), "currentTracer", null);
        setField(term221899, term221899.getClass(), "currentPassName", null);
        setField(term221899, term221899.getClass(), "recentChange", null);
        setField(term221899, term221899.getClass(), "codeChangeHandlers", null);
        setField(term221899, term221899.getClass(), "stage", null);
        setField(term221895, term221895.getClass(), "source", term221899);
        setBooleanField(term221895, term221895.getClass(), "colorize", false);
        term221900 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term221900, term221900.getClass(), "type", null);
        setField(term221900, term221900.getClass(), "description", null);
        setField(term221900, term221900.getClass(), "sourceName", null);
        setField(term221900, term221900.getClass(), "node", null);
        setIntField(term221900, term221900.getClass(), "lineNumber", 0);
        setField(term221900, term221900.getClass(), "level", null);
        setIntField(term221900, term221900.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term220025;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term219691, args);
        assertTrue(recursiveEquals(term219691, term221895));
        assertTrue(recursiveEquals(term220025, term221900));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


