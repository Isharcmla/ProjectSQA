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

public class IRFactory_transformTree_165260666278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111199;
     Object term111369;

    public IRFactory_transformTree_165260666278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111199 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term111239 = newInstance(Class.forName("java.util.TreeSet"));
        setIntField(term111199, term111199.getClass(), "type", 136);
        setField(term111199, term111199.getClass(), "first", null);
        setField(term111199, term111199.getClass(), "propListHead", null);
        setIntField(term111199, term111199.getClass(), "lineno", -1);
        setField(term111199, term111199.getClass(), "parent", null);
        setIntField(term111199, term111199.getClass(), "position", 0);
        setIntField(term111199, term111199.getClass(), "length", -1);
        setField(term111199, term111199.getClass(), "comments", term111239);
        Class<? extends Object> term111527 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term111526 = ((Class) term111527).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term111526).setAccessible(true);
        Object enum147 = ((Field) term111526).get((Object) null);
        term111369 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term111369, term111369.getClass(), "languageMode", enum147);
        setBooleanField(term111369, term111369.getClass(), "isIdeMode", true);
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
        args[0] = term111199;
        args[1] = null;
        args[2] = "";
        args[3] = term111369;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


