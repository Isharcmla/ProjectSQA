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

public class IRFactory_transformTree_165260666250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66279;
     Object term66547;

    public IRFactory_transformTree_165260666250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66549 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term66548 = ((Class) term66549).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term66548).setAccessible(true);
        Object enum92 = ((Field) term66548).get((Object) null);
        term66279 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term66279, term66279.getClass(), "languageMode", enum92);
        term66547 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
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
        args[0] = null;
        args[1] = null;
        args[2] = "";
        args[3] = term66279;
        args[4] = term66547;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


