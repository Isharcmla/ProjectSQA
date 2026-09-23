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
import java.lang.Object;

public class IRFactory_init_1761821480143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48330;

    public IRFactory_init_1761821480143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48040 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term48120 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term48204 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term48040, term48040.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term48040, term48040.getClass(), "parsedComments", null);
        setField(term48040, term48040.getClass(), "rootNodeJsDocHolder", null);
        setField(term48040, term48040.getClass(), "fileLevelJsDocBuilder", null);
        setField(term48040, term48040.getClass(), "fileOverviewInfo", term48120);
        setField(term48040, term48040.getClass(), "sourceString", null);
        setField(term48040, term48040.getClass(), "sourceFile", term48204);
        term48330 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
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
        args[0] = "";
        args[1] = term48330;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


