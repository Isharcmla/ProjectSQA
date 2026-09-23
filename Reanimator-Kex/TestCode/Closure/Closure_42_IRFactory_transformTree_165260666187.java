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
import java.lang.String;
import java.lang.Object;

public class IRFactory_transformTree_165260666187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63967;
     Object term64097;
     Object term64365;
     Object term65170;
     Object term65174;
     Object term65175;
     Object term65165;

    public IRFactory_transformTree_165260666187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63967 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term63967, term63967.getClass(), "type", 136);
        setField(term63967, term63967.getClass(), "first", null);
        setField(term63967, term63967.getClass(), "propListHead", null);
        Class<? extends Object> term65187 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term65186 = ((Class) term65187).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term65186).setAccessible(true);
        Object enum101 = ((Field) term65186).get((Object) null);
        term64097 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term64097, term64097.getClass(), "languageMode", enum101);
        term64365 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        Class<? extends Object> term65517 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term65516 = ((Class) term65517).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term65516).setAccessible(true);
        Object enum102 = ((Field) term65516).get((Object) null);
        term65170 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term65170, term65170.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term65170, term65170.getClass(), "isIdeMode", false);
        setField(term65170, term65170.getClass(), "annotationNames", null);
        setField(term65170, term65170.getClass(), "suppressionNames", null);
        setField(term65170, term65170.getClass(), "languageMode", enum102);
        setBooleanField(term65170, term65170.getClass(), "acceptConstKeyword", false);
        term65174 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setBooleanField(term65174, term65174.getClass(), "forEval", false);
        setField(term65174, term65174.getClass(), "chainedReporter", null);
        term65175 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setField(term65175, term65175.getClass(), "comments", null);
        setBooleanField(term65175, term65175.getClass(), "inStrictMode", false);
        setIntField(term65175, term65175.getClass(), "encodedSourceStart", 0);
        setIntField(term65175, term65175.getClass(), "encodedSourceEnd", 0);
        setField(term65175, term65175.getClass(), "sourceName", null);
        setField(term65175, term65175.getClass(), "encodedSource", null);
        setIntField(term65175, term65175.getClass(), "endLineno", 0);
        setField(term65175, term65175.getClass(), "functions", null);
        setField(term65175, term65175.getClass(), "regexps", null);
        setField(term65175, term65175.getClass(), "EMPTY_LIST", null);
        setField(term65175, term65175.getClass(), "symbols", null);
        setIntField(term65175, term65175.getClass(), "paramCount", 0);
        setField(term65175, term65175.getClass(), "variableNames", null);
        setField(term65175, term65175.getClass(), "isConsts", null);
        setField(term65175, term65175.getClass(), "compilerData", null);
        setIntField(term65175, term65175.getClass(), "tempNumber", 0);
        setField(term65175, term65175.getClass(), "symbolTable", null);
        setField(term65175, term65175.getClass(), "parentScope", null);
        setField(term65175, term65175.getClass(), "top", null);
        setField(term65175, term65175.getClass(), "childScopes", null);
        setField(term65175, term65175.getClass(), "target", null);
        setField(term65175, term65175.getClass(), "target2", null);
        setField(term65175, term65175.getClass(), "jumpNode", null);
        setIntField(term65175, term65175.getClass(), "position", 0);
        setIntField(term65175, term65175.getClass(), "length", 0);
        setField(term65175, term65175.getClass(), "parent", null);
        setIntField(term65175, term65175.getClass(), "type", 136);
        setField(term65175, term65175.getClass(), "next", null);
        setField(term65175, term65175.getClass(), "first", null);
        setField(term65175, term65175.getClass(), "last", null);
        setIntField(term65175, term65175.getClass(), "lineno", 0);
        setField(term65175, term65175.getClass(), "propListHead", null);
        term65165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65165, term65165.getClass(), "type", 132);
        setField(term65165, term65165.getClass(), "next", null);
        setField(term65165, term65165.getClass(), "first", null);
        setField(term65165, term65165.getClass(), "last", null);
        setField(term65165, term65165.getClass(), "propListHead", null);
        setIntField(term65165, term65165.getClass(), "sourcePosition", 0);
        setField(term65165, term65165.getClass(), "jsType", null);
        setField(term65165, term65165.getClass(), "parent", null);
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
        args[0] = term63967;
        args[1] = null;
        args[2] = "use strict";
        args[3] = term64097;
        args[4] = term64365;
        Object retValue = callMethod(klass, "transformTree", argTypes, null, args);
        assertTrue(recursiveEquals(term63967, "use strict"));
        assertTrue(recursiveEquals(term64097, term65174));
        assertTrue(recursiveEquals(term64365, term65175));
        assertTrue(recursiveEquals(retValue, term65165));
    }

};


