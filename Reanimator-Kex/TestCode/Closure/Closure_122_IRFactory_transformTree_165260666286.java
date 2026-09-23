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

public class IRFactory_transformTree_165260666286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114551;
     Object term114787;

    public IRFactory_transformTree_165260666286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114551 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term114657 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term114551, term114551.getClass(), "type", 136);
        setField(term114551, term114551.getClass(), "first", null);
        setIntField(term114657, term114657.getClass(), "type", -25);
        setField(term114657, term114657.getClass(), "next", null);
        setField(term114551, term114551.getClass(), "propListHead", term114657);
        setIntField(term114551, term114551.getClass(), "lineno", 0);
        setIntField(term114551, term114551.getClass(), "position", 0);
        setField(term114551, term114551.getClass(), "parent", null);
        Class<? extends Object> term114945 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term114944 = ((Class) term114945).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term114944).setAccessible(true);
        Object enum149 = ((Field) term114944).get((Object) null);
        term114787 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term114787, term114787.getClass(), "languageMode", enum149);
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
        args[0] = term114551;
        args[1] = null;
        args[2] = "";
        args[3] = term114787;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


