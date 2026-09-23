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

public class LightweightMessageFormatter_format_413663799201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168958;
     Object term169444;
     Object term169987;
     Object term169993;

    public LightweightMessageFormatter_format_413663799201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term169086 = new HashMap();
        Class<? extends Object> term169995 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term169994 = ((Class) term169995).getDeclaredField((String) "REGION");
        ((Field) term169994).setAccessible(true);
        Object enum198 = ((Field) term169994).get((Object) null);
        term168958 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term169038 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term169038, term169038.getClass(), "inputsByName", term169086);
        setField(term168958, term168958.getClass(), "source", term169038);
        setField(term168958, term168958.getClass(), "excerpt", enum198);
        setBooleanField(term168958, term168958.getClass(), "colorize", true);
        term169444 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term169444, term169444.getClass(), "sourceName", null);
        setIntField(term169444, term169444.getClass(), "lineNumber", 1);
        Class<? extends Object> term170340 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term170339 = ((Class) term170340).getDeclaredField((String) "REGION");
        ((Field) term170339).setAccessible(true);
        Object enum199 = ((Field) term170339).get((Object) null);
        HashMap term169992 = new HashMap();
        term169987 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term169991 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term169987, term169987.getClass(), "excerpt", enum199);
        setField(term169991, term169991.getClass(), "options", null);
        setField(term169991, term169991.getClass(), "passes", null);
        setField(term169991, term169991.getClass(), "externs", null);
        setField(term169991, term169991.getClass(), "modules", null);
        setField(term169991, term169991.getClass(), "moduleGraph", null);
        setField(term169991, term169991.getClass(), "inputs", null);
        setField(term169991, term169991.getClass(), "errorManager", null);
        setField(term169991, term169991.getClass(), "warningsGuard", null);
        setField(term169991, term169991.getClass(), "externsRoot", null);
        setField(term169991, term169991.getClass(), "jsRoot", null);
        setField(term169991, term169991.getClass(), "externAndJsRoot", null);
        setField(term169991, term169991.getClass(), "inputsByName", term169992);
        setField(term169991, term169991.getClass(), "sourceMap", null);
        setField(term169991, term169991.getClass(), "externExports", null);
        setIntField(term169991, term169991.getClass(), "uniqueNameId", 0);
        setBooleanField(term169991, term169991.getClass(), "useThreads", false);
        setBooleanField(term169991, term169991.getClass(), "hasRegExpGlobalReferences", false);
        setField(term169991, term169991.getClass(), "functionInformationMap", null);
        setField(term169991, term169991.getClass(), "debugLog", null);
        setField(term169991, term169991.getClass(), "defaultCodingConvention", null);
        setField(term169991, term169991.getClass(), "typeRegistry", null);
        setField(term169991, term169991.getClass(), "parserConfig", null);
        setField(term169991, term169991.getClass(), "abstractInterpreter", null);
        setField(term169991, term169991.getClass(), "typeValidator", null);
        setField(term169991, term169991.getClass(), "tracker", null);
        setField(term169991, term169991.getClass(), "oldErrorReporter", null);
        setField(term169991, term169991.getClass(), "defaultErrorReporter", null);
        setField(term169991, term169991.getClass(), "outStream", null);
        setField(term169991, term169991.getClass(), "globalRefMap", null);
        setField(term169991, term169991.getClass(), "sanityCheck", null);
        setField(term169991, term169991.getClass(), "currentTracer", null);
        setField(term169991, term169991.getClass(), "currentPassName", null);
        setField(term169991, term169991.getClass(), "recentChange", null);
        setField(term169991, term169991.getClass(), "codeChangeHandlers", null);
        setField(term169991, term169991.getClass(), "stage", null);
        setField(term169987, term169987.getClass(), "source", term169991);
        setBooleanField(term169987, term169987.getClass(), "colorize", true);
        term169993 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term169993, term169993.getClass(), "type", null);
        setField(term169993, term169993.getClass(), "description", null);
        setField(term169993, term169993.getClass(), "sourceName", null);
        setField(term169993, term169993.getClass(), "node", null);
        setIntField(term169993, term169993.getClass(), "lineNumber", 1);
        setField(term169993, term169993.getClass(), "level", null);
        setIntField(term169993, term169993.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term169444;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term168958, args);
        assertTrue(recursiveEquals(term168958, term169987));
        assertTrue(recursiveEquals(term169444, term169993));
        assertTrue(recursiveEquals(retValue, "\u001B[35mWARNING\u001B[39m - null\n"));
    }

};


