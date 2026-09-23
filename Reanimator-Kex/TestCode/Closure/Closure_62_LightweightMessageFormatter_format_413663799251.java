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

public class LightweightMessageFormatter_format_413663799251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217524;
     Object term218010;
     Object term218660;
     Object term218666;

    public LightweightMessageFormatter_format_413663799251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term217652 = new HashMap();
        Class<? extends Object> term218670 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term218669 = ((Class) term218670).getDeclaredField((String) "REGION");
        ((Field) term218669).setAccessible(true);
        Object enum258 = ((Field) term218669).get((Object) null);
        term217524 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term217604 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term217604, term217604.getClass(), "inputsByName", term217652);
        setField(term217524, term217524.getClass(), "source", term217604);
        setField(term217524, term217524.getClass(), "excerpt", enum258);
        term218010 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term218010, term218010.getClass(), "sourceName", "");
        setIntField(term218010, term218010.getClass(), "lineNumber", 1);
        Class<? extends Object> term219015 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term219014 = ((Class) term219015).getDeclaredField((String) "REGION");
        ((Field) term219014).setAccessible(true);
        Object enum259 = ((Field) term219014).get((Object) null);
        HashMap term218665 = new HashMap();
        term218660 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term218664 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term218660, term218660.getClass(), "excerpt", enum259);
        setField(term218664, term218664.getClass(), "options", null);
        setField(term218664, term218664.getClass(), "passes", null);
        setField(term218664, term218664.getClass(), "externs", null);
        setField(term218664, term218664.getClass(), "modules", null);
        setField(term218664, term218664.getClass(), "moduleGraph", null);
        setField(term218664, term218664.getClass(), "inputs", null);
        setField(term218664, term218664.getClass(), "errorManager", null);
        setField(term218664, term218664.getClass(), "warningsGuard", null);
        setField(term218664, term218664.getClass(), "externsRoot", null);
        setField(term218664, term218664.getClass(), "jsRoot", null);
        setField(term218664, term218664.getClass(), "externAndJsRoot", null);
        setField(term218664, term218664.getClass(), "inputsByName", term218665);
        setField(term218664, term218664.getClass(), "sourceMap", null);
        setField(term218664, term218664.getClass(), "externExports", null);
        setIntField(term218664, term218664.getClass(), "uniqueNameId", 0);
        setBooleanField(term218664, term218664.getClass(), "useThreads", false);
        setBooleanField(term218664, term218664.getClass(), "hasRegExpGlobalReferences", false);
        setField(term218664, term218664.getClass(), "functionInformationMap", null);
        setField(term218664, term218664.getClass(), "debugLog", null);
        setField(term218664, term218664.getClass(), "defaultCodingConvention", null);
        setField(term218664, term218664.getClass(), "typeRegistry", null);
        setField(term218664, term218664.getClass(), "parserConfig", null);
        setField(term218664, term218664.getClass(), "abstractInterpreter", null);
        setField(term218664, term218664.getClass(), "typeValidator", null);
        setField(term218664, term218664.getClass(), "tracker", null);
        setField(term218664, term218664.getClass(), "oldErrorReporter", null);
        setField(term218664, term218664.getClass(), "defaultErrorReporter", null);
        setField(term218664, term218664.getClass(), "outStream", null);
        setField(term218664, term218664.getClass(), "globalRefMap", null);
        setField(term218664, term218664.getClass(), "sanityCheck", null);
        setField(term218664, term218664.getClass(), "currentTracer", null);
        setField(term218664, term218664.getClass(), "currentPassName", null);
        setField(term218664, term218664.getClass(), "recentChange", null);
        setField(term218664, term218664.getClass(), "codeChangeHandlers", null);
        setField(term218664, term218664.getClass(), "stage", null);
        setField(term218660, term218660.getClass(), "source", term218664);
        setBooleanField(term218660, term218660.getClass(), "colorize", false);
        term218666 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term218666, term218666.getClass(), "type", null);
        setField(term218666, term218666.getClass(), "description", null);
        setField(term218666, term218666.getClass(), "sourceName", "");
        setField(term218666, term218666.getClass(), "node", null);
        setIntField(term218666, term218666.getClass(), "lineNumber", 1);
        setField(term218666, term218666.getClass(), "level", null);
        setIntField(term218666, term218666.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term218010;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term217524, args);
        assertTrue(recursiveEquals(term217524, term218660));
        assertTrue(recursiveEquals(term218010, term218666));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


