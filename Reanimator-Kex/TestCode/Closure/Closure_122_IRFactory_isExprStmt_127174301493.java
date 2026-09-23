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

public class IRFactory_isExprStmt_127174301493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59036;
     Object term59136;
     Object term60376;
     Object term60377;

    public IRFactory_isExprStmt_127174301493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59036 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term59136 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.XmlPropRef"));
        term60376 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term60376, term60376.getClass(), "sourceString", null);
        setField(term60376, term60376.getClass(), "sourceFile", null);
        setField(term60376, term60376.getClass(), "sourceName", null);
        setField(term60376, term60376.getClass(), "config", null);
        setField(term60376, term60376.getClass(), "errorReporter", null);
        setField(term60376, term60376.getClass(), "transformDispatcher", null);
        setField(term60376, term60376.getClass(), "reservedKeywords", null);
        setField(term60376, term60376.getClass(), "parsedComments", null);
        setField(term60376, term60376.getClass(), "rootNodeJsDocHolder", null);
        setField(term60376, term60376.getClass(), "fileLevelJsDocBuilder", null);
        setField(term60376, term60376.getClass(), "fileOverviewInfo", null);
        setField(term60376, term60376.getClass(), "templateNode", null);
        term60377 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.XmlPropRef"));
        setField(term60377, term60377.getClass(), "propName", null);
        setField(term60377, term60377.getClass(), "namespace", null);
        setIntField(term60377, term60377.getClass(), "atPos", 0);
        setIntField(term60377, term60377.getClass(), "colonPos", 0);
        setIntField(term60377, term60377.getClass(), "position", 0);
        setIntField(term60377, term60377.getClass(), "length", 0);
        setField(term60377, term60377.getClass(), "parent", null);
        setIntField(term60377, term60377.getClass(), "type", 0);
        setField(term60377, term60377.getClass(), "next", null);
        setField(term60377, term60377.getClass(), "first", null);
        setField(term60377, term60377.getClass(), "last", null);
        setIntField(term60377, term60377.getClass(), "lineno", 0);
        setField(term60377, term60377.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term59136;
        Object retValue = callMethod(klass, "isExprStmt", argTypes, term59036, args);
        assertTrue(recursiveEquals(term59036, term60376));
        assertTrue(recursiveEquals(term59136, term60377));
        assertTrue(recursiveEquals(retValue, false));
    }

};


