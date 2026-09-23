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

public class IRFactory_transformTree_165260666145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69288;
     Object term69418;
     Object term70851;
     Object term70855;
     Object term70846;

    public IRFactory_transformTree_165260666145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69288 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term69288, term69288.getClass(), "type", 136);
        setField(term69288, term69288.getClass(), "first", null);
        setField(term69288, term69288.getClass(), "propListHead", null);
        setIntField(term69288, term69288.getClass(), "lineno", -1);
        setField(term69288, term69288.getClass(), "parent", null);
        setIntField(term69288, term69288.getClass(), "position", 0);
        Class<? extends Object> term70857 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term70856 = ((Class) term70857).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term70856).setAccessible(true);
        Object enum118 = ((Field) term70856).get((Object) null);
        term69418 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term69418, term69418.getClass(), "languageMode", enum118);
        Class<? extends Object> term71198 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term71197 = ((Class) term71198).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term71197).setAccessible(true);
        Object enum119 = ((Field) term71197).get((Object) null);
        term70851 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term70851, term70851.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term70851, term70851.getClass(), "isIdeMode", false);
        setField(term70851, term70851.getClass(), "annotationNames", null);
        setField(term70851, term70851.getClass(), "suppressionNames", null);
        setField(term70851, term70851.getClass(), "languageMode", enum119);
        setBooleanField(term70851, term70851.getClass(), "acceptConstKeyword", false);
        term70855 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setField(term70855, term70855.getClass(), "comments", null);
        setBooleanField(term70855, term70855.getClass(), "inStrictMode", false);
        setIntField(term70855, term70855.getClass(), "encodedSourceStart", 0);
        setIntField(term70855, term70855.getClass(), "encodedSourceEnd", 0);
        setField(term70855, term70855.getClass(), "sourceName", null);
        setField(term70855, term70855.getClass(), "encodedSource", null);
        setIntField(term70855, term70855.getClass(), "endLineno", 0);
        setField(term70855, term70855.getClass(), "functions", null);
        setField(term70855, term70855.getClass(), "regexps", null);
        setField(term70855, term70855.getClass(), "EMPTY_LIST", null);
        setField(term70855, term70855.getClass(), "symbols", null);
        setIntField(term70855, term70855.getClass(), "paramCount", 0);
        setField(term70855, term70855.getClass(), "variableNames", null);
        setField(term70855, term70855.getClass(), "isConsts", null);
        setField(term70855, term70855.getClass(), "compilerData", null);
        setIntField(term70855, term70855.getClass(), "tempNumber", 0);
        setField(term70855, term70855.getClass(), "symbolTable", null);
        setField(term70855, term70855.getClass(), "parentScope", null);
        setField(term70855, term70855.getClass(), "top", null);
        setField(term70855, term70855.getClass(), "childScopes", null);
        setField(term70855, term70855.getClass(), "target", null);
        setField(term70855, term70855.getClass(), "target2", null);
        setField(term70855, term70855.getClass(), "jumpNode", null);
        setIntField(term70855, term70855.getClass(), "position", 0);
        setIntField(term70855, term70855.getClass(), "length", 0);
        setField(term70855, term70855.getClass(), "parent", null);
        setIntField(term70855, term70855.getClass(), "type", 136);
        setField(term70855, term70855.getClass(), "next", null);
        setField(term70855, term70855.getClass(), "first", null);
        setField(term70855, term70855.getClass(), "last", null);
        setIntField(term70855, term70855.getClass(), "lineno", -1);
        setField(term70855, term70855.getClass(), "propListHead", null);
        term70846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70846, term70846.getClass(), "type", 132);
        setField(term70846, term70846.getClass(), "next", null);
        setField(term70846, term70846.getClass(), "first", null);
        setField(term70846, term70846.getClass(), "last", null);
        setField(term70846, term70846.getClass(), "propListHead", null);
        setIntField(term70846, term70846.getClass(), "sourcePosition", -1);
        setField(term70846, term70846.getClass(), "jsType", null);
        setField(term70846, term70846.getClass(), "parent", null);
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
        args[0] = term69288;
        args[1] = null;
        args[2] = "";
        args[3] = term69418;
        args[4] = null;
        Object retValue = callMethod(klass, "transformTree", argTypes, null, args);
        assertTrue(recursiveEquals(term69288, ""));
        assertTrue(recursiveEquals(term69418, null));
        assertTrue(recursiveEquals(retValue, term70846));
    }

};


