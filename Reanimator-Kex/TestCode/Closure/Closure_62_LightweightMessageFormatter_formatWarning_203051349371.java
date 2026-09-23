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

public class LightweightMessageFormatter_formatWarning_203051349371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42571;
     Object term42905;
     Object term44204;
     Object term44209;

    public LightweightMessageFormatter_formatWarning_203051349371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44211 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term44210 = ((Class) term44211).getDeclaredField((String) "LINE");
        ((Field) term44210).setAccessible(true);
        Object enum60 = ((Field) term44210).get((Object) null);
        term42571 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term42651 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42571, term42571.getClass(), "source", term42651);
        setField(term42571, term42571.getClass(), "excerpt", enum60);
        term42905 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        Class<? extends Object> term44550 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term44549 = ((Class) term44550).getDeclaredField((String) "LINE");
        ((Field) term44549).setAccessible(true);
        Object enum61 = ((Field) term44549).get((Object) null);
        term44204 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term44208 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term44204, term44204.getClass(), "excerpt", enum61);
        setField(term44208, term44208.getClass(), "options", null);
        setField(term44208, term44208.getClass(), "passes", null);
        setField(term44208, term44208.getClass(), "externs", null);
        setField(term44208, term44208.getClass(), "modules", null);
        setField(term44208, term44208.getClass(), "moduleGraph", null);
        setField(term44208, term44208.getClass(), "inputs", null);
        setField(term44208, term44208.getClass(), "errorManager", null);
        setField(term44208, term44208.getClass(), "warningsGuard", null);
        setField(term44208, term44208.getClass(), "externsRoot", null);
        setField(term44208, term44208.getClass(), "jsRoot", null);
        setField(term44208, term44208.getClass(), "externAndJsRoot", null);
        setField(term44208, term44208.getClass(), "inputsByName", null);
        setField(term44208, term44208.getClass(), "sourceMap", null);
        setField(term44208, term44208.getClass(), "externExports", null);
        setIntField(term44208, term44208.getClass(), "uniqueNameId", 0);
        setBooleanField(term44208, term44208.getClass(), "useThreads", false);
        setBooleanField(term44208, term44208.getClass(), "hasRegExpGlobalReferences", false);
        setField(term44208, term44208.getClass(), "functionInformationMap", null);
        setField(term44208, term44208.getClass(), "debugLog", null);
        setField(term44208, term44208.getClass(), "defaultCodingConvention", null);
        setField(term44208, term44208.getClass(), "typeRegistry", null);
        setField(term44208, term44208.getClass(), "parserConfig", null);
        setField(term44208, term44208.getClass(), "abstractInterpreter", null);
        setField(term44208, term44208.getClass(), "typeValidator", null);
        setField(term44208, term44208.getClass(), "tracker", null);
        setField(term44208, term44208.getClass(), "oldErrorReporter", null);
        setField(term44208, term44208.getClass(), "defaultErrorReporter", null);
        setField(term44208, term44208.getClass(), "outStream", null);
        setField(term44208, term44208.getClass(), "globalRefMap", null);
        setField(term44208, term44208.getClass(), "sanityCheck", null);
        setField(term44208, term44208.getClass(), "currentTracer", null);
        setField(term44208, term44208.getClass(), "currentPassName", null);
        setField(term44208, term44208.getClass(), "recentChange", null);
        setField(term44208, term44208.getClass(), "codeChangeHandlers", null);
        setField(term44208, term44208.getClass(), "stage", null);
        setField(term44204, term44204.getClass(), "source", term44208);
        setBooleanField(term44204, term44204.getClass(), "colorize", false);
        term44209 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term44209, term44209.getClass(), "type", null);
        setField(term44209, term44209.getClass(), "description", null);
        setField(term44209, term44209.getClass(), "sourceName", null);
        setField(term44209, term44209.getClass(), "node", null);
        setIntField(term44209, term44209.getClass(), "lineNumber", 0);
        setField(term44209, term44209.getClass(), "level", null);
        setIntField(term44209, term44209.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term42905;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term42571, args);
        assertTrue(recursiveEquals(term42571, term44204));
        assertTrue(recursiveEquals(term42905, term44209));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


