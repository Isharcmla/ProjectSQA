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

public class IRFactory_init_1761821480150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56945;
     Object term57075;

    public IRFactory_init_1761821480150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56584 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term56714 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term56822 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
        setField(term56584, term56584.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term56584, term56584.getClass(), "parsedComments", null);
        setField(term56584, term56584.getClass(), "rootNodeJsDocHolder", null);
        setField(term56584, term56584.getClass(), "fileLevelJsDocBuilder", null);
        setField(term56584, term56584.getClass(), "fileOverviewInfo", null);
        setField(term56584, term56584.getClass(), "sourceString", null);
        setField(term56584, term56584.getClass(), "sourceFile", null);
        setField(term56584, term56584.getClass(), "sourceName", "");
        setField(term56584, term56584.getClass(), "config", term56714);
        setField(term56584, term56584.getClass(), "errorReporter", term56822);
        setField(term56584, term56584.getClass(), "transformDispatcher", null);
        setField(term56584, term56584.getClass(), "templateNode", null);
        term56945 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term56945, term56945.getClass(), "fileName", "");
        term57075 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
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
        args[1] = term56945;
        args[2] = term57075;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


