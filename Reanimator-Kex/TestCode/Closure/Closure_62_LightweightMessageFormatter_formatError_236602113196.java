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

public class LightweightMessageFormatter_formatError_236602113196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162379;
     Object term162713;
     Object term164217;
     Object term164222;

    public LightweightMessageFormatter_formatError_236602113196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term164224 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term164223 = ((Class) term164224).getDeclaredField((String) "REGION");
        ((Field) term164223).setAccessible(true);
        Object enum190 = ((Field) term164223).get((Object) null);
        term162379 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term162459 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term162379, term162379.getClass(), "source", term162459);
        setField(term162379, term162379.getClass(), "excerpt", enum190);
        term162713 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term162713, term162713.getClass(), "sourceName", null);
        setIntField(term162713, term162713.getClass(), "lineNumber", 0);
        Class<? extends Object> term164569 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term164568 = ((Class) term164569).getDeclaredField((String) "REGION");
        ((Field) term164568).setAccessible(true);
        Object enum191 = ((Field) term164568).get((Object) null);
        term164217 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term164221 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term164217, term164217.getClass(), "excerpt", enum191);
        setField(term164221, term164221.getClass(), "options", null);
        setField(term164221, term164221.getClass(), "passes", null);
        setField(term164221, term164221.getClass(), "externs", null);
        setField(term164221, term164221.getClass(), "modules", null);
        setField(term164221, term164221.getClass(), "moduleGraph", null);
        setField(term164221, term164221.getClass(), "inputs", null);
        setField(term164221, term164221.getClass(), "errorManager", null);
        setField(term164221, term164221.getClass(), "warningsGuard", null);
        setField(term164221, term164221.getClass(), "externsRoot", null);
        setField(term164221, term164221.getClass(), "jsRoot", null);
        setField(term164221, term164221.getClass(), "externAndJsRoot", null);
        setField(term164221, term164221.getClass(), "inputsByName", null);
        setField(term164221, term164221.getClass(), "sourceMap", null);
        setField(term164221, term164221.getClass(), "externExports", null);
        setIntField(term164221, term164221.getClass(), "uniqueNameId", 0);
        setBooleanField(term164221, term164221.getClass(), "useThreads", false);
        setBooleanField(term164221, term164221.getClass(), "hasRegExpGlobalReferences", false);
        setField(term164221, term164221.getClass(), "functionInformationMap", null);
        setField(term164221, term164221.getClass(), "debugLog", null);
        setField(term164221, term164221.getClass(), "defaultCodingConvention", null);
        setField(term164221, term164221.getClass(), "typeRegistry", null);
        setField(term164221, term164221.getClass(), "parserConfig", null);
        setField(term164221, term164221.getClass(), "abstractInterpreter", null);
        setField(term164221, term164221.getClass(), "typeValidator", null);
        setField(term164221, term164221.getClass(), "tracker", null);
        setField(term164221, term164221.getClass(), "oldErrorReporter", null);
        setField(term164221, term164221.getClass(), "defaultErrorReporter", null);
        setField(term164221, term164221.getClass(), "outStream", null);
        setField(term164221, term164221.getClass(), "globalRefMap", null);
        setField(term164221, term164221.getClass(), "sanityCheck", null);
        setField(term164221, term164221.getClass(), "currentTracer", null);
        setField(term164221, term164221.getClass(), "currentPassName", null);
        setField(term164221, term164221.getClass(), "recentChange", null);
        setField(term164221, term164221.getClass(), "codeChangeHandlers", null);
        setField(term164221, term164221.getClass(), "stage", null);
        setField(term164217, term164217.getClass(), "source", term164221);
        setBooleanField(term164217, term164217.getClass(), "colorize", false);
        term164222 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term164222, term164222.getClass(), "type", null);
        setField(term164222, term164222.getClass(), "description", null);
        setField(term164222, term164222.getClass(), "sourceName", null);
        setField(term164222, term164222.getClass(), "node", null);
        setIntField(term164222, term164222.getClass(), "lineNumber", 0);
        setField(term164222, term164222.getClass(), "level", null);
        setIntField(term164222, term164222.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term162713;
        Object retValue = callMethod(klass, "formatError", argTypes, term162379, args);
        assertTrue(recursiveEquals(term162379, term164217));
        assertTrue(recursiveEquals(term162713, term164222));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


