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

public class LightweightMessageFormatter_formatError_236602113295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249546;
     Object term249880;
     Object term251209;
     Object term251214;

    public LightweightMessageFormatter_formatError_236602113295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term251216 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term251215 = ((Class) term251216).getDeclaredField((String) "REGION");
        ((Field) term251215).setAccessible(true);
        Object enum297 = ((Field) term251215).get((Object) null);
        term249546 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term249626 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term249546, term249546.getClass(), "source", term249626);
        setField(term249546, term249546.getClass(), "excerpt", enum297);
        term249880 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term249880, term249880.getClass(), "sourceName", null);
        setIntField(term249880, term249880.getClass(), "lineNumber", 0);
        Class<? extends Object> term251561 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term251560 = ((Class) term251561).getDeclaredField((String) "REGION");
        ((Field) term251560).setAccessible(true);
        Object enum298 = ((Field) term251560).get((Object) null);
        term251209 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term251213 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term251209, term251209.getClass(), "excerpt", enum298);
        setField(term251213, term251213.getClass(), "options", null);
        setField(term251213, term251213.getClass(), "passes", null);
        setField(term251213, term251213.getClass(), "externs", null);
        setField(term251213, term251213.getClass(), "modules", null);
        setField(term251213, term251213.getClass(), "moduleGraph", null);
        setField(term251213, term251213.getClass(), "inputs", null);
        setField(term251213, term251213.getClass(), "errorManager", null);
        setField(term251213, term251213.getClass(), "warningsGuard", null);
        setField(term251213, term251213.getClass(), "externsRoot", null);
        setField(term251213, term251213.getClass(), "jsRoot", null);
        setField(term251213, term251213.getClass(), "externAndJsRoot", null);
        setField(term251213, term251213.getClass(), "inputsByName", null);
        setField(term251213, term251213.getClass(), "sourceMap", null);
        setField(term251213, term251213.getClass(), "externExports", null);
        setIntField(term251213, term251213.getClass(), "uniqueNameId", 0);
        setBooleanField(term251213, term251213.getClass(), "useThreads", false);
        setBooleanField(term251213, term251213.getClass(), "hasRegExpGlobalReferences", false);
        setField(term251213, term251213.getClass(), "functionInformationMap", null);
        setField(term251213, term251213.getClass(), "debugLog", null);
        setField(term251213, term251213.getClass(), "defaultCodingConvention", null);
        setField(term251213, term251213.getClass(), "typeRegistry", null);
        setField(term251213, term251213.getClass(), "parserConfig", null);
        setField(term251213, term251213.getClass(), "abstractInterpreter", null);
        setField(term251213, term251213.getClass(), "typeValidator", null);
        setField(term251213, term251213.getClass(), "tracker", null);
        setField(term251213, term251213.getClass(), "oldErrorReporter", null);
        setField(term251213, term251213.getClass(), "defaultErrorReporter", null);
        setField(term251213, term251213.getClass(), "outStream", null);
        setField(term251213, term251213.getClass(), "globalRefMap", null);
        setField(term251213, term251213.getClass(), "sanityCheck", null);
        setField(term251213, term251213.getClass(), "currentTracer", null);
        setField(term251213, term251213.getClass(), "currentPassName", null);
        setField(term251213, term251213.getClass(), "recentChange", null);
        setField(term251213, term251213.getClass(), "codeChangeHandlers", null);
        setField(term251213, term251213.getClass(), "stage", null);
        setField(term251209, term251209.getClass(), "source", term251213);
        setBooleanField(term251209, term251209.getClass(), "colorize", false);
        term251214 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term251214, term251214.getClass(), "type", null);
        setField(term251214, term251214.getClass(), "description", null);
        setField(term251214, term251214.getClass(), "sourceName", null);
        setField(term251214, term251214.getClass(), "node", null);
        setIntField(term251214, term251214.getClass(), "lineNumber", 0);
        setField(term251214, term251214.getClass(), "level", null);
        setIntField(term251214, term251214.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term249880;
        Object retValue = callMethod(klass, "formatError", argTypes, term249546, args);
        assertTrue(recursiveEquals(term249546, term251209));
        assertTrue(recursiveEquals(term249880, term251214));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


