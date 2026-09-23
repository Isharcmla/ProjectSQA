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

public class IRFactory_init_1761821480219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59021;
     Object term59151;

    public IRFactory_init_1761821480219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58628 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term58758 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term58914 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term58628, term58628.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term58628, term58628.getClass(), "parsedComments", null);
        setField(term58628, term58628.getClass(), "rootNodeJsDocHolder", null);
        setField(term58628, term58628.getClass(), "fileLevelJsDocBuilder", null);
        setField(term58628, term58628.getClass(), "fileOverviewInfo", null);
        setField(term58628, term58628.getClass(), "sourceString", null);
        setField(term58628, term58628.getClass(), "sourceFile", null);
        setField(term58628, term58628.getClass(), "sourceName", "");
        setField(term58628, term58628.getClass(), "config", term58758);
        setField(term58628, term58628.getClass(), "errorReporter", term58914);
        setField(term58628, term58628.getClass(), "transformDispatcher", null);
        setField(term58628, term58628.getClass(), "templateNode", null);
        term59021 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term59021, term59021.getClass(), "fileName", "");
        term59151 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
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
        args[1] = term59021;
        args[2] = term59151;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


