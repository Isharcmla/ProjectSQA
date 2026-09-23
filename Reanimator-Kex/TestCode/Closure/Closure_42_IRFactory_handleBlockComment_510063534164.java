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
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;

public class IRFactory_handleBlockComment_510063534164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59685;
     Object term59779;
     Object term59830;
     Object term59831;

    public IRFactory_handleBlockComment_510063534164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59685 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term59779 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term59779, term59779.getClass(), "value", "");
        term59830 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term59830, term59830.getClass(), "sourceString", null);
        setField(term59830, term59830.getClass(), "sourceFile", null);
        setField(term59830, term59830.getClass(), "sourceName", null);
        setField(term59830, term59830.getClass(), "config", null);
        setField(term59830, term59830.getClass(), "errorReporter", null);
        setField(term59830, term59830.getClass(), "transformDispatcher", null);
        setField(term59830, term59830.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term59830, term59830.getClass(), "reservedKeywords", null);
        setField(term59830, term59830.getClass(), "parsedComments", null);
        setField(term59830, term59830.getClass(), "rootNodeJsDocHolder", null);
        setField(term59830, term59830.getClass(), "fileLevelJsDocBuilder", null);
        setField(term59830, term59830.getClass(), "fileOverviewInfo", null);
        setField(term59830, term59830.getClass(), "templateNode", null);
        term59831 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term59831, term59831.getClass(), "value", "");
        setField(term59831, term59831.getClass(), "commentType", null);
        setIntField(term59831, term59831.getClass(), "position", 0);
        setIntField(term59831, term59831.getClass(), "length", 0);
        setField(term59831, term59831.getClass(), "parent", null);
        setIntField(term59831, term59831.getClass(), "type", 0);
        setField(term59831, term59831.getClass(), "next", null);
        setField(term59831, term59831.getClass(), "first", null);
        setField(term59831, term59831.getClass(), "last", null);
        setIntField(term59831, term59831.getClass(), "lineno", 0);
        setField(term59831, term59831.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term59779;
        callMethod(klass, "handleBlockComment", argTypes, term59685, args);
        assertTrue(recursiveEquals(term59685, term59830));
        assertTrue(recursiveEquals(term59779, term59831));
    }

};


