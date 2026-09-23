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

public class IRFactory_transformTree_165260666199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82233;
     Object term82363;
     Object term84250;
     Object term84254;
     Object term84245;

    public IRFactory_transformTree_165260666199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82233 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term82233, term82233.getClass(), "type", 136);
        setField(term82233, term82233.getClass(), "first", null);
        setField(term82233, term82233.getClass(), "propListHead", null);
        setIntField(term82233, term82233.getClass(), "lineno", -1);
        setField(term82233, term82233.getClass(), "parent", null);
        setIntField(term82233, term82233.getClass(), "position", 0);
        Class<? extends Object> term84256 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term84255 = ((Class) term84256).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term84255).setAccessible(true);
        Object enum130 = ((Field) term84255).get((Object) null);
        term82363 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term82363, term82363.getClass(), "languageMode", enum130);
        setBooleanField(term82363, term82363.getClass(), "isIdeMode", true);
        Class<? extends Object> term84597 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term84596 = ((Class) term84597).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term84596).setAccessible(true);
        Object enum131 = ((Field) term84596).get((Object) null);
        term84250 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term84250, term84250.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term84250, term84250.getClass(), "isIdeMode", true);
        setField(term84250, term84250.getClass(), "annotationNames", null);
        setField(term84250, term84250.getClass(), "suppressionNames", null);
        setField(term84250, term84250.getClass(), "languageMode", enum131);
        setBooleanField(term84250, term84250.getClass(), "acceptConstKeyword", false);
        term84254 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setField(term84254, term84254.getClass(), "comments", null);
        setBooleanField(term84254, term84254.getClass(), "inStrictMode", false);
        setIntField(term84254, term84254.getClass(), "encodedSourceStart", 0);
        setIntField(term84254, term84254.getClass(), "encodedSourceEnd", 0);
        setField(term84254, term84254.getClass(), "sourceName", null);
        setField(term84254, term84254.getClass(), "encodedSource", null);
        setIntField(term84254, term84254.getClass(), "endLineno", 0);
        setField(term84254, term84254.getClass(), "functions", null);
        setField(term84254, term84254.getClass(), "regexps", null);
        setField(term84254, term84254.getClass(), "EMPTY_LIST", null);
        setField(term84254, term84254.getClass(), "symbols", null);
        setIntField(term84254, term84254.getClass(), "paramCount", 0);
        setField(term84254, term84254.getClass(), "variableNames", null);
        setField(term84254, term84254.getClass(), "isConsts", null);
        setField(term84254, term84254.getClass(), "compilerData", null);
        setIntField(term84254, term84254.getClass(), "tempNumber", 0);
        setField(term84254, term84254.getClass(), "symbolTable", null);
        setField(term84254, term84254.getClass(), "parentScope", null);
        setField(term84254, term84254.getClass(), "top", null);
        setField(term84254, term84254.getClass(), "childScopes", null);
        setField(term84254, term84254.getClass(), "target", null);
        setField(term84254, term84254.getClass(), "target2", null);
        setField(term84254, term84254.getClass(), "jumpNode", null);
        setIntField(term84254, term84254.getClass(), "position", 0);
        setIntField(term84254, term84254.getClass(), "length", 0);
        setField(term84254, term84254.getClass(), "parent", null);
        setIntField(term84254, term84254.getClass(), "type", 136);
        setField(term84254, term84254.getClass(), "next", null);
        setField(term84254, term84254.getClass(), "first", null);
        setField(term84254, term84254.getClass(), "last", null);
        setIntField(term84254, term84254.getClass(), "lineno", -1);
        setField(term84254, term84254.getClass(), "propListHead", null);
        term84245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84245, term84245.getClass(), "type", 132);
        setField(term84245, term84245.getClass(), "next", null);
        setField(term84245, term84245.getClass(), "first", null);
        setField(term84245, term84245.getClass(), "last", null);
        setField(term84245, term84245.getClass(), "propListHead", null);
        setIntField(term84245, term84245.getClass(), "sourcePosition", -1);
        setField(term84245, term84245.getClass(), "jsType", null);
        setField(term84245, term84245.getClass(), "parent", null);
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
        args[0] = term82233;
        args[1] = null;
        args[2] = "";
        args[3] = term82363;
        args[4] = null;
        Object retValue = callMethod(klass, "transformTree", argTypes, null, args);
        assertTrue(recursiveEquals(term82233, ""));
        assertTrue(recursiveEquals(term82363, null));
        assertTrue(recursiveEquals(retValue, term84245));
    }

};


