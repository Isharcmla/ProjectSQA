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

public class IRFactory_transformTree_165260666239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96357;
     Object term96487;
     Object term96761;

    public IRFactory_transformTree_165260666239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96357 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term96357, term96357.getClass(), "type", 136);
        setField(term96357, term96357.getClass(), "first", null);
        setField(term96357, term96357.getClass(), "propListHead", null);
        setIntField(term96357, term96357.getClass(), "lineno", -1);
        setField(term96357, term96357.getClass(), "parent", null);
        setIntField(term96357, term96357.getClass(), "position", 0);
        Class<? extends Object> term96763 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term96762 = ((Class) term96763).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term96762).setAccessible(true);
        Object enum139 = ((Field) term96762).get((Object) null);
        term96487 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term96487, term96487.getClass(), "languageMode", enum139);
        term96761 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
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
        args[0] = term96357;
        args[1] = null;
        args[2] = "";
        args[3] = term96487;
        args[4] = term96761;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


