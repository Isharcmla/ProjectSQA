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

public class IRFactory_transformTree_165260666233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94677;
     Object term94847;

    public IRFactory_transformTree_165260666233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94677 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term94717 = newInstance(Class.forName("java.util.TreeSet"));
        setIntField(term94677, term94677.getClass(), "type", 136);
        setField(term94677, term94677.getClass(), "first", null);
        setField(term94677, term94677.getClass(), "propListHead", null);
        setIntField(term94677, term94677.getClass(), "lineno", -1);
        setField(term94677, term94677.getClass(), "parent", null);
        setIntField(term94677, term94677.getClass(), "position", 0);
        setIntField(term94677, term94677.getClass(), "length", -1);
        setField(term94677, term94677.getClass(), "comments", term94717);
        Class<? extends Object> term95005 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term95004 = ((Class) term95005).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term95004).setAccessible(true);
        Object enum138 = ((Field) term95004).get((Object) null);
        term94847 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term94847, term94847.getClass(), "languageMode", enum138);
        setBooleanField(term94847, term94847.getClass(), "isIdeMode", true);
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
        args[0] = term94677;
        args[1] = null;
        args[2] = "";
        args[3] = term94847;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


