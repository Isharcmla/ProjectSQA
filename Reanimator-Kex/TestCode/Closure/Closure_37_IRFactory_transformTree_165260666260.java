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

public class IRFactory_transformTree_165260666260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72747;
     Object term72877;

    public IRFactory_transformTree_165260666260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setField(term72747, term72747.getClass(), "name", "ECMASCRIPT5");
        Class<? extends Object> term73046 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term73045 = ((Class) term73046).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term73045).setAccessible(true);
        Object enum96 = ((Field) term73045).get((Object) null);
        term72877 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term72877, term72877.getClass(), "languageMode", enum96);
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
        args[1] = term72747;
        args[2] = null;
        args[3] = term72877;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


