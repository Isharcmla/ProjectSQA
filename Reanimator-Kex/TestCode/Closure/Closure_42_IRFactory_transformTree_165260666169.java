package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class IRFactory_transformTree_165260666169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60710;
     Object term60946;
     Object term61210;
     Object term62024;
     Object term62028;
     Object term62029;
     Object term62019;

    public IRFactory_transformTree_165260666169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60710 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term60816 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term60710, term60710.getClass(), "type", 136);
        setField(term60710, term60710.getClass(), "first", null);
        setIntField(term60816, term60816.getClass(), "type", 24);
        setField(term60710, term60710.getClass(), "propListHead", term60816);
        Class<? extends Object> term62042 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term62041 = ((Class) term62042).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term62041).setAccessible(true);
        Object enum98 = ((Field) term62041).get((Object) null);
        term60946 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term60946, term60946.getClass(), "languageMode", enum98);
        term61210 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
        Class<? extends Object> term62372 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term62371 = ((Class) term62372).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term62371).setAccessible(true);
        Object enum99 = ((Field) term62371).get((Object) null);
        term62024 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term62024, term62024.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term62024, term62024.getClass(), "isIdeMode", false);
        setField(term62024, term62024.getClass(), "annotationNames", null);
        setField(term62024, term62024.getClass(), "suppressionNames", null);
        setField(term62024, term62024.getClass(), "languageMode", enum99);
        setBooleanField(term62024, term62024.getClass(), "acceptConstKeyword", false);
        term62028 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
        setField(term62028, term62028.getClass(), "errors", null);
        term62029 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term62030 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setField(term62029, term62029.getClass(), "comments", null);
        setBooleanField(term62029, term62029.getClass(), "inStrictMode", false);
        setIntField(term62029, term62029.getClass(), "encodedSourceStart", 0);
        setIntField(term62029, term62029.getClass(), "encodedSourceEnd", 0);
        setField(term62029, term62029.getClass(), "sourceName", null);
        setField(term62029, term62029.getClass(), "encodedSource", null);
        setIntField(term62029, term62029.getClass(), "endLineno", 0);
        setField(term62029, term62029.getClass(), "functions", null);
        setField(term62029, term62029.getClass(), "regexps", null);
        setField(term62029, term62029.getClass(), "EMPTY_LIST", null);
        setField(term62029, term62029.getClass(), "symbols", null);
        setIntField(term62029, term62029.getClass(), "paramCount", 0);
        setField(term62029, term62029.getClass(), "variableNames", null);
        setField(term62029, term62029.getClass(), "isConsts", null);
        setField(term62029, term62029.getClass(), "compilerData", null);
        setIntField(term62029, term62029.getClass(), "tempNumber", 0);
        setField(term62029, term62029.getClass(), "symbolTable", null);
        setField(term62029, term62029.getClass(), "parentScope", null);
        setField(term62029, term62029.getClass(), "top", null);
        setField(term62029, term62029.getClass(), "childScopes", null);
        setField(term62029, term62029.getClass(), "target", null);
        setField(term62029, term62029.getClass(), "target2", null);
        setField(term62029, term62029.getClass(), "jumpNode", null);
        setIntField(term62029, term62029.getClass(), "position", 0);
        setIntField(term62029, term62029.getClass(), "length", 0);
        setField(term62029, term62029.getClass(), "parent", null);
        setIntField(term62029, term62029.getClass(), "type", 136);
        setField(term62029, term62029.getClass(), "next", null);
        setField(term62029, term62029.getClass(), "first", null);
        setField(term62029, term62029.getClass(), "last", null);
        setIntField(term62029, term62029.getClass(), "lineno", 0);
        setField(term62030, term62030.getClass(), "next", null);
        setIntField(term62030, term62030.getClass(), "type", 24);
        setIntField(term62030, term62030.getClass(), "intValue", 0);
        setField(term62030, term62030.getClass(), "objectValue", null);
        setField(term62029, term62029.getClass(), "propListHead", term62030);
        term62019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62019, term62019.getClass(), "type", 132);
        setField(term62019, term62019.getClass(), "next", null);
        setField(term62019, term62019.getClass(), "first", null);
        setField(term62019, term62019.getClass(), "last", null);
        setField(term62019, term62019.getClass(), "propListHead", null);
        setIntField(term62019, term62019.getClass(), "sourcePosition", 0);
        setField(term62019, term62019.getClass(), "jsType", null);
        setField(term62019, term62019.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstRoot");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSourceFile");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.parsing.Config");
        argTypes[4] = Class.forName("com.google.javascript.rhino.head.ErrorReporter");
        Object[] args = new Object[5];
        args[0] = term60710;
        args[1] = null;
        args[2] = "use strict";
        args[3] = term60946;
        args[4] = term61210;
        Object retValue = callMethod(klass, "transformTree", argTypes, null, args);
        assertTrue(recursiveEquals(term60710, "use strict"));
        assertTrue(recursiveEquals(term60946, term62028));
        assertTrue(recursiveEquals(term61210, term62029));
        assertTrue(recursiveEquals(retValue, term62019));
    }

};


