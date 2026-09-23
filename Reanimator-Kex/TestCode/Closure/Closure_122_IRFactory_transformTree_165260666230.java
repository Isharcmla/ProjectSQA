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

public class IRFactory_transformTree_165260666230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91536;
     Object term91666;
     Object term92485;
     Object term92489;
     Object term92480;

    public IRFactory_transformTree_165260666230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91536 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term91536, term91536.getClass(), "type", 136);
        setField(term91536, term91536.getClass(), "first", null);
        setField(term91536, term91536.getClass(), "propListHead", null);
        setIntField(term91536, term91536.getClass(), "lineno", 0);
        setIntField(term91536, term91536.getClass(), "position", 0);
        setField(term91536, term91536.getClass(), "parent", null);
        Class<? extends Object> term92491 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term92490 = ((Class) term92491).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term92490).setAccessible(true);
        Object enum136 = ((Field) term92490).get((Object) null);
        term91666 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term91666, term91666.getClass(), "languageMode", enum136);
        Class<? extends Object> term92811 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term92810 = ((Class) term92811).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term92810).setAccessible(true);
        Object enum137 = ((Field) term92810).get((Object) null);
        term92485 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term92485, term92485.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term92485, term92485.getClass(), "isIdeMode", false);
        setField(term92485, term92485.getClass(), "annotationNames", null);
        setField(term92485, term92485.getClass(), "suppressionNames", null);
        setField(term92485, term92485.getClass(), "languageMode", enum137);
        setBooleanField(term92485, term92485.getClass(), "acceptConstKeyword", false);
        term92489 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setField(term92489, term92489.getClass(), "comments", null);
        setBooleanField(term92489, term92489.getClass(), "inStrictMode", false);
        setIntField(term92489, term92489.getClass(), "encodedSourceStart", 0);
        setIntField(term92489, term92489.getClass(), "encodedSourceEnd", 0);
        setField(term92489, term92489.getClass(), "sourceName", null);
        setField(term92489, term92489.getClass(), "encodedSource", null);
        setIntField(term92489, term92489.getClass(), "endLineno", 0);
        setField(term92489, term92489.getClass(), "functions", null);
        setField(term92489, term92489.getClass(), "regexps", null);
        setField(term92489, term92489.getClass(), "EMPTY_LIST", null);
        setField(term92489, term92489.getClass(), "symbols", null);
        setIntField(term92489, term92489.getClass(), "paramCount", 0);
        setField(term92489, term92489.getClass(), "variableNames", null);
        setField(term92489, term92489.getClass(), "isConsts", null);
        setField(term92489, term92489.getClass(), "compilerData", null);
        setIntField(term92489, term92489.getClass(), "tempNumber", 0);
        setField(term92489, term92489.getClass(), "symbolTable", null);
        setField(term92489, term92489.getClass(), "parentScope", null);
        setField(term92489, term92489.getClass(), "top", null);
        setField(term92489, term92489.getClass(), "childScopes", null);
        setField(term92489, term92489.getClass(), "target", null);
        setField(term92489, term92489.getClass(), "target2", null);
        setField(term92489, term92489.getClass(), "jumpNode", null);
        setIntField(term92489, term92489.getClass(), "position", 0);
        setIntField(term92489, term92489.getClass(), "length", 0);
        setField(term92489, term92489.getClass(), "parent", null);
        setIntField(term92489, term92489.getClass(), "type", 136);
        setField(term92489, term92489.getClass(), "next", null);
        setField(term92489, term92489.getClass(), "first", null);
        setField(term92489, term92489.getClass(), "last", null);
        setIntField(term92489, term92489.getClass(), "lineno", 0);
        setField(term92489, term92489.getClass(), "propListHead", null);
        term92480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92480, term92480.getClass(), "type", 132);
        setField(term92480, term92480.getClass(), "next", null);
        setField(term92480, term92480.getClass(), "first", null);
        setField(term92480, term92480.getClass(), "last", null);
        setField(term92480, term92480.getClass(), "propListHead", null);
        setIntField(term92480, term92480.getClass(), "sourcePosition", 0);
        setField(term92480, term92480.getClass(), "jsType", null);
        setField(term92480, term92480.getClass(), "parent", null);
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
        args[0] = term91536;
        args[1] = null;
        args[2] = "";
        args[3] = term91666;
        args[4] = null;
        Object retValue = callMethod(klass, "transformTree", argTypes, null, args);
        assertTrue(recursiveEquals(term91536, ""));
        assertTrue(recursiveEquals(term91666, null));
        assertTrue(recursiveEquals(retValue, term92480));
    }

};


