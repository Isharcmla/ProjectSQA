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

public class IRFactory_isPropAccess_536103024102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61010;
     Object term61128;
     Object term61143;
     Object term61144;

    public IRFactory_isPropAccess_536103024102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61010 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term61128 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.VariableDeclaration"));
        term61143 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term61143, term61143.getClass(), "sourceString", null);
        setField(term61143, term61143.getClass(), "sourceFile", null);
        setField(term61143, term61143.getClass(), "sourceName", null);
        setField(term61143, term61143.getClass(), "config", null);
        setField(term61143, term61143.getClass(), "errorReporter", null);
        setField(term61143, term61143.getClass(), "transformDispatcher", null);
        setField(term61143, term61143.getClass(), "reservedKeywords", null);
        setField(term61143, term61143.getClass(), "parsedComments", null);
        setField(term61143, term61143.getClass(), "rootNodeJsDocHolder", null);
        setField(term61143, term61143.getClass(), "fileLevelJsDocBuilder", null);
        setField(term61143, term61143.getClass(), "fileOverviewInfo", null);
        setField(term61143, term61143.getClass(), "templateNode", null);
        term61144 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.VariableDeclaration"));
        setField(term61144, term61144.getClass(), "variables", null);
        setBooleanField(term61144, term61144.getClass(), "isStatement", false);
        setIntField(term61144, term61144.getClass(), "position", 0);
        setIntField(term61144, term61144.getClass(), "length", 0);
        setField(term61144, term61144.getClass(), "parent", null);
        setIntField(term61144, term61144.getClass(), "type", 0);
        setField(term61144, term61144.getClass(), "next", null);
        setField(term61144, term61144.getClass(), "first", null);
        setField(term61144, term61144.getClass(), "last", null);
        setIntField(term61144, term61144.getClass(), "lineno", 0);
        setField(term61144, term61144.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term61128;
        Object retValue = callMethod(klass, "isPropAccess", argTypes, term61010, args);
        assertTrue(recursiveEquals(term61010, term61143));
        assertTrue(recursiveEquals(term61128, term61144));
        assertTrue(recursiveEquals(retValue, false));
    }

};


