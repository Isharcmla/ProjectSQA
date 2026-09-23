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
import java.lang.String;
import java.lang.Object;

public class IRFactory_transformTree_165260666242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97430;
     Object term97522;

    public IRFactory_transformTree_165260666242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97430 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term97430, term97430.getClass(), "type", 136);
        setField(term97430, term97430.getClass(), "first", null);
        setField(term97430, term97430.getClass(), "propListHead", null);
        setIntField(term97430, term97430.getClass(), "lineno", 0);
        Class<? extends Object> term97680 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term97679 = ((Class) term97680).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term97679).setAccessible(true);
        Object enum140 = ((Field) term97679).get((Object) null);
        term97522 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term97522, term97522.getClass(), "languageMode", enum140);
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
        args[0] = term97430;
        args[1] = null;
        args[2] = null;
        args[3] = term97522;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


