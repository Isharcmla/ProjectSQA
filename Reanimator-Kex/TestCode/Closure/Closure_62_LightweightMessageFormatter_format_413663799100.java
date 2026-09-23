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

public class LightweightMessageFormatter_format_413663799100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67132;
     Object term67466;
     Object term68563;
     Object term68568;

    public LightweightMessageFormatter_format_413663799100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68570 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term68569 = ((Class) term68570).getDeclaredField((String) "REGION");
        ((Field) term68569).setAccessible(true);
        Object enum81 = ((Field) term68569).get((Object) null);
        term67132 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term67212 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term67132, term67132.getClass(), "source", term67212);
        setField(term67132, term67132.getClass(), "excerpt", enum81);
        setBooleanField(term67132, term67132.getClass(), "colorize", true);
        term67466 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term67466, term67466.getClass(), "sourceName", null);
        setIntField(term67466, term67466.getClass(), "lineNumber", 0);
        Class<? extends Object> term68915 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term68914 = ((Class) term68915).getDeclaredField((String) "REGION");
        ((Field) term68914).setAccessible(true);
        Object enum82 = ((Field) term68914).get((Object) null);
        term68563 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term68567 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term68563, term68563.getClass(), "excerpt", enum82);
        setField(term68567, term68567.getClass(), "options", null);
        setField(term68567, term68567.getClass(), "passes", null);
        setField(term68567, term68567.getClass(), "externs", null);
        setField(term68567, term68567.getClass(), "modules", null);
        setField(term68567, term68567.getClass(), "moduleGraph", null);
        setField(term68567, term68567.getClass(), "inputs", null);
        setField(term68567, term68567.getClass(), "errorManager", null);
        setField(term68567, term68567.getClass(), "warningsGuard", null);
        setField(term68567, term68567.getClass(), "externsRoot", null);
        setField(term68567, term68567.getClass(), "jsRoot", null);
        setField(term68567, term68567.getClass(), "externAndJsRoot", null);
        setField(term68567, term68567.getClass(), "inputsByName", null);
        setField(term68567, term68567.getClass(), "sourceMap", null);
        setField(term68567, term68567.getClass(), "externExports", null);
        setIntField(term68567, term68567.getClass(), "uniqueNameId", 0);
        setBooleanField(term68567, term68567.getClass(), "useThreads", false);
        setBooleanField(term68567, term68567.getClass(), "hasRegExpGlobalReferences", false);
        setField(term68567, term68567.getClass(), "functionInformationMap", null);
        setField(term68567, term68567.getClass(), "debugLog", null);
        setField(term68567, term68567.getClass(), "defaultCodingConvention", null);
        setField(term68567, term68567.getClass(), "typeRegistry", null);
        setField(term68567, term68567.getClass(), "parserConfig", null);
        setField(term68567, term68567.getClass(), "abstractInterpreter", null);
        setField(term68567, term68567.getClass(), "typeValidator", null);
        setField(term68567, term68567.getClass(), "tracker", null);
        setField(term68567, term68567.getClass(), "oldErrorReporter", null);
        setField(term68567, term68567.getClass(), "defaultErrorReporter", null);
        setField(term68567, term68567.getClass(), "outStream", null);
        setField(term68567, term68567.getClass(), "globalRefMap", null);
        setField(term68567, term68567.getClass(), "sanityCheck", null);
        setField(term68567, term68567.getClass(), "currentTracer", null);
        setField(term68567, term68567.getClass(), "currentPassName", null);
        setField(term68567, term68567.getClass(), "recentChange", null);
        setField(term68567, term68567.getClass(), "codeChangeHandlers", null);
        setField(term68567, term68567.getClass(), "stage", null);
        setField(term68563, term68563.getClass(), "source", term68567);
        setBooleanField(term68563, term68563.getClass(), "colorize", true);
        term68568 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term68568, term68568.getClass(), "type", null);
        setField(term68568, term68568.getClass(), "description", null);
        setField(term68568, term68568.getClass(), "sourceName", null);
        setField(term68568, term68568.getClass(), "node", null);
        setIntField(term68568, term68568.getClass(), "lineNumber", 0);
        setField(term68568, term68568.getClass(), "level", null);
        setIntField(term68568, term68568.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term67466;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term67132, args);
        assertTrue(recursiveEquals(term67132, term68563));
        assertTrue(recursiveEquals(term67466, term68568));
        assertTrue(recursiveEquals(retValue, "\u001B[35mWARNING\u001B[39m - null\n"));
    }

};


