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

public class LightweightMessageFormatter_format_41366379991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57270;
     Object term57604;
     Object term58947;
     Object term58952;

    public LightweightMessageFormatter_format_41366379991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58954 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term58953 = ((Class) term58954).getDeclaredField((String) "REGION");
        ((Field) term58953).setAccessible(true);
        Object enum72 = ((Field) term58953).get((Object) null);
        term57270 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term57350 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term57270, term57270.getClass(), "source", term57350);
        setField(term57270, term57270.getClass(), "excerpt", enum72);
        setBooleanField(term57270, term57270.getClass(), "colorize", true);
        term57604 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term57604, term57604.getClass(), "sourceName", null);
        setIntField(term57604, term57604.getClass(), "lineNumber", 0);
        Class<? extends Object> term59299 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term59298 = ((Class) term59299).getDeclaredField((String) "REGION");
        ((Field) term59298).setAccessible(true);
        Object enum73 = ((Field) term59298).get((Object) null);
        term58947 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term58951 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58947, term58947.getClass(), "excerpt", enum73);
        setField(term58951, term58951.getClass(), "options", null);
        setField(term58951, term58951.getClass(), "passes", null);
        setField(term58951, term58951.getClass(), "externs", null);
        setField(term58951, term58951.getClass(), "modules", null);
        setField(term58951, term58951.getClass(), "moduleGraph", null);
        setField(term58951, term58951.getClass(), "inputs", null);
        setField(term58951, term58951.getClass(), "errorManager", null);
        setField(term58951, term58951.getClass(), "warningsGuard", null);
        setField(term58951, term58951.getClass(), "externsRoot", null);
        setField(term58951, term58951.getClass(), "jsRoot", null);
        setField(term58951, term58951.getClass(), "externAndJsRoot", null);
        setField(term58951, term58951.getClass(), "inputsByName", null);
        setField(term58951, term58951.getClass(), "sourceMap", null);
        setField(term58951, term58951.getClass(), "externExports", null);
        setIntField(term58951, term58951.getClass(), "uniqueNameId", 0);
        setBooleanField(term58951, term58951.getClass(), "useThreads", false);
        setBooleanField(term58951, term58951.getClass(), "hasRegExpGlobalReferences", false);
        setField(term58951, term58951.getClass(), "functionInformationMap", null);
        setField(term58951, term58951.getClass(), "debugLog", null);
        setField(term58951, term58951.getClass(), "defaultCodingConvention", null);
        setField(term58951, term58951.getClass(), "typeRegistry", null);
        setField(term58951, term58951.getClass(), "parserConfig", null);
        setField(term58951, term58951.getClass(), "abstractInterpreter", null);
        setField(term58951, term58951.getClass(), "typeValidator", null);
        setField(term58951, term58951.getClass(), "tracker", null);
        setField(term58951, term58951.getClass(), "oldErrorReporter", null);
        setField(term58951, term58951.getClass(), "defaultErrorReporter", null);
        setField(term58951, term58951.getClass(), "outStream", null);
        setField(term58951, term58951.getClass(), "globalRefMap", null);
        setField(term58951, term58951.getClass(), "sanityCheck", null);
        setField(term58951, term58951.getClass(), "currentTracer", null);
        setField(term58951, term58951.getClass(), "currentPassName", null);
        setField(term58951, term58951.getClass(), "recentChange", null);
        setField(term58951, term58951.getClass(), "codeChangeHandlers", null);
        setField(term58951, term58951.getClass(), "stage", null);
        setField(term58947, term58947.getClass(), "source", term58951);
        setBooleanField(term58947, term58947.getClass(), "colorize", true);
        term58952 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term58952, term58952.getClass(), "type", null);
        setField(term58952, term58952.getClass(), "description", null);
        setField(term58952, term58952.getClass(), "sourceName", null);
        setField(term58952, term58952.getClass(), "node", null);
        setIntField(term58952, term58952.getClass(), "lineNumber", 0);
        setField(term58952, term58952.getClass(), "level", null);
        setIntField(term58952, term58952.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term57604;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term57270, args);
        assertTrue(recursiveEquals(term57270, term58947));
        assertTrue(recursiveEquals(term57604, term58952));
        assertTrue(recursiveEquals(retValue, "\u001B[31mERROR\u001B[39m - null\n"));
    }

};


