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
import java.lang.Object;
import java.lang.String;

public class IRFactory_transformTree_165260666259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71489;
     Object term71831;
     Object term72131;

    public IRFactory_transformTree_165260666259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71489 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term71595 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term71701 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term71489, term71489.getClass(), "type", 136);
        setField(term71489, term71489.getClass(), "first", null);
        setIntField(term71595, term71595.getClass(), "type", -25);
        setField(term71595, term71595.getClass(), "next", term71701);
        setField(term71489, term71489.getClass(), "propListHead", term71595);
        Class<? extends Object> term72143 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term72142 = ((Class) term72143).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term72142).setAccessible(true);
        Object enum95 = ((Field) term72142).get((Object) null);
        term71831 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term71831, term71831.getClass(), "languageMode", enum95);
        term72131 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter"));
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
        args[0] = term71489;
        args[1] = null;
        args[2] = "use strict";
        args[3] = term71831;
        args[4] = term72131;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


