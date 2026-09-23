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

public class IRFactory_init_1761821480243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98982;
     Object term99074;

    public IRFactory_init_1761821480243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98196 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term98266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98346 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term98476 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term98632 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        Object term98770 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term98840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98196, term98196.getClass(), "parsedComments", null);
        setField(term98196, term98196.getClass(), "rootNodeJsDocHolder", term98266);
        setField(term98196, term98196.getClass(), "fileLevelJsDocBuilder", null);
        setField(term98196, term98196.getClass(), "fileOverviewInfo", term98346);
        setField(term98196, term98196.getClass(), "sourceString", null);
        setField(term98196, term98196.getClass(), "sourceFile", null);
        setField(term98196, term98196.getClass(), "sourceName", "");
        setField(term98196, term98196.getClass(), "config", term98476);
        setField(term98196, term98196.getClass(), "errorReporter", term98632);
        setField(term98196, term98196.getClass(), "transformDispatcher", term98770);
        setField(term98196, term98196.getClass(), "templateNode", term98840);
        term98982 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term98982, term98982.getClass(), "fileName", null);
        term99074 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
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
        args[1] = term98982;
        args[2] = term99074;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


