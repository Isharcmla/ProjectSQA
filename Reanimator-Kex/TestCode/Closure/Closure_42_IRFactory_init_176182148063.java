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
import java.util.HashSet;

public class IRFactory_init_176182148063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43262;

    public IRFactory_init_176182148063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term42848 = new HashSet();
        Object term42800 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term42918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43032 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term43120 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term42800, term42800.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term42800, term42800.getClass(), "parsedComments", term42848);
        setField(term42800, term42800.getClass(), "rootNodeJsDocHolder", term42918);
        setField(term42800, term42800.getClass(), "fileLevelJsDocBuilder", term43032);
        setField(term42800, term42800.getClass(), "fileOverviewInfo", null);
        setField(term42800, term42800.getClass(), "sourceString", null);
        setField(term42800, term42800.getClass(), "sourceFile", term43120);
        term43262 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
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
        args[1] = term43262;
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


