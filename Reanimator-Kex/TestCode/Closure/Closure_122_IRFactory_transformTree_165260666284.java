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

public class IRFactory_transformTree_165260666284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113335;
     Object term113505;

    public IRFactory_transformTree_165260666284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113335 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term113375 = newInstance(Class.forName("java.util.TreeSet"));
        setIntField(term113335, term113335.getClass(), "type", 136);
        setField(term113335, term113335.getClass(), "first", null);
        setField(term113335, term113335.getClass(), "propListHead", null);
        setIntField(term113335, term113335.getClass(), "lineno", -1);
        setField(term113335, term113335.getClass(), "parent", null);
        setIntField(term113335, term113335.getClass(), "position", 0);
        setIntField(term113335, term113335.getClass(), "length", 0);
        setField(term113335, term113335.getClass(), "comments", term113375);
        Class<? extends Object> term113663 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term113662 = ((Class) term113663).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term113662).setAccessible(true);
        Object enum148 = ((Field) term113662).get((Object) null);
        term113505 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term113505, term113505.getClass(), "languageMode", enum148);
        setBooleanField(term113505, term113505.getClass(), "isIdeMode", true);
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
        args[0] = term113335;
        args[1] = null;
        args[2] = "";
        args[3] = term113505;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


