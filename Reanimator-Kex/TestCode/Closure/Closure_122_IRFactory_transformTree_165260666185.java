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

public class IRFactory_transformTree_165260666185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76474;
     Object term76604;
     Object term76916;
     Object term77833;
     Object term77837;
     Object term77838;
     Object term77825;

    public IRFactory_transformTree_165260666185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76474 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term76474, term76474.getClass(), "type", 136);
        setField(term76474, term76474.getClass(), "first", null);
        setField(term76474, term76474.getClass(), "propListHead", null);
        setIntField(term76474, term76474.getClass(), "lineno", -1);
        setField(term76474, term76474.getClass(), "parent", null);
        setIntField(term76474, term76474.getClass(), "position", 0);
        setIntField(term76474, term76474.getClass(), "length", -1);
        setField(term76474, term76474.getClass(), "comments", null);
        Class<? extends Object> term77840 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term77839 = ((Class) term77840).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term77839).setAccessible(true);
        Object enum124 = ((Field) term77839).get((Object) null);
        term76604 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term76604, term76604.getClass(), "languageMode", enum124);
        setBooleanField(term76604, term76604.getClass(), "isIdeMode", true);
        term76916 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        Class<? extends Object> term78160 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term78159 = ((Class) term78160).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term78159).setAccessible(true);
        Object enum125 = ((Field) term78159).get((Object) null);
        term77833 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term77833, term77833.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term77833, term77833.getClass(), "isIdeMode", true);
        setField(term77833, term77833.getClass(), "annotationNames", null);
        setField(term77833, term77833.getClass(), "suppressionNames", null);
        setField(term77833, term77833.getClass(), "languageMode", enum125);
        setBooleanField(term77833, term77833.getClass(), "acceptConstKeyword", false);
        term77837 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        term77838 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setField(term77838, term77838.getClass(), "comments", null);
        setBooleanField(term77838, term77838.getClass(), "inStrictMode", false);
        setIntField(term77838, term77838.getClass(), "encodedSourceStart", 0);
        setIntField(term77838, term77838.getClass(), "encodedSourceEnd", 0);
        setField(term77838, term77838.getClass(), "sourceName", null);
        setField(term77838, term77838.getClass(), "encodedSource", null);
        setIntField(term77838, term77838.getClass(), "endLineno", 0);
        setField(term77838, term77838.getClass(), "functions", null);
        setField(term77838, term77838.getClass(), "regexps", null);
        setField(term77838, term77838.getClass(), "EMPTY_LIST", null);
        setField(term77838, term77838.getClass(), "symbols", null);
        setIntField(term77838, term77838.getClass(), "paramCount", 0);
        setField(term77838, term77838.getClass(), "variableNames", null);
        setField(term77838, term77838.getClass(), "isConsts", null);
        setField(term77838, term77838.getClass(), "compilerData", null);
        setIntField(term77838, term77838.getClass(), "tempNumber", 0);
        setField(term77838, term77838.getClass(), "symbolTable", null);
        setField(term77838, term77838.getClass(), "parentScope", null);
        setField(term77838, term77838.getClass(), "top", null);
        setField(term77838, term77838.getClass(), "childScopes", null);
        setField(term77838, term77838.getClass(), "target", null);
        setField(term77838, term77838.getClass(), "target2", null);
        setField(term77838, term77838.getClass(), "jumpNode", null);
        setIntField(term77838, term77838.getClass(), "position", 0);
        setIntField(term77838, term77838.getClass(), "length", -1);
        setField(term77838, term77838.getClass(), "parent", null);
        setIntField(term77838, term77838.getClass(), "type", 136);
        setField(term77838, term77838.getClass(), "next", null);
        setField(term77838, term77838.getClass(), "first", null);
        setField(term77838, term77838.getClass(), "last", null);
        setIntField(term77838, term77838.getClass(), "lineno", -1);
        setField(term77838, term77838.getClass(), "propListHead", null);
        term77825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77827 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term77825, term77825.getClass(), "type", 132);
        setField(term77825, term77825.getClass(), "next", null);
        setField(term77825, term77825.getClass(), "first", null);
        setField(term77825, term77825.getClass(), "last", null);
        setIntField(term77827, term77827.getClass(), "intValue", -1);
        setField(term77827, term77827.getClass(), "next", null);
        setIntField(term77827, term77827.getClass(), "propType", 52);
        setField(term77825, term77825.getClass(), "propListHead", term77827);
        setIntField(term77825, term77825.getClass(), "sourcePosition", -1);
        setField(term77825, term77825.getClass(), "jsType", null);
        setField(term77825, term77825.getClass(), "parent", null);
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
        args[0] = term76474;
        args[1] = null;
        args[2] = "";
        args[3] = term76604;
        args[4] = term76916;
        Object retValue = callMethod(klass, "transformTree", argTypes, null, args);
        assertTrue(recursiveEquals(term76474, ""));
        assertTrue(recursiveEquals(term76604, term77837));
        assertTrue(recursiveEquals(term76916, term77838));
        assertTrue(recursiveEquals(retValue, term77825));
    }

};


