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

public class LightweightMessageFormatter_formatWarning_2030513493112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78061;
     Object term78395;
     Object term80215;
     Object term80220;

    public LightweightMessageFormatter_formatWarning_2030513493112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80222 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term80221 = ((Class) term80222).getDeclaredField((String) "REGION");
        ((Field) term80221).setAccessible(true);
        Object enum93 = ((Field) term80221).get((Object) null);
        term78061 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term78141 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term78061, term78061.getClass(), "source", term78141);
        setField(term78061, term78061.getClass(), "excerpt", enum93);
        setBooleanField(term78061, term78061.getClass(), "colorize", true);
        term78395 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term78395, term78395.getClass(), "sourceName", null);
        setIntField(term78395, term78395.getClass(), "lineNumber", 0);
        Class<? extends Object> term80567 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term80566 = ((Class) term80567).getDeclaredField((String) "REGION");
        ((Field) term80566).setAccessible(true);
        Object enum94 = ((Field) term80566).get((Object) null);
        term80215 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term80219 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term80215, term80215.getClass(), "excerpt", enum94);
        setField(term80219, term80219.getClass(), "options", null);
        setField(term80219, term80219.getClass(), "passes", null);
        setField(term80219, term80219.getClass(), "externs", null);
        setField(term80219, term80219.getClass(), "modules", null);
        setField(term80219, term80219.getClass(), "moduleGraph", null);
        setField(term80219, term80219.getClass(), "inputs", null);
        setField(term80219, term80219.getClass(), "errorManager", null);
        setField(term80219, term80219.getClass(), "warningsGuard", null);
        setField(term80219, term80219.getClass(), "externsRoot", null);
        setField(term80219, term80219.getClass(), "jsRoot", null);
        setField(term80219, term80219.getClass(), "externAndJsRoot", null);
        setField(term80219, term80219.getClass(), "inputsByName", null);
        setField(term80219, term80219.getClass(), "sourceMap", null);
        setField(term80219, term80219.getClass(), "externExports", null);
        setIntField(term80219, term80219.getClass(), "uniqueNameId", 0);
        setBooleanField(term80219, term80219.getClass(), "useThreads", false);
        setBooleanField(term80219, term80219.getClass(), "hasRegExpGlobalReferences", false);
        setField(term80219, term80219.getClass(), "functionInformationMap", null);
        setField(term80219, term80219.getClass(), "debugLog", null);
        setField(term80219, term80219.getClass(), "defaultCodingConvention", null);
        setField(term80219, term80219.getClass(), "typeRegistry", null);
        setField(term80219, term80219.getClass(), "parserConfig", null);
        setField(term80219, term80219.getClass(), "abstractInterpreter", null);
        setField(term80219, term80219.getClass(), "typeValidator", null);
        setField(term80219, term80219.getClass(), "tracker", null);
        setField(term80219, term80219.getClass(), "oldErrorReporter", null);
        setField(term80219, term80219.getClass(), "defaultErrorReporter", null);
        setField(term80219, term80219.getClass(), "outStream", null);
        setField(term80219, term80219.getClass(), "globalRefMap", null);
        setField(term80219, term80219.getClass(), "sanityCheck", null);
        setField(term80219, term80219.getClass(), "currentTracer", null);
        setField(term80219, term80219.getClass(), "currentPassName", null);
        setField(term80219, term80219.getClass(), "recentChange", null);
        setField(term80219, term80219.getClass(), "codeChangeHandlers", null);
        setField(term80219, term80219.getClass(), "stage", null);
        setField(term80215, term80215.getClass(), "source", term80219);
        setBooleanField(term80215, term80215.getClass(), "colorize", true);
        term80220 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term80220, term80220.getClass(), "type", null);
        setField(term80220, term80220.getClass(), "description", null);
        setField(term80220, term80220.getClass(), "sourceName", null);
        setField(term80220, term80220.getClass(), "node", null);
        setIntField(term80220, term80220.getClass(), "lineNumber", 0);
        setField(term80220, term80220.getClass(), "level", null);
        setIntField(term80220, term80220.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term78395;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term78061, args);
        assertTrue(recursiveEquals(term78061, term80215));
        assertTrue(recursiveEquals(term78395, term80220));
        assertTrue(recursiveEquals(retValue, "\u001B[35mWARNING\u001B[39m - null\n"));
    }

};


