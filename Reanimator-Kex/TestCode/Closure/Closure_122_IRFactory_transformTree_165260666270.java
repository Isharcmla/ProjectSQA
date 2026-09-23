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

public class IRFactory_transformTree_165260666270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108055;
     Object term108253;

    public IRFactory_transformTree_165260666270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108055 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term108161 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term108055, term108055.getClass(), "type", 136);
        setField(term108055, term108055.getClass(), "first", null);
        setIntField(term108161, term108161.getClass(), "type", 24);
        setField(term108055, term108055.getClass(), "propListHead", term108161);
        Class<? extends Object> term108411 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term108410 = ((Class) term108411).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term108410).setAccessible(true);
        Object enum145 = ((Field) term108410).get((Object) null);
        term108253 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term108253, term108253.getClass(), "languageMode", enum145);
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
        args[0] = term108055;
        args[1] = null;
        args[2] = null;
        args[3] = term108253;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


