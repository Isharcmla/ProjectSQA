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

public class IRFactory_transformTree_165260666268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106975;
     Object term107173;

    public IRFactory_transformTree_165260666268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106975 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term107081 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term106975, term106975.getClass(), "type", 136);
        setField(term106975, term106975.getClass(), "first", null);
        setIntField(term107081, term107081.getClass(), "type", -25);
        setField(term107081, term107081.getClass(), "next", null);
        setField(term106975, term106975.getClass(), "propListHead", term107081);
        setIntField(term106975, term106975.getClass(), "lineno", -2147483648);
        Class<? extends Object> term107331 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term107330 = ((Class) term107331).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term107330).setAccessible(true);
        Object enum144 = ((Field) term107330).get((Object) null);
        term107173 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term107173, term107173.getClass(), "languageMode", enum144);
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
        args[0] = term106975;
        args[1] = null;
        args[2] = null;
        args[3] = term107173;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


