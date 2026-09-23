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

public class IRFactory_isPropAccess_536103024196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81278;
     Object term81396;
     Object term81409;
     Object term81410;

    public IRFactory_isPropAccess_536103024196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81278 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term81396 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.VariableDeclaration"));
        setIntField(term81396, term81396.getClass(), "type", 36);
        term81409 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term81409, term81409.getClass(), "sourceString", null);
        setField(term81409, term81409.getClass(), "sourceFile", null);
        setField(term81409, term81409.getClass(), "sourceName", null);
        setField(term81409, term81409.getClass(), "config", null);
        setField(term81409, term81409.getClass(), "errorReporter", null);
        setField(term81409, term81409.getClass(), "transformDispatcher", null);
        setField(term81409, term81409.getClass(), "reservedKeywords", null);
        setField(term81409, term81409.getClass(), "parsedComments", null);
        setField(term81409, term81409.getClass(), "rootNodeJsDocHolder", null);
        setField(term81409, term81409.getClass(), "fileLevelJsDocBuilder", null);
        setField(term81409, term81409.getClass(), "fileOverviewInfo", null);
        setField(term81409, term81409.getClass(), "templateNode", null);
        term81410 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.VariableDeclaration"));
        setField(term81410, term81410.getClass(), "variables", null);
        setBooleanField(term81410, term81410.getClass(), "isStatement", false);
        setIntField(term81410, term81410.getClass(), "position", 0);
        setIntField(term81410, term81410.getClass(), "length", 0);
        setField(term81410, term81410.getClass(), "parent", null);
        setIntField(term81410, term81410.getClass(), "type", 36);
        setField(term81410, term81410.getClass(), "next", null);
        setField(term81410, term81410.getClass(), "first", null);
        setField(term81410, term81410.getClass(), "last", null);
        setIntField(term81410, term81410.getClass(), "lineno", 0);
        setField(term81410, term81410.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term81396;
        Object retValue = callMethod(klass, "isPropAccess", argTypes, term81278, args);
        assertTrue(recursiveEquals(term81278, term81409));
        assertTrue(recursiveEquals(term81396, term81410));
        assertTrue(recursiveEquals(retValue, true));
    }

};


