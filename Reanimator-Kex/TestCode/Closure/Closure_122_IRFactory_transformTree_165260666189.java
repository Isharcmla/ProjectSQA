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
import java.lang.String;
import java.lang.Object;

public class IRFactory_transformTree_165260666189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79007;
     Object term79099;
     Object term79363;

    public IRFactory_transformTree_165260666189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79007 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term79007, term79007.getClass(), "type", 136);
        setField(term79007, term79007.getClass(), "first", null);
        setField(term79007, term79007.getClass(), "propListHead", null);
        setIntField(term79007, term79007.getClass(), "lineno", 0);
        Class<? extends Object> term80485 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term80484 = ((Class) term80485).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term80484).setAccessible(true);
        Object enum127 = ((Field) term80484).get((Object) null);
        term79099 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term79099, term79099.getClass(), "languageMode", enum127);
        term79363 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
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
        args[0] = term79007;
        args[1] = null;
        args[2] = null;
        args[3] = term79099;
        args[4] = term79363;
        try {
            callMethod(klass, "transformTree", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


