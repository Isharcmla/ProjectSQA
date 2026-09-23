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

public class IRFactory_init_1761821480253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68490;

    public IRFactory_init_1761821480253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term68360 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term68360, term68360.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term68360, term68360.getClass(), "parsedComments", null);
        setField(term68360, term68360.getClass(), "rootNodeJsDocHolder", null);
        setField(term68360, term68360.getClass(), "fileLevelJsDocBuilder", null);
        setField(term68360, term68360.getClass(), "fileOverviewInfo", null);
        setField(term68360, term68360.getClass(), "sourceString", null);
        setField(term68360, term68360.getClass(), "sourceFile", null);
        setField(term68360, term68360.getClass(), "sourceName", "");
        setField(term68360, term68360.getClass(), "config", null);
        setField(term68360, term68360.getClass(), "errorReporter", null);
        setField(term68360, term68360.getClass(), "transformDispatcher", null);
        setField(term68360, term68360.getClass(), "templateNode", null);
        Class<? extends Object> term68648 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term68647 = ((Class) term68648).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term68647).setAccessible(true);
        Object enum94 = ((Field) term68647).get((Object) null);
        term68490 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term68490, term68490.getClass(), "languageMode", enum94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSourceFile");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.parsing.Config");
        argTypes[3] = Class.forName("com.google.javascript.rhino.head.ErrorReporter");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term68490;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


