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

public class IRFactory_init_176182148072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52999;

    public IRFactory_init_176182148072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term52505 = new HashSet();
        Object term52457 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term52575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52689 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term52769 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term52895 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term52457, term52457.getClass(), "parsedComments", term52505);
        setField(term52457, term52457.getClass(), "rootNodeJsDocHolder", term52575);
        setField(term52457, term52457.getClass(), "fileLevelJsDocBuilder", term52689);
        setField(term52457, term52457.getClass(), "fileOverviewInfo", term52769);
        setField(term52457, term52457.getClass(), "sourceString", "");
        setField(term52457, term52457.getClass(), "sourceFile", term52895);
        term52999 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
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
        args[1] = term52999;
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


