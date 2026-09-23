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

public class LightweightMessageFormatter_format_413663799345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294242;
     Object term294576;
     Object term295042;
     Object term295047;

    public LightweightMessageFormatter_format_413663799345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term295049 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term295048 = ((Class) term295049).getDeclaredField((String) "REGION");
        ((Field) term295048).setAccessible(true);
        Object enum351 = ((Field) term295048).get((Object) null);
        term294242 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term294322 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term294242, term294242.getClass(), "source", term294322);
        setField(term294242, term294242.getClass(), "excerpt", enum351);
        term294576 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term294576, term294576.getClass(), "sourceName", null);
        setIntField(term294576, term294576.getClass(), "lineNumber", 0);
        Class<? extends Object> term295394 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term295393 = ((Class) term295394).getDeclaredField((String) "REGION");
        ((Field) term295393).setAccessible(true);
        Object enum352 = ((Field) term295393).get((Object) null);
        term295042 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term295046 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term295042, term295042.getClass(), "excerpt", enum352);
        setField(term295046, term295046.getClass(), "options", null);
        setField(term295046, term295046.getClass(), "passes", null);
        setField(term295046, term295046.getClass(), "externs", null);
        setField(term295046, term295046.getClass(), "modules", null);
        setField(term295046, term295046.getClass(), "moduleGraph", null);
        setField(term295046, term295046.getClass(), "inputs", null);
        setField(term295046, term295046.getClass(), "errorManager", null);
        setField(term295046, term295046.getClass(), "warningsGuard", null);
        setField(term295046, term295046.getClass(), "externsRoot", null);
        setField(term295046, term295046.getClass(), "jsRoot", null);
        setField(term295046, term295046.getClass(), "externAndJsRoot", null);
        setField(term295046, term295046.getClass(), "inputsByName", null);
        setField(term295046, term295046.getClass(), "sourceMap", null);
        setField(term295046, term295046.getClass(), "externExports", null);
        setIntField(term295046, term295046.getClass(), "uniqueNameId", 0);
        setBooleanField(term295046, term295046.getClass(), "useThreads", false);
        setBooleanField(term295046, term295046.getClass(), "hasRegExpGlobalReferences", false);
        setField(term295046, term295046.getClass(), "functionInformationMap", null);
        setField(term295046, term295046.getClass(), "debugLog", null);
        setField(term295046, term295046.getClass(), "defaultCodingConvention", null);
        setField(term295046, term295046.getClass(), "typeRegistry", null);
        setField(term295046, term295046.getClass(), "parserConfig", null);
        setField(term295046, term295046.getClass(), "abstractInterpreter", null);
        setField(term295046, term295046.getClass(), "typeValidator", null);
        setField(term295046, term295046.getClass(), "tracker", null);
        setField(term295046, term295046.getClass(), "oldErrorReporter", null);
        setField(term295046, term295046.getClass(), "defaultErrorReporter", null);
        setField(term295046, term295046.getClass(), "outStream", null);
        setField(term295046, term295046.getClass(), "globalRefMap", null);
        setField(term295046, term295046.getClass(), "sanityCheck", null);
        setField(term295046, term295046.getClass(), "currentTracer", null);
        setField(term295046, term295046.getClass(), "currentPassName", null);
        setField(term295046, term295046.getClass(), "recentChange", null);
        setField(term295046, term295046.getClass(), "codeChangeHandlers", null);
        setField(term295046, term295046.getClass(), "stage", null);
        setField(term295042, term295042.getClass(), "source", term295046);
        setBooleanField(term295042, term295042.getClass(), "colorize", false);
        term295047 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term295047, term295047.getClass(), "type", null);
        setField(term295047, term295047.getClass(), "description", null);
        setField(term295047, term295047.getClass(), "sourceName", null);
        setField(term295047, term295047.getClass(), "node", null);
        setIntField(term295047, term295047.getClass(), "lineNumber", 0);
        setField(term295047, term295047.getClass(), "level", null);
        setIntField(term295047, term295047.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term294576;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term294242, args);
        assertTrue(recursiveEquals(term294242, term295042));
        assertTrue(recursiveEquals(term294576, term295047));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


