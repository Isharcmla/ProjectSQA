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

public class IRFactory_transformTree_16526066691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58205;
     Object term58335;
     Object term58609;
     Object term59491;
     Object term59495;
     Object term59496;
     Object term59486;

    public IRFactory_transformTree_16526066691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58205 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term58205, term58205.getClass(), "type", 136);
        setField(term58205, term58205.getClass(), "first", null);
        setField(term58205, term58205.getClass(), "propListHead", null);
        setIntField(term58205, term58205.getClass(), "lineno", -1);
        setField(term58205, term58205.getClass(), "parent", null);
        setIntField(term58205, term58205.getClass(), "position", 0);
        Class<? extends Object> term59498 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term59497 = ((Class) term59498).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term59497).setAccessible(true);
        Object enum107 = ((Field) term59497).get((Object) null);
        term58335 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term58335, term58335.getClass(), "languageMode", enum107);
        setBooleanField(term58335, term58335.getClass(), "isIdeMode", false);
        term58609 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        Class<? extends Object> term59818 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term59817 = ((Class) term59818).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term59817).setAccessible(true);
        Object enum108 = ((Field) term59817).get((Object) null);
        term59491 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term59491, term59491.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term59491, term59491.getClass(), "isIdeMode", false);
        setField(term59491, term59491.getClass(), "annotationNames", null);
        setField(term59491, term59491.getClass(), "suppressionNames", null);
        setField(term59491, term59491.getClass(), "languageMode", enum108);
        setBooleanField(term59491, term59491.getClass(), "acceptConstKeyword", false);
        term59495 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setBooleanField(term59495, term59495.getClass(), "hasReportedErrorFlag", false);
        setBooleanField(term59495, term59495.getClass(), "reportWarnings", false);
        setField(term59495, term59495.getClass(), "err", null);
        term59496 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setField(term59496, term59496.getClass(), "comments", null);
        setBooleanField(term59496, term59496.getClass(), "inStrictMode", false);
        setIntField(term59496, term59496.getClass(), "encodedSourceStart", 0);
        setIntField(term59496, term59496.getClass(), "encodedSourceEnd", 0);
        setField(term59496, term59496.getClass(), "sourceName", null);
        setField(term59496, term59496.getClass(), "encodedSource", null);
        setIntField(term59496, term59496.getClass(), "endLineno", 0);
        setField(term59496, term59496.getClass(), "functions", null);
        setField(term59496, term59496.getClass(), "regexps", null);
        setField(term59496, term59496.getClass(), "EMPTY_LIST", null);
        setField(term59496, term59496.getClass(), "symbols", null);
        setIntField(term59496, term59496.getClass(), "paramCount", 0);
        setField(term59496, term59496.getClass(), "variableNames", null);
        setField(term59496, term59496.getClass(), "isConsts", null);
        setField(term59496, term59496.getClass(), "compilerData", null);
        setIntField(term59496, term59496.getClass(), "tempNumber", 0);
        setField(term59496, term59496.getClass(), "symbolTable", null);
        setField(term59496, term59496.getClass(), "parentScope", null);
        setField(term59496, term59496.getClass(), "top", null);
        setField(term59496, term59496.getClass(), "childScopes", null);
        setField(term59496, term59496.getClass(), "target", null);
        setField(term59496, term59496.getClass(), "target2", null);
        setField(term59496, term59496.getClass(), "jumpNode", null);
        setIntField(term59496, term59496.getClass(), "position", 0);
        setIntField(term59496, term59496.getClass(), "length", 0);
        setField(term59496, term59496.getClass(), "parent", null);
        setIntField(term59496, term59496.getClass(), "type", 136);
        setField(term59496, term59496.getClass(), "next", null);
        setField(term59496, term59496.getClass(), "first", null);
        setField(term59496, term59496.getClass(), "last", null);
        setIntField(term59496, term59496.getClass(), "lineno", -1);
        setField(term59496, term59496.getClass(), "propListHead", null);
        term59486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59486, term59486.getClass(), "type", 132);
        setField(term59486, term59486.getClass(), "next", null);
        setField(term59486, term59486.getClass(), "first", null);
        setField(term59486, term59486.getClass(), "last", null);
        setField(term59486, term59486.getClass(), "propListHead", null);
        setIntField(term59486, term59486.getClass(), "sourcePosition", -1);
        setField(term59486, term59486.getClass(), "jsType", null);
        setField(term59486, term59486.getClass(), "parent", null);
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
        args[0] = term58205;
        args[1] = null;
        args[2] = "";
        args[3] = term58335;
        args[4] = term58609;
        Object retValue = callMethod(klass, "transformTree", argTypes, null, args);
        assertTrue(recursiveEquals(term58205, ""));
        assertTrue(recursiveEquals(term58335, term59495));
        assertTrue(recursiveEquals(term58609, term59496));
        assertTrue(recursiveEquals(retValue, term59486));
    }

};


