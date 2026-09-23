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

public class IRFactory_isExprStmt_1271743014174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75479;
     Object term75579;
     Object term75601;
     Object term75602;

    public IRFactory_isExprStmt_1271743014174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75479 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term75579 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.XmlPropRef"));
        setIntField(term75579, term75579.getClass(), "type", 134);
        term75601 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term75601, term75601.getClass(), "sourceString", null);
        setField(term75601, term75601.getClass(), "sourceFile", null);
        setField(term75601, term75601.getClass(), "sourceName", null);
        setField(term75601, term75601.getClass(), "config", null);
        setField(term75601, term75601.getClass(), "errorReporter", null);
        setField(term75601, term75601.getClass(), "transformDispatcher", null);
        setField(term75601, term75601.getClass(), "reservedKeywords", null);
        setField(term75601, term75601.getClass(), "parsedComments", null);
        setField(term75601, term75601.getClass(), "rootNodeJsDocHolder", null);
        setField(term75601, term75601.getClass(), "fileLevelJsDocBuilder", null);
        setField(term75601, term75601.getClass(), "fileOverviewInfo", null);
        setField(term75601, term75601.getClass(), "templateNode", null);
        term75602 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.XmlPropRef"));
        setField(term75602, term75602.getClass(), "propName", null);
        setField(term75602, term75602.getClass(), "namespace", null);
        setIntField(term75602, term75602.getClass(), "atPos", 0);
        setIntField(term75602, term75602.getClass(), "colonPos", 0);
        setIntField(term75602, term75602.getClass(), "position", 0);
        setIntField(term75602, term75602.getClass(), "length", 0);
        setField(term75602, term75602.getClass(), "parent", null);
        setIntField(term75602, term75602.getClass(), "type", 134);
        setField(term75602, term75602.getClass(), "next", null);
        setField(term75602, term75602.getClass(), "first", null);
        setField(term75602, term75602.getClass(), "last", null);
        setIntField(term75602, term75602.getClass(), "lineno", 0);
        setField(term75602, term75602.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term75579;
        Object retValue = callMethod(klass, "isExprStmt", argTypes, term75479, args);
        assertTrue(recursiveEquals(term75479, term75601));
        assertTrue(recursiveEquals(term75579, term75602));
        assertTrue(recursiveEquals(retValue, true));
    }

};


