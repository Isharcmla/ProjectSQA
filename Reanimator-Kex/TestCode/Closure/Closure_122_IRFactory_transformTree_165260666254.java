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

public class IRFactory_transformTree_165260666254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102030;
     Object term102200;

    public IRFactory_transformTree_165260666254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102030 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term102070 = newInstance(Class.forName("java.util.TreeSet"));
        setIntField(term102030, term102030.getClass(), "type", 136);
        setField(term102030, term102030.getClass(), "first", null);
        setField(term102030, term102030.getClass(), "propListHead", null);
        setIntField(term102030, term102030.getClass(), "lineno", -1);
        setField(term102030, term102030.getClass(), "parent", null);
        setIntField(term102030, term102030.getClass(), "position", 0);
        setIntField(term102030, term102030.getClass(), "length", -1);
        setField(term102030, term102030.getClass(), "comments", term102070);
        Class<? extends Object> term102358 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term102357 = ((Class) term102358).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term102357).setAccessible(true);
        Object enum141 = ((Field) term102357).get((Object) null);
        term102200 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term102200, term102200.getClass(), "languageMode", enum141);
        setBooleanField(term102200, term102200.getClass(), "isIdeMode", true);
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
        args[0] = term102030;
        args[1] = null;
        args[2] = "";
        args[3] = term102200;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


