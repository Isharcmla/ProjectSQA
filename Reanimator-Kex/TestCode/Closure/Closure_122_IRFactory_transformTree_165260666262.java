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

public class IRFactory_transformTree_165260666262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105194;
     Object term105286;

    public IRFactory_transformTree_165260666262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105194 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term105194, term105194.getClass(), "type", 136);
        setField(term105194, term105194.getClass(), "first", null);
        setField(term105194, term105194.getClass(), "propListHead", null);
        setIntField(term105194, term105194.getClass(), "lineno", -2147483648);
        Class<? extends Object> term105444 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term105443 = ((Class) term105444).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term105443).setAccessible(true);
        Object enum143 = ((Field) term105443).get((Object) null);
        term105286 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term105286, term105286.getClass(), "languageMode", enum143);
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
        args[0] = term105194;
        args[1] = null;
        args[2] = null;
        args[3] = term105286;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


