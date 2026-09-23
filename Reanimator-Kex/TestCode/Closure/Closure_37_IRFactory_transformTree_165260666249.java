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

public class IRFactory_transformTree_165260666249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65085;
     Object term65215;
     Object term65489;

    public IRFactory_transformTree_165260666249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65085 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        setIntField(term65085, term65085.getClass(), "type", 136);
        setField(term65085, term65085.getClass(), "first", null);
        setField(term65085, term65085.getClass(), "propListHead", null);
        Class<? extends Object> term65491 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term65490 = ((Class) term65491).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term65490).setAccessible(true);
        Object enum91 = ((Field) term65490).get((Object) null);
        term65215 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term65215, term65215.getClass(), "languageMode", enum91);
        term65489 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
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
        args[0] = term65085;
        args[1] = null;
        args[2] = "";
        args[3] = term65215;
        args[4] = term65489;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


