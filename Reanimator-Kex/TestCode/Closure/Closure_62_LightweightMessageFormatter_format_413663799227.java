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

public class LightweightMessageFormatter_format_413663799227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199252;
     Object term199738;
     Object term200209;
     Object term200215;

    public LightweightMessageFormatter_format_413663799227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term199380 = new HashMap();
        Class<? extends Object> term200217 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term200216 = ((Class) term200217).getDeclaredField((String) "REGION");
        ((Field) term200216).setAccessible(true);
        Object enum237 = ((Field) term200216).get((Object) null);
        term199252 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term199332 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term199332, term199332.getClass(), "inputsByName", term199380);
        setField(term199252, term199252.getClass(), "source", term199332);
        setField(term199252, term199252.getClass(), "excerpt", enum237);
        term199738 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term199738, term199738.getClass(), "sourceName", null);
        setIntField(term199738, term199738.getClass(), "lineNumber", 1);
        Class<? extends Object> term200562 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term200561 = ((Class) term200562).getDeclaredField((String) "REGION");
        ((Field) term200561).setAccessible(true);
        Object enum238 = ((Field) term200561).get((Object) null);
        HashMap term200214 = new HashMap();
        term200209 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term200213 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term200209, term200209.getClass(), "excerpt", enum238);
        setField(term200213, term200213.getClass(), "options", null);
        setField(term200213, term200213.getClass(), "passes", null);
        setField(term200213, term200213.getClass(), "externs", null);
        setField(term200213, term200213.getClass(), "modules", null);
        setField(term200213, term200213.getClass(), "moduleGraph", null);
        setField(term200213, term200213.getClass(), "inputs", null);
        setField(term200213, term200213.getClass(), "errorManager", null);
        setField(term200213, term200213.getClass(), "warningsGuard", null);
        setField(term200213, term200213.getClass(), "externsRoot", null);
        setField(term200213, term200213.getClass(), "jsRoot", null);
        setField(term200213, term200213.getClass(), "externAndJsRoot", null);
        setField(term200213, term200213.getClass(), "inputsByName", term200214);
        setField(term200213, term200213.getClass(), "sourceMap", null);
        setField(term200213, term200213.getClass(), "externExports", null);
        setIntField(term200213, term200213.getClass(), "uniqueNameId", 0);
        setBooleanField(term200213, term200213.getClass(), "useThreads", false);
        setBooleanField(term200213, term200213.getClass(), "hasRegExpGlobalReferences", false);
        setField(term200213, term200213.getClass(), "functionInformationMap", null);
        setField(term200213, term200213.getClass(), "debugLog", null);
        setField(term200213, term200213.getClass(), "defaultCodingConvention", null);
        setField(term200213, term200213.getClass(), "typeRegistry", null);
        setField(term200213, term200213.getClass(), "parserConfig", null);
        setField(term200213, term200213.getClass(), "abstractInterpreter", null);
        setField(term200213, term200213.getClass(), "typeValidator", null);
        setField(term200213, term200213.getClass(), "tracker", null);
        setField(term200213, term200213.getClass(), "oldErrorReporter", null);
        setField(term200213, term200213.getClass(), "defaultErrorReporter", null);
        setField(term200213, term200213.getClass(), "outStream", null);
        setField(term200213, term200213.getClass(), "globalRefMap", null);
        setField(term200213, term200213.getClass(), "sanityCheck", null);
        setField(term200213, term200213.getClass(), "currentTracer", null);
        setField(term200213, term200213.getClass(), "currentPassName", null);
        setField(term200213, term200213.getClass(), "recentChange", null);
        setField(term200213, term200213.getClass(), "codeChangeHandlers", null);
        setField(term200213, term200213.getClass(), "stage", null);
        setField(term200209, term200209.getClass(), "source", term200213);
        setBooleanField(term200209, term200209.getClass(), "colorize", false);
        term200215 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term200215, term200215.getClass(), "type", null);
        setField(term200215, term200215.getClass(), "description", null);
        setField(term200215, term200215.getClass(), "sourceName", null);
        setField(term200215, term200215.getClass(), "node", null);
        setIntField(term200215, term200215.getClass(), "lineNumber", 1);
        setField(term200215, term200215.getClass(), "level", null);
        setIntField(term200215, term200215.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term199738;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term199252, args);
        assertTrue(recursiveEquals(term199252, term200209));
        assertTrue(recursiveEquals(term199738, term200215));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


