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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class IRFactory_transformTree_165260666204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86094;
     Object term86292;
     Object term86556;

    public IRFactory_transformTree_165260666204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86094 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term86200 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term86094, term86094.getClass(), "type", 136);
        setField(term86094, term86094.getClass(), "first", null);
        setField(term86094, term86094.getClass(), "propListHead", term86200);
        Class<? extends Object> term87456 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term87455 = ((Class) term87456).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term87455).setAccessible(true);
        Object enum133 = ((Field) term87455).get((Object) null);
        term86292 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term86292, term86292.getClass(), "languageMode", enum133);
        term86556 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
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
        args[0] = term86094;
        args[1] = null;
        args[2] = null;
        args[3] = term86292;
        args[4] = term86556;
        try {
            callMethod(klass, "transformTree", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


