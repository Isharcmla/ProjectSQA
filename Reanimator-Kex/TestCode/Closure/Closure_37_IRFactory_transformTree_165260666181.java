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

public class IRFactory_transformTree_165260666181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53013;
     Object term53211;

    public IRFactory_transformTree_165260666181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53013 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term53119 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term53013, term53013.getClass(), "type", 136);
        setField(term53013, term53013.getClass(), "first", null);
        setField(term53013, term53013.getClass(), "propListHead", term53119);
        Class<? extends Object> term54330 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term54329 = ((Class) term54330).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term54329).setAccessible(true);
        Object enum89 = ((Field) term54329).get((Object) null);
        term53211 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term53211, term53211.getClass(), "languageMode", enum89);
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
        args[0] = term53013;
        args[1] = null;
        args[2] = null;
        args[3] = term53211;
        args[4] = null;
        try {
            callMethod(klass, "transformTree", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


