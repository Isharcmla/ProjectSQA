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

public class LightweightMessageFormatter_format_413663799214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182729;
     Object term183215;
     Object term185104;
     Object term185110;

    public LightweightMessageFormatter_format_413663799214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term182857 = new HashMap();
        Class<? extends Object> term185114 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term185113 = ((Class) term185114).getDeclaredField((String) "REGION");
        ((Field) term185113).setAccessible(true);
        Object enum217 = ((Field) term185113).get((Object) null);
        term182729 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term182809 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term182809, term182809.getClass(), "inputsByName", term182857);
        setField(term182729, term182729.getClass(), "source", term182809);
        setField(term182729, term182729.getClass(), "excerpt", enum217);
        term183215 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term183215, term183215.getClass(), "sourceName", "");
        setIntField(term183215, term183215.getClass(), "lineNumber", 4);
        Class<? extends Object> term185459 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term185458 = ((Class) term185459).getDeclaredField((String) "REGION");
        ((Field) term185458).setAccessible(true);
        Object enum218 = ((Field) term185458).get((Object) null);
        HashMap term185109 = new HashMap();
        term185104 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term185108 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term185104, term185104.getClass(), "excerpt", enum218);
        setField(term185108, term185108.getClass(), "options", null);
        setField(term185108, term185108.getClass(), "passes", null);
        setField(term185108, term185108.getClass(), "externs", null);
        setField(term185108, term185108.getClass(), "modules", null);
        setField(term185108, term185108.getClass(), "moduleGraph", null);
        setField(term185108, term185108.getClass(), "inputs", null);
        setField(term185108, term185108.getClass(), "errorManager", null);
        setField(term185108, term185108.getClass(), "warningsGuard", null);
        setField(term185108, term185108.getClass(), "externsRoot", null);
        setField(term185108, term185108.getClass(), "jsRoot", null);
        setField(term185108, term185108.getClass(), "externAndJsRoot", null);
        setField(term185108, term185108.getClass(), "inputsByName", term185109);
        setField(term185108, term185108.getClass(), "sourceMap", null);
        setField(term185108, term185108.getClass(), "externExports", null);
        setIntField(term185108, term185108.getClass(), "uniqueNameId", 0);
        setBooleanField(term185108, term185108.getClass(), "useThreads", false);
        setBooleanField(term185108, term185108.getClass(), "hasRegExpGlobalReferences", false);
        setField(term185108, term185108.getClass(), "functionInformationMap", null);
        setField(term185108, term185108.getClass(), "debugLog", null);
        setField(term185108, term185108.getClass(), "defaultCodingConvention", null);
        setField(term185108, term185108.getClass(), "typeRegistry", null);
        setField(term185108, term185108.getClass(), "parserConfig", null);
        setField(term185108, term185108.getClass(), "abstractInterpreter", null);
        setField(term185108, term185108.getClass(), "typeValidator", null);
        setField(term185108, term185108.getClass(), "tracker", null);
        setField(term185108, term185108.getClass(), "oldErrorReporter", null);
        setField(term185108, term185108.getClass(), "defaultErrorReporter", null);
        setField(term185108, term185108.getClass(), "outStream", null);
        setField(term185108, term185108.getClass(), "globalRefMap", null);
        setField(term185108, term185108.getClass(), "sanityCheck", null);
        setField(term185108, term185108.getClass(), "currentTracer", null);
        setField(term185108, term185108.getClass(), "currentPassName", null);
        setField(term185108, term185108.getClass(), "recentChange", null);
        setField(term185108, term185108.getClass(), "codeChangeHandlers", null);
        setField(term185108, term185108.getClass(), "stage", null);
        setField(term185104, term185104.getClass(), "source", term185108);
        setBooleanField(term185104, term185104.getClass(), "colorize", false);
        term185110 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term185110, term185110.getClass(), "type", null);
        setField(term185110, term185110.getClass(), "description", null);
        setField(term185110, term185110.getClass(), "sourceName", "");
        setField(term185110, term185110.getClass(), "node", null);
        setIntField(term185110, term185110.getClass(), "lineNumber", 4);
        setField(term185110, term185110.getClass(), "level", null);
        setIntField(term185110, term185110.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term183215;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term182729, args);
        assertTrue(recursiveEquals(term182729, term185104));
        assertTrue(recursiveEquals(term183215, term185110));
        assertTrue(recursiveEquals(retValue, ":4: WARNING - null\n"));
    }

};


