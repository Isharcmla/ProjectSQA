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

public class LightweightMessageFormatter_format_41366379933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17961;
     Object term18295;
     Object term18738;
     Object term18743;

    public LightweightMessageFormatter_format_41366379933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18745 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term18744 = ((Class) term18745).getDeclaredField((String) "LINE");
        ((Field) term18744).setAccessible(true);
        Object enum36 = ((Field) term18744).get((Object) null);
        term17961 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term18041 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17961, term17961.getClass(), "source", term18041);
        setField(term17961, term17961.getClass(), "excerpt", enum36);
        term18295 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        Class<? extends Object> term19084 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term19083 = ((Class) term19084).getDeclaredField((String) "LINE");
        ((Field) term19083).setAccessible(true);
        Object enum37 = ((Field) term19083).get((Object) null);
        term18738 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term18742 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18738, term18738.getClass(), "excerpt", enum37);
        setField(term18742, term18742.getClass(), "options", null);
        setField(term18742, term18742.getClass(), "passes", null);
        setField(term18742, term18742.getClass(), "externs", null);
        setField(term18742, term18742.getClass(), "modules", null);
        setField(term18742, term18742.getClass(), "moduleGraph", null);
        setField(term18742, term18742.getClass(), "inputs", null);
        setField(term18742, term18742.getClass(), "errorManager", null);
        setField(term18742, term18742.getClass(), "warningsGuard", null);
        setField(term18742, term18742.getClass(), "externsRoot", null);
        setField(term18742, term18742.getClass(), "jsRoot", null);
        setField(term18742, term18742.getClass(), "externAndJsRoot", null);
        setField(term18742, term18742.getClass(), "inputsByName", null);
        setField(term18742, term18742.getClass(), "sourceMap", null);
        setField(term18742, term18742.getClass(), "externExports", null);
        setIntField(term18742, term18742.getClass(), "uniqueNameId", 0);
        setBooleanField(term18742, term18742.getClass(), "useThreads", false);
        setBooleanField(term18742, term18742.getClass(), "hasRegExpGlobalReferences", false);
        setField(term18742, term18742.getClass(), "functionInformationMap", null);
        setField(term18742, term18742.getClass(), "debugLog", null);
        setField(term18742, term18742.getClass(), "defaultCodingConvention", null);
        setField(term18742, term18742.getClass(), "typeRegistry", null);
        setField(term18742, term18742.getClass(), "parserConfig", null);
        setField(term18742, term18742.getClass(), "abstractInterpreter", null);
        setField(term18742, term18742.getClass(), "typeValidator", null);
        setField(term18742, term18742.getClass(), "tracker", null);
        setField(term18742, term18742.getClass(), "oldErrorReporter", null);
        setField(term18742, term18742.getClass(), "defaultErrorReporter", null);
        setField(term18742, term18742.getClass(), "outStream", null);
        setField(term18742, term18742.getClass(), "globalRefMap", null);
        setField(term18742, term18742.getClass(), "sanityCheck", null);
        setField(term18742, term18742.getClass(), "currentTracer", null);
        setField(term18742, term18742.getClass(), "currentPassName", null);
        setField(term18742, term18742.getClass(), "recentChange", null);
        setField(term18742, term18742.getClass(), "codeChangeHandlers", null);
        setField(term18742, term18742.getClass(), "stage", null);
        setField(term18738, term18738.getClass(), "source", term18742);
        setBooleanField(term18738, term18738.getClass(), "colorize", false);
        term18743 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term18743, term18743.getClass(), "type", null);
        setField(term18743, term18743.getClass(), "description", null);
        setField(term18743, term18743.getClass(), "sourceName", null);
        setField(term18743, term18743.getClass(), "node", null);
        setIntField(term18743, term18743.getClass(), "lineNumber", 0);
        setField(term18743, term18743.getClass(), "level", null);
        setIntField(term18743, term18743.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term18295;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term17961, args);
        assertTrue(recursiveEquals(term17961, term18738));
        assertTrue(recursiveEquals(term18295, term18743));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


