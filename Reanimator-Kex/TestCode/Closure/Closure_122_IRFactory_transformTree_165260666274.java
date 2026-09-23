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

public class IRFactory_transformTree_165260666274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109388;
     Object term109624;

    public IRFactory_transformTree_165260666274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109388 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term109494 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term109388, term109388.getClass(), "type", 136);
        setField(term109388, term109388.getClass(), "first", null);
        setField(term109388, term109388.getClass(), "propListHead", term109494);
        Class<? extends Object> term109782 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term109781 = ((Class) term109782).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term109781).setAccessible(true);
        Object enum146 = ((Field) term109781).get((Object) null);
        term109624 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term109624, term109624.getClass(), "languageMode", enum146);
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
        args[0] = term109388;
        args[1] = null;
        args[2] = "";
        args[3] = term109624;
        args[4] = null;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


