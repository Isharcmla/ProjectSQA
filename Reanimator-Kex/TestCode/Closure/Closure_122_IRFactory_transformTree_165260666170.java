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

public class IRFactory_transformTree_165260666170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73519;
     Object term73649;
     Object term74720;
     Object term74724;
     Object term74712;

    public IRFactory_transformTree_165260666170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73519 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term73519, term73519.getClass(), "type", 136);
        setField(term73519, term73519.getClass(), "first", null);
        setField(term73519, term73519.getClass(), "propListHead", null);
        setIntField(term73519, term73519.getClass(), "lineno", -1);
        setField(term73519, term73519.getClass(), "parent", null);
        setIntField(term73519, term73519.getClass(), "position", 0);
        setIntField(term73519, term73519.getClass(), "length", -1);
        setField(term73519, term73519.getClass(), "comments", null);
        Class<? extends Object> term74726 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term74725 = ((Class) term74726).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term74725).setAccessible(true);
        Object enum121 = ((Field) term74725).get((Object) null);
        term73649 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term73649, term73649.getClass(), "languageMode", enum121);
        setBooleanField(term73649, term73649.getClass(), "isIdeMode", true);
        Class<? extends Object> term75046 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term75045 = ((Class) term75046).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term75045).setAccessible(true);
        Object enum122 = ((Field) term75045).get((Object) null);
        term74720 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term74720, term74720.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term74720, term74720.getClass(), "isIdeMode", true);
        setField(term74720, term74720.getClass(), "annotationNames", null);
        setField(term74720, term74720.getClass(), "suppressionNames", null);
        setField(term74720, term74720.getClass(), "languageMode", enum122);
        setBooleanField(term74720, term74720.getClass(), "acceptConstKeyword", false);
        term74724 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setField(term74724, term74724.getClass(), "comments", null);
        setBooleanField(term74724, term74724.getClass(), "inStrictMode", false);
        setIntField(term74724, term74724.getClass(), "encodedSourceStart", 0);
        setIntField(term74724, term74724.getClass(), "encodedSourceEnd", 0);
        setField(term74724, term74724.getClass(), "sourceName", null);
        setField(term74724, term74724.getClass(), "encodedSource", null);
        setIntField(term74724, term74724.getClass(), "endLineno", 0);
        setField(term74724, term74724.getClass(), "functions", null);
        setField(term74724, term74724.getClass(), "regexps", null);
        setField(term74724, term74724.getClass(), "EMPTY_LIST", null);
        setField(term74724, term74724.getClass(), "symbols", null);
        setIntField(term74724, term74724.getClass(), "paramCount", 0);
        setField(term74724, term74724.getClass(), "variableNames", null);
        setField(term74724, term74724.getClass(), "isConsts", null);
        setField(term74724, term74724.getClass(), "compilerData", null);
        setIntField(term74724, term74724.getClass(), "tempNumber", 0);
        setField(term74724, term74724.getClass(), "symbolTable", null);
        setField(term74724, term74724.getClass(), "parentScope", null);
        setField(term74724, term74724.getClass(), "top", null);
        setField(term74724, term74724.getClass(), "childScopes", null);
        setField(term74724, term74724.getClass(), "target", null);
        setField(term74724, term74724.getClass(), "target2", null);
        setField(term74724, term74724.getClass(), "jumpNode", null);
        setIntField(term74724, term74724.getClass(), "position", 0);
        setIntField(term74724, term74724.getClass(), "length", -1);
        setField(term74724, term74724.getClass(), "parent", null);
        setIntField(term74724, term74724.getClass(), "type", 136);
        setField(term74724, term74724.getClass(), "next", null);
        setField(term74724, term74724.getClass(), "first", null);
        setField(term74724, term74724.getClass(), "last", null);
        setIntField(term74724, term74724.getClass(), "lineno", -1);
        setField(term74724, term74724.getClass(), "propListHead", null);
        term74712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74714 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term74712, term74712.getClass(), "type", 132);
        setField(term74712, term74712.getClass(), "next", null);
        setField(term74712, term74712.getClass(), "first", null);
        setField(term74712, term74712.getClass(), "last", null);
        setIntField(term74714, term74714.getClass(), "intValue", -1);
        setField(term74714, term74714.getClass(), "next", null);
        setIntField(term74714, term74714.getClass(), "propType", 52);
        setField(term74712, term74712.getClass(), "propListHead", term74714);
        setIntField(term74712, term74712.getClass(), "sourcePosition", -1);
        setField(term74712, term74712.getClass(), "jsType", null);
        setField(term74712, term74712.getClass(), "parent", null);
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
        args[0] = term73519;
        args[1] = null;
        args[2] = "";
        args[3] = term73649;
        args[4] = null;
        Object retValue = callMethod(klass, "transformTree", argTypes, null, args);
        assertTrue(recursiveEquals(term73519, ""));
        assertTrue(recursiveEquals(term73649, null));
        assertTrue(recursiveEquals(retValue, term74712));
    }

};


