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

public class IRFactory_transformTree_165260666217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68260;
     Object term68660;
     Object term68856;

    public IRFactory_transformTree_165260666217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68858 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term68857 = ((Class) term68858).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term68857).setAccessible(true);
        Object enum103 = ((Field) term68857).get((Object) null);
        term68260 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term68366 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        term68660 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setIntField(term68260, term68260.getClass(), "type", 136);
        setField(term68260, term68260.getClass(), "first", null);
        setIntField(term68366, term68366.getClass(), "type", 24);
        setField(term68660, term68660.getClass(), "languageMode", enum103);
        setField(term68366, term68366.getClass(), "objectValue", term68660);
        setField(term68260, term68260.getClass(), "propListHead", term68366);
        term68856 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
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
        args[0] = term68260;
        args[1] = null;
        args[2] = null;
        args[3] = term68660;
        args[4] = term68856;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


